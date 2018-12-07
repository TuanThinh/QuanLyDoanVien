package mta.qldv.api;

import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.dto.HoatDongHoSoDto;
import mta.qldv.entity.HoSo;
import mta.qldv.form.HoSoForm;
import mta.qldv.form.DiemHoSoForm;
import mta.qldv.form.HoatDongHoSoForm;
import mta.qldv.service.HoSoService;
import mta.qldv.utils.Paging;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ho-so")
public class HoSoApi {

    @Autowired
    private HoSoService hoSoService;
    private JSONObject jsonObject;

    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean addHoSo(@RequestBody HoSoForm form){
        return hoSoService.addHoSo(form);
    }

    @PutMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean updateHoSo(@RequestBody HoSoForm form){
        return hoSoService.updateHoSo(form);
    }

    @PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean deleteHoSo(@RequestParam Long id){
        return hoSoService.deleteHoSo(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    public String getList(@RequestBody Paging paging){
        return hoSoService.getList(paging).toString();
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    public HoSo getById(@RequestParam Long id){
        return hoSoService.getHoSoById(id);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    public String getHoSoDetailId(@RequestParam("id") Long id){
        return hoSoService.getHoSoDetailId(id).toString();
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<HoSo> getHoTen(@PathVariable String name){
        List<HoSo> listHoSo = hoSoService.getHoTen(name);
        return listHoSo;
    }

    @RequestMapping(value = "/dia-chi/{name}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<HoSo> getDiaChi(@PathVariable String name){
        List<HoSo> listHoSo = hoSoService.getDiaChi(name);
        return listHoSo;
    }

    @RequestMapping(value = "/chi-doan/{name}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<HoSo> getChiDoan(@PathVariable String name){
        List<HoSo> listHoSo = hoSoService.getChiDoan(name);
        return listHoSo;
    }

    @RequestMapping(value = "/don-vi/{name}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<HoSo> getDonVi(@PathVariable String name){
        List<HoSo> listHoSo = hoSoService.getDonVi(name);
        return listHoSo;
    }

    @RequestMapping(value = "/doan-vien", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public String getCountDoanVien(@RequestParam("startDate") int startDate, @RequestParam("endDate") int endDate){
        jsonObject = new JSONObject();
        List<Long> listVaoDoan = hoSoService.getVaoDoan(startDate, endDate);
        List<Long> listVaoDang = hoSoService.getVaoDang(startDate, endDate);
        jsonObject.put("startDate", startDate);
        jsonObject.put("endDate", endDate);
        jsonObject.put("listVaoDoan", listVaoDoan);
        jsonObject.put("listVaoDang", listVaoDang);
        return jsonObject.toString();
    }

    @RequestMapping(value = "/hoc-luc-cd", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public String getChiDoanHl(@RequestParam("idChiDoan") int id, @RequestParam("nam") int nam){
        return  hoSoService.getChiDoanHl(id, nam).toString();
    }

    @RequestMapping(value = "/hoc-luc-dv", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    public String getDonViHl(@RequestParam("idDonVi") int id, @RequestParam("nam") int nam){
        return  hoSoService.getDonViHl(id, nam).toString();
    }

    @RequestMapping(value = "/danh-sach-diem", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    public List<DiemHoSoDto> getTkDanhSachDiem(@RequestBody DiemHoSoForm form){
        return  hoSoService.getTkDanhSachDiem(form);
    }

    @RequestMapping(value = "/danh-sach-hoat-dong", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    public List<HoatDongHoSoDto> getTkDanhSachHoatDong(@RequestBody HoatDongHoSoForm form){
        return  hoSoService.getTkDanhSachHoatDong(form);
    }
}

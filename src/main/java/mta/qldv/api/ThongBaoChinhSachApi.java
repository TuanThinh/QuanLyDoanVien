package mta.qldv.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import mta.qldv.dto.ThongBaoChinhSachDto;
import mta.qldv.entity.ThongBaoChinhSach;
import mta.qldv.service.ThongBaoChinhSachService;

@Controller
@RequestMapping("/thong-bao-chinh-sach")
public class ThongBaoChinhSachApi {
	@Autowired
	private ThongBaoChinhSachService thongBaoChinhSachService;

	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<ThongBaoChinhSach> getList() {
		List<ThongBaoChinhSach> listThongBaoChinhSach = thongBaoChinhSachService.getList();
		return listThongBaoChinhSach;
	}

	@PostMapping(value = "/add", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String addThongBaoChinhSach(@Valid @ModelAttribute("tbcsDto") ThongBaoChinhSachDto tbcsDto,
			BindingResult results) {
		if(results.hasErrors()) {
			return "them-tb-cs";
		}
		ThongBaoChinhSach tbcs = new ThongBaoChinhSach();
		tbcs.setTenThongBaoChinhSach(tbcsDto.getTenThongBaoChinhSach());
		tbcs.setNoiDung(tbcsDto.getNoiDung());
		tbcs.setNguoiGui(tbcsDto.getNguoiGui());
		return "redirect:/admin/tb-cs/them?result=" + thongBaoChinhSachService.addThongBaoChinhSach(tbcs);
	}

	@PutMapping(value = "/update/{tbcs}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public boolean updateThongBaoChinhSach(@PathVariable ThongBaoChinhSach newTBCS) {
		return thongBaoChinhSachService.updateThongBaoChinhSach(newTBCS);
	}

	@DeleteMapping(value = "/delete/{tbcs}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public boolean deleteThongBaoChinhSach(@PathVariable ThongBaoChinhSach tBCS) {
		return thongBaoChinhSachService.deleteThongBaoChinhSach(tBCS);
	}

	@RequestMapping(value = "/id", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
	public ThongBaoChinhSach getById(@RequestParam Long id){
		return thongBaoChinhSachService.getById(id);
	}
}

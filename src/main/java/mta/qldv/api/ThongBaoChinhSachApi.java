package mta.qldv.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

	@PostMapping(value = "/update", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String updateThongBaoChinhSach(@Valid @ModelAttribute("tbcsDto") ThongBaoChinhSachDto tbcsDto,
			BindingResult results) {
		if(results.hasErrors()) {
			return "them-tb-cs";
		}
		ThongBaoChinhSach tbcs = thongBaoChinhSachService.getById(tbcsDto.getId());
		tbcs.setTenThongBaoChinhSach(tbcsDto.getTenThongBaoChinhSach());
		tbcs.setNoiDung(tbcsDto.getNoiDung());
		tbcs.setNguoiGui(tbcsDto.getNguoiGui());
		return "redirect:/admin/tb-cs/danh-sach?result=" + thongBaoChinhSachService.updateThongBaoChinhSach(tbcs);
	}

	@DeleteMapping(value = "/delete/{tbcs}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public boolean deleteThongBaoChinhSach(@PathVariable ThongBaoChinhSach tbcs) {
		return thongBaoChinhSachService.deleteThongBaoChinhSach(tbcs);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ThongBaoChinhSach getById(@PathVariable Long id) {
		return thongBaoChinhSachService.getById(id);
	}
}

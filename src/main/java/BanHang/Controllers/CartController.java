package BanHang.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import BanHang.DataBinding.CartItemDTO;
import BanHang.DataBinding.OrderDTO;
import BanHang.Entities.Order;
import BanHang.Services.ICartService;
import BanHang.Services.IOrderService;
import BanHang.ViewModel.JsonResponse;
import BanHang.ViewModel.JsonResponseData;
import lombok.var;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Springweb.entity.Category;

import Springweb.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    
    
    @Autowired CategoryRepository categoryRepository; //
    
    @GetMapping( value = "/categories")
    public String getAll(Model model)
    {
        Iterable<Category> list = categoryRepository.findAll();
        model.addAttribute("list", list);
        return "category";
        
        
    }
}
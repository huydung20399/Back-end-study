package org.example.finaljwdbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Ho Huy Dung - 1999/03/20
 */
@Controller
public class TrangChuController {
    @RequestMapping("/trangChu")
    public String trangChu() {
        return "trangChu";
    }
}

package qa.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import qa.spring.beans.Student;

import java.time.LocalDate;


@Controller
public class StudentController
{
    //HTTP SERVER'dan bizim localServer'imiza GET REQUEST ATILIYOR
    //localhost:8080 numarali odanin icinde calisan java programimiza
    //localhost:8080 diye get request atilirsa index.html ekranda getirilsin
    //BU REQUESTIN TIPI GET OLDUGU ICIN,
    //NOTE:BIZ DEGIL HTTP SERVER BIZDEN GET YAPMAK ISTIYOR
    //O YUZDEN BU METHODUN BASINA  @GetMapping("/") koyduk
    @GetMapping("/")
    public String index()
    {
        return "index.html";
    }



    @GetMapping("/studentForm")
    public String studentForm()
    {
        return "studentForm.html";
    }


    //BIZ HTTP SERVERDA YAYINLANAN VE ORADA EKRANDAN GIRILEN DATAYI
    //LOCAL SERVERIMIZA GET YAPIYORUZ
    //UI -> HTML FORM -> JAVA METHOD -> JAVA STUDENT OBJESI

    //NOTE:POST MAPPING DERSEK HTTP SERVER BIZE POST EDIYOR VERILERI
    //VE URL ADRESINDE DETAYLAR YAZMIYOR
    @PostMapping("/studentPost")
    public void studentPost(  @RequestParam String adi,
                              @RequestParam String soyadi,
                              @RequestParam String email,
                              @RequestParam String dogumTarihi)
    {
        Student student1=new Student();


        System.out.printf("Adı: %s, Soyadı: %s, E-mail: %s, Doğum Tarihi: %s %n", adi, soyadi, email, dogumTarihi);


        //student1.setId(10);
        student1.setAdi(adi);
        student1.setSoyadi(soyadi);
        student1.setEmail(email);
        student1.setDogumTarihi(LocalDate.parse(dogumTarihi));


        System.out.println(student1);
    }

}

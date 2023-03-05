package qa.spring.beans;

import lombok.Data;

import java.time.LocalDate;

@Data//lombok ile getter-setter yazmiyoruz
public class Student
{

    private Integer id;
    private String adi;
    private String soyadi;
    private String email;
    private LocalDate dogumTarihi;




}

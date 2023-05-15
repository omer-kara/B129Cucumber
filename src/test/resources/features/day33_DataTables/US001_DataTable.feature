Feature: US001_Amazonda_Urun_Aratma
  Scenario: TC01_Amazonda_Urun_Aratma
    Given kullanici_amazon_sayfasina_gider
    And kullanici_verilen_urunleri_aratir
      | Urunler  |
      | samsung  |
      | nokia    |
      | iphone   |
      | motorola |
    And sayfayi_kapatir

    #DataTable; scenario'lardaki satir ve sütun icin bir veri tablosu temsil eder.
    #Bunun icin kullanilmak istenen her stepten sonra yukardaki örnekteki gibi bir tablo yapisi olustururuz
    #ve bu stepin methodunu stepDefinition'da olusturdugumuz zaman burdaki verileri alabilmemiz icin
    #olusturulan methoda DataTable parametresi eklenir. Bu parametre ismi ile bir list olusturulabilir.
    #yada direk asList() methodu ile row'lara ulasabiliriz.
    #Bu parametre io.cucumber.datatable.DataTable; dan olmali

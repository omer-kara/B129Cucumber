Feature: Google_Search

  Background: Kullanici_Google_Anasayfasina_Gider
    Given kullanici_"googleUrl"_sayfasina_gider
    And kullanici 2 saniye bekler
    And cikan_reklamGG_kapatilir


    #Scenario Outline: TestNG deki @DataProvider mantigiyla calisir
    #Birden fazla veriyi tek seferde feature file'den kullanmamiza yardimci olur

  Scenario Outline: Google_Aramalari
    * kullanici googleda "<aranacakKelime>" aratir
    * basligin"<aranacakKelime>" icerigini dogrular
    * sayfayi_kapatir
    Examples:
      | aranacakKelime |
      | volvo          |
      | bmv            |
      | mercedes       |
      | audi           |
      | ford           |
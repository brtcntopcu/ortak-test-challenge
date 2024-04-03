# Ortak Test Challenge

## Case 1
### Test Cases
1- Gösterilecek menkul değerin sembolünün (ticker) ve logosunun doğru gösterilmesi

2-	Menkul değer bilgisinin fiyat bilgilerinin doğru gösterilmesi (Bitcoin Fiyatı yazısının altındaki text)

3-	Menkul değere ait fiyat bilgilerinin grafik üzerinde doğru ve seçili para biriminde gösterilmesi

4-	Para birimi dropdown menüsünde gerekli para birimlerinlerinin gösterilmesi ve seçilebilir olması

5-	Seçili zaman dilimindeki değişim farkının doğru gösterilmesi (1 günlük değişim %5 gibi)

6-	Zaman filtresi seçeneklerinin görünür ve tıklanabilir olması

7-	Grafiğin x eksenindeki zaman dilimlerinin zaman filtresine uygun olması

8-	Grafiğin y eksenindeki fiyat aralıklarının fiyata uygun olması

9-	Menkul değer fiyatının başındaki para birimi logosunun seçili para birimi ile uyuşması

10- Grafik üzerine gelindiğinde geçmiş tarih ve saatteki fiyat bilgisin doğru olması/eşleşmesi

11- Para birimi menüsündeki para birimi ve para birimi simgelerinin doğru olması

12- Para birimi menüsünde yazı ile arama yapılıp seçilebilmesi

13- Zaman filtresindeki textlerin kontrolü (Örneğin şu an binance sitesinde "3Ay" yazıyor)

14-	Zaman filtresinin default olarak seçili zaman diliminde geldiğinin kontrolü

Test case'leri farklı çözünürlüklerde de kontrol edilmelidir. Yukarıdaki maddelerden 6-9-12 numaralı maddeler otomatize edilmiştir

### Edge Test Cases
1- Menkul değere ait fiyat bilgisi farklı para birimlerinde gösterilirken döviz kuru bilgilerinin doğruluğunun kontrol edilmesi (örneğin BTC/TRY gösterilirken USD/TRY kurunun kontrol edilmesi)

2- Menkul değere ait fiyat bilgisinin 2 farklı servisten kontrol edilmesi (1 servisten gelen bilgi ekrana yansırken farklı bir servisten de kontrol edilmesi)
## Run Test (Case 2-3)

Aşağıdaki kodu komut satırında çalıştırarak maven ile testleri çalıştırabilirsiniz.

```bash
mvn install
```

## Notlar
Sitede para birimi değişince grafik ve fiyat kısmı güncellemesi stabil çalışmamaktadır. 

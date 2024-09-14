package com.xlw.pdf;

import com.aspose.cells.License;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Demo {
    public static void main(String[] args) {
        // 加载license
        getLicense();

        try {
            // 加载 Excel 文件
            String excelFilePath = "/Users/xieliwei/Desktop/电子签章测试/销售合同/非标合同2.xls"; // Excel 文件路径
            Workbook workbook = new Workbook(excelFilePath);

            // 保存为 PDF
            String pdfFilePath = "/Users/xieliwei/Desktop/电子签章测试/销售合同/非标合同2.pdf"; // PDF 文件保存路径
            workbook.save(pdfFilePath, SaveFormat.PDF);

            // 关闭工作簿（可选，但建议这样做以释放资源）
            workbook.dispose();

            System.out.println("Excel 文件已成功转换为 PDF！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //授权
    public static boolean getLicense() {
        try {
            String license2 = "<License>"
                    + "  <Data>"
                    + "    <Products>"
                    + "      <Product>Aspose.Total for Java</Product>"
                    + "      <Product>Aspose.Words for Java</Product>"
                    + "    </Products>"
                    + "    <EditionType>Enterprise</EditionType>"
                    + "    <SubscriptionExpiry>20991231</SubscriptionExpiry>"
                    + "    <LicenseExpiry>20991231</LicenseExpiry>"
                    + "    <SerialNumber>8bfe198c-7f0c-4ef8-8ff0-acc3237bf0d7</SerialNumber>"
                    + "  </Data>"
                    + "  <Signature>111</Signature>"
                    + "</License>";
            System.out.println(license2);
            InputStream is2 = new ByteArrayInputStream(license2.getBytes("UTF-8"));
            License asposeLic2 = new License();
            asposeLic2.setLicense(is2);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

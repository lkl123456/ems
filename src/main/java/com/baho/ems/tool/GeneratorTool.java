package com.baho.ems.tool;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorTool {
    public static void main(String[] args) {
        shell();
    }

    private static void shell() {
        ArrayList<String> warnings = new ArrayList<String>();
        try {
            //String configFilePath = System.getProperty("user.dir").concat("/resources/generator/generatorConfig.xml");
            String genCfg="E:\\soft-project\\alls\\springboot-mybatis\\ems\\src\\main\\resources\\generator\\generatorConfig.xml";
            //String configFilePath = getResource(genCfg).getFile();
            System.out.println("加载配置文件===" + genCfg);
            boolean overwrite = true;
            File configFile = new File(genCfg);
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                    callback, warnings);
            ProgressCallback progressCallback = new VerboseProgressCallback();
            // myBatisGenerator.generate(null);
            myBatisGenerator.generate(progressCallback);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }

   /* public void generator() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        Resource resource = new ClassPathResource("mybatis/generatorConfig.xml");//这个是逆向工程的配置文件的路径
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration( resource.getInputStream());
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
    public static void main(String[] args) throws Exception {
        try {
            GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/


}

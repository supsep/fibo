package com.sepfibo;

import static com.sepfibo.Constants.EMPTY_INPUT;
import static com.sepfibo.Constants.MAXIUMUM_INPUT;
import static com.sepfibo.Constants.MINIUMUM_INPUT;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.util.List;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FibonacciServiceImplTest {
  private static final FibonacciService service = new FibonacciServiceImpl();

  @Rule
  public ExpectedException expectedEx = ExpectedException.none();



  @Test
  public void testFindFibonacciRange() throws Exception {
    ClassLoader classLoader = ClassLoader.getSystemClassLoader();

    File file = new File(classLoader.getResource("10000_values.txt").getFile());
    String content = new String(Files.readAllBytes(file.toPath()));

    List<BigInteger> result = service.findFibonacciRange(10000);
    Assert.assertEquals(content.trim(), FiboUtils.bigIntegerListToString(result).trim());
  }


  @Test
  public void testFindFibonacciNumber() {
    BigInteger result = service.findFibonacciNumber(1);
    Assert.assertEquals(new BigInteger("1"), result);

    result = service.findFibonacciNumber(9999);
    Assert.assertEquals(new BigInteger("2079360823713349807211264898864283682508703609401590311"
        + "96829458665285014234556866489274560343052265155917573432971901580106247942672509731761338"
        + "1017990273803823178974834623555648319143159192453239442002806781032040872441469346284906"
        + "2668387083308048250920654493340878733226377580847446324873797603734794648258113858631550"
        + "4040810172603812029199438923709428526016473982135544790818235937154295669451493129936648"
        + "46779090437799284773675379284270660175134664833266377698642012106891355791141872776934080"
        + "80350495679409464829288056605636471818766266897075853738335267742083557415594565854200363"
        + "47653245410061210124467856891714948032624086026930912116019739382294466360499015319632861"
        + "5969907788042772028923553932967187718291564341907918652511867885682160089752017107049943"
        + "765706734240087108390881180097625972743182053955425686946081535591845825339823438236043"
        + "576275982317989611674842426954592463320461413799285081435201873848092358155398899089715"
        + "146940613169561449778372074346137375621868510685682609069633981549092125371453724186691"
        + "160425059735374782373326817818219850924022695582641601669008474981607284358248861318482"
        + "990538315018004784435375155420157383310552198099812383325326122868982405177784658846107"
        + "979080782836713238479845179401107656905752215868037896153216085838722388297438048393192"
        + "954122210080031358068858500259887956646322142782044849256507310659580883740164899642356"
        + "338610978204563412246787292184560640917436063561821688381256232166444282295253757749271"
        + "536532113420453068674243545450510326976814437011849490639025493494235890403150987736972"
        + "243705338316536038859511698024592793522590153763492565487238087718300830107456944400242"
        + "643641475690509453507280476468449210568002473991449055590439136921869638709291818924615"
        + "710345038705022930060324161141070745396008017092827795183476321670524248582080142386652"
        + "663381608292144288309546325908047181932920171014782802522138565634020748979631766327887"
        + "220760779103443170011275355881347888872750382538906682309868335569571813786788298211171"
        + "079642270677853691319234273336455672792801895398915310604737974128079409163942990879665"
        + "0294603536651238230626"), result);

  }

  @Test
  public void testValidateInput() throws Exception {
    int result = service.validateInput("1");
    Assert.assertEquals(1, result);

    result = service.validateInput("2");
    Assert.assertEquals(2, result);

    result = service.validateInput("10000");
    Assert.assertEquals(10000, result);
  }

  @Test
  public void testValidateInputEmptyInput() throws Exception {
    expectedEx.expect(Exception.class);
    expectedEx.expectMessage(EMPTY_INPUT);
    service.validateInput("");
  }

  @Test
  public void testValidateInputNull() throws Exception {
    expectedEx.expect(Exception.class);
    expectedEx.expectMessage(EMPTY_INPUT);
    service.validateInput("");
  }

  @Test
  public void testValidateInputMax() throws Exception {
    expectedEx.expect(Exception.class);
    expectedEx.expectMessage(MAXIUMUM_INPUT);
    service.validateInput("10001");
  }
  @Test
  public void testValidateInputMaxInt() throws Exception {
    expectedEx.expect(Exception.class);
    expectedEx.expectMessage(MAXIUMUM_INPUT);
    service.validateInput(String.valueOf(Integer.MAX_VALUE));
  }

  @Test
  public void testValidateInputMin() throws Exception {
    expectedEx.expect(Exception.class);
    expectedEx.expectMessage(MINIUMUM_INPUT);
    service.validateInput("0");
  }
  @Test
  public void testValidateInputMinInt() throws Exception {
    expectedEx.expect(Exception.class);
    expectedEx.expectMessage(MINIUMUM_INPUT);
    service.validateInput(String.valueOf(Integer.MIN_VALUE));
  }
}
package com.fincatto.nfe310.classes.nota;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.nfe310.FabricaDeObjetosFake;

public class NFNotaaInfoItemImpostoICMSUFDestinoTest {

    @Test
    public void deveObterPercentualAliquotaInternaDestinoComoFoiSetado() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        final String percentualAliquota = "999.9999";
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal(percentualAliquota));
        Assert.assertEquals(percentualAliquota, icmsUFDestino.getPercentualAliquotaInternaDestino());

    }

    @Test
    public void deveObterPercentualInterestadualComoFoiSetado() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        final String percentualInterestadual = "999.9999";
        icmsUFDestino.setPercentualInterestadual(new BigDecimal(percentualInterestadual));
        Assert.assertEquals(percentualInterestadual, icmsUFDestino.getPercentualInterestadual());
    }

    @Test
    public void deveObterPercentualProvisorioPartilhaComoFoiSetado() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        final String percentualProvisorioPartilha = "999.9999";
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal(percentualProvisorioPartilha));
        Assert.assertEquals(percentualProvisorioPartilha, icmsUFDestino.getPercentualProvisorioPartilha());
    }

    @Test
    public void deveObterPercentualRelativoFundoCombatePobrezaDestinoComoFoiSetado() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        final String percentualRelativoFundoCombatePobrezaDestino = "999.9999";
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal(percentualRelativoFundoCombatePobrezaDestino));
        Assert.assertEquals(percentualRelativoFundoCombatePobrezaDestino, icmsUFDestino.getPercentualRelativoFundoCombatePobrezaDestino());
    }

    @Test
    public void deveObterValorBaseCalculoDestinoComoFoiSetado() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        final String valorBaseCalculoDestino = "9999999999999.99";
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal(valorBaseCalculoDestino));
        Assert.assertEquals(valorBaseCalculoDestino, icmsUFDestino.getValorBaseCalculoDestino());
    }

    @Test
    public void deveObterValorICMSInterestadualDestinoComoFoiSetado() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        final String valorICMSInterestadualDestino = "9999999999999.99";
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal(valorICMSInterestadualDestino));
        Assert.assertEquals(valorICMSInterestadualDestino, icmsUFDestino.getValorICMSInterestadualDestino());
    }

    @Test
    public void deveObterValorICMSInterestadualRemetenteComoFoiSetado() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        final String valorICMSInterestadualRemetente = "9999999999999.99";
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal(valorICMSInterestadualRemetente));
        Assert.assertEquals(valorICMSInterestadualRemetente, icmsUFDestino.getValorICMSInterestadualRemetente());
    }

    @Test
    public void deveObterValorRelativoFundoCombatePobrezaDestinoComoFoiSetado() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        final String valorRelativoFundoCombatePobrezaDestino = "9999999999999.99";
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal(valorRelativoFundoCombatePobrezaDestino));
        Assert.assertEquals(valorRelativoFundoCombatePobrezaDestino, icmsUFDestino.getValorRelativoFundoCombatePobrezaDestino());
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaInternaDestinoNulo() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualInterestadualNulo() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualProvisorioPartilhaNulo() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualRelativoFundoCombatePobrezaDestinoNulo() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBaseCalculoDestinoNulo() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSInterestadualDestinoNulo() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSInterestadualRemetenteNulo() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorRelativoFundoCombatePobrezaDestinoNulo() {
        final NFNotaaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFNotaaInfoItemImpostoICMSUFDestino><vBCUFDest>9999999999999.99</vBCUFDest><pFCPUFDest>999.9999</pFCPUFDest><pICMSUFDest>999.9999</pICMSUFDest><pICMSInter>999.9999</pICMSInter><pICMSInterPart>999.9999</pICMSInterPart><vFCPUFDest>9999999999999.99</vFCPUFDest><vICMSUFDest>9999999999999.99</vICMSUFDest><vICMSUFRemet>9999999999999.99</vICMSUFRemet></NFNotaaInfoItemImpostoICMSUFDestino>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino().toString());
    }
}
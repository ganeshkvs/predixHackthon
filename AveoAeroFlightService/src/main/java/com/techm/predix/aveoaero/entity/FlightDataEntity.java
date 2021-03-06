package com.techm.predix.aveoaero.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the AVIO_DATA_NEW1 database table.
 * 
 */
@Entity
@Table(name="avioaerodata")
@NamedQuery(name="FlightDataEntity.findAll", query="SELECT a FROM FlightDataEntity a")
public class FlightDataEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AvioDataNew1PK id;

	private double a01;

	private double a02;

	private BigDecimal a03;

	private BigDecimal a04;

	private double a05;

	private BigDecimal a06;

	private double c01;

	private double c02;

	private double c03;

	private double c04;

	private double c05;

	private double c06;

	private double c07;

	private double c08;

	private double c09;

	private double c10;

	private double c11;

	private BigDecimal c12;

	private BigDecimal c13;

	private BigDecimal c14;

	private BigDecimal c15;

	private BigDecimal c16;

	private BigDecimal c17;

	private BigDecimal c18;

	private BigDecimal c19;

	private BigDecimal c20;

	private double c21;

	private double c22;

	private double c23;

	private double d01;

	private double d02;

	private double d03;

	private double d52;

	private double d53;

	private double d54;

	private double e01;

	private double e02;

	private double e03;

	private double e04;

	private double e07;

	private double e08;

	private BigDecimal e09;

	private BigDecimal e10;

	private BigDecimal e11;

	private BigDecimal e12;

	private BigDecimal e13;

	private BigDecimal e14;

	private BigDecimal e15;

	private BigDecimal e16;

	private BigDecimal e17;

	private BigDecimal e50;

	private BigDecimal e51;

	private double e52;

	private double e53;

	private double e54;

	private double e55;

	private BigDecimal e56;

	private BigDecimal e57;

	private BigDecimal e58;

	private BigDecimal e59;

	private double e60;

	private double e61;

	private BigDecimal e62;

	private BigDecimal e63;

	private BigDecimal f01;

	private BigDecimal f02;

	private BigDecimal f03;

	private BigDecimal f04;

	private BigDecimal f05;

	private BigDecimal frame;

	private BigDecimal l01;

	private double m01;

	private double m02;

	private double m03;

	private BigDecimal m04;

	private BigDecimal m05;

	private BigDecimal m06;

	private double m50;

	private double m51;

	private double m52;

	private double m59;

	private double m61;

	private double r01;

	private double s08;

	private double s51;

	private double s53;

	private double s54;

	private double s55;

	private double s56;

	private BigDecimal s60;

	private BigDecimal s61;

	private BigDecimal s62;

	private BigDecimal s63;

	private BigDecimal s64;

	private BigDecimal s65;

	private BigDecimal s66;

	private BigDecimal s67;

	private BigDecimal s69;

	private double s70;

	private BigDecimal s71;

	private BigDecimal s72;

	private BigDecimal s73;

	private BigDecimal s74;

	private BigDecimal s75;

	private BigDecimal s76;

	private BigDecimal s77;

	private BigDecimal s81;

	private BigDecimal s82;

	private BigDecimal s83;

	private BigDecimal s84;

	private BigDecimal s85;

	private BigDecimal s86;

	private BigDecimal s87;

	private double s91;

	private double s92;

	private double s93;

	private double t01;

	private BigDecimal t02;

	private BigDecimal t03;

	private double w01;

	private BigDecimal w02;

	private double w50;

	private double w51;

	private double w52;

	private double w53;

	private double w54;

	private BigDecimal w55;

	private BigDecimal w56;

	public FlightDataEntity() {
	}

	public AvioDataNew1PK getId() {
		return this.id;
	}

	public void setId(AvioDataNew1PK id) {
		this.id = id;
	}

	public double getA01() {
		return this.a01;
	}

	public void setA01(double a01) {
		this.a01 = a01;
	}

	public double getA02() {
		return this.a02;
	}

	public void setA02(double a02) {
		this.a02 = a02;
	}

	public BigDecimal getA03() {
		return this.a03;
	}

	public void setA03(BigDecimal a03) {
		this.a03 = a03;
	}

	public BigDecimal getA04() {
		return this.a04;
	}

	public void setA04(BigDecimal a04) {
		this.a04 = a04;
	}

	public double getA05() {
		return this.a05;
	}

	public void setA05(double a05) {
		this.a05 = a05;
	}

	public BigDecimal getA06() {
		return this.a06;
	}

	public void setA06(BigDecimal a06) {
		this.a06 = a06;
	}

	public double getC01() {
		return this.c01;
	}

	public void setC01(double c01) {
		this.c01 = c01;
	}

	public double getC02() {
		return this.c02;
	}

	public void setC02(double c02) {
		this.c02 = c02;
	}

	public double getC03() {
		return this.c03;
	}

	public void setC03(double c03) {
		this.c03 = c03;
	}

	public double getC04() {
		return this.c04;
	}

	public void setC04(double c04) {
		this.c04 = c04;
	}

	public double getC05() {
		return this.c05;
	}

	public void setC05(double c05) {
		this.c05 = c05;
	}

	public double getC06() {
		return this.c06;
	}

	public void setC06(double c06) {
		this.c06 = c06;
	}

	public double getC07() {
		return this.c07;
	}

	public void setC07(double c07) {
		this.c07 = c07;
	}

	public double getC08() {
		return this.c08;
	}

	public void setC08(double c08) {
		this.c08 = c08;
	}

	public double getC09() {
		return this.c09;
	}

	public void setC09(double c09) {
		this.c09 = c09;
	}

	public double getC10() {
		return this.c10;
	}

	public void setC10(double c10) {
		this.c10 = c10;
	}

	public double getC11() {
		return this.c11;
	}

	public void setC11(double c11) {
		this.c11 = c11;
	}

	public BigDecimal getC12() {
		return this.c12;
	}

	public void setC12(BigDecimal c12) {
		this.c12 = c12;
	}

	public BigDecimal getC13() {
		return this.c13;
	}

	public void setC13(BigDecimal c13) {
		this.c13 = c13;
	}

	public BigDecimal getC14() {
		return this.c14;
	}

	public void setC14(BigDecimal c14) {
		this.c14 = c14;
	}

	public BigDecimal getC15() {
		return this.c15;
	}

	public void setC15(BigDecimal c15) {
		this.c15 = c15;
	}

	public BigDecimal getC16() {
		return this.c16;
	}

	public void setC16(BigDecimal c16) {
		this.c16 = c16;
	}

	public BigDecimal getC17() {
		return this.c17;
	}

	public void setC17(BigDecimal c17) {
		this.c17 = c17;
	}

	public BigDecimal getC18() {
		return this.c18;
	}

	public void setC18(BigDecimal c18) {
		this.c18 = c18;
	}

	public BigDecimal getC19() {
		return this.c19;
	}

	public void setC19(BigDecimal c19) {
		this.c19 = c19;
	}

	public BigDecimal getC20() {
		return this.c20;
	}

	public void setC20(BigDecimal c20) {
		this.c20 = c20;
	}

	public double getC21() {
		return this.c21;
	}

	public void setC21(double c21) {
		this.c21 = c21;
	}

	public double getC22() {
		return this.c22;
	}

	public void setC22(double c22) {
		this.c22 = c22;
	}

	public double getC23() {
		return this.c23;
	}

	public void setC23(double c23) {
		this.c23 = c23;
	}

	public double getD01() {
		return this.d01;
	}

	public void setD01(double d01) {
		this.d01 = d01;
	}

	public double getD02() {
		return this.d02;
	}

	public void setD02(double d02) {
		this.d02 = d02;
	}

	public double getD03() {
		return this.d03;
	}

	public void setD03(double d03) {
		this.d03 = d03;
	}

	public double getD52() {
		return this.d52;
	}

	public void setD52(double d52) {
		this.d52 = d52;
	}

	public double getD53() {
		return this.d53;
	}

	public void setD53(double d53) {
		this.d53 = d53;
	}

	public double getD54() {
		return this.d54;
	}

	public void setD54(double d54) {
		this.d54 = d54;
	}

	public double getE01() {
		return this.e01;
	}

	public void setE01(double e01) {
		this.e01 = e01;
	}

	public double getE02() {
		return this.e02;
	}

	public void setE02(double e02) {
		this.e02 = e02;
	}

	public double getE03() {
		return this.e03;
	}

	public void setE03(double e03) {
		this.e03 = e03;
	}

	public double getE04() {
		return this.e04;
	}

	public void setE04(double e04) {
		this.e04 = e04;
	}

	public double getE07() {
		return this.e07;
	}

	public void setE07(double e07) {
		this.e07 = e07;
	}

	public double getE08() {
		return this.e08;
	}

	public void setE08(double e08) {
		this.e08 = e08;
	}

	public BigDecimal getE09() {
		return this.e09;
	}

	public void setE09(BigDecimal e09) {
		this.e09 = e09;
	}

	public BigDecimal getE10() {
		return this.e10;
	}

	public void setE10(BigDecimal e10) {
		this.e10 = e10;
	}

	public BigDecimal getE11() {
		return this.e11;
	}

	public void setE11(BigDecimal e11) {
		this.e11 = e11;
	}

	public BigDecimal getE12() {
		return this.e12;
	}

	public void setE12(BigDecimal e12) {
		this.e12 = e12;
	}

	public BigDecimal getE13() {
		return this.e13;
	}

	public void setE13(BigDecimal e13) {
		this.e13 = e13;
	}

	public BigDecimal getE14() {
		return this.e14;
	}

	public void setE14(BigDecimal e14) {
		this.e14 = e14;
	}

	public BigDecimal getE15() {
		return this.e15;
	}

	public void setE15(BigDecimal e15) {
		this.e15 = e15;
	}

	public BigDecimal getE16() {
		return this.e16;
	}

	public void setE16(BigDecimal e16) {
		this.e16 = e16;
	}

	public BigDecimal getE17() {
		return this.e17;
	}

	public void setE17(BigDecimal e17) {
		this.e17 = e17;
	}

	public BigDecimal getE50() {
		return this.e50;
	}

	public void setE50(BigDecimal e50) {
		this.e50 = e50;
	}

	public BigDecimal getE51() {
		return this.e51;
	}

	public void setE51(BigDecimal e51) {
		this.e51 = e51;
	}

	public double getE52() {
		return this.e52;
	}

	public void setE52(double e52) {
		this.e52 = e52;
	}

	public double getE53() {
		return this.e53;
	}

	public void setE53(double e53) {
		this.e53 = e53;
	}

	public double getE54() {
		return this.e54;
	}

	public void setE54(double e54) {
		this.e54 = e54;
	}

	public double getE55() {
		return this.e55;
	}

	public void setE55(double e55) {
		this.e55 = e55;
	}

	public BigDecimal getE56() {
		return this.e56;
	}

	public void setE56(BigDecimal e56) {
		this.e56 = e56;
	}

	public BigDecimal getE57() {
		return this.e57;
	}

	public void setE57(BigDecimal e57) {
		this.e57 = e57;
	}

	public BigDecimal getE58() {
		return this.e58;
	}

	public void setE58(BigDecimal e58) {
		this.e58 = e58;
	}

	public BigDecimal getE59() {
		return this.e59;
	}

	public void setE59(BigDecimal e59) {
		this.e59 = e59;
	}

	public double getE60() {
		return this.e60;
	}

	public void setE60(double e60) {
		this.e60 = e60;
	}

	public double getE61() {
		return this.e61;
	}

	public void setE61(double e61) {
		this.e61 = e61;
	}

	public BigDecimal getE62() {
		return this.e62;
	}

	public void setE62(BigDecimal e62) {
		this.e62 = e62;
	}

	public BigDecimal getE63() {
		return this.e63;
	}

	public void setE63(BigDecimal e63) {
		this.e63 = e63;
	}

	public BigDecimal getF01() {
		return this.f01;
	}

	public void setF01(BigDecimal f01) {
		this.f01 = f01;
	}

	public BigDecimal getF02() {
		return this.f02;
	}

	public void setF02(BigDecimal f02) {
		this.f02 = f02;
	}

	public BigDecimal getF03() {
		return this.f03;
	}

	public void setF03(BigDecimal f03) {
		this.f03 = f03;
	}

	public BigDecimal getF04() {
		return this.f04;
	}

	public void setF04(BigDecimal f04) {
		this.f04 = f04;
	}

	public BigDecimal getF05() {
		return this.f05;
	}

	public void setF05(BigDecimal f05) {
		this.f05 = f05;
	}

	public BigDecimal getFrame() {
		return this.frame;
	}

	public void setFrame(BigDecimal frame) {
		this.frame = frame;
	}

	public BigDecimal getL01() {
		return this.l01;
	}

	public void setL01(BigDecimal l01) {
		this.l01 = l01;
	}

	public double getM01() {
		return this.m01;
	}

	public void setM01(double m01) {
		this.m01 = m01;
	}

	public double getM02() {
		return this.m02;
	}

	public void setM02(double m02) {
		this.m02 = m02;
	}

	public double getM03() {
		return this.m03;
	}

	public void setM03(double m03) {
		this.m03 = m03;
	}

	public BigDecimal getM04() {
		return this.m04;
	}

	public void setM04(BigDecimal m04) {
		this.m04 = m04;
	}

	public BigDecimal getM05() {
		return this.m05;
	}

	public void setM05(BigDecimal m05) {
		this.m05 = m05;
	}

	public BigDecimal getM06() {
		return this.m06;
	}

	public void setM06(BigDecimal m06) {
		this.m06 = m06;
	}

	public double getM50() {
		return this.m50;
	}

	public void setM50(double m50) {
		this.m50 = m50;
	}

	public double getM51() {
		return this.m51;
	}

	public void setM51(double m51) {
		this.m51 = m51;
	}

	public double getM52() {
		return this.m52;
	}

	public void setM52(double m52) {
		this.m52 = m52;
	}

	public double getM59() {
		return this.m59;
	}

	public void setM59(double m59) {
		this.m59 = m59;
	}

	public double getM61() {
		return this.m61;
	}

	public void setM61(double m61) {
		this.m61 = m61;
	}

	public double getR01() {
		return this.r01;
	}

	public void setR01(double r01) {
		this.r01 = r01;
	}

	public double getS08() {
		return this.s08;
	}

	public void setS08(double s08) {
		this.s08 = s08;
	}

	public double getS51() {
		return this.s51;
	}

	public void setS51(double s51) {
		this.s51 = s51;
	}

	public double getS53() {
		return this.s53;
	}

	public void setS53(double s53) {
		this.s53 = s53;
	}

	public double getS54() {
		return this.s54;
	}

	public void setS54(double s54) {
		this.s54 = s54;
	}

	public double getS55() {
		return this.s55;
	}

	public void setS55(double s55) {
		this.s55 = s55;
	}

	public double getS56() {
		return this.s56;
	}

	public void setS56(double s56) {
		this.s56 = s56;
	}

	public BigDecimal getS60() {
		return this.s60;
	}

	public void setS60(BigDecimal s60) {
		this.s60 = s60;
	}

	public BigDecimal getS61() {
		return this.s61;
	}

	public void setS61(BigDecimal s61) {
		this.s61 = s61;
	}

	public BigDecimal getS62() {
		return this.s62;
	}

	public void setS62(BigDecimal s62) {
		this.s62 = s62;
	}

	public BigDecimal getS63() {
		return this.s63;
	}

	public void setS63(BigDecimal s63) {
		this.s63 = s63;
	}

	public BigDecimal getS64() {
		return this.s64;
	}

	public void setS64(BigDecimal s64) {
		this.s64 = s64;
	}

	public BigDecimal getS65() {
		return this.s65;
	}

	public void setS65(BigDecimal s65) {
		this.s65 = s65;
	}

	public BigDecimal getS66() {
		return this.s66;
	}

	public void setS66(BigDecimal s66) {
		this.s66 = s66;
	}

	public BigDecimal getS67() {
		return this.s67;
	}

	public void setS67(BigDecimal s67) {
		this.s67 = s67;
	}

	public BigDecimal getS69() {
		return this.s69;
	}

	public void setS69(BigDecimal s69) {
		this.s69 = s69;
	}

	public double getS70() {
		return this.s70;
	}

	public void setS70(double s70) {
		this.s70 = s70;
	}

	public BigDecimal getS71() {
		return this.s71;
	}

	public void setS71(BigDecimal s71) {
		this.s71 = s71;
	}

	public BigDecimal getS72() {
		return this.s72;
	}

	public void setS72(BigDecimal s72) {
		this.s72 = s72;
	}

	public BigDecimal getS73() {
		return this.s73;
	}

	public void setS73(BigDecimal s73) {
		this.s73 = s73;
	}

	public BigDecimal getS74() {
		return this.s74;
	}

	public void setS74(BigDecimal s74) {
		this.s74 = s74;
	}

	public BigDecimal getS75() {
		return this.s75;
	}

	public void setS75(BigDecimal s75) {
		this.s75 = s75;
	}

	public BigDecimal getS76() {
		return this.s76;
	}

	public void setS76(BigDecimal s76) {
		this.s76 = s76;
	}

	public BigDecimal getS77() {
		return this.s77;
	}

	public void setS77(BigDecimal s77) {
		this.s77 = s77;
	}

	public BigDecimal getS81() {
		return this.s81;
	}

	public void setS81(BigDecimal s81) {
		this.s81 = s81;
	}

	public BigDecimal getS82() {
		return this.s82;
	}

	public void setS82(BigDecimal s82) {
		this.s82 = s82;
	}

	public BigDecimal getS83() {
		return this.s83;
	}

	public void setS83(BigDecimal s83) {
		this.s83 = s83;
	}

	public BigDecimal getS84() {
		return this.s84;
	}

	public void setS84(BigDecimal s84) {
		this.s84 = s84;
	}

	public BigDecimal getS85() {
		return this.s85;
	}

	public void setS85(BigDecimal s85) {
		this.s85 = s85;
	}

	public BigDecimal getS86() {
		return this.s86;
	}

	public void setS86(BigDecimal s86) {
		this.s86 = s86;
	}

	public BigDecimal getS87() {
		return this.s87;
	}

	public void setS87(BigDecimal s87) {
		this.s87 = s87;
	}

	public double getS91() {
		return this.s91;
	}

	public void setS91(double s91) {
		this.s91 = s91;
	}

	public double getS92() {
		return this.s92;
	}

	public void setS92(double s92) {
		this.s92 = s92;
	}

	public double getS93() {
		return this.s93;
	}

	public void setS93(double s93) {
		this.s93 = s93;
	}

	public double getT01() {
		return this.t01;
	}

	public void setT01(double t01) {
		this.t01 = t01;
	}

	public BigDecimal getT02() {
		return this.t02;
	}

	public void setT02(BigDecimal t02) {
		this.t02 = t02;
	}

	public BigDecimal getT03() {
		return this.t03;
	}

	public void setT03(BigDecimal t03) {
		this.t03 = t03;
	}

	public double getW01() {
		return this.w01;
	}

	public void setW01(double w01) {
		this.w01 = w01;
	}

	public BigDecimal getW02() {
		return this.w02;
	}

	public void setW02(BigDecimal w02) {
		this.w02 = w02;
	}

	public double getW50() {
		return this.w50;
	}

	public void setW50(double w50) {
		this.w50 = w50;
	}

	public double getW51() {
		return this.w51;
	}

	public void setW51(double w51) {
		this.w51 = w51;
	}

	public double getW52() {
		return this.w52;
	}

	public void setW52(double w52) {
		this.w52 = w52;
	}

	public double getW53() {
		return this.w53;
	}

	public void setW53(double w53) {
		this.w53 = w53;
	}

	public double getW54() {
		return this.w54;
	}

	public void setW54(double w54) {
		this.w54 = w54;
	}

	public BigDecimal getW55() {
		return this.w55;
	}

	public void setW55(BigDecimal w55) {
		this.w55 = w55;
	}

	public BigDecimal getW56() {
		return this.w56;
	}

	public void setW56(BigDecimal w56) {
		this.w56 = w56;
	}

}
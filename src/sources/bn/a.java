package bn;

import a.ar.MFeWs;
import b7.e0;
import cf.x;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jz.d;
import jz.e;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import oi.c;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import oz.q;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {
    public final /* synthetic */ int H;
    public final String K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    public a(int i11) {
        super(2);
        this.H = i11;
        String str = BuildConfig.VERSION_NAME;
        switch (i11) {
            case 1:
                super(2);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                int i12 = x.n().keyLanguage;
                if (i12 == 10) {
                    str = ";125;126;127;128;129;130;131;132;133;134;135;136;137;899;902;903;906;922;925;928;988;989;1003;1004;1006;1010;1014;1015;1021;1022;1023;1039;1083;1087;1088;1089;1090;1091;1092;1093;1094;1138;1139;1234;1235;1237;1239;1241;1242;1244;1296;1298;1299;1309;";
                } else if (i12 == 20) {
                    str = ";108;112;113;114;115;471;482;483;484;485;486;487;488;489;490;491;492;493;494; 495;496;497;499;502;503;505;506;507;508;511;512;514;515;516;517;519;520;521;522;523;584;640;732;733;778;779;781;782;784;785;786;788;789;790;791;794;795;797;799;845;847;1076;1088;1091;1440;1502;1551;1577;1624;1635;1669;1671;1677;2071;15;16;30;179;188;1815;109;";
                } else if (i12 == 22) {
                    str = ";125;126;127;128;129;130;131;132;133;134;135;136;137;899;902;903;906;922;925;928;988;989;1003;1004;1006;1010;1014;1015;1021;1022;1023;1039;1083;1087;1088;1089;1090;1091;1092;1093;1094;1138;1139;1234;1235;1237;1239;1241;1242;1244;1296;1298;1299;1309;";
                } else if (i12 == 40) {
                    str = ";108;112;113;114;115;471;482;483;484;485;486;487;488;489;490;491;492;493;494; 495;496;497;499;502;503;505;506;507;508;511;512;514;515;516;517;519;520;521;522;523;584;640;732;733;778;779;781;782;784;785;786;788;789;790;791;794;795;797;799;845;847;1076;1088;1091;1440;1502;1551;1577;1624;1635;1669;1671;1677;2071;15;16;30;179;188;1815;109;";
                }
                this.K = str;
                break;
            case 2:
                super(2);
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                int i13 = x.n().keyLanguage;
                if (i13 == 1) {
                    str = ";1581;1667;1668;1669;1670;1671;1785;1799;1836;1937;2068;2069;2070;2073;2076;2078;2081;2128;2130;2131;2132;2134;2174;2427;2428;2452;2453;2454;2455;2456;2457;2488;2490;2491;2496;2497;2498;2500;2501;2502;2665;2697;2725;2860;2885;2894;2901;2902;2903;3033;3072;3165;3174;3175;3176;2631;2498;2503;2501;2498;2500;2502;2497;2851;2491;2490;2488;2487;547;2486;";
                } else if (i13 == 12) {
                    str = ";49;63;75;101;168;231;396;422;428;430;562;571;603;748;750;751;753;770;771;804;806;975;1081;404;561;809;";
                }
                this.K = str;
                break;
            case 3:
                super(2);
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                int i14 = x.n().keyLanguage;
                if (i14 == 4 || i14 == 14) {
                    str = ";126;127;128;129;130;131;132;133;134;135;136;137;138;139;140;141;142;207;237;240;243;246;254;264;441;452;461;462;463;464;465;466;467;468;469;470;471;475;476;477;480;481;483;484;485;486;487;488;489;490;491;492;493;495;497;503;504;505;521;524;526;530;549;554;557;571;576;580;583;587;593;595;597;598;599;600;601;605;606;607;608;680;708;718;738;739;740;755;762;767;769;784;857;866;868;870;873;954;956;986;987;996;1003;1010;1018;1035;1088;1097;1099;1110;1129;1151;1153;1161;1208;1210;1211;1213;1217;1227;1264;1265;1266;1267;1270;1309;1310;1324;1325;1327;1328;1345;1349;1350;1352;1353;1354;1357;1358;1363;1364;1381;1411;1414;1430;1434;1452;1502;";
                } else if (i14 == 47 || i14 == 48) {
                    str = ";278;279;282;284;285;287;288;289;290;291;292;293;295;296;297;299;300;301;302;303;305;306;307;309;313;320;336;344;352;358;377;379;407;414;571;593;631;688;711;712;713;714;715;716;718;720;721;722;723;724;725;726;727;728;729;730;731;732;733;734;735;736;737;738;739;741;749;755;757;759;764;765;767;769;770;778;779;780;781;782;783;786;788;789;805;812;865;866;867;868;869;870;875;877;879;881;889;891;905;941;965;1058;1136;1232;1251;1268;1276;1278;1288;1289;1324;1381;1393;1413;1414;1421;1446;1526;1534;1538;1563;1620;1633;1644;1650;1656;1657;1890;2068;2096;2172;2174;2175;2176;2182;2183;2186;2187;2189;2190;2192;2205;2218;2311;2318;2395;2454;2456;2470;2505;2710;2711;2712;2713;2716;2718;2728;2738;2739;2817;2915;2962;2965;2967;2976;2993;2997;2998;3001;3031;3033;3040;3041;3045;3052;3080;3090;3232;3318;3329;3343;3352;3354;3365;3390;3394;3395;3403;3410;3482;3483;3568;3586;3700;3711;3918;3974;3984;3991;3998;4006;4011;4211;4216;4255;4309;4324;4334;4335;4422;4448;4451;4452;4520;4569;4571;4573;4575;4576;4589;4596;4623;4650;4651;4656;4675;4676;4772;4780;4820;4821;4824;4828;4839;4841;4845;4891;4895;4896;4897;4969;5003;5036;5052;5053;5072;5129;5140;5141;5181;5187;5189;5226;5228;5237;5248;5272;5290;5325;5338;5357;5462;5463;5465;5466;5494;5495;5532;5533;5539;5564;5579;5598;5599;5600;5605;5622;5643;5681;5780;5819;5980;6029;6318;6365;6500;6518;6529;6548;6549;";
                } else if (i14 == 53 || i14 == 54) {
                    str = ";313;314;345;428;545;611;613;616;743;744;745;746;747;748;749;750;751;752;5921;753;754;755;756;763;764;767;768;773;774;775;776;777;778;779;780;792;794;881;900;981;989;1045;1128;1145;1147;1159;1283;1287;5930;1341;1368;1407;1408;1422;1427;1430;1433;1442;1475;1481;5932;5933;1669;1688;1689;1727;1767;2153;2176;2235;2242;2352;2356;2424;2425;2452;2460;2482;2500;2505;2618;5967;2901;3219;3339;3353;3376;3388;3649;3708;3782;3729;3732;3736;3777;3778;3888;4031;4043;4127;4325;4357;4383;4389;4635;4761;4798;";
                }
                this.K = str;
                break;
            case 4:
                super(2);
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                int i15 = x.n().keyLanguage;
                if (i15 == 0) {
                    str = ";1668;249;1396;171;172;1403;266;279;268;281;1404;1405;1406;282;283;284;285;286;287;293;294;1230;298;302;1207;1208;344;353;357;363;367;368;369;371;550;651;652;678;679;680;681;682;685;686;687;688;689;690;691;692;694;696;700;701;722;787;789;841;914;946;949;947;951;952;968;978;1004;1087;1094;1122;1140;1144;1138;1142;1146;1147;1148;1149;1152;1153;1154;1155;1169;1174;1176;1177;1178;1181;";
                } else if (i15 == 11) {
                    str = ";162;163;176;177;178;336;376;380;381;382;392;395;398;430;431;432;433;451;515;516;651;758;789;791;792;793;804;817;826;";
                }
                this.K = str;
                break;
            case 5:
                super(2);
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                int i16 = x.n().keyLanguage;
                this.K = (i16 == 8 || i16 == 17) ? ";123;11;12;17;70;86;154;427;1392;122;125;413;586;597;598;604;607;620;630;631;1048;1058;1222;1231;1279;1425;1424;1426;124;131;161;209;249;592;1385;132;1349;120;230;585;614;615;121;594;606;611;1348;1383;579;584;629;1046;1309;1339;1413;1449;623;627;633;641;589;617;624;634;1307;130;392;431;540;601;766;1225;1229;583;1347;1350;581;578;764;1325;587;596;1008;590;1260;1014;126;" : str;
                break;
            default:
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                this.K = x.n().keyLanguage == 2 ? ";187;188;189;190;191;192;193;194;195;196;203;204;205;206;207;208;209;210;213;215;217;219;223;225;226;227;228;229;230;231;232;233;234;236;238;240;242;244;245;246;247;248;249;400;401;402;403;404;405;406;407;408;409;410;411;412;481;483;486;487;488;489;494;495;496;497;500;501;514;515;516;517;518;614;632;637;684;702;738;836;837;843;888;889;890;891;892;893;932;937;940;993;1011;1019;1044;1105;1106;1108;1118;1119;1120;1121;1208;1209;1210;1211;1212;1213;1214;1215;" : ";50;55;73;85;139;151;163;166;213;250;262;264;313;344;579;580;597;599;600;669;680;734;763;789;878;";
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x03a8  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    private final List w(String str) {
        List listK;
        List listT;
        int i11;
        int i12;
        List listK2;
        List listT2;
        int i13;
        List listK3;
        List listT3;
        int iC;
        List listK4;
        boolean z11;
        List listT4;
        List listK5;
        List listT5;
        List listK6;
        List listT6;
        List listK7;
        List listT7;
        boolean z12;
        List listK8;
        List listT8;
        ArrayList arrayList = (ArrayList) this.f44926b;
        ArrayList arrayList2 = (ArrayList) this.f44927c;
        this.f44925a = w4.c.m(str, "repeatRegex");
        ?? r9 = 0;
        Matcher matcherW = p.w(0, "#", "compile(...)", str);
        if (matcherW.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iC2 = 0;
            do {
                iC2 = p.c(matcherW, str, iC2, arrayList3);
            } while (matcherW.find());
            p.B(iC2, str, arrayList3);
            listK = arrayList3;
        } else {
            listK = o.K(str.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        r rVar = r.f50854a;
        if (zIsEmpty) {
            listT = rVar;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listT = rVar;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                listT = e0.t(listIterator, 1, listK);
                break;
            }
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        ArrayList arrayList4 = new ArrayList();
        int length = strArr.length;
        int i14 = 0;
        while (i14 < length) {
            String strQ0 = strArr[i14];
            if (oz.x.s0(strQ0, "3:", r9)) {
                strQ0 = oz.x.q0(oz.x.q0(strQ0, ":-", ":0-"), ":;", ":0;");
            }
            Matcher matcherW2 = p.w(r9, ";", "compile(...)", strQ0);
            if (matcherW2.find()) {
                ArrayList arrayList5 = new ArrayList(10);
                int iC3 = 0;
                do {
                    iC3 = p.c(matcherW2, strQ0, iC3, arrayList5);
                } while (matcherW2.find());
                p.B(iC3, strQ0, arrayList5);
                listK6 = arrayList5;
            } else {
                listK6 = o.K(strQ0.toString());
            }
            if (listK6.isEmpty()) {
                listT6 = rVar;
                break;
            }
            ListIterator listIterator2 = listK6.listIterator(listK6.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT6 = rVar;
                    break;
                }
                if (((String) listIterator2.previous()).length() != 0) {
                    listT6 = e0.t(listIterator2, 1, listK6);
                    break;
                }
            }
            String[] strArr2 = (String[]) listT6.toArray(new String[0]);
            int i15 = strArr2.length > 2 ? Integer.parseInt(strArr2[2]) : 1;
            String str2 = strArr2[0];
            Matcher matcher = e0.u(0, "-", "compile(...)", str2, "input").matcher(str2);
            if (matcher.find()) {
                ArrayList arrayList6 = new ArrayList(10);
                int iC4 = 0;
                do {
                    iC4 = p.c(matcher, str2, iC4, arrayList6);
                } while (matcher.find());
                p.B(iC4, str2, arrayList6);
                listK7 = arrayList6;
            } else {
                listK7 = o.K(str2.toString());
            }
            if (listK7.isEmpty()) {
                listT7 = rVar;
                break;
            }
            ListIterator listIterator3 = listK7.listIterator(listK7.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT7 = rVar;
                    break;
                }
                if (((String) listIterator3.previous()).length() != 0) {
                    listT7 = e0.t(listIterator3, 1, listK7);
                    break;
                }
            }
            String[] strArr3 = (String[]) listT7.toArray(new String[0]);
            if (strArr3.length >= 3) {
                int length2 = strArr3.length;
                int i16 = 0;
                z12 = true;
                while (i16 < length2) {
                    int i17 = i16;
                    String str3 = strArr3[i17];
                    r rVar2 = rVar;
                    int i18 = length;
                    Matcher matcher2 = e0.u(0, ":", "compile(...)", str3, "input").matcher(str3);
                    if (matcher2.find()) {
                        ArrayList arrayList7 = new ArrayList(10);
                        int iC5 = 0;
                        do {
                            iC5 = p.c(matcher2, str3, iC5, arrayList7);
                        } while (matcher2.find());
                        p.B(iC5, str3, arrayList7);
                        listK8 = arrayList7;
                    } else {
                        listK8 = o.K(str3.toString());
                    }
                    if (listK8.isEmpty()) {
                        listT8 = rVar2;
                        break;
                    }
                    ListIterator listIterator4 = listK8.listIterator(listK8.size());
                    while (true) {
                        if (!listIterator4.hasPrevious()) {
                            listT8 = rVar2;
                            break;
                        }
                        if (((String) listIterator4.previous()).length() != 0) {
                            listT8 = e0.t(listIterator4, 1, listK8);
                            break;
                        }
                    }
                    String[] strArr4 = (String[]) listT8.toArray(new String[0]);
                    if ((!m.a(strArr4[0], "0") || !m.a(strArr4[2], "0")) && (!m.a(strArr4[0], "3") || !m.a(strArr4[2], "0"))) {
                        z12 = false;
                    }
                    i16 = i17 + 1;
                    rVar = rVar2;
                    length = i18;
                    i14 = i14;
                }
            } else {
                z12 = false;
            }
            r rVar3 = rVar;
            int i19 = length;
            int i21 = i14;
            if (z12) {
                arrayList4.add(str2);
            } else {
                for (int i22 : j3.P(strArr3.length, i15)) {
                    arrayList4.add(strArr3[i22]);
                }
            }
            i14 = i21 + 1;
            strArr = strArr;
            rVar = rVar3;
            length = i19;
            r9 = 0;
        }
        r rVar4 = rVar;
        int size = arrayList4.size();
        int i23 = 0;
        while (i23 < size) {
            Object obj = arrayList4.get(i23);
            m.e(obj, "get(...)");
            String str4 = (String) obj;
            int i24 = 0;
            if (q.W0(str4, new String[]{"-"}, 0, 6).size() >= 3) {
                ArrayList arrayList8 = new ArrayList();
                List<String> listW0 = q.W0(str4, new String[]{"-"}, 0, 6);
                int i25 = 6;
                for (String str5 : listW0) {
                    Matcher matcher3 = e0.u(i24, ":", "compile(...)", str5, "input").matcher(str5);
                    if (matcher3.find()) {
                        ArrayList arrayList9 = new ArrayList(10);
                        int i26 = 0;
                        while (true) {
                            iC = p.c(matcher3, str5, i26, arrayList9);
                            if (!matcher3.find()) {
                                break;
                            }
                            i26 = iC;
                        }
                        p.B(iC, str5, arrayList9);
                        listK4 = arrayList9;
                    } else {
                        listK4 = o.K(str5.toString());
                    }
                    if (listK4.isEmpty()) {
                        z11 = true;
                        listT4 = rVar4;
                        break;
                    }
                    ListIterator listIterator5 = listK4.listIterator(listK4.size());
                    while (true) {
                        if (!listIterator5.hasPrevious()) {
                            z11 = true;
                            listT4 = rVar4;
                            break;
                        }
                        if (!(((String) listIterator5.previous()).length() == 0)) {
                            z11 = true;
                            listT4 = e0.t(listIterator5, 1, listK4);
                            break;
                        }
                    }
                    arrayList8.add(Long.valueOf(((String[]) listT4.toArray(new String[0]))[z11 ? 1 : 0]));
                    Pattern patternCompile = Pattern.compile(":");
                    m.e(patternCompile, "compile(...)");
                    q.U0(0);
                    Matcher matcher4 = patternCompile.matcher(str5);
                    if (matcher4.find()) {
                        ArrayList arrayList10 = new ArrayList(10);
                        int iC6 = 0;
                        while (true) {
                            iC6 = p.c(matcher4, str5, iC6, arrayList10);
                            if (!matcher4.find()) {
                                break;
                            }
                            matcher4 = matcher4;
                        }
                        p.B(iC6, str5, arrayList10);
                        listK5 = arrayList10;
                    } else {
                        listK5 = o.K(str5.toString());
                    }
                    if (listK5.isEmpty()) {
                        listT5 = rVar4;
                        break;
                    }
                    ListIterator listIterator6 = listK5.listIterator(listK5.size());
                    while (true) {
                        if (!listIterator6.hasPrevious()) {
                            listT5 = rVar4;
                            break;
                        }
                        if (!(((String) listIterator6.previous()).length() == 0)) {
                            listT5 = e0.t(listIterator6, 1, listK5);
                            break;
                        }
                    }
                    i24 = 0;
                    i25 = Integer.parseInt(((String[]) listT5.toArray(new String[0]))[2]);
                    size = size;
                }
                i12 = size;
                int i27 = i24;
                int i28 = 6;
                int i29 = Integer.parseInt((String) q.W0((CharSequence) listW0.get(i27), new String[]{":"}, i27, 6).get(i27));
                if (i29 != 0) {
                    if (i29 != 3) {
                        i28 = i25;
                    } else {
                        i28 = 14;
                    }
                } else if (i25 != 0) {
                    i28 = i25;
                }
                qi.a aVar = new qi.a();
                aVar.f47798a = i29;
                aVar.f47799b = 0L;
                aVar.f47800c = i28;
                aVar.f47801d = arrayList8;
                i().add(aVar);
                i13 = i23;
            } else {
                i12 = size;
                arrayList.clear();
                arrayList2.clear();
                arrayList.add(new ArrayList());
                arrayList.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                Pattern patternCompile2 = Pattern.compile(":");
                m.e(patternCompile2, "compile(...)");
                q.U0(0);
                Matcher matcher5 = patternCompile2.matcher(str4);
                if (matcher5.find()) {
                    ArrayList arrayList11 = new ArrayList(10);
                    int iC7 = 0;
                    do {
                        iC7 = p.c(matcher5, str4, iC7, arrayList11);
                    } while (matcher5.find());
                    p.B(iC7, str4, arrayList11);
                    listK2 = arrayList11;
                } else {
                    listK2 = o.K(str4.toString());
                }
                if (listK2.isEmpty()) {
                    listT2 = rVar4;
                    break;
                }
                ListIterator listIterator7 = listK2.listIterator(listK2.size());
                while (true) {
                    if (!listIterator7.hasPrevious()) {
                        listT2 = rVar4;
                        break;
                    }
                    if (!(((String) listIterator7.previous()).length() == 0)) {
                        listT2 = e0.t(listIterator7, 1, listK2);
                        break;
                    }
                }
                String[] strArr5 = (String[]) listT2.toArray(new String[0]);
                qi.a aVar2 = new qi.a();
                aVar2.f47798a = Integer.parseInt(strArr5[0]);
                i13 = i23;
                aVar2.f47799b = Integer.parseInt(strArr5[1]);
                String str6 = strArr5[2];
                Matcher matcher6 = e0.u(0, ",", "compile(...)", str6, "input").matcher(str6);
                if (matcher6.find()) {
                    ArrayList arrayList12 = new ArrayList(10);
                    int iC8 = 0;
                    do {
                        iC8 = p.c(matcher6, str6, iC8, arrayList12);
                    } while (matcher6.find());
                    p.B(iC8, str6, arrayList12);
                    listK3 = arrayList12;
                } else {
                    listK3 = o.K(str6.toString());
                }
                if (listK3.isEmpty()) {
                    listT3 = rVar4;
                    break;
                }
                ListIterator listIterator8 = listK3.listIterator(listK3.size());
                while (true) {
                    if (!listIterator8.hasPrevious()) {
                        listT3 = rVar4;
                        break;
                    }
                    if (!(((String) listIterator8.previous()).length() == 0)) {
                        listT3 = e0.t(listIterator8, 1, listK3);
                        break;
                    }
                }
                String[] strArr6 = (String[]) listT3.toArray(new String[0]);
                ArrayList arrayList13 = new ArrayList();
                for (String str7 : strArr6) {
                    arrayList13.add(Integer.valueOf(Integer.parseInt(str7)));
                }
                boolean zD = d(i(), aVar2.f47798a, aVar2.f47799b);
                if (aVar2.f47798a == 0) {
                    q(aVar2, arrayList13, zD);
                } else {
                    n(aVar2, arrayList13, zD, i13);
                }
                i().add(aVar2);
            }
            i23 = i13 + 1;
            arrayList4 = arrayList4;
            size = i12;
        }
        long j11 = 0;
        if (q.v0("release", "debug", false) && xt.b.f56282d) {
            i11 = 1;
            t(i().subList(0, 1));
        } else {
            i11 = 1;
        }
        int i30 = 0;
        for (int size2 = i().size() - i11; -1 < size2; size2--) {
            qi.a aVar3 = (qi.a) i().get(size2);
            if (aVar3.f47798a == i11) {
                long j12 = aVar3.f47799b;
                if (j11 != j12) {
                    aVar3.f47800c = 13;
                    i30++;
                    j11 = j12;
                }
            }
            if (i30 == 2) {
                break;
            }
        }
        return i();
    }

    /* JADX WARN: Code duplicated, block: B:164:0x03a8  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    private final List x(String str) {
        List listK;
        List listT;
        int i11;
        int i12;
        List listK2;
        List listT2;
        int i13;
        List listK3;
        List listT3;
        int iC;
        List listK4;
        boolean z11;
        List listT4;
        List listK5;
        List listT5;
        List listK6;
        List listT6;
        List listK7;
        List listT7;
        boolean z12;
        List listK8;
        List listT8;
        ArrayList arrayList = (ArrayList) this.f44926b;
        ArrayList arrayList2 = (ArrayList) this.f44927c;
        this.f44925a = w4.c.m(str, "repeatRegex");
        ?? r9 = 0;
        Matcher matcherW = p.w(0, "#", "compile(...)", str);
        if (matcherW.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iC2 = 0;
            do {
                iC2 = p.c(matcherW, str, iC2, arrayList3);
            } while (matcherW.find());
            p.B(iC2, str, arrayList3);
            listK = arrayList3;
        } else {
            listK = o.K(str.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        r rVar = r.f50854a;
        if (zIsEmpty) {
            listT = rVar;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listT = rVar;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                listT = e0.t(listIterator, 1, listK);
                break;
            }
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        ArrayList arrayList4 = new ArrayList();
        int length = strArr.length;
        int i14 = 0;
        while (i14 < length) {
            String strQ0 = strArr[i14];
            if (oz.x.s0(strQ0, "3:", r9)) {
                strQ0 = oz.x.q0(oz.x.q0(strQ0, ":-", ":0-"), ":;", ":0;");
            }
            Matcher matcherW2 = p.w(r9, ";", "compile(...)", strQ0);
            if (matcherW2.find()) {
                ArrayList arrayList5 = new ArrayList(10);
                int iC3 = 0;
                do {
                    iC3 = p.c(matcherW2, strQ0, iC3, arrayList5);
                } while (matcherW2.find());
                p.B(iC3, strQ0, arrayList5);
                listK6 = arrayList5;
            } else {
                listK6 = o.K(strQ0.toString());
            }
            if (listK6.isEmpty()) {
                listT6 = rVar;
                break;
            }
            ListIterator listIterator2 = listK6.listIterator(listK6.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT6 = rVar;
                    break;
                }
                if (((String) listIterator2.previous()).length() != 0) {
                    listT6 = e0.t(listIterator2, 1, listK6);
                    break;
                }
            }
            String[] strArr2 = (String[]) listT6.toArray(new String[0]);
            int i15 = strArr2.length > 2 ? Integer.parseInt(strArr2[2]) : 1;
            String str2 = strArr2[0];
            Matcher matcher = e0.u(0, "-", "compile(...)", str2, "input").matcher(str2);
            if (matcher.find()) {
                ArrayList arrayList6 = new ArrayList(10);
                int iC4 = 0;
                do {
                    iC4 = p.c(matcher, str2, iC4, arrayList6);
                } while (matcher.find());
                p.B(iC4, str2, arrayList6);
                listK7 = arrayList6;
            } else {
                listK7 = o.K(str2.toString());
            }
            if (listK7.isEmpty()) {
                listT7 = rVar;
                break;
            }
            ListIterator listIterator3 = listK7.listIterator(listK7.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT7 = rVar;
                    break;
                }
                if (((String) listIterator3.previous()).length() != 0) {
                    listT7 = e0.t(listIterator3, 1, listK7);
                    break;
                }
            }
            String[] strArr3 = (String[]) listT7.toArray(new String[0]);
            if (strArr3.length >= 3) {
                int length2 = strArr3.length;
                int i16 = 0;
                z12 = true;
                while (i16 < length2) {
                    int i17 = i16;
                    String str3 = strArr3[i17];
                    r rVar2 = rVar;
                    int i18 = length;
                    Matcher matcher2 = e0.u(0, ":", "compile(...)", str3, "input").matcher(str3);
                    if (matcher2.find()) {
                        ArrayList arrayList7 = new ArrayList(10);
                        int iC5 = 0;
                        do {
                            iC5 = p.c(matcher2, str3, iC5, arrayList7);
                        } while (matcher2.find());
                        p.B(iC5, str3, arrayList7);
                        listK8 = arrayList7;
                    } else {
                        listK8 = o.K(str3.toString());
                    }
                    if (listK8.isEmpty()) {
                        listT8 = rVar2;
                        break;
                    }
                    ListIterator listIterator4 = listK8.listIterator(listK8.size());
                    while (true) {
                        if (!listIterator4.hasPrevious()) {
                            listT8 = rVar2;
                            break;
                        }
                        if (((String) listIterator4.previous()).length() != 0) {
                            listT8 = e0.t(listIterator4, 1, listK8);
                            break;
                        }
                    }
                    String[] strArr4 = (String[]) listT8.toArray(new String[0]);
                    if ((!m.a(strArr4[0], "0") || !m.a(strArr4[2], "0")) && (!m.a(strArr4[0], "3") || !m.a(strArr4[2], "0"))) {
                        z12 = false;
                    }
                    i16 = i17 + 1;
                    rVar = rVar2;
                    length = i18;
                    i14 = i14;
                }
            } else {
                z12 = false;
            }
            r rVar3 = rVar;
            int i19 = length;
            int i21 = i14;
            if (z12) {
                arrayList4.add(str2);
            } else {
                for (int i22 : j3.P(strArr3.length, i15)) {
                    arrayList4.add(strArr3[i22]);
                }
            }
            i14 = i21 + 1;
            strArr = strArr;
            rVar = rVar3;
            length = i19;
            r9 = 0;
        }
        r rVar4 = rVar;
        int size = arrayList4.size();
        int i23 = 0;
        while (i23 < size) {
            Object obj = arrayList4.get(i23);
            m.e(obj, "get(...)");
            String str4 = (String) obj;
            int i24 = 0;
            if (q.W0(str4, new String[]{"-"}, 0, 6).size() >= 3) {
                ArrayList arrayList8 = new ArrayList();
                List<String> listW0 = q.W0(str4, new String[]{"-"}, 0, 6);
                int i25 = 6;
                for (String str5 : listW0) {
                    Matcher matcher3 = e0.u(i24, ":", "compile(...)", str5, "input").matcher(str5);
                    if (matcher3.find()) {
                        ArrayList arrayList9 = new ArrayList(10);
                        int i26 = 0;
                        while (true) {
                            iC = p.c(matcher3, str5, i26, arrayList9);
                            if (!matcher3.find()) {
                                break;
                            }
                            i26 = iC;
                        }
                        p.B(iC, str5, arrayList9);
                        listK4 = arrayList9;
                    } else {
                        listK4 = o.K(str5.toString());
                    }
                    if (listK4.isEmpty()) {
                        z11 = true;
                        listT4 = rVar4;
                        break;
                    }
                    ListIterator listIterator5 = listK4.listIterator(listK4.size());
                    while (true) {
                        if (!listIterator5.hasPrevious()) {
                            z11 = true;
                            listT4 = rVar4;
                            break;
                        }
                        if (!(((String) listIterator5.previous()).length() == 0)) {
                            z11 = true;
                            listT4 = e0.t(listIterator5, 1, listK4);
                            break;
                        }
                    }
                    arrayList8.add(Long.valueOf(((String[]) listT4.toArray(new String[0]))[z11 ? 1 : 0]));
                    Pattern patternCompile = Pattern.compile(":");
                    m.e(patternCompile, "compile(...)");
                    q.U0(0);
                    Matcher matcher4 = patternCompile.matcher(str5);
                    if (matcher4.find()) {
                        ArrayList arrayList10 = new ArrayList(10);
                        int iC6 = 0;
                        while (true) {
                            iC6 = p.c(matcher4, str5, iC6, arrayList10);
                            if (!matcher4.find()) {
                                break;
                            }
                            matcher4 = matcher4;
                        }
                        p.B(iC6, str5, arrayList10);
                        listK5 = arrayList10;
                    } else {
                        listK5 = o.K(str5.toString());
                    }
                    if (listK5.isEmpty()) {
                        listT5 = rVar4;
                        break;
                    }
                    ListIterator listIterator6 = listK5.listIterator(listK5.size());
                    while (true) {
                        if (!listIterator6.hasPrevious()) {
                            listT5 = rVar4;
                            break;
                        }
                        if (!(((String) listIterator6.previous()).length() == 0)) {
                            listT5 = e0.t(listIterator6, 1, listK5);
                            break;
                        }
                    }
                    i24 = 0;
                    i25 = Integer.parseInt(((String[]) listT5.toArray(new String[0]))[2]);
                    size = size;
                }
                i12 = size;
                int i27 = i24;
                int i28 = 6;
                int i29 = Integer.parseInt((String) q.W0((CharSequence) listW0.get(i27), new String[]{":"}, i27, 6).get(i27));
                if (i29 != 0) {
                    if (i29 != 3) {
                        i28 = i25;
                    } else {
                        i28 = 14;
                    }
                } else if (i25 != 0) {
                    i28 = i25;
                }
                qi.a aVar = new qi.a();
                aVar.f47798a = i29;
                aVar.f47799b = 0L;
                aVar.f47800c = i28;
                aVar.f47801d = arrayList8;
                i().add(aVar);
                i13 = i23;
            } else {
                i12 = size;
                arrayList.clear();
                arrayList2.clear();
                arrayList.add(new ArrayList());
                arrayList.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                Pattern patternCompile2 = Pattern.compile(":");
                m.e(patternCompile2, "compile(...)");
                q.U0(0);
                Matcher matcher5 = patternCompile2.matcher(str4);
                if (matcher5.find()) {
                    ArrayList arrayList11 = new ArrayList(10);
                    int iC7 = 0;
                    do {
                        iC7 = p.c(matcher5, str4, iC7, arrayList11);
                    } while (matcher5.find());
                    p.B(iC7, str4, arrayList11);
                    listK2 = arrayList11;
                } else {
                    listK2 = o.K(str4.toString());
                }
                if (listK2.isEmpty()) {
                    listT2 = rVar4;
                    break;
                }
                ListIterator listIterator7 = listK2.listIterator(listK2.size());
                while (true) {
                    if (!listIterator7.hasPrevious()) {
                        listT2 = rVar4;
                        break;
                    }
                    if (!(((String) listIterator7.previous()).length() == 0)) {
                        listT2 = e0.t(listIterator7, 1, listK2);
                        break;
                    }
                }
                String[] strArr5 = (String[]) listT2.toArray(new String[0]);
                qi.a aVar2 = new qi.a();
                aVar2.f47798a = Integer.parseInt(strArr5[0]);
                i13 = i23;
                aVar2.f47799b = Integer.parseInt(strArr5[1]);
                String str6 = strArr5[2];
                Matcher matcher6 = e0.u(0, ",", "compile(...)", str6, "input").matcher(str6);
                if (matcher6.find()) {
                    ArrayList arrayList12 = new ArrayList(10);
                    int iC8 = 0;
                    do {
                        iC8 = p.c(matcher6, str6, iC8, arrayList12);
                    } while (matcher6.find());
                    p.B(iC8, str6, arrayList12);
                    listK3 = arrayList12;
                } else {
                    listK3 = o.K(str6.toString());
                }
                if (listK3.isEmpty()) {
                    listT3 = rVar4;
                    break;
                }
                ListIterator listIterator8 = listK3.listIterator(listK3.size());
                while (true) {
                    if (!listIterator8.hasPrevious()) {
                        listT3 = rVar4;
                        break;
                    }
                    if (!(((String) listIterator8.previous()).length() == 0)) {
                        listT3 = e0.t(listIterator8, 1, listK3);
                        break;
                    }
                }
                String[] strArr6 = (String[]) listT3.toArray(new String[0]);
                ArrayList arrayList13 = new ArrayList();
                for (String str7 : strArr6) {
                    arrayList13.add(Integer.valueOf(Integer.parseInt(str7)));
                }
                boolean zD = d(i(), aVar2.f47798a, aVar2.f47799b);
                if (aVar2.f47798a == 0) {
                    q(aVar2, arrayList13, zD);
                } else {
                    n(aVar2, arrayList13, zD, i13);
                }
                i().add(aVar2);
            }
            i23 = i13 + 1;
            arrayList4 = arrayList4;
            size = i12;
        }
        long j11 = 0;
        if (q.v0("release", "debug", false) && xt.b.f56282d) {
            i11 = 1;
            t(i().subList(0, 1));
        } else {
            i11 = 1;
        }
        int i30 = 0;
        for (int size2 = i().size() - i11; -1 < size2; size2--) {
            qi.a aVar3 = (qi.a) i().get(size2);
            if (aVar3.f47798a == i11) {
                long j12 = aVar3.f47799b;
                if (j11 != j12) {
                    aVar3.f47800c = 13;
                    i30++;
                    j11 = j12;
                }
            }
            if (i30 == 2) {
                break;
            }
        }
        return i();
    }

    @Override // oi.c
    public final void n(qi.a aVar, ArrayList arrayList, boolean z11, int i11) {
        int i12 = this.H;
        String str = this.K;
        switch (i12) {
            case 0:
                ArrayList arrayList2 = (ArrayList) this.f44926b;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().isAudioModel) {
                    ((List) p.e(4, 1, arrayList2, (List) arrayList2.get(1))).add(5);
                    if (!q.v0(str, p.m(aVar.f47799b, ";", ";"), false)) {
                        ((List) arrayList2.get(1)).add(7);
                    }
                } else {
                    ((List) p.e(2, 1, arrayList2, (List) arrayList2.get(1))).add(5);
                    ((List) arrayList2.get(1)).add(13);
                }
                ArrayList arrayListL = c.l(i(), aVar.f47798a, aVar.f47799b);
                if (!arrayListL.isEmpty() && ((List) arrayList2.get(1)).size() > 1) {
                    ((List) arrayList2.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL)).intValue()));
                }
                ArrayList arrayListK = k(i(), aVar.f47798a);
                if (!arrayListK.isEmpty() && ((List) arrayList2.get(1)).size() > 1) {
                    ((List) arrayList2.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK)).intValue()));
                }
                String.valueOf(arrayList2.get(1));
                Collection collection = (Collection) arrayList2.get(1);
                d dVar = e.f37397a;
                aVar.f47800c = ((Number) ry.m.I0(collection)).intValue();
                aVar.f47802e = (List) arrayList2.get(1);
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) this.f44926b;
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (x.n().isAudioModel) {
                    ((List) p.e(4, 1, arrayList3, (List) arrayList3.get(1))).add(5);
                    if (!q.v0(str, p.m(aVar.f47799b, ";", ";"), false)) {
                        ((List) arrayList3.get(1)).add(7);
                    }
                } else {
                    ((List) p.e(2, 1, arrayList3, (List) arrayList3.get(1))).add(5);
                    ((List) arrayList3.get(1)).add(13);
                }
                ArrayList arrayListL2 = c.l(i(), aVar.f47798a, aVar.f47799b);
                if (!arrayListL2.isEmpty() && ((List) arrayList3.get(1)).size() > 1) {
                    ((List) arrayList3.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL2)).intValue()));
                }
                ArrayList arrayListK2 = k(i(), aVar.f47798a);
                if (!arrayListK2.isEmpty() && ((List) arrayList3.get(1)).size() > 1) {
                    ((List) arrayList3.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK2)).intValue()));
                }
                String.valueOf(arrayList3.get(1));
                Collection collection2 = (Collection) arrayList3.get(1);
                d dVar2 = e.f37397a;
                aVar.f47800c = ((Number) ry.m.I0(collection2)).intValue();
                aVar.f47802e = (List) arrayList3.get(1);
                break;
            case 2:
                ArrayList arrayList4 = (ArrayList) this.f44926b;
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                if (x.n().isAudioModel) {
                    ((List) p.e(4, 1, arrayList4, (List) arrayList4.get(1))).add(5);
                    if (!q.v0(str, p.m(aVar.f47799b, ";", ";"), false)) {
                        ((List) arrayList4.get(1)).add(7);
                    }
                } else {
                    ((List) p.e(2, 1, arrayList4, (List) arrayList4.get(1))).add(5);
                    ((List) arrayList4.get(1)).add(13);
                }
                ArrayList arrayListL3 = c.l(i(), aVar.f47798a, aVar.f47799b);
                if (!arrayListL3.isEmpty() && ((List) arrayList4.get(1)).size() > 1) {
                    ((List) arrayList4.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL3)).intValue()));
                }
                ArrayList arrayListK3 = k(i(), aVar.f47798a);
                if (!arrayListK3.isEmpty() && ((List) arrayList4.get(1)).size() > 1) {
                    ((List) arrayList4.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK3)).intValue()));
                }
                String.valueOf(arrayList4.get(1));
                Collection collection3 = (Collection) arrayList4.get(1);
                d dVar3 = e.f37397a;
                aVar.f47800c = ((Number) ry.m.I0(collection3)).intValue();
                aVar.f47802e = (List) arrayList4.get(1);
                break;
            case 3:
                ArrayList arrayList5 = (ArrayList) this.f44926b;
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                if (x.n().isAudioModel) {
                    ((List) p.e(4, 1, arrayList5, (List) arrayList5.get(1))).add(5);
                    if (!q.v0(str, p.m(aVar.f47799b, ";", ";"), false)) {
                        ((List) arrayList5.get(1)).add(7);
                    }
                } else {
                    ((List) p.e(2, 1, arrayList5, (List) arrayList5.get(1))).add(5);
                    ((List) arrayList5.get(1)).add(13);
                }
                ArrayList arrayListL4 = c.l(i(), aVar.f47798a, aVar.f47799b);
                if (!arrayListL4.isEmpty() && ((List) arrayList5.get(1)).size() > 1) {
                    ((List) arrayList5.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL4)).intValue()));
                }
                ArrayList arrayListK4 = k(i(), aVar.f47798a);
                if (!arrayListK4.isEmpty() && ((List) arrayList5.get(1)).size() > 1) {
                    ((List) arrayList5.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK4)).intValue()));
                }
                String.valueOf(arrayList5.get(1));
                Collection collection4 = (Collection) arrayList5.get(1);
                d dVar4 = e.f37397a;
                aVar.f47800c = ((Number) ry.m.I0(collection4)).intValue();
                aVar.f47802e = (List) arrayList5.get(1);
                break;
            case 4:
                ArrayList arrayList6 = (ArrayList) this.f44926b;
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                if (x.n().isAudioModel) {
                    if (arrayList.contains(5)) {
                        ((List) p.e(4, 1, arrayList6, (List) arrayList6.get(1))).add(5);
                    }
                    if (!q.v0(str, p.m(aVar.f47799b, ";", ";"), false)) {
                        ((List) arrayList6.get(1)).add(7);
                    }
                } else {
                    ((List) p.e(2, 1, arrayList6, (List) arrayList6.get(1))).add(5);
                    ((List) arrayList6.get(1)).add(13);
                }
                ArrayList arrayListL5 = c.l(i(), aVar.f47798a, aVar.f47799b);
                if (!arrayListL5.isEmpty() && ((List) arrayList6.get(1)).size() > 1) {
                    ((List) arrayList6.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL5)).intValue()));
                }
                ArrayList arrayListK5 = k(i(), aVar.f47798a);
                if (!arrayListK5.isEmpty() && ((List) arrayList6.get(1)).size() > 1) {
                    ((List) arrayList6.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK5)).intValue()));
                }
                String.valueOf(arrayList6.get(1));
                Collection collection5 = (Collection) arrayList6.get(1);
                d dVar5 = e.f37397a;
                aVar.f47800c = ((Number) ry.m.I0(collection5)).intValue();
                aVar.f47802e = (List) arrayList6.get(1);
                break;
            default:
                ArrayList arrayList7 = (ArrayList) this.f44926b;
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                if (x.n().isAudioModel) {
                    ((List) p.e(4, 1, arrayList7, (List) arrayList7.get(1))).add(5);
                    if (!q.v0(str, p.m(aVar.f47799b, ";", ";"), false)) {
                        ((List) arrayList7.get(1)).add(7);
                    }
                } else {
                    ((List) p.e(2, 1, arrayList7, (List) arrayList7.get(1))).add(5);
                    ((List) arrayList7.get(1)).add(13);
                }
                ArrayList arrayListL6 = c.l(i(), aVar.f47798a, aVar.f47799b);
                if (!arrayListL6.isEmpty() && ((List) arrayList7.get(1)).size() > 1) {
                    ((List) arrayList7.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL6)).intValue()));
                }
                ArrayList arrayListK6 = k(i(), aVar.f47798a);
                if (!arrayListK6.isEmpty() && ((List) arrayList7.get(1)).size() > 1) {
                    ((List) arrayList7.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK6)).intValue()));
                }
                String.valueOf(arrayList7.get(1));
                Collection collection6 = (Collection) arrayList7.get(1);
                d dVar6 = e.f37397a;
                aVar.f47800c = ((Number) ry.m.I0(collection6)).intValue();
                aVar.f47802e = (List) arrayList7.get(1);
                break;
        }
    }

    @Override // oi.c
    public final void q(qi.a aVar, ArrayList arrayList, boolean z11) {
        switch (this.H) {
            case 0:
                ArrayList arrayList2 = (ArrayList) this.f44926b;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().isAudioModel) {
                    ((List) p.e(4, 1, arrayList2, (List) p.e(3, 1, arrayList2, (List) arrayList2.get(1)))).add(9);
                } else {
                    ((List) arrayList2.get(1)).add(9);
                    ((List) arrayList2.get(1)).add(10);
                }
                ArrayList arrayListL = c.l(i(), aVar.f47798a, aVar.f47799b);
                if (!arrayListL.isEmpty() && ((List) arrayList2.get(1)).size() > 1) {
                    ((List) arrayList2.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL)).intValue()));
                }
                ArrayList arrayListK = k(i(), aVar.f47798a);
                if (!arrayListK.isEmpty() && ((List) arrayList2.get(1)).size() > 1) {
                    ((List) arrayList2.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK)).intValue()));
                }
                String.valueOf(arrayList2.get(1));
                Collection collection = (Collection) arrayList2.get(1);
                d dVar = e.f37397a;
                aVar.f47800c = ((Number) ry.m.I0(collection)).intValue();
                aVar.f47802e = (List) arrayList2.get(1);
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) this.f44926b;
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (x.n().isAudioModel) {
                    ((List) p.e(3, 1, arrayList3, (List) arrayList3.get(1))).add(9);
                } else {
                    ((List) arrayList3.get(1)).add(9);
                    ((List) arrayList3.get(1)).add(10);
                }
                ArrayList arrayListL2 = c.l(i(), aVar.f47798a, aVar.f47799b);
                if (!arrayListL2.isEmpty() && ((List) arrayList3.get(1)).size() > 1) {
                    ((List) arrayList3.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL2)).intValue()));
                }
                ArrayList arrayListK2 = k(i(), aVar.f47798a);
                if (!arrayListK2.isEmpty() && ((List) arrayList3.get(1)).size() > 1) {
                    ((List) arrayList3.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK2)).intValue()));
                }
                String.valueOf(arrayList3.get(1));
                Collection collection2 = (Collection) arrayList3.get(1);
                d dVar2 = e.f37397a;
                aVar.f47800c = ((Number) ry.m.I0(collection2)).intValue();
                aVar.f47802e = (List) arrayList3.get(1);
                break;
            case 2:
                ArrayList arrayList4 = (ArrayList) this.f44926b;
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                if (x.n().isAudioModel) {
                    ((List) p.e(4, 1, arrayList4, (List) p.e(3, 1, arrayList4, (List) arrayList4.get(1)))).add(9);
                } else {
                    ((List) arrayList4.get(1)).add(9);
                    ((List) arrayList4.get(1)).add(10);
                }
                ArrayList arrayListL3 = c.l(i(), aVar.f47798a, aVar.f47799b);
                if (!arrayListL3.isEmpty() && ((List) arrayList4.get(1)).size() > 1) {
                    ((List) arrayList4.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL3)).intValue()));
                }
                ArrayList arrayListK3 = k(i(), aVar.f47798a);
                if (!arrayListK3.isEmpty() && ((List) arrayList4.get(1)).size() > 1) {
                    ((List) arrayList4.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK3)).intValue()));
                }
                String.valueOf(arrayList4.get(1));
                Collection collection3 = (Collection) arrayList4.get(1);
                d dVar3 = e.f37397a;
                aVar.f47800c = ((Number) ry.m.I0(collection3)).intValue();
                aVar.f47802e = (List) arrayList4.get(1);
                break;
            case 3:
                ArrayList arrayList5 = (ArrayList) this.f44926b;
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                if (x.n().isAudioModel) {
                    ((List) p.e(4, 1, arrayList5, (List) arrayList5.get(1))).add(9);
                } else {
                    ((List) arrayList5.get(1)).add(9);
                    ((List) arrayList5.get(1)).add(10);
                }
                ArrayList arrayListL4 = c.l(i(), aVar.f47798a, aVar.f47799b);
                if (!arrayListL4.isEmpty() && ((List) arrayList5.get(1)).size() > 1) {
                    ((List) arrayList5.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL4)).intValue()));
                }
                ArrayList arrayListK4 = k(i(), aVar.f47798a);
                if (!arrayListK4.isEmpty() && ((List) arrayList5.get(1)).size() > 1) {
                    ((List) arrayList5.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK4)).intValue()));
                }
                String.valueOf(arrayList5.get(1));
                Collection collection4 = (Collection) arrayList5.get(1);
                d dVar4 = e.f37397a;
                aVar.f47800c = ((Number) ry.m.I0(collection4)).intValue();
                aVar.f47802e = (List) arrayList5.get(1);
                break;
            case 4:
                ArrayList arrayList6 = (ArrayList) this.f44926b;
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                if (!x.n().isAudioModel) {
                    ((List) arrayList6.get(1)).add(9);
                    ((List) arrayList6.get(1)).add(10);
                } else if (x.n().locateLanguage == 1) {
                    ((List) p.e(5, 1, arrayList6, (List) arrayList6.get(1))).add(11);
                } else {
                    ((List) p.e(4, 1, arrayList6, (List) arrayList6.get(1))).add(9);
                }
                ArrayList arrayListL5 = c.l(i(), aVar.f47798a, aVar.f47799b);
                if (!arrayListL5.isEmpty() && ((List) arrayList6.get(1)).size() > 1) {
                    ((List) arrayList6.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL5)).intValue()));
                }
                ArrayList arrayListK5 = k(i(), aVar.f47798a);
                if (!arrayListK5.isEmpty() && ((List) arrayList6.get(1)).size() > 1) {
                    ((List) arrayList6.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK5)).intValue()));
                }
                String.valueOf(arrayList6.get(1));
                Collection collection5 = (Collection) arrayList6.get(1);
                d dVar5 = e.f37397a;
                aVar.f47800c = ((Number) ry.m.I0(collection5)).intValue();
                aVar.f47802e = (List) arrayList6.get(1);
                break;
            default:
                ArrayList arrayList7 = (ArrayList) this.f44926b;
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                if (x.n().isAudioModel) {
                    ((List) p.e(3, 1, arrayList7, (List) arrayList7.get(1))).add(9);
                } else {
                    ((List) arrayList7.get(1)).add(9);
                    ((List) arrayList7.get(1)).add(10);
                }
                ArrayList arrayListL6 = c.l(i(), aVar.f47798a, aVar.f47799b);
                if (!arrayListL6.isEmpty() && ((List) arrayList7.get(1)).size() > 1) {
                    ((List) arrayList7.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL6)).intValue()));
                }
                ArrayList arrayListK6 = k(i(), aVar.f47798a);
                if (!arrayListK6.isEmpty() && ((List) arrayList7.get(1)).size() > 1) {
                    ((List) arrayList7.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK6)).intValue()));
                }
                String.valueOf(arrayList7.get(1));
                Collection collection6 = (Collection) arrayList7.get(1);
                d dVar6 = e.f37397a;
                aVar.f47800c = ((Number) ry.m.I0(collection6)).intValue();
                aVar.f47802e = (List) arrayList7.get(1);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x03a9  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    private final List y(String str) {
        List listK;
        List listT;
        int i11;
        int i12;
        List listK2;
        List listT2;
        int i13;
        List listK3;
        List listT3;
        int iC;
        List listK4;
        boolean z11;
        List listT4;
        List listK5;
        List listT5;
        List listK6;
        List listT6;
        List listK7;
        List listT7;
        boolean z12;
        List listK8;
        List listT8;
        ArrayList arrayList = (ArrayList) this.f44926b;
        ArrayList arrayList2 = (ArrayList) this.f44927c;
        this.f44925a = w4.c.m(str, "repeatRegex");
        ?? r9 = 0;
        Matcher matcherW = p.w(0, "#", "compile(...)", str);
        if (matcherW.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iC2 = 0;
            do {
                iC2 = p.c(matcherW, str, iC2, arrayList3);
            } while (matcherW.find());
            p.B(iC2, str, arrayList3);
            listK = arrayList3;
        } else {
            listK = o.K(str.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        r rVar = r.f50854a;
        if (zIsEmpty) {
            listT = rVar;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listT = rVar;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                listT = e0.t(listIterator, 1, listK);
                break;
            }
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        ArrayList arrayList4 = new ArrayList();
        int length = strArr.length;
        int i14 = 0;
        while (i14 < length) {
            String strQ0 = strArr[i14];
            if (oz.x.s0(strQ0, "3:", r9)) {
                strQ0 = oz.x.q0(oz.x.q0(strQ0, ":-", ":0-"), ":;", ":0;");
            }
            Matcher matcherW2 = p.w(r9, ";", "compile(...)", strQ0);
            if (matcherW2.find()) {
                ArrayList arrayList5 = new ArrayList(10);
                int iC3 = 0;
                do {
                    iC3 = p.c(matcherW2, strQ0, iC3, arrayList5);
                } while (matcherW2.find());
                p.B(iC3, strQ0, arrayList5);
                listK6 = arrayList5;
            } else {
                listK6 = o.K(strQ0.toString());
            }
            if (listK6.isEmpty()) {
                listT6 = rVar;
                break;
            }
            ListIterator listIterator2 = listK6.listIterator(listK6.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT6 = rVar;
                    break;
                }
                if (((String) listIterator2.previous()).length() != 0) {
                    listT6 = e0.t(listIterator2, 1, listK6);
                    break;
                }
            }
            String[] strArr2 = (String[]) listT6.toArray(new String[0]);
            int i15 = strArr2.length > 2 ? Integer.parseInt(strArr2[2]) : 1;
            String str2 = strArr2[0];
            Matcher matcher = e0.u(0, "-", "compile(...)", str2, "input").matcher(str2);
            if (matcher.find()) {
                ArrayList arrayList6 = new ArrayList(10);
                int iC4 = 0;
                do {
                    iC4 = p.c(matcher, str2, iC4, arrayList6);
                } while (matcher.find());
                p.B(iC4, str2, arrayList6);
                listK7 = arrayList6;
            } else {
                listK7 = o.K(str2.toString());
            }
            if (listK7.isEmpty()) {
                listT7 = rVar;
                break;
            }
            ListIterator listIterator3 = listK7.listIterator(listK7.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT7 = rVar;
                    break;
                }
                if (((String) listIterator3.previous()).length() != 0) {
                    listT7 = e0.t(listIterator3, 1, listK7);
                    break;
                }
            }
            String[] strArr3 = (String[]) listT7.toArray(new String[0]);
            if (strArr3.length >= 3) {
                int length2 = strArr3.length;
                int i16 = 0;
                z12 = true;
                while (i16 < length2) {
                    int i17 = i16;
                    String str3 = strArr3[i17];
                    r rVar2 = rVar;
                    int i18 = length;
                    Matcher matcher2 = e0.u(0, ":", "compile(...)", str3, "input").matcher(str3);
                    if (matcher2.find()) {
                        ArrayList arrayList7 = new ArrayList(10);
                        int iC5 = 0;
                        do {
                            iC5 = p.c(matcher2, str3, iC5, arrayList7);
                        } while (matcher2.find());
                        p.B(iC5, str3, arrayList7);
                        listK8 = arrayList7;
                    } else {
                        listK8 = o.K(str3.toString());
                    }
                    if (listK8.isEmpty()) {
                        listT8 = rVar2;
                        break;
                    }
                    ListIterator listIterator4 = listK8.listIterator(listK8.size());
                    while (true) {
                        if (!listIterator4.hasPrevious()) {
                            listT8 = rVar2;
                            break;
                        }
                        if (((String) listIterator4.previous()).length() != 0) {
                            listT8 = e0.t(listIterator4, 1, listK8);
                            break;
                        }
                    }
                    String[] strArr4 = (String[]) listT8.toArray(new String[0]);
                    if ((!m.a(strArr4[0], "0") || !m.a(strArr4[2], "0")) && (!m.a(strArr4[0], "3") || !m.a(strArr4[2], "0"))) {
                        z12 = false;
                    }
                    i16 = i17 + 1;
                    rVar = rVar2;
                    length = i18;
                    i14 = i14;
                }
            } else {
                z12 = false;
            }
            r rVar3 = rVar;
            int i19 = length;
            int i21 = i14;
            if (z12) {
                arrayList4.add(str2);
            } else {
                for (int i22 : j3.P(strArr3.length, i15)) {
                    arrayList4.add(strArr3[i22]);
                }
            }
            i14 = i21 + 1;
            strArr = strArr;
            rVar = rVar3;
            length = i19;
            r9 = 0;
        }
        r rVar4 = rVar;
        int size = arrayList4.size();
        int i23 = 0;
        while (i23 < size) {
            Object obj = arrayList4.get(i23);
            m.e(obj, SemtNwfPgIhi.MasFn);
            String str4 = (String) obj;
            int i24 = 0;
            if (q.W0(str4, new String[]{"-"}, 0, 6).size() >= 3) {
                ArrayList arrayList8 = new ArrayList();
                List<String> listW0 = q.W0(str4, new String[]{"-"}, 0, 6);
                int i25 = 6;
                for (String str5 : listW0) {
                    Matcher matcher3 = e0.u(i24, ":", "compile(...)", str5, "input").matcher(str5);
                    if (matcher3.find()) {
                        ArrayList arrayList9 = new ArrayList(10);
                        int i26 = 0;
                        while (true) {
                            iC = p.c(matcher3, str5, i26, arrayList9);
                            if (!matcher3.find()) {
                                break;
                            }
                            i26 = iC;
                        }
                        p.B(iC, str5, arrayList9);
                        listK4 = arrayList9;
                    } else {
                        listK4 = o.K(str5.toString());
                    }
                    if (listK4.isEmpty()) {
                        z11 = true;
                        listT4 = rVar4;
                        break;
                    }
                    ListIterator listIterator5 = listK4.listIterator(listK4.size());
                    while (true) {
                        if (!listIterator5.hasPrevious()) {
                            z11 = true;
                            listT4 = rVar4;
                            break;
                        }
                        if (!(((String) listIterator5.previous()).length() == 0)) {
                            z11 = true;
                            listT4 = e0.t(listIterator5, 1, listK4);
                            break;
                        }
                    }
                    arrayList8.add(Long.valueOf(((String[]) listT4.toArray(new String[0]))[z11 ? 1 : 0]));
                    Pattern patternCompile = Pattern.compile(":");
                    m.e(patternCompile, "compile(...)");
                    q.U0(0);
                    Matcher matcher4 = patternCompile.matcher(str5);
                    if (matcher4.find()) {
                        ArrayList arrayList10 = new ArrayList(10);
                        int iC6 = 0;
                        while (true) {
                            iC6 = p.c(matcher4, str5, iC6, arrayList10);
                            if (!matcher4.find()) {
                                break;
                            }
                            matcher4 = matcher4;
                        }
                        p.B(iC6, str5, arrayList10);
                        listK5 = arrayList10;
                    } else {
                        listK5 = o.K(str5.toString());
                    }
                    if (listK5.isEmpty()) {
                        listT5 = rVar4;
                        break;
                    }
                    ListIterator listIterator6 = listK5.listIterator(listK5.size());
                    while (true) {
                        if (!listIterator6.hasPrevious()) {
                            listT5 = rVar4;
                            break;
                        }
                        if (!(((String) listIterator6.previous()).length() == 0)) {
                            listT5 = e0.t(listIterator6, 1, listK5);
                            break;
                        }
                    }
                    i24 = 0;
                    i25 = Integer.parseInt(((String[]) listT5.toArray(new String[0]))[2]);
                    size = size;
                }
                i12 = size;
                int i27 = i24;
                int i28 = 6;
                int i29 = Integer.parseInt((String) q.W0((CharSequence) listW0.get(i27), new String[]{":"}, i27, 6).get(i27));
                if (i29 != 0) {
                    if (i29 != 3) {
                        i28 = i25;
                    } else {
                        i28 = 14;
                    }
                } else if (i25 != 0) {
                    i28 = i25;
                }
                qi.a aVar = new qi.a();
                aVar.f47798a = i29;
                aVar.f47799b = 0L;
                aVar.f47800c = i28;
                aVar.f47801d = arrayList8;
                i().add(aVar);
                i13 = i23;
            } else {
                i12 = size;
                arrayList.clear();
                arrayList2.clear();
                arrayList.add(new ArrayList());
                arrayList.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                Pattern patternCompile2 = Pattern.compile(":");
                m.e(patternCompile2, "compile(...)");
                q.U0(0);
                Matcher matcher5 = patternCompile2.matcher(str4);
                if (matcher5.find()) {
                    ArrayList arrayList11 = new ArrayList(10);
                    int iC7 = 0;
                    do {
                        iC7 = p.c(matcher5, str4, iC7, arrayList11);
                    } while (matcher5.find());
                    p.B(iC7, str4, arrayList11);
                    listK2 = arrayList11;
                } else {
                    listK2 = o.K(str4.toString());
                }
                if (listK2.isEmpty()) {
                    listT2 = rVar4;
                    break;
                }
                ListIterator listIterator7 = listK2.listIterator(listK2.size());
                while (true) {
                    if (!listIterator7.hasPrevious()) {
                        listT2 = rVar4;
                        break;
                    }
                    if (!(((String) listIterator7.previous()).length() == 0)) {
                        listT2 = e0.t(listIterator7, 1, listK2);
                        break;
                    }
                }
                String[] strArr5 = (String[]) listT2.toArray(new String[0]);
                qi.a aVar2 = new qi.a();
                aVar2.f47798a = Integer.parseInt(strArr5[0]);
                i13 = i23;
                aVar2.f47799b = Integer.parseInt(strArr5[1]);
                String str6 = strArr5[2];
                Matcher matcher6 = e0.u(0, ",", "compile(...)", str6, "input").matcher(str6);
                if (matcher6.find()) {
                    ArrayList arrayList12 = new ArrayList(10);
                    int iC8 = 0;
                    do {
                        iC8 = p.c(matcher6, str6, iC8, arrayList12);
                    } while (matcher6.find());
                    p.B(iC8, str6, arrayList12);
                    listK3 = arrayList12;
                } else {
                    listK3 = o.K(str6.toString());
                }
                if (listK3.isEmpty()) {
                    listT3 = rVar4;
                    break;
                }
                ListIterator listIterator8 = listK3.listIterator(listK3.size());
                while (true) {
                    if (!listIterator8.hasPrevious()) {
                        listT3 = rVar4;
                        break;
                    }
                    if (!(((String) listIterator8.previous()).length() == 0)) {
                        listT3 = e0.t(listIterator8, 1, listK3);
                        break;
                    }
                }
                String[] strArr6 = (String[]) listT3.toArray(new String[0]);
                ArrayList arrayList13 = new ArrayList();
                for (String str7 : strArr6) {
                    arrayList13.add(Integer.valueOf(Integer.parseInt(str7)));
                }
                boolean zD = d(i(), aVar2.f47798a, aVar2.f47799b);
                if (aVar2.f47798a == 0) {
                    q(aVar2, arrayList13, zD);
                } else {
                    n(aVar2, arrayList13, zD, i13);
                }
                i().add(aVar2);
            }
            i23 = i13 + 1;
            arrayList4 = arrayList4;
            size = i12;
        }
        long j11 = 0;
        if (q.v0("release", "debug", false) && xt.b.f56282d) {
            i11 = 1;
            t(i().subList(0, 1));
        } else {
            i11 = 1;
        }
        int i30 = 0;
        for (int size2 = i().size() - i11; -1 < size2; size2--) {
            qi.a aVar3 = (qi.a) i().get(size2);
            if (aVar3.f47798a == i11) {
                long j12 = aVar3.f47799b;
                if (j11 != j12) {
                    aVar3.f47800c = 13;
                    i30++;
                    j11 = j12;
                }
            }
            if (i30 == 2) {
                break;
            }
        }
        return i();
    }

    /* JADX WARN: Code duplicated, block: B:164:0x03a9  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    private final List z(String str) {
        List listK;
        List listT;
        String str2;
        int i11;
        int i12;
        List listK2;
        List listT2;
        int i13;
        List listK3;
        List listT3;
        int iC;
        List listK4;
        boolean z11;
        List listT4;
        List listK5;
        List listT5;
        List listK6;
        List listT6;
        List listK7;
        List listT7;
        boolean z12;
        List listK8;
        List listT8;
        ArrayList arrayList = (ArrayList) this.f44926b;
        ArrayList arrayList2 = (ArrayList) this.f44927c;
        this.f44925a = w4.c.m(str, "repeatRegex");
        ?? r9 = 0;
        Matcher matcherW = p.w(0, "#", "compile(...)", str);
        if (matcherW.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iC2 = 0;
            do {
                iC2 = p.c(matcherW, str, iC2, arrayList3);
            } while (matcherW.find());
            p.B(iC2, str, arrayList3);
            listK = arrayList3;
        } else {
            listK = o.K(str.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        r rVar = r.f50854a;
        if (zIsEmpty) {
            listT = rVar;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listT = rVar;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                listT = e0.t(listIterator, 1, listK);
                break;
            }
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        ArrayList arrayList4 = new ArrayList();
        int length = strArr.length;
        int i14 = 0;
        while (true) {
            str2 = OYAvlbfUyD.bvFKauK;
            if (i14 >= length) {
                break;
            }
            String strQ0 = strArr[i14];
            if (oz.x.s0(strQ0, "3:", r9)) {
                strQ0 = oz.x.q0(oz.x.q0(strQ0, ":-", ":0-"), ":;", ":0;");
            }
            Matcher matcherW2 = p.w(r9, ";", "compile(...)", strQ0);
            if (matcherW2.find()) {
                ArrayList arrayList5 = new ArrayList(10);
                int iC3 = 0;
                do {
                    iC3 = p.c(matcherW2, strQ0, iC3, arrayList5);
                } while (matcherW2.find());
                p.B(iC3, strQ0, arrayList5);
                listK6 = arrayList5;
            } else {
                listK6 = o.K(strQ0.toString());
            }
            if (listK6.isEmpty()) {
                listT6 = rVar;
                break;
            }
            ListIterator listIterator2 = listK6.listIterator(listK6.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT6 = rVar;
                    break;
                }
                if (((String) listIterator2.previous()).length() != 0) {
                    listT6 = e0.t(listIterator2, 1, listK6);
                    break;
                }
            }
            String[] strArr2 = (String[]) listT6.toArray(new String[0]);
            int i15 = strArr2.length > 2 ? Integer.parseInt(strArr2[2]) : 1;
            String str3 = strArr2[0];
            Matcher matcher = e0.u(0, str2, "compile(...)", str3, "input").matcher(str3);
            if (matcher.find()) {
                ArrayList arrayList6 = new ArrayList(10);
                int iC4 = 0;
                do {
                    iC4 = p.c(matcher, str3, iC4, arrayList6);
                } while (matcher.find());
                p.B(iC4, str3, arrayList6);
                listK7 = arrayList6;
            } else {
                listK7 = o.K(str3.toString());
            }
            if (listK7.isEmpty()) {
                listT7 = rVar;
                break;
            }
            ListIterator listIterator3 = listK7.listIterator(listK7.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT7 = rVar;
                    break;
                }
                if (((String) listIterator3.previous()).length() != 0) {
                    listT7 = e0.t(listIterator3, 1, listK7);
                    break;
                }
            }
            String[] strArr3 = (String[]) listT7.toArray(new String[0]);
            if (strArr3.length >= 3) {
                int length2 = strArr3.length;
                int i16 = 0;
                z12 = true;
                while (i16 < length2) {
                    int i17 = i16;
                    String str4 = strArr3[i17];
                    r rVar2 = rVar;
                    int i18 = length;
                    Matcher matcher2 = e0.u(0, ":", "compile(...)", str4, "input").matcher(str4);
                    if (matcher2.find()) {
                        ArrayList arrayList7 = new ArrayList(10);
                        int iC5 = 0;
                        do {
                            iC5 = p.c(matcher2, str4, iC5, arrayList7);
                        } while (matcher2.find());
                        p.B(iC5, str4, arrayList7);
                        listK8 = arrayList7;
                    } else {
                        listK8 = o.K(str4.toString());
                    }
                    if (listK8.isEmpty()) {
                        listT8 = rVar2;
                        break;
                    }
                    ListIterator listIterator4 = listK8.listIterator(listK8.size());
                    while (true) {
                        if (!listIterator4.hasPrevious()) {
                            listT8 = rVar2;
                            break;
                        }
                        if (((String) listIterator4.previous()).length() != 0) {
                            listT8 = e0.t(listIterator4, 1, listK8);
                            break;
                        }
                    }
                    String[] strArr4 = (String[]) listT8.toArray(new String[0]);
                    if ((!m.a(strArr4[0], "0") || !m.a(strArr4[2], "0")) && (!m.a(strArr4[0], "3") || !m.a(strArr4[2], "0"))) {
                        z12 = false;
                    }
                    i16 = i17 + 1;
                    rVar = rVar2;
                    length = i18;
                    i14 = i14;
                }
            } else {
                z12 = false;
            }
            r rVar3 = rVar;
            int i19 = length;
            int i21 = i14;
            if (z12) {
                arrayList4.add(str3);
            } else {
                for (int i22 : j3.P(strArr3.length, i15)) {
                    arrayList4.add(strArr3[i22]);
                }
            }
            i14 = i21 + 1;
            strArr = strArr;
            rVar = rVar3;
            length = i19;
            r9 = 0;
        }
        r rVar4 = rVar;
        int size = arrayList4.size();
        int i23 = 0;
        while (i23 < size) {
            Object obj = arrayList4.get(i23);
            m.e(obj, "get(...)");
            String str5 = (String) obj;
            int i24 = 0;
            if (q.W0(str5, new String[]{str2}, 0, 6).size() >= 3) {
                ArrayList arrayList8 = new ArrayList();
                List<String> listW0 = q.W0(str5, new String[]{str2}, 0, 6);
                int i25 = 6;
                for (String str6 : listW0) {
                    Matcher matcher3 = e0.u(i24, ":", "compile(...)", str6, "input").matcher(str6);
                    if (matcher3.find()) {
                        ArrayList arrayList9 = new ArrayList(10);
                        int i26 = 0;
                        while (true) {
                            iC = p.c(matcher3, str6, i26, arrayList9);
                            if (!matcher3.find()) {
                                break;
                            }
                            i26 = iC;
                        }
                        p.B(iC, str6, arrayList9);
                        listK4 = arrayList9;
                    } else {
                        listK4 = o.K(str6.toString());
                    }
                    if (listK4.isEmpty()) {
                        z11 = true;
                        listT4 = rVar4;
                        break;
                    }
                    ListIterator listIterator5 = listK4.listIterator(listK4.size());
                    while (true) {
                        if (!listIterator5.hasPrevious()) {
                            z11 = true;
                            listT4 = rVar4;
                            break;
                        }
                        if (!(((String) listIterator5.previous()).length() == 0)) {
                            z11 = true;
                            listT4 = e0.t(listIterator5, 1, listK4);
                            break;
                        }
                    }
                    arrayList8.add(Long.valueOf(((String[]) listT4.toArray(new String[0]))[z11 ? 1 : 0]));
                    Pattern patternCompile = Pattern.compile(":");
                    m.e(patternCompile, "compile(...)");
                    q.U0(0);
                    Matcher matcher4 = patternCompile.matcher(str6);
                    if (matcher4.find()) {
                        ArrayList arrayList10 = new ArrayList(10);
                        int iC6 = 0;
                        while (true) {
                            iC6 = p.c(matcher4, str6, iC6, arrayList10);
                            if (!matcher4.find()) {
                                break;
                            }
                            matcher4 = matcher4;
                        }
                        p.B(iC6, str6, arrayList10);
                        listK5 = arrayList10;
                    } else {
                        listK5 = o.K(str6.toString());
                    }
                    if (listK5.isEmpty()) {
                        listT5 = rVar4;
                        break;
                    }
                    ListIterator listIterator6 = listK5.listIterator(listK5.size());
                    while (true) {
                        if (!listIterator6.hasPrevious()) {
                            listT5 = rVar4;
                            break;
                        }
                        if (!(((String) listIterator6.previous()).length() == 0)) {
                            listT5 = e0.t(listIterator6, 1, listK5);
                            break;
                        }
                    }
                    i24 = 0;
                    i25 = Integer.parseInt(((String[]) listT5.toArray(new String[0]))[2]);
                    size = size;
                }
                i12 = size;
                int i27 = i24;
                int i28 = 6;
                int i29 = Integer.parseInt((String) q.W0((CharSequence) listW0.get(i27), new String[]{":"}, i27, 6).get(i27));
                if (i29 != 0) {
                    if (i29 != 3) {
                        i28 = i25;
                    } else {
                        i28 = 14;
                    }
                } else if (i25 != 0) {
                    i28 = i25;
                }
                qi.a aVar = new qi.a();
                aVar.f47798a = i29;
                aVar.f47799b = 0L;
                aVar.f47800c = i28;
                aVar.f47801d = arrayList8;
                i().add(aVar);
                i13 = i23;
            } else {
                i12 = size;
                arrayList.clear();
                arrayList2.clear();
                arrayList.add(new ArrayList());
                arrayList.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                Pattern patternCompile2 = Pattern.compile(":");
                m.e(patternCompile2, "compile(...)");
                q.U0(0);
                Matcher matcher5 = patternCompile2.matcher(str5);
                if (matcher5.find()) {
                    ArrayList arrayList11 = new ArrayList(10);
                    int iC7 = 0;
                    do {
                        iC7 = p.c(matcher5, str5, iC7, arrayList11);
                    } while (matcher5.find());
                    p.B(iC7, str5, arrayList11);
                    listK2 = arrayList11;
                } else {
                    listK2 = o.K(str5.toString());
                }
                if (listK2.isEmpty()) {
                    listT2 = rVar4;
                    break;
                }
                ListIterator listIterator7 = listK2.listIterator(listK2.size());
                while (true) {
                    if (!listIterator7.hasPrevious()) {
                        listT2 = rVar4;
                        break;
                    }
                    if (!(((String) listIterator7.previous()).length() == 0)) {
                        listT2 = e0.t(listIterator7, 1, listK2);
                        break;
                    }
                }
                String[] strArr5 = (String[]) listT2.toArray(new String[0]);
                qi.a aVar2 = new qi.a();
                aVar2.f47798a = Integer.parseInt(strArr5[0]);
                i13 = i23;
                aVar2.f47799b = Integer.parseInt(strArr5[1]);
                String str7 = strArr5[2];
                Matcher matcher6 = e0.u(0, ",", "compile(...)", str7, "input").matcher(str7);
                if (matcher6.find()) {
                    ArrayList arrayList12 = new ArrayList(10);
                    int iC8 = 0;
                    do {
                        iC8 = p.c(matcher6, str7, iC8, arrayList12);
                    } while (matcher6.find());
                    p.B(iC8, str7, arrayList12);
                    listK3 = arrayList12;
                } else {
                    listK3 = o.K(str7.toString());
                }
                if (listK3.isEmpty()) {
                    listT3 = rVar4;
                    break;
                }
                ListIterator listIterator8 = listK3.listIterator(listK3.size());
                while (true) {
                    if (!listIterator8.hasPrevious()) {
                        listT3 = rVar4;
                        break;
                    }
                    if (!(((String) listIterator8.previous()).length() == 0)) {
                        listT3 = e0.t(listIterator8, 1, listK3);
                        break;
                    }
                }
                String[] strArr6 = (String[]) listT3.toArray(new String[0]);
                ArrayList arrayList13 = new ArrayList();
                for (String str8 : strArr6) {
                    arrayList13.add(Integer.valueOf(Integer.parseInt(str8)));
                }
                boolean zD = d(i(), aVar2.f47798a, aVar2.f47799b);
                if (aVar2.f47798a == 0) {
                    q(aVar2, arrayList13, zD);
                } else {
                    n(aVar2, arrayList13, zD, i13);
                }
                i().add(aVar2);
            }
            i23 = i13 + 1;
            arrayList4 = arrayList4;
            size = i12;
        }
        long j11 = 0;
        if (q.v0("release", "debug", false) && xt.b.f56282d) {
            i11 = 1;
            t(i().subList(0, 1));
        } else {
            i11 = 1;
        }
        int i30 = 0;
        for (int size2 = i().size() - i11; -1 < size2; size2--) {
            qi.a aVar3 = (qi.a) i().get(size2);
            if (aVar3.f47798a == i11) {
                long j12 = aVar3.f47799b;
                if (j11 != j12) {
                    aVar3.f47800c = 13;
                    i30++;
                    j11 = j12;
                }
            }
            if (i30 == 2) {
                break;
            }
        }
        return i();
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:408:0x0943  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v84 */
    @Override // oi.c
    public final List s(String str) {
        List listK;
        List listT;
        int i11;
        int i12;
        List listK2;
        List listT2;
        int i13;
        List listK3;
        List listT3;
        List listK4;
        boolean z11;
        List listT4;
        List listK5;
        List listT5;
        List listK6;
        List listT6;
        List listK7;
        List listT7;
        boolean z12;
        List listK8;
        List listT8;
        List listK9;
        List listT9;
        int i14;
        int i15;
        List listK10;
        List listT10;
        int i16;
        List listK11;
        List listT11;
        List listK12;
        boolean z13;
        List listT12;
        List listK13;
        List listT13;
        List listK14;
        List listT14;
        List listK15;
        List listT15;
        boolean z14;
        List listK16;
        List listT16;
        switch (this.H) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f44926b;
                ArrayList arrayList2 = (ArrayList) this.f44927c;
                this.f44925a = w4.c.m(str, "repeatRegex");
                ?? r9 = 0;
                Matcher matcherW = p.w(0, "#", "compile(...)", str);
                if (matcherW.find()) {
                    ArrayList arrayList3 = new ArrayList(10);
                    int iC = 0;
                    do {
                        iC = p.c(matcherW, str, iC, arrayList3);
                    } while (matcherW.find());
                    p.B(iC, str, arrayList3);
                    listK = arrayList3;
                } else {
                    listK = o.K(str.toString());
                }
                boolean zIsEmpty = listK.isEmpty();
                r rVar = r.f50854a;
                if (zIsEmpty) {
                    listT = rVar;
                } else {
                    ListIterator listIterator = listK.listIterator(listK.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            listT = rVar;
                        } else if (((String) listIterator.previous()).length() != 0) {
                            listT = e0.t(listIterator, 1, listK);
                        }
                    }
                }
                String[] strArr = (String[]) listT.toArray(new String[0]);
                ArrayList arrayList4 = new ArrayList();
                int length = strArr.length;
                int i17 = 0;
                while (true) {
                    String str2 = MFeWs.YuScYKQGMh;
                    if (i17 >= length) {
                        r rVar2 = rVar;
                        int size = arrayList4.size();
                        int i18 = 0;
                        while (i18 < size) {
                            Object obj = arrayList4.get(i18);
                            m.e(obj, "get(...)");
                            String str3 = (String) obj;
                            int i19 = 0;
                            if (q.W0(str3, new String[]{"-"}, 0, 6).size() >= 3) {
                                ArrayList arrayList5 = new ArrayList();
                                List<String> listW0 = q.W0(str3, new String[]{"-"}, 0, 6);
                                int i21 = 6;
                                for (String str4 : listW0) {
                                    Matcher matcher = e0.u(i19, ":", "compile(...)", str4, str2).matcher(str4);
                                    if (matcher.find()) {
                                        ArrayList arrayList6 = new ArrayList(10);
                                        int i22 = 0;
                                        while (true) {
                                            int iC2 = p.c(matcher, str4, i22, arrayList6);
                                            if (matcher.find()) {
                                                i22 = iC2;
                                            } else {
                                                p.B(iC2, str4, arrayList6);
                                                listK4 = arrayList6;
                                            }
                                        }
                                    } else {
                                        listK4 = o.K(str4.toString());
                                    }
                                    if (listK4.isEmpty()) {
                                        z11 = true;
                                        listT4 = rVar2;
                                    } else {
                                        ListIterator listIterator2 = listK4.listIterator(listK4.size());
                                        while (true) {
                                            if (!listIterator2.hasPrevious()) {
                                                z11 = true;
                                                listT4 = rVar2;
                                            } else if (!(((String) listIterator2.previous()).length() == 0)) {
                                                z11 = true;
                                                listT4 = e0.t(listIterator2, 1, listK4);
                                            }
                                        }
                                    }
                                    arrayList5.add(Long.valueOf(((String[]) listT4.toArray(new String[0]))[z11 ? 1 : 0]));
                                    Pattern patternCompile = Pattern.compile(":");
                                    m.e(patternCompile, "compile(...)");
                                    q.U0(0);
                                    Matcher matcher2 = patternCompile.matcher(str4);
                                    if (matcher2.find()) {
                                        ArrayList arrayList7 = new ArrayList(10);
                                        int iC3 = 0;
                                        while (true) {
                                            iC3 = p.c(matcher2, str4, iC3, arrayList7);
                                            if (matcher2.find()) {
                                                matcher2 = matcher2;
                                            } else {
                                                p.B(iC3, str4, arrayList7);
                                                listK5 = arrayList7;
                                            }
                                        }
                                    } else {
                                        listK5 = o.K(str4.toString());
                                    }
                                    if (listK5.isEmpty()) {
                                        listT5 = rVar2;
                                    } else {
                                        ListIterator listIterator3 = listK5.listIterator(listK5.size());
                                        while (true) {
                                            if (!listIterator3.hasPrevious()) {
                                                listT5 = rVar2;
                                            } else if (!(((String) listIterator3.previous()).length() == 0)) {
                                                listT5 = e0.t(listIterator3, 1, listK5);
                                            }
                                        }
                                    }
                                    i19 = 0;
                                    i21 = Integer.parseInt(((String[]) listT5.toArray(new String[0]))[2]);
                                    size = size;
                                }
                                i12 = size;
                                int i23 = i19;
                                int i24 = 6;
                                int i25 = Integer.parseInt((String) q.W0((CharSequence) listW0.get(i23), new String[]{":"}, i23, 6).get(i23));
                                if (i25 != 0) {
                                    if (i25 != 3) {
                                        i24 = i21;
                                    } else {
                                        i24 = 14;
                                    }
                                } else if (i21 != 0) {
                                    i24 = i21;
                                }
                                qi.a aVar = new qi.a();
                                aVar.f47798a = i25;
                                aVar.f47799b = 0L;
                                aVar.f47800c = i24;
                                aVar.f47801d = arrayList5;
                                i().add(aVar);
                                i13 = i18;
                            } else {
                                i12 = size;
                                arrayList.clear();
                                arrayList2.clear();
                                arrayList.add(new ArrayList());
                                arrayList.add(new ArrayList());
                                arrayList2.add(new ArrayList());
                                arrayList2.add(new ArrayList());
                                arrayList2.add(new ArrayList());
                                arrayList2.add(new ArrayList());
                                Pattern patternCompile2 = Pattern.compile(":");
                                m.e(patternCompile2, "compile(...)");
                                q.U0(0);
                                Matcher matcher3 = patternCompile2.matcher(str3);
                                if (matcher3.find()) {
                                    ArrayList arrayList8 = new ArrayList(10);
                                    int iC4 = 0;
                                    do {
                                        iC4 = p.c(matcher3, str3, iC4, arrayList8);
                                    } while (matcher3.find());
                                    p.B(iC4, str3, arrayList8);
                                    listK2 = arrayList8;
                                } else {
                                    listK2 = o.K(str3.toString());
                                }
                                if (listK2.isEmpty()) {
                                    listT2 = rVar2;
                                } else {
                                    ListIterator listIterator4 = listK2.listIterator(listK2.size());
                                    while (true) {
                                        if (!listIterator4.hasPrevious()) {
                                            listT2 = rVar2;
                                        } else if (!(((String) listIterator4.previous()).length() == 0)) {
                                            listT2 = e0.t(listIterator4, 1, listK2);
                                        }
                                    }
                                }
                                String[] strArr2 = (String[]) listT2.toArray(new String[0]);
                                qi.a aVar2 = new qi.a();
                                aVar2.f47798a = Integer.parseInt(strArr2[0]);
                                i13 = i18;
                                aVar2.f47799b = Integer.parseInt(strArr2[1]);
                                String str5 = strArr2[2];
                                Matcher matcher4 = e0.u(0, ",", "compile(...)", str5, str2).matcher(str5);
                                if (matcher4.find()) {
                                    ArrayList arrayList9 = new ArrayList(10);
                                    int iC5 = 0;
                                    do {
                                        iC5 = p.c(matcher4, str5, iC5, arrayList9);
                                    } while (matcher4.find());
                                    p.B(iC5, str5, arrayList9);
                                    listK3 = arrayList9;
                                } else {
                                    listK3 = o.K(str5.toString());
                                }
                                if (listK3.isEmpty()) {
                                    listT3 = rVar2;
                                } else {
                                    ListIterator listIterator5 = listK3.listIterator(listK3.size());
                                    while (true) {
                                        if (!listIterator5.hasPrevious()) {
                                            listT3 = rVar2;
                                        } else if (!(((String) listIterator5.previous()).length() == 0)) {
                                            listT3 = e0.t(listIterator5, 1, listK3);
                                        }
                                    }
                                }
                                String[] strArr3 = (String[]) listT3.toArray(new String[0]);
                                ArrayList arrayList10 = new ArrayList();
                                for (String str6 : strArr3) {
                                    arrayList10.add(Integer.valueOf(Integer.parseInt(str6)));
                                }
                                boolean zD = d(i(), aVar2.f47798a, aVar2.f47799b);
                                if (aVar2.f47798a == 0) {
                                    q(aVar2, arrayList10, zD);
                                } else {
                                    n(aVar2, arrayList10, zD, i13);
                                }
                                i().add(aVar2);
                            }
                            i18 = i13 + 1;
                            arrayList4 = arrayList4;
                            size = i12;
                        }
                        long j11 = 0;
                        if (q.v0("release", "debug", false) && xt.b.f56282d) {
                            i11 = 1;
                            t(i().subList(0, 1));
                        } else {
                            i11 = 1;
                        }
                        int i26 = 0;
                        for (int size2 = i().size() - i11; -1 < size2; size2--) {
                            qi.a aVar3 = (qi.a) i().get(size2);
                            if (aVar3.f47798a == i11) {
                                long j12 = aVar3.f47799b;
                                if (j11 != j12) {
                                    aVar3.f47800c = 13;
                                    i26++;
                                    j11 = j12;
                                }
                            }
                            if (i26 == 2) {
                                return i();
                            }
                        }
                        return i();
                    }
                    String strQ0 = strArr[i17];
                    if (oz.x.s0(strQ0, "3:", r9)) {
                        strQ0 = oz.x.q0(oz.x.q0(strQ0, ":-", ":0-"), ":;", ":0;");
                    }
                    Matcher matcherW2 = p.w(r9, ";", "compile(...)", strQ0);
                    if (matcherW2.find()) {
                        ArrayList arrayList11 = new ArrayList(10);
                        int iC6 = 0;
                        do {
                            iC6 = p.c(matcherW2, strQ0, iC6, arrayList11);
                        } while (matcherW2.find());
                        p.B(iC6, strQ0, arrayList11);
                        listK6 = arrayList11;
                    } else {
                        listK6 = o.K(strQ0.toString());
                    }
                    if (listK6.isEmpty()) {
                        listT6 = rVar;
                    } else {
                        ListIterator listIterator6 = listK6.listIterator(listK6.size());
                        while (true) {
                            if (!listIterator6.hasPrevious()) {
                                listT6 = rVar;
                            } else if (((String) listIterator6.previous()).length() != 0) {
                                listT6 = e0.t(listIterator6, 1, listK6);
                            }
                        }
                    }
                    String[] strArr4 = (String[]) listT6.toArray(new String[0]);
                    int i27 = strArr4.length > 2 ? Integer.parseInt(strArr4[2]) : 1;
                    String str7 = strArr4[0];
                    Matcher matcher5 = e0.u(0, "-", "compile(...)", str7, str2).matcher(str7);
                    if (matcher5.find()) {
                        ArrayList arrayList12 = new ArrayList(10);
                        int iC7 = 0;
                        do {
                            iC7 = p.c(matcher5, str7, iC7, arrayList12);
                        } while (matcher5.find());
                        p.B(iC7, str7, arrayList12);
                        listK7 = arrayList12;
                    } else {
                        listK7 = o.K(str7.toString());
                    }
                    if (listK7.isEmpty()) {
                        listT7 = rVar;
                    } else {
                        ListIterator listIterator7 = listK7.listIterator(listK7.size());
                        while (true) {
                            if (!listIterator7.hasPrevious()) {
                                listT7 = rVar;
                            } else if (((String) listIterator7.previous()).length() != 0) {
                                listT7 = e0.t(listIterator7, 1, listK7);
                            }
                        }
                    }
                    String[] strArr5 = (String[]) listT7.toArray(new String[0]);
                    if (strArr5.length >= 3) {
                        int length2 = strArr5.length;
                        int i28 = 0;
                        z12 = true;
                        while (i28 < length2) {
                            int i29 = i28;
                            String str8 = strArr5[i29];
                            r rVar3 = rVar;
                            int i30 = length;
                            Matcher matcher6 = e0.u(0, ":", "compile(...)", str8, str2).matcher(str8);
                            if (matcher6.find()) {
                                ArrayList arrayList13 = new ArrayList(10);
                                int iC8 = 0;
                                do {
                                    iC8 = p.c(matcher6, str8, iC8, arrayList13);
                                } while (matcher6.find());
                                p.B(iC8, str8, arrayList13);
                                listK8 = arrayList13;
                            } else {
                                listK8 = o.K(str8.toString());
                            }
                            if (listK8.isEmpty()) {
                                listT8 = rVar3;
                            } else {
                                ListIterator listIterator8 = listK8.listIterator(listK8.size());
                                while (true) {
                                    if (!listIterator8.hasPrevious()) {
                                        listT8 = rVar3;
                                    } else if (((String) listIterator8.previous()).length() != 0) {
                                        listT8 = e0.t(listIterator8, 1, listK8);
                                    }
                                }
                            }
                            String[] strArr6 = (String[]) listT8.toArray(new String[0]);
                            if ((!m.a(strArr6[0], "0") || !m.a(strArr6[2], "0")) && (!m.a(strArr6[0], "3") || !m.a(strArr6[2], "0"))) {
                                z12 = false;
                            }
                            i28 = i29 + 1;
                            rVar = rVar3;
                            length = i30;
                            i17 = i17;
                        }
                    } else {
                        z12 = false;
                    }
                    r rVar4 = rVar;
                    int i31 = length;
                    int i32 = i17;
                    if (z12) {
                        arrayList4.add(str7);
                    } else {
                        for (int i33 : j3.P(strArr5.length, i27)) {
                            arrayList4.add(strArr5[i33]);
                        }
                    }
                    i17 = i32 + 1;
                    strArr = strArr;
                    rVar = rVar4;
                    length = i31;
                    r9 = 0;
                }
                break;
            case 1:
                return w(str);
            case 2:
                return x(str);
            case 3:
                return y(str);
            case 4:
                return z(str);
            default:
                ArrayList arrayList14 = (ArrayList) this.f44926b;
                ArrayList arrayList15 = (ArrayList) this.f44927c;
                this.f44925a = w4.c.m(str, "repeatRegex");
                ?? r11 = 0;
                Matcher matcherW3 = p.w(0, "#", "compile(...)", str);
                if (matcherW3.find()) {
                    ArrayList arrayList16 = new ArrayList(10);
                    int iC9 = 0;
                    do {
                        iC9 = p.c(matcherW3, str, iC9, arrayList16);
                    } while (matcherW3.find());
                    p.B(iC9, str, arrayList16);
                    listK9 = arrayList16;
                } else {
                    listK9 = o.K(str.toString());
                }
                boolean zIsEmpty2 = listK9.isEmpty();
                r rVar5 = r.f50854a;
                if (zIsEmpty2) {
                    listT9 = rVar5;
                } else {
                    ListIterator listIterator9 = listK9.listIterator(listK9.size());
                    while (true) {
                        if (!listIterator9.hasPrevious()) {
                            listT9 = rVar5;
                        } else if (((String) listIterator9.previous()).length() != 0) {
                            listT9 = e0.t(listIterator9, 1, listK9);
                        }
                    }
                }
                String[] strArr7 = (String[]) listT9.toArray(new String[0]);
                ArrayList arrayList17 = new ArrayList();
                int length3 = strArr7.length;
                int i34 = 0;
                while (i34 < length3) {
                    String strQ1 = strArr7[i34];
                    if (oz.x.s0(strQ1, "3:", r11)) {
                        strQ1 = oz.x.q0(oz.x.q0(strQ1, ":-", ":0-"), ":;", ":0;");
                    }
                    Matcher matcherW4 = p.w(r11, ";", "compile(...)", strQ1);
                    if (matcherW4.find()) {
                        ArrayList arrayList18 = new ArrayList(10);
                        int iC10 = 0;
                        do {
                            iC10 = p.c(matcherW4, strQ1, iC10, arrayList18);
                        } while (matcherW4.find());
                        p.B(iC10, strQ1, arrayList18);
                        listK14 = arrayList18;
                    } else {
                        listK14 = o.K(strQ1.toString());
                    }
                    if (listK14.isEmpty()) {
                        listT14 = rVar5;
                    } else {
                        ListIterator listIterator10 = listK14.listIterator(listK14.size());
                        while (true) {
                            if (!listIterator10.hasPrevious()) {
                                listT14 = rVar5;
                            } else if (((String) listIterator10.previous()).length() != 0) {
                                listT14 = e0.t(listIterator10, 1, listK14);
                            }
                        }
                    }
                    String[] strArr8 = (String[]) listT14.toArray(new String[0]);
                    int i35 = strArr8.length > 2 ? Integer.parseInt(strArr8[2]) : 1;
                    String str9 = strArr8[0];
                    Matcher matcher7 = e0.u(0, "-", "compile(...)", str9, "input").matcher(str9);
                    if (matcher7.find()) {
                        ArrayList arrayList19 = new ArrayList(10);
                        int iC11 = 0;
                        do {
                            iC11 = p.c(matcher7, str9, iC11, arrayList19);
                        } while (matcher7.find());
                        p.B(iC11, str9, arrayList19);
                        listK15 = arrayList19;
                    } else {
                        listK15 = o.K(str9.toString());
                    }
                    if (listK15.isEmpty()) {
                        listT15 = rVar5;
                    } else {
                        ListIterator listIterator11 = listK15.listIterator(listK15.size());
                        while (true) {
                            if (!listIterator11.hasPrevious()) {
                                listT15 = rVar5;
                            } else if (((String) listIterator11.previous()).length() != 0) {
                                listT15 = e0.t(listIterator11, 1, listK15);
                            }
                        }
                    }
                    String[] strArr9 = (String[]) listT15.toArray(new String[0]);
                    if (strArr9.length >= 3) {
                        int length4 = strArr9.length;
                        int i36 = 0;
                        z14 = true;
                        while (i36 < length4) {
                            int i37 = i36;
                            String str10 = strArr9[i37];
                            r rVar6 = rVar5;
                            int i38 = length3;
                            Matcher matcher8 = e0.u(0, ":", "compile(...)", str10, "input").matcher(str10);
                            if (matcher8.find()) {
                                ArrayList arrayList20 = new ArrayList(10);
                                int iC12 = 0;
                                do {
                                    iC12 = p.c(matcher8, str10, iC12, arrayList20);
                                } while (matcher8.find());
                                p.B(iC12, str10, arrayList20);
                                listK16 = arrayList20;
                            } else {
                                listK16 = o.K(str10.toString());
                            }
                            if (listK16.isEmpty()) {
                                listT16 = rVar6;
                            } else {
                                ListIterator listIterator12 = listK16.listIterator(listK16.size());
                                while (true) {
                                    if (!listIterator12.hasPrevious()) {
                                        listT16 = rVar6;
                                    } else if (((String) listIterator12.previous()).length() != 0) {
                                        listT16 = e0.t(listIterator12, 1, listK16);
                                    }
                                }
                            }
                            String[] strArr10 = (String[]) listT16.toArray(new String[0]);
                            if ((!m.a(strArr10[0], "0") || !m.a(strArr10[2], "0")) && (!m.a(strArr10[0], "3") || !m.a(strArr10[2], "0"))) {
                                z14 = false;
                            }
                            i36 = i37 + 1;
                            rVar5 = rVar6;
                            length3 = i38;
                            i34 = i34;
                        }
                    } else {
                        z14 = false;
                    }
                    r rVar7 = rVar5;
                    int i39 = length3;
                    int i40 = i34;
                    if (z14) {
                        arrayList17.add(str9);
                    } else {
                        for (int i41 : j3.P(strArr9.length, i35)) {
                            arrayList17.add(strArr9[i41]);
                        }
                    }
                    i34 = i40 + 1;
                    strArr7 = strArr7;
                    rVar5 = rVar7;
                    length3 = i39;
                    r11 = 0;
                }
                r rVar8 = rVar5;
                int size3 = arrayList17.size();
                int i42 = 0;
                while (i42 < size3) {
                    Object obj2 = arrayList17.get(i42);
                    m.e(obj2, "get(...)");
                    String str11 = (String) obj2;
                    int i43 = 0;
                    if (q.W0(str11, new String[]{"-"}, 0, 6).size() >= 3) {
                        ArrayList arrayList21 = new ArrayList();
                        List<String> listW1 = q.W0(str11, new String[]{"-"}, 0, 6);
                        int i44 = 6;
                        for (String str12 : listW1) {
                            Matcher matcher9 = e0.u(i43, ":", "compile(...)", str12, "input").matcher(str12);
                            if (matcher9.find()) {
                                ArrayList arrayList22 = new ArrayList(10);
                                int i45 = 0;
                                while (true) {
                                    int iC13 = p.c(matcher9, str12, i45, arrayList22);
                                    if (matcher9.find()) {
                                        i45 = iC13;
                                    } else {
                                        p.B(iC13, str12, arrayList22);
                                        listK12 = arrayList22;
                                    }
                                }
                            } else {
                                listK12 = o.K(str12.toString());
                            }
                            if (listK12.isEmpty()) {
                                z13 = true;
                                listT12 = rVar8;
                            } else {
                                ListIterator listIterator13 = listK12.listIterator(listK12.size());
                                while (true) {
                                    if (!listIterator13.hasPrevious()) {
                                        z13 = true;
                                        listT12 = rVar8;
                                    } else if (!(((String) listIterator13.previous()).length() == 0)) {
                                        z13 = true;
                                        listT12 = e0.t(listIterator13, 1, listK12);
                                    }
                                }
                            }
                            arrayList21.add(Long.valueOf(((String[]) listT12.toArray(new String[0]))[z13 ? 1 : 0]));
                            Pattern patternCompile3 = Pattern.compile(":");
                            m.e(patternCompile3, "compile(...)");
                            q.U0(0);
                            Matcher matcher10 = patternCompile3.matcher(str12);
                            if (matcher10.find()) {
                                ArrayList arrayList23 = new ArrayList(10);
                                int iC14 = 0;
                                while (true) {
                                    iC14 = p.c(matcher10, str12, iC14, arrayList23);
                                    if (matcher10.find()) {
                                        matcher10 = matcher10;
                                    } else {
                                        p.B(iC14, str12, arrayList23);
                                        listK13 = arrayList23;
                                    }
                                }
                            } else {
                                listK13 = o.K(str12.toString());
                            }
                            if (listK13.isEmpty()) {
                                listT13 = rVar8;
                            } else {
                                ListIterator listIterator14 = listK13.listIterator(listK13.size());
                                while (true) {
                                    if (!listIterator14.hasPrevious()) {
                                        listT13 = rVar8;
                                    } else if (!(((String) listIterator14.previous()).length() == 0)) {
                                        listT13 = e0.t(listIterator14, 1, listK13);
                                    }
                                }
                            }
                            i43 = 0;
                            i44 = Integer.parseInt(((String[]) listT13.toArray(new String[0]))[2]);
                            size3 = size3;
                        }
                        i15 = size3;
                        int i46 = i43;
                        int i47 = 6;
                        int i48 = Integer.parseInt((String) q.W0((CharSequence) listW1.get(i46), new String[]{":"}, i46, 6).get(i46));
                        if (i48 != 0) {
                            if (i48 != 3) {
                                i47 = i44;
                            } else {
                                i47 = 14;
                            }
                        } else if (i44 != 0) {
                            i47 = i44;
                        }
                        qi.a aVar4 = new qi.a();
                        aVar4.f47798a = i48;
                        aVar4.f47799b = 0L;
                        aVar4.f47800c = i47;
                        aVar4.f47801d = arrayList21;
                        i().add(aVar4);
                        i16 = i42;
                    } else {
                        i15 = size3;
                        arrayList14.clear();
                        arrayList15.clear();
                        arrayList14.add(new ArrayList());
                        arrayList14.add(new ArrayList());
                        arrayList15.add(new ArrayList());
                        arrayList15.add(new ArrayList());
                        arrayList15.add(new ArrayList());
                        arrayList15.add(new ArrayList());
                        Pattern patternCompile4 = Pattern.compile(":");
                        m.e(patternCompile4, "compile(...)");
                        q.U0(0);
                        Matcher matcher11 = patternCompile4.matcher(str11);
                        if (matcher11.find()) {
                            ArrayList arrayList24 = new ArrayList(10);
                            int iC15 = 0;
                            do {
                                iC15 = p.c(matcher11, str11, iC15, arrayList24);
                            } while (matcher11.find());
                            p.B(iC15, str11, arrayList24);
                            listK10 = arrayList24;
                        } else {
                            listK10 = o.K(str11.toString());
                        }
                        if (listK10.isEmpty()) {
                            listT10 = rVar8;
                        } else {
                            ListIterator listIterator15 = listK10.listIterator(listK10.size());
                            while (true) {
                                if (!listIterator15.hasPrevious()) {
                                    listT10 = rVar8;
                                } else if (!(((String) listIterator15.previous()).length() == 0)) {
                                    listT10 = e0.t(listIterator15, 1, listK10);
                                }
                            }
                        }
                        String[] strArr11 = (String[]) listT10.toArray(new String[0]);
                        qi.a aVar5 = new qi.a();
                        aVar5.f47798a = Integer.parseInt(strArr11[0]);
                        i16 = i42;
                        aVar5.f47799b = Integer.parseInt(strArr11[1]);
                        String str13 = strArr11[2];
                        Matcher matcher12 = e0.u(0, ",", "compile(...)", str13, "input").matcher(str13);
                        if (matcher12.find()) {
                            ArrayList arrayList25 = new ArrayList(10);
                            int iC16 = 0;
                            do {
                                iC16 = p.c(matcher12, str13, iC16, arrayList25);
                            } while (matcher12.find());
                            p.B(iC16, str13, arrayList25);
                            listK11 = arrayList25;
                        } else {
                            listK11 = o.K(str13.toString());
                        }
                        if (listK11.isEmpty()) {
                            listT11 = rVar8;
                        } else {
                            ListIterator listIterator16 = listK11.listIterator(listK11.size());
                            while (true) {
                                if (!listIterator16.hasPrevious()) {
                                    listT11 = rVar8;
                                } else if (!(((String) listIterator16.previous()).length() == 0)) {
                                    listT11 = e0.t(listIterator16, 1, listK11);
                                }
                            }
                        }
                        String[] strArr12 = (String[]) listT11.toArray(new String[0]);
                        ArrayList arrayList26 = new ArrayList();
                        for (String str14 : strArr12) {
                            arrayList26.add(Integer.valueOf(Integer.parseInt(str14)));
                        }
                        boolean zD2 = d(i(), aVar5.f47798a, aVar5.f47799b);
                        if (aVar5.f47798a == 0) {
                            q(aVar5, arrayList26, zD2);
                        } else {
                            n(aVar5, arrayList26, zD2, i16);
                        }
                        i().add(aVar5);
                    }
                    i42 = i16 + 1;
                    arrayList17 = arrayList17;
                    size3 = i15;
                }
                long j13 = 0;
                if (q.v0("release", "debug", false) && xt.b.f56282d) {
                    i14 = 1;
                    t(i().subList(0, 1));
                } else {
                    i14 = 1;
                }
                int i49 = 0;
                for (int size4 = i().size() - i14; -1 < size4; size4--) {
                    qi.a aVar6 = (qi.a) i().get(size4);
                    if (aVar6.f47798a == i14) {
                        long j14 = aVar6.f47799b;
                        if (j13 != j14) {
                            aVar6.f47800c = 13;
                            i49++;
                            j13 = j14;
                        }
                    }
                    if (i49 == 2) {
                        return i();
                    }
                }
                return i();
        }
    }
}

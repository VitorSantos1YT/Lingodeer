package rt;

import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.TestModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class nb extends xy.i implements fz.e {
    public final /* synthetic */ boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f50146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedHashMap f50147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f50148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f50150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f50151f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wt.b0 f50152t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(List list, int i11, wt.b0 b0Var, boolean z11, vy.d dVar) {
        super(2, dVar);
        this.f50150e = list;
        this.f50151f = i11;
        this.f50152t = b0Var;
        this.H = z11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new nb(this.f50150e, this.f50151f, this.f50152t, this.H, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((nb) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0201  */
    /* JADX WARN: Code duplicated, block: B:58:0x0203  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        Object objU;
        ArrayList arrayList2;
        Integer num;
        ArrayList arrayList3;
        int i11;
        ArrayList arrayList4;
        int i12;
        TestModel testModel;
        int i13;
        int i14;
        nb nbVar = this;
        int i15 = 0;
        Integer num2 = 0;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i16 = nbVar.f50149d;
        int i17 = nbVar.f50151f;
        int i18 = 1;
        if (i16 == 0) {
            com.bumptech.glide.e.F(obj);
            List list = nbVar.f50150e;
            if (list.isEmpty()) {
                return new ge(ry.r.f50854a, ry.s.f50855a);
            }
            arrayList = new ArrayList();
            linkedHashMap = new LinkedHashMap();
            List listW0 = oz.q.W0(i17 == 0 ? "100,1002,1003,1005,1007,1008,1009,1010,1011,1012,1013,1014,1015,1016,1017,102,1020,1021,1022,1024,1025,1026,1027,1030,1032,1034,1036,1037,1040,1041,1044,1045,1046,1047,1048,1049,1050,1051,1052,1059,106,1061,1062,1063,1064,1069,107,1070,1071,1072,1073,1074,1075,1076,1078,108,1083,1086,1087,1088,1089,109,1090,1091,1094,1095,1096,1097,1103,1104,1105,1106,1107,1108,1109,111,1110,1111,1112,1113,1114,1115,1116,1117,1118,1119,1120,1122,1124,1125,1126,1128,1129,113,1131,1132,1134,1136,1137,114,1147,1148,1149,115,1154,1155,1157,1159,116,1160,1162,1164,1165,1167,1168,117,1171,1172,1175,1176,1177,118,1182,1183,1185,1186,1187,1188,119,1190,1191,1192,1193,1194,1196,1197,1198,1199,1200,1202,1203,1204,1205,1207,1208,1211,1212,1215,1216,122,1224,1226,1227,1228,1229,123,1230,1236,1237,1238,1240,1248,1249,125,1250,1256,1257,1258,1259,126,1260,1261,1262,1263,1264,127,1273,1274,1275,1276,1277,1278,1279,128,1280,1281,1282,1286,1287,1288,1289,129,1290,1291,1294,1295,1296,1298,1299,1300,1301,1302,1303,1308,1309,131,1310,1314,1315,1316,1317,1318,1319,132,1320,1321,1322,1323,1324,1325,1326,1327,1328,1329,133,1330,1331,1332,1333,1334,1335,1336,1337,1338,1339,134,1340,1341,1342,1343,1344,1345,1346,1348,1349,135,1363,1364,1365,1366,1367,1368,1369,1370,1371,1372,1373,1374,1375,1376,1377,1378,1379,1380,1381,1382,1383,1384,1385,1389,1391,1392,1393,1394,1396,1397,1398,1399,1400,1401,1402,1403,1404,1405,1406,1407,1408,1410,1411,1412,1413,1414,1417,1419,1420,1421,1422,1423,1424,1425,1426,1427,1429,1430,146,147,149,150,151,152,155,161,163,1645,1646,1647,1648,1649,1650,1652,1653,1654,1656,1657,1658,1659,166,1660,1661,1662,1663,1664,1665,1666,1667,1668,1670,1671,1672,1673,1674,1675,1676,1677,1678,1680,171,172,175,176,177,181,182,183,184,185,186,187,188,189,190,194,195,196,197,199,204,205,206,207,209,210,211,212,222,224,226,230,232,233,234,235,238,239,24,241,242,244,245,248,249,25,253,254,256,257,258,26,261,262,263,264,265,266,270,271,275,276,279,281,282,283,284,288,290,292,293,294,295,296,297,298,299,300,301,302,303,304,308,309,310,311,322,323,324,325,326,328,33,335,34,342,344,346,35,352,353,355,356,357,36,360,361,362,363,364,366,367,368,369,37,370,371,372,375,376,377,378,379,38,380,384,385,386,387,39,392,393,394,395,396,397,401,402,403,404,405,406,407,410,411,422,43,430,434,435,436,44,441,442,444,445,446,447,448,449,450,451,452,453,454,455,456,461,462,463,464,465,467,468,470,471,472,473,474,475,48,483,484,485,486,487,488,49,490,492,50,503,504,505,506,51,512,513,514,515,516,517,518,523,524,525,526,53,531,533,537,538,54,541,542,545,546,547,548,549,550,551,552,553,554,555,556,557,558,560,561,563,564,565,566,567,570,571,576,577,578,580,581,582,583,584,585,586,587,588,589,590,591,592,593,594,595,596,597,598,599,60,600,601,61,611,613,614,615,616,617,618,620,621,624,625,626,627,629,630,631,632,633,634,635,637,638,639,64,640,641,642,643,644,647,648,649,650,651,652,653,654,655,656,657,661,664,665,668,669,672,673,674,675,676,69,696,7,70,702,703,704,705,706,708,709,71,710,711,712,716,718,72,720,721,722,723,724,725,726,729,73,730,731,732,733,734,735,736,737,738,739,74,740,741,742,743,744,745,746,748,749,75,750,751,752,753,754,755,756,757,758,759,76,760,761,762,763,764,766,767,768,769,770,771,772,773,774,775,776,777,778,779,78,780,781,782,783,784,785,786,787,79,794,795,796,799,80,801,803,805,806,807,809,81,810,811,813,816,817,818,819,820,821,822,824,825,826,827,828,829,830,833,835,836,837,839,84,840,841,842,843,844,845,846,847,848,849,85,851,852,853,854,857,858,859,86,860,862,863,864,866,867,868,869,87,870,871,875,879,88,880,881,882,883,884,886,887,89,890,892,893,894,895,896,897,898,899,9,90,900,901,902,907,91,910,911,912,913,914,915,916,917,918,919,92,920,922,923,924,925,926,927,929,93,930,931,932,933,934,935,936,937,938,939,94,940,941,942,944,947,949,95,951,952,953,954,955,956,957,958,96,964,965,966,970,977,979,98,982,983,984,985,986,987,988,989,99,990,992,993,998,999" : "1,10,100,101,102,103,105,106,107,108,109,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,13,130,131,132,133,134,135,136,137,138,139,14,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,18,180,181,182,183,184,185,186,187,189,19,190,191,192,193,194,195,196,197,198,199,2,20,200,201,202,203,204,205,206,207,208,209,21,210,211,212,213,214,215,216,217,218,219,22,220,221,222,223,224,225,226,227,228,23,230,231,232,233,234,235,236,237,238,239,24,240,241,242,243,244,245,246,247,248,249,25,250,251,252,253,254,255,256,257,258,259,26,260,261,262,263,264,265,266,267,268,269,27,270,271,272,273,274,275,276,278,279,28,280,281,282,283,286,287,288,289,29,290,291,292,293,294,295,296,298,299,3,30,300,301,302,303,304,305,306,307,308,309,31,310,311,312,313,314,315,316,317,318,319,32,321,322,323,324,325,327,328,329,33,330,331,332,333,334,335,336,337,339,34,340,341,342,344,346,347,348,349,350,351,352,353,354,355,356,357,358,359,36,360,361,362,363,364,365,366,367,368,369,37,370,371,372,373,374,375,376,377,378,38,380,381,383,384,386,388,389,39,390,391,392,393,394,396,397,398,399,4,40,400,401,402,403,404,405,406,407,408,409,41,410,411,412,413,414,415,416,418,419,42,420,421,422,423,424,425,426,429,43,430,431,432,433,434,437,438,439,44,440,441,442,443,444,445,446,447,448,449,450,452,454,455,456,457,458,459,46,460,461,462,463,464,465,466,467,468,469,47,470,471,472,473,474,475,476,477,48,480,482,483,484,485,486,487,488,491,492,493,494,495,496,497,498,499,5,500,501,502,503,505,506,507,508,510,512,515,516,517,518,519,52,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,544,545,546,547,548,549,55,550,551,552,553,554,555,556,557,558,559,56,560,561,562,563,564,565,566,567,568,569,57,570,571,572,573,574,575,576,577,578,579,58,580,581,582,583,584,585,586,587,588,589,59,590,592,593,594,595,596,597,598,6,60,600,602,603,604,605,606,607,608,609,61,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,63,630,631,632,633,634,635,636,637,638,639,64,640,643,644,645,646,647,648,649,65,650,651,652,653,654,656,657,658,659,66,660,661,662,663,664,665,666,667,668,669,67,670,671,672,674,675,676,679,68,680,681,682,683,684,685,688,689,69,690,691,692,693,694,695,696,70,706,707,708,709,71,710,712,713,715,716,717,72,722,724,725,726,727,728,729,73,730,731,732,733,734,735,736,737,74,741,742,743,744,745,746,747,748,749,75,750,751,752,753,754,756,757,759,76,764,765,766,767,768,769,77,770,771,772,774,775,777,778,78,781,782,784,785,786,787,788,79,790,791,792,794,795,796,797,798,799,80,800,802,803,804,805,806,807,809,81,811,812,813,814,815,818,819,82,820,821,823,824,825,826,827,828,829,83,830,831,832,833,834,835,836,837,84,87,89,9,90,91,92,93,94,95,96,97,98,99,", new String[]{","}, 0, 6);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : listW0) {
                if (((String) obj2).length() > 0) {
                    arrayList5.add(obj2);
                }
            }
            ArrayList arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
            int size = arrayList5.size();
            int i19 = 0;
            while (i19 < size) {
                Object obj3 = arrayList5.get(i19);
                i19++;
                b7.e0.x(Long.parseLong((String) obj3), arrayList6);
            }
            wt.b0 b0Var = nbVar.f50152t;
            b0Var.getClass();
            bh.f0 f0Var = new bh.f0(((vt.z0) b0Var.f55236a).b(((fr.o0) b0Var.f55237b).f27733a.keyLanguage, ns.o.L(num2, 1), list), 9);
            nbVar.f50146a = arrayList;
            nbVar.f50147b = linkedHashMap;
            nbVar.f50148c = arrayList6;
            nbVar.f50149d = 1;
            objU = uz.x0.u(f0Var, nbVar);
            if (objU == aVar) {
                return aVar;
            }
            arrayList2 = arrayList6;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList2 = nbVar.f50148c;
            LinkedHashMap linkedHashMap2 = nbVar.f50147b;
            arrayList = nbVar.f50146a;
            com.bumptech.glide.e.F(obj);
            linkedHashMap = linkedHashMap2;
            objU = obj;
        }
        ArrayList arrayList7 = (ArrayList) ns.o.S((Iterable) objU);
        int size2 = arrayList7.size();
        while (i15 < size2) {
            Object obj4 = arrayList7.get(i15);
            i15++;
            SRSStatus sRSStatus = (SRSStatus) obj4;
            if (sRSStatus.getUnitId() > 0) {
                linkedHashMap.putIfAbsent(gb.r.U(sRSStatus.getElemType(), sRSStatus.getElemId()), new Long(sRSStatus.getUnitId()));
            }
            boolean z11 = nbVar.H;
            if (!z11 || sRSStatus.getElemType() != i18 || arrayList2.contains(new Long(sRSStatus.getElemId())) || !ry.l.D(new Integer[]{11, num2}, Integer.valueOf(i17))) {
                if (z11 && i17 == 0) {
                    arrayList4 = arrayList;
                    i11 = i17;
                    i12 = i15;
                    num = num2;
                    arrayList3 = arrayList2;
                    if (ry.l.D(new Long[]{new Long(195L), new Long(321L), new Long(335L), new Long(619L), new Long(403L), new Long(427L), new Long(312L)}, new Long(sRSStatus.getElemId()))) {
                        nbVar = this;
                        arrayList = arrayList4;
                        i15 = i12;
                        i17 = i11;
                        num2 = num;
                        arrayList2 = arrayList3;
                        i18 = 1;
                    } else {
                        testModel = new TestModel();
                        testModel.elemType = sRSStatus.getElemType();
                        testModel.elemId = sRSStatus.getElemId();
                        if (testModel.elemType == 0) {
                            i13 = i11;
                            if (ry.l.D(new Integer[]{new Integer(57), new Integer(51), new Integer(55), new Integer(21), new Integer(61)}, new Integer(i13))) {
                                i14 = 2;
                            } else {
                                i14 = 10;
                            }
                        } else {
                            i13 = i11;
                            if (z11) {
                                i14 = 4;
                            } else {
                                i14 = 5;
                            }
                        }
                        testModel.modelType = i14;
                        arrayList = arrayList4;
                        arrayList.add(testModel);
                        nbVar = this;
                        i15 = i12;
                        num2 = num;
                        i18 = 1;
                        i17 = i13;
                        arrayList2 = arrayList3;
                    }
                } else {
                    num = num2;
                    arrayList3 = arrayList2;
                    i11 = i17;
                    arrayList4 = arrayList;
                    i12 = i15;
                    testModel = new TestModel();
                    testModel.elemType = sRSStatus.getElemType();
                    testModel.elemId = sRSStatus.getElemId();
                    if (testModel.elemType == 0) {
                        i13 = i11;
                        if (ry.l.D(new Integer[]{new Integer(57), new Integer(51), new Integer(55), new Integer(21), new Integer(61)}, new Integer(i13))) {
                            i14 = 2;
                        } else {
                            i14 = 10;
                        }
                    } else {
                        i13 = i11;
                        if (z11) {
                            i14 = 4;
                        } else {
                            i14 = 5;
                        }
                    }
                    testModel.modelType = i14;
                    arrayList = arrayList4;
                    arrayList.add(testModel);
                    nbVar = this;
                    i15 = i12;
                    num2 = num;
                    i18 = 1;
                    i17 = i13;
                    arrayList2 = arrayList3;
                }
            }
        }
        return new ge(arrayList, linkedHashMap);
    }
}

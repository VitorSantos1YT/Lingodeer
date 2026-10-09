package t7;

import android.content.Context;
import b7.t;
import b7.u;
import b7.y;
import bw.ORXQ.ADSb;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.api.Service;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.protobuf.DescriptorProtos;
import com.lingodeer.data.model.AchievementLevelType;
import com.stkouyu.util.httputil.Consts;
import com.yalantis.ucrop.UCrop;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p7.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements e, d7.q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ImmutableList f52067p = ImmutableList.t(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ImmutableList f52068q = ImmutableList.t(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ImmutableList f52069r = ImmutableList.t(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ImmutableList f52070s = ImmutableList.t(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ImmutableList f52071t = ImmutableList.t(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ImmutableList f52072u = ImmutableList.t(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static i f52073v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f52074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableMap f52075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f52076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f52077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f52078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f52079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f52081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f52082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f52083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f52084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f52085l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f52086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f52087o;

    public i(Context context, HashMap map) {
        boolean z11;
        y yVar = y.f4045a;
        this.f52074a = context == null ? null : context.getApplicationContext();
        this.f52075b = ImmutableMap.b(map);
        this.f52076c = new d(0, (byte) 0);
        this.f52079f = new s();
        this.f52077d = yVar;
        this.f52078e = true;
        if (context == null) {
            this.f52086n = 0;
            this.f52085l = 1000000L;
            return;
        }
        u uVarA = u.a(context);
        int iB = uVarA.b();
        this.f52086n = iB;
        this.f52085l = a(iB);
        h hVar = new h(this);
        Executor executorQ = b7.a.q();
        CopyOnWriteArrayList<t> copyOnWriteArrayList = uVarA.f4027b;
        for (t tVar : copyOnWriteArrayList) {
            if (tVar.f4022a.get() == null) {
                copyOnWriteArrayList.remove(tVar);
            }
        }
        t tVar2 = new t(uVarA, hVar, executorQ);
        synchronized (uVarA.f4028c) {
            uVarA.f4027b.add(tVar2);
            z11 = uVarA.f4030e;
        }
        if (z11) {
            tVar2.f4023b.execute(new b2.a(tVar2, 1));
        }
    }

    public final void b(long j11, int i11, long j12) {
        final long j13;
        final int i12;
        final long j14;
        if (i11 == 0 && j11 == 0 && j12 == this.m) {
            return;
        }
        this.m = j12;
        for (final c cVar : (CopyOnWriteArrayList) this.f52076c.f52059b) {
            if (cVar.f52057c) {
                j13 = j11;
                i12 = i11;
                j14 = j12;
            } else {
                j13 = j11;
                i12 = i11;
                j14 = j12;
                cVar.f52055a.post(new Runnable() { // from class: t7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        g7.f fVar = cVar.f52056b;
                        g7.e eVar = fVar.f28807d;
                        g7.a aVarJ = fVar.J(eVar.f28799b.isEmpty() ? null : (b0) Iterables.c(eVar.f28799b));
                        fVar.N(aVarJ, 1006, new g7.d(aVarJ, i12, j13, j14));
                    }
                });
            }
            i11 = i12;
            j11 = j13;
            j12 = j14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:1146:0x1226  */
    /* JADX WARN: Multi-variable type inference failed */
    public final long a(int i11) {
        int[] iArr;
        long jLongValue;
        Integer numValueOf = Integer.valueOf(i11);
        ImmutableMap immutableMap = this.f52075b;
        Long lValueOf = (Long) immutableMap.get(numValueOf);
        if (lValueOf == null) {
            lValueOf = (Long) immutableMap.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            String strD = Strings.d(this.f52087o);
            byte b3 = -1;
            switch (strD.hashCode()) {
                case 2083:
                    if (strD.equals("AD")) {
                        b3 = 0;
                    }
                    break;
                case 2084:
                    if (strD.equals("AE")) {
                        b3 = 1;
                    }
                    break;
                case 2085:
                    if (strD.equals("AF")) {
                        b3 = 2;
                    }
                    break;
                case 2086:
                    if (strD.equals("AG")) {
                        b3 = 3;
                    }
                    break;
                case 2088:
                    if (strD.equals("AI")) {
                        b3 = 4;
                    }
                    break;
                case 2091:
                    if (strD.equals("AL")) {
                        b3 = 5;
                    }
                    break;
                case 2092:
                    if (strD.equals("AM")) {
                        b3 = 6;
                    }
                    break;
                case 2094:
                    if (strD.equals("AO")) {
                        b3 = 7;
                    }
                    break;
                case 2096:
                    if (strD.equals("AQ")) {
                        b3 = 8;
                    }
                    break;
                case 2097:
                    if (strD.equals("AR")) {
                        b3 = 9;
                    }
                    break;
                case 2098:
                    if (strD.equals("AS")) {
                        b3 = 10;
                    }
                    break;
                case 2099:
                    if (strD.equals("AT")) {
                        b3 = 11;
                    }
                    break;
                case 2100:
                    if (strD.equals("AU")) {
                        b3 = 12;
                    }
                    break;
                case 2102:
                    if (strD.equals("AW")) {
                        b3 = 13;
                    }
                    break;
                case 2103:
                    if (strD.equals("AX")) {
                        b3 = 14;
                    }
                    break;
                case 2105:
                    if (strD.equals("AZ")) {
                        b3 = 15;
                    }
                    break;
                case 2111:
                    if (strD.equals("BA")) {
                        b3 = 16;
                    }
                    break;
                case 2112:
                    if (strD.equals("BB")) {
                        b3 = 17;
                    }
                    break;
                case 2114:
                    if (strD.equals("BD")) {
                        b3 = 18;
                    }
                    break;
                case 2115:
                    if (strD.equals("BE")) {
                        b3 = 19;
                    }
                    break;
                case 2116:
                    if (strD.equals("BF")) {
                        b3 = 20;
                    }
                    break;
                case 2117:
                    if (strD.equals("BG")) {
                        b3 = 21;
                    }
                    break;
                case 2118:
                    if (strD.equals("BH")) {
                        b3 = 22;
                    }
                    break;
                case 2119:
                    if (strD.equals("BI")) {
                        b3 = 23;
                    }
                    break;
                case 2120:
                    if (strD.equals("BJ")) {
                        b3 = 24;
                    }
                    break;
                case 2122:
                    if (strD.equals("BL")) {
                        b3 = 25;
                    }
                    break;
                case 2123:
                    if (strD.equals("BM")) {
                        b3 = 26;
                    }
                    break;
                case 2124:
                    if (strD.equals("BN")) {
                        b3 = 27;
                    }
                    break;
                case 2125:
                    if (strD.equals("BO")) {
                        b3 = 28;
                    }
                    break;
                case 2127:
                    if (strD.equals("BQ")) {
                        b3 = 29;
                    }
                    break;
                case 2128:
                    if (strD.equals("BR")) {
                        b3 = 30;
                    }
                    break;
                case 2129:
                    if (strD.equals("BS")) {
                        b3 = 31;
                    }
                    break;
                case 2130:
                    if (strD.equals("BT")) {
                        b3 = 32;
                    }
                    break;
                case 2133:
                    if (strD.equals("BW")) {
                        b3 = 33;
                    }
                    break;
                case 2135:
                    if (strD.equals("BY")) {
                        b3 = 34;
                    }
                    break;
                case 2136:
                    if (strD.equals("BZ")) {
                        b3 = 35;
                    }
                    break;
                case 2142:
                    if (strD.equals("CA")) {
                        b3 = 36;
                    }
                    break;
                case 2145:
                    if (strD.equals("CD")) {
                        b3 = 37;
                    }
                    break;
                case 2147:
                    if (strD.equals("CF")) {
                        b3 = 38;
                    }
                    break;
                case 2148:
                    if (strD.equals("CG")) {
                        b3 = 39;
                    }
                    break;
                case 2149:
                    if (strD.equals("CH")) {
                        b3 = 40;
                    }
                    break;
                case 2150:
                    if (strD.equals("CI")) {
                        b3 = 41;
                    }
                    break;
                case 2152:
                    if (strD.equals("CK")) {
                        b3 = 42;
                    }
                    break;
                case 2153:
                    if (strD.equals("CL")) {
                        b3 = 43;
                    }
                    break;
                case 2154:
                    if (strD.equals("CM")) {
                        b3 = 44;
                    }
                    break;
                case 2155:
                    if (strD.equals("CN")) {
                        b3 = 45;
                    }
                    break;
                case 2156:
                    if (strD.equals("CO")) {
                        b3 = 46;
                    }
                    break;
                case 2159:
                    if (strD.equals("CR")) {
                        b3 = 47;
                    }
                    break;
                case 2162:
                    if (strD.equals("CU")) {
                        b3 = 48;
                    }
                    break;
                case 2163:
                    if (strD.equals("CV")) {
                        b3 = 49;
                    }
                    break;
                case 2164:
                    if (strD.equals("CW")) {
                        b3 = 50;
                    }
                    break;
                case 2165:
                    if (strD.equals("CX")) {
                        b3 = 51;
                    }
                    break;
                case 2166:
                    if (strD.equals("CY")) {
                        b3 = 52;
                    }
                    break;
                case 2167:
                    if (strD.equals("CZ")) {
                        b3 = 53;
                    }
                    break;
                case 2177:
                    if (strD.equals("DE")) {
                        b3 = 54;
                    }
                    break;
                case 2182:
                    if (strD.equals("DJ")) {
                        b3 = 55;
                    }
                    break;
                case 2183:
                    if (strD.equals("DK")) {
                        b3 = 56;
                    }
                    break;
                case 2185:
                    if (strD.equals("DM")) {
                        b3 = 57;
                    }
                    break;
                case 2187:
                    if (strD.equals("DO")) {
                        b3 = 58;
                    }
                    break;
                case 2198:
                    if (strD.equals("DZ")) {
                        b3 = 59;
                    }
                    break;
                case 2206:
                    if (strD.equals("EC")) {
                        b3 = 60;
                    }
                    break;
                case 2208:
                    if (strD.equals("EE")) {
                        b3 = 61;
                    }
                    break;
                case 2210:
                    if (strD.equals("EG")) {
                        b3 = 62;
                    }
                    break;
                case 2221:
                    if (strD.equals("ER")) {
                        b3 = 63;
                    }
                    break;
                case 2222:
                    if (strD.equals("ES")) {
                        b3 = 64;
                    }
                    break;
                case 2223:
                    if (strD.equals("ET")) {
                        b3 = 65;
                    }
                    break;
                case 2243:
                    if (strD.equals("FI")) {
                        b3 = 66;
                    }
                    break;
                case 2244:
                    if (strD.equals("FJ")) {
                        b3 = 67;
                    }
                    break;
                case 2245:
                    if (strD.equals("FK")) {
                        b3 = 68;
                    }
                    break;
                case 2247:
                    if (strD.equals("FM")) {
                        b3 = 69;
                    }
                    break;
                case 2249:
                    if (strD.equals("FO")) {
                        b3 = 70;
                    }
                    break;
                case 2252:
                    if (strD.equals("FR")) {
                        b3 = 71;
                    }
                    break;
                case 2266:
                    if (strD.equals("GA")) {
                        b3 = 72;
                    }
                    break;
                case 2267:
                    if (strD.equals("GB")) {
                        b3 = 73;
                    }
                    break;
                case 2269:
                    if (strD.equals("GD")) {
                        b3 = 74;
                    }
                    break;
                case 2270:
                    if (strD.equals("GE")) {
                        b3 = 75;
                    }
                    break;
                case 2271:
                    if (strD.equals("GF")) {
                        b3 = 76;
                    }
                    break;
                case 2272:
                    if (strD.equals("GG")) {
                        b3 = 77;
                    }
                    break;
                case 2273:
                    if (strD.equals("GH")) {
                        b3 = 78;
                    }
                    break;
                case 2274:
                    if (strD.equals("GI")) {
                        b3 = 79;
                    }
                    break;
                case 2277:
                    if (strD.equals("GL")) {
                        b3 = 80;
                    }
                    break;
                case 2278:
                    if (strD.equals("GM")) {
                        b3 = 81;
                    }
                    break;
                case 2279:
                    if (strD.equals("GN")) {
                        b3 = 82;
                    }
                    break;
                case 2281:
                    if (strD.equals("GP")) {
                        b3 = 83;
                    }
                    break;
                case 2282:
                    if (strD.equals("GQ")) {
                        b3 = 84;
                    }
                    break;
                case 2283:
                    if (strD.equals("GR")) {
                        b3 = 85;
                    }
                    break;
                case 2285:
                    if (strD.equals("GT")) {
                        b3 = 86;
                    }
                    break;
                case 2286:
                    if (strD.equals("GU")) {
                        b3 = 87;
                    }
                    break;
                case 2288:
                    if (strD.equals("GW")) {
                        b3 = 88;
                    }
                    break;
                case 2290:
                    if (strD.equals("GY")) {
                        b3 = 89;
                    }
                    break;
                case 2307:
                    if (strD.equals("HK")) {
                        b3 = 90;
                    }
                    break;
                case 2314:
                    if (strD.equals("HR")) {
                        b3 = 91;
                    }
                    break;
                case 2316:
                    if (strD.equals("HT")) {
                        b3 = 92;
                    }
                    break;
                case 2317:
                    if (strD.equals("HU")) {
                        b3 = 93;
                    }
                    break;
                case 2331:
                    if (strD.equals("ID")) {
                        b3 = 94;
                    }
                    break;
                case 2332:
                    if (strD.equals("IE")) {
                        b3 = 95;
                    }
                    break;
                case 2339:
                    if (strD.equals("IL")) {
                        b3 = 96;
                    }
                    break;
                case 2340:
                    if (strD.equals("IM")) {
                        b3 = 97;
                    }
                    break;
                case 2341:
                    if (strD.equals("IN")) {
                        b3 = 98;
                    }
                    break;
                case 2342:
                    if (strD.equals("IO")) {
                        b3 = 99;
                    }
                    break;
                case 2344:
                    if (strD.equals("IQ")) {
                        b3 = 100;
                    }
                    break;
                case 2345:
                    if (strD.equals("IR")) {
                        b3 = 101;
                    }
                    break;
                case 2346:
                    if (strD.equals("IS")) {
                        b3 = 102;
                    }
                    break;
                case 2347:
                    if (strD.equals("IT")) {
                        b3 = 103;
                    }
                    break;
                case 2363:
                    if (strD.equals("JE")) {
                        b3 = 104;
                    }
                    break;
                case 2371:
                    if (strD.equals("JM")) {
                        b3 = 105;
                    }
                    break;
                case 2373:
                    if (strD.equals("JO")) {
                        b3 = 106;
                    }
                    break;
                case 2374:
                    if (strD.equals("JP")) {
                        b3 = 107;
                    }
                    break;
                case 2394:
                    if (strD.equals("KE")) {
                        b3 = 108;
                    }
                    break;
                case 2396:
                    if (strD.equals("KG")) {
                        b3 = 109;
                    }
                    break;
                case 2397:
                    if (strD.equals("KH")) {
                        b3 = 110;
                    }
                    break;
                case 2398:
                    if (strD.equals("KI")) {
                        b3 = 111;
                    }
                    break;
                case 2402:
                    if (strD.equals("KM")) {
                        b3 = 112;
                    }
                    break;
                case 2403:
                    if (strD.equals("KN")) {
                        b3 = 113;
                    }
                    break;
                case 2407:
                    if (strD.equals("KR")) {
                        b3 = 114;
                    }
                    break;
                case 2412:
                    if (strD.equals("KW")) {
                        b3 = 115;
                    }
                    break;
                case 2414:
                    if (strD.equals("KY")) {
                        b3 = 116;
                    }
                    break;
                case 2415:
                    if (strD.equals("KZ")) {
                        b3 = 117;
                    }
                    break;
                case 2421:
                    if (strD.equals("LA")) {
                        b3 = 118;
                    }
                    break;
                case 2422:
                    if (strD.equals("LB")) {
                        b3 = 119;
                    }
                    break;
                case 2423:
                    if (strD.equals("LC")) {
                        b3 = 120;
                    }
                    break;
                case 2429:
                    if (strD.equals("LI")) {
                        b3 = 121;
                    }
                    break;
                case 2431:
                    if (strD.equals("LK")) {
                        b3 = 122;
                    }
                    break;
                case 2438:
                    if (strD.equals("LR")) {
                        b3 = 123;
                    }
                    break;
                case 2439:
                    if (strD.equals("LS")) {
                        b3 = 124;
                    }
                    break;
                case 2440:
                    if (strD.equals("LT")) {
                        b3 = 125;
                    }
                    break;
                case 2441:
                    if (strD.equals("LU")) {
                        b3 = 126;
                    }
                    break;
                case 2442:
                    if (strD.equals("LV")) {
                        b3 = 127;
                    }
                    break;
                case 2445:
                    if (strD.equals("LY")) {
                        b3 = 128;
                    }
                    break;
                case 2452:
                    if (strD.equals("MA")) {
                        b3 = 129;
                    }
                    break;
                case 2454:
                    if (strD.equals("MC")) {
                        b3 = 130;
                    }
                    break;
                case 2455:
                    if (strD.equals("MD")) {
                        b3 = 131;
                    }
                    break;
                case 2456:
                    if (strD.equals("ME")) {
                        b3 = 132;
                    }
                    break;
                case 2457:
                    if (strD.equals("MF")) {
                        b3 = 133;
                    }
                    break;
                case 2458:
                    if (strD.equals("MG")) {
                        b3 = 134;
                    }
                    break;
                case 2459:
                    if (strD.equals("MH")) {
                        b3 = 135;
                    }
                    break;
                case 2462:
                    if (strD.equals("MK")) {
                        b3 = 136;
                    }
                    break;
                case 2463:
                    if (strD.equals("ML")) {
                        b3 = 137;
                    }
                    break;
                case 2464:
                    if (strD.equals("MM")) {
                        b3 = 138;
                    }
                    break;
                case 2465:
                    if (strD.equals("MN")) {
                        b3 = 139;
                    }
                    break;
                case 2466:
                    if (strD.equals("MO")) {
                        b3 = 140;
                    }
                    break;
                case 2467:
                    if (strD.equals("MP")) {
                        b3 = 141;
                    }
                    break;
                case 2468:
                    if (strD.equals("MQ")) {
                        b3 = 142;
                    }
                    break;
                case 2469:
                    if (strD.equals("MR")) {
                        b3 = 143;
                    }
                    break;
                case 2470:
                    if (strD.equals("MS")) {
                        b3 = 144;
                    }
                    break;
                case 2471:
                    if (strD.equals("MT")) {
                        b3 = 145;
                    }
                    break;
                case 2472:
                    if (strD.equals("MU")) {
                        b3 = 146;
                    }
                    break;
                case 2473:
                    if (strD.equals("MV")) {
                        b3 = 147;
                    }
                    break;
                case 2474:
                    if (strD.equals("MW")) {
                        b3 = 148;
                    }
                    break;
                case 2475:
                    if (strD.equals("MX")) {
                        b3 = 149;
                    }
                    break;
                case 2476:
                    if (strD.equals("MY")) {
                        b3 = 150;
                    }
                    break;
                case 2477:
                    if (strD.equals("MZ")) {
                        b3 = 151;
                    }
                    break;
                case 2483:
                    if (strD.equals("NA")) {
                        b3 = 152;
                    }
                    break;
                case 2485:
                    if (strD.equals("NC")) {
                        b3 = 153;
                    }
                    break;
                case 2487:
                    if (strD.equals("NE")) {
                        b3 = 154;
                    }
                    break;
                case 2488:
                    if (strD.equals("NF")) {
                        b3 = 155;
                    }
                    break;
                case 2489:
                    if (strD.equals("NG")) {
                        b3 = 156;
                    }
                    break;
                case 2491:
                    if (strD.equals("NI")) {
                        b3 = 157;
                    }
                    break;
                case 2494:
                    if (strD.equals("NL")) {
                        b3 = 158;
                    }
                    break;
                case 2497:
                    if (strD.equals("NO")) {
                        b3 = 159;
                    }
                    break;
                case 2498:
                    if (strD.equals("NP")) {
                        b3 = 160;
                    }
                    break;
                case 2500:
                    if (strD.equals("NR")) {
                        b3 = 161;
                    }
                    break;
                case 2503:
                    if (strD.equals("NU")) {
                        b3 = 162;
                    }
                    break;
                case 2508:
                    if (strD.equals("NZ")) {
                        b3 = 163;
                    }
                    break;
                case 2526:
                    if (strD.equals("OM")) {
                        b3 = 164;
                    }
                    break;
                case 2545:
                    if (strD.equals("PA")) {
                        b3 = 165;
                    }
                    break;
                case 2549:
                    if (strD.equals("PE")) {
                        b3 = 166;
                    }
                    break;
                case 2550:
                    if (strD.equals("PF")) {
                        b3 = 167;
                    }
                    break;
                case 2551:
                    if (strD.equals("PG")) {
                        b3 = 168;
                    }
                    break;
                case 2552:
                    if (strD.equals("PH")) {
                        b3 = 169;
                    }
                    break;
                case 2555:
                    if (strD.equals("PK")) {
                        b3 = 170;
                    }
                    break;
                case 2556:
                    if (strD.equals("PL")) {
                        b3 = 171;
                    }
                    break;
                case 2557:
                    if (strD.equals("PM")) {
                        b3 = 172;
                    }
                    break;
                case 2562:
                    if (strD.equals("PR")) {
                        b3 = 173;
                    }
                    break;
                case 2563:
                    if (strD.equals("PS")) {
                        b3 = 174;
                    }
                    break;
                case 2564:
                    if (strD.equals("PT")) {
                        b3 = 175;
                    }
                    break;
                case 2567:
                    if (strD.equals("PW")) {
                        b3 = 176;
                    }
                    break;
                case 2569:
                    if (strD.equals("PY")) {
                        b3 = 177;
                    }
                    break;
                case 2576:
                    if (strD.equals("QA")) {
                        b3 = 178;
                    }
                    break;
                case 2611:
                    if (strD.equals("RE")) {
                        b3 = 179;
                    }
                    break;
                case 2621:
                    if (strD.equals("RO")) {
                        b3 = 180;
                    }
                    break;
                case 2625:
                    if (strD.equals("RS")) {
                        b3 = 181;
                    }
                    break;
                case 2627:
                    if (strD.equals("RU")) {
                        b3 = 182;
                    }
                    break;
                case 2629:
                    if (strD.equals("RW")) {
                        b3 = 183;
                    }
                    break;
                case 2638:
                    if (strD.equals("SA")) {
                        b3 = 184;
                    }
                    break;
                case 2639:
                    if (strD.equals("SB")) {
                        b3 = 185;
                    }
                    break;
                case 2640:
                    if (strD.equals("SC")) {
                        b3 = 186;
                    }
                    break;
                case 2641:
                    if (strD.equals("SD")) {
                        b3 = 187;
                    }
                    break;
                case 2642:
                    if (strD.equals("SE")) {
                        b3 = 188;
                    }
                    break;
                case 2644:
                    if (strD.equals("SG")) {
                        b3 = 189;
                    }
                    break;
                case 2645:
                    if (strD.equals("SH")) {
                        b3 = 190;
                    }
                    break;
                case 2646:
                    if (strD.equals("SI")) {
                        b3 = 191;
                    }
                    break;
                case 2647:
                    if (strD.equals("SJ")) {
                        b3 = 192;
                    }
                    break;
                case 2648:
                    if (strD.equals("SK")) {
                        b3 = 193;
                    }
                    break;
                case 2649:
                    if (strD.equals("SL")) {
                        b3 = 194;
                    }
                    break;
                case 2650:
                    if (strD.equals(ADSb.rWXHXNOW)) {
                        b3 = 195;
                    }
                    break;
                case 2651:
                    if (strD.equals("SN")) {
                        b3 = 196;
                    }
                    break;
                case 2652:
                    if (strD.equals("SO")) {
                        b3 = 197;
                    }
                    break;
                case 2655:
                    if (strD.equals("SR")) {
                        b3 = 198;
                    }
                    break;
                case 2656:
                    if (strD.equals("SS")) {
                        b3 = 199;
                    }
                    break;
                case 2657:
                    if (strD.equals("ST")) {
                        b3 = 200;
                    }
                    break;
                case 2659:
                    if (strD.equals("SV")) {
                        b3 = 201;
                    }
                    break;
                case 2661:
                    if (strD.equals("SX")) {
                        b3 = 202;
                    }
                    break;
                case 2662:
                    if (strD.equals("SY")) {
                        b3 = 203;
                    }
                    break;
                case 2663:
                    if (strD.equals("SZ")) {
                        b3 = 204;
                    }
                    break;
                case 2671:
                    if (strD.equals("TC")) {
                        b3 = 205;
                    }
                    break;
                case 2672:
                    if (strD.equals("TD")) {
                        b3 = 206;
                    }
                    break;
                case 2675:
                    if (strD.equals("TG")) {
                        b3 = 207;
                    }
                    break;
                case 2676:
                    if (strD.equals("TH")) {
                        b3 = 208;
                    }
                    break;
                case 2678:
                    if (strD.equals("TJ")) {
                        b3 = 209;
                    }
                    break;
                case 2680:
                    if (strD.equals("TL")) {
                        b3 = 210;
                    }
                    break;
                case 2681:
                    if (strD.equals("TM")) {
                        b3 = 211;
                    }
                    break;
                case 2682:
                    if (strD.equals("TN")) {
                        b3 = 212;
                    }
                    break;
                case 2683:
                    if (strD.equals("TO")) {
                        b3 = 213;
                    }
                    break;
                case 2686:
                    if (strD.equals("TR")) {
                        b3 = 214;
                    }
                    break;
                case 2688:
                    if (strD.equals("TT")) {
                        b3 = 215;
                    }
                    break;
                case 2690:
                    if (strD.equals("TV")) {
                        b3 = 216;
                    }
                    break;
                case 2691:
                    if (strD.equals("TW")) {
                        b3 = 217;
                    }
                    break;
                case 2694:
                    if (strD.equals("TZ")) {
                        b3 = 218;
                    }
                    break;
                case 2700:
                    if (strD.equals("UA")) {
                        b3 = 219;
                    }
                    break;
                case 2706:
                    if (strD.equals("UG")) {
                        b3 = 220;
                    }
                    break;
                case 2718:
                    if (strD.equals("US")) {
                        b3 = 221;
                    }
                    break;
                case 2724:
                    if (strD.equals("UY")) {
                        b3 = 222;
                    }
                    break;
                case 2725:
                    if (strD.equals("UZ")) {
                        b3 = 223;
                    }
                    break;
                case 2731:
                    if (strD.equals("VA")) {
                        b3 = 224;
                    }
                    break;
                case 2733:
                    if (strD.equals("VC")) {
                        b3 = 225;
                    }
                    break;
                case 2735:
                    if (strD.equals("VE")) {
                        b3 = 226;
                    }
                    break;
                case 2737:
                    if (strD.equals("VG")) {
                        b3 = 227;
                    }
                    break;
                case 2739:
                    if (strD.equals("VI")) {
                        b3 = 228;
                    }
                    break;
                case 2744:
                    if (strD.equals("VN")) {
                        b3 = 229;
                    }
                    break;
                case 2751:
                    if (strD.equals("VU")) {
                        b3 = 230;
                    }
                    break;
                case 2767:
                    if (strD.equals("WF")) {
                        b3 = 231;
                    }
                    break;
                case 2780:
                    if (strD.equals("WS")) {
                        b3 = 232;
                    }
                    break;
                case 2803:
                    if (strD.equals("XK")) {
                        b3 = 233;
                    }
                    break;
                case 2828:
                    if (strD.equals("YE")) {
                        b3 = 234;
                    }
                    break;
                case 2843:
                    if (strD.equals("YT")) {
                        b3 = 235;
                    }
                    break;
                case 2855:
                    if (strD.equals("ZA")) {
                        b3 = 236;
                    }
                    break;
                case 2867:
                    if (strD.equals("ZM")) {
                        b3 = 237;
                    }
                    break;
                case 2877:
                    if (strD.equals("ZW")) {
                        b3 = 238;
                    }
                    break;
            }
            switch (b3) {
                case 0:
                case 4:
                case 17:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                case 50:
                case 57:
                case 113:
                case 116:
                case 202:
                case 225:
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case 1:
                    iArr = new int[]{1, 4, 2, 3, 4, 1};
                    break;
                case 2:
                case 204:
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case 3:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case 5:
                    iArr = new int[]{1, 1, 1, 2, 2, 2};
                    break;
                case 6:
                case 165:
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case 7:
                    iArr = new int[]{3, 4, 4, 3, 2, 2};
                    break;
                case 8:
                case 63:
                case 162:
                case 186:
                case 190:
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case 9:
                    iArr = new int[]{2, 2, 2, 2, 1, 2};
                    break;
                case 10:
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case 11:
                case 61:
                case 93:
                case 102:
                case 127:
                case 145:
                case 188:
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case 12:
                    iArr = new int[]{0, 3, 1, 1, 3, 0};
                    break;
                case 13:
                    iArr = new int[]{2, 2, 3, 4, 2, 2};
                    break;
                case 14:
                case 51:
                case 121:
                case 144:
                case 172:
                case 195:
                case 224:
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case 15:
                case 55:
                case 128:
                case 194:
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case 16:
                case 106:
                case 214:
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case 18:
                    iArr = new int[]{2, 1, 3, 2, 4, 2};
                    break;
                case 19:
                    iArr = new int[]{0, 0, 1, 0, 1, 2};
                    break;
                case 20:
                case 187:
                case 203:
                case 206:
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case 21:
                case AchievementLevelType.KNOWLEDGE_POINT_LV_4 /* 175 */:
                case 191:
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case 22:
                    iArr = new int[]{1, 3, 1, 3, 4, 2};
                    break;
                case 23:
                case 84:
                case 92:
                case 154:
                case 226:
                case 234:
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case 141:
                case 177:
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case 27:
                    iArr = new int[]{3, 2, 0, 0, 2, 2};
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case 30:
                    iArr = new int[]{1, 1, 1, 1, 2, 4};
                    break;
                case 31:
                    iArr = new int[]{3, 2, 1, 1, 2, 2};
                    break;
                case Consts.SP /* 32 */:
                    iArr = new int[]{3, 1, 2, 2, 3, 2};
                    break;
                case 33:
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    iArr = new int[]{1, 2, 3, 3, 2, 2};
                    break;
                case 35:
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 219:
                    iArr = new int[]{0, 2, 1, 2, 3, 3};
                    break;
                case 37:
                case 137:
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case 38:
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 62:
                case 134:
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    iArr = new int[]{0, 1, 0, 0, 0, 2};
                    break;
                case 43:
                case 208:
                    iArr = new int[]{0, 1, 2, 2, 2, 2};
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case 143:
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    iArr = new int[]{2, 0, 1, 1, 3, 1};
                    break;
                case 46:
                    iArr = new int[]{2, 3, 3, 2, 2, 2};
                    break;
                case 47:
                case 157:
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case 48:
                case 111:
                case 161:
                case 210:
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case 49:
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case 52:
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case 53:
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case 54:
                    iArr = new int[]{0, 1, 4, 2, 2, 1};
                    break;
                case 56:
                    iArr = new int[]{0, 0, 2, 0, 0, 2};
                    break;
                case 58:
                case 123:
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case 59:
                case 209:
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case 60:
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case 64:
                    iArr = new int[]{0, 0, 0, 0, 1, 0};
                    break;
                case 65:
                    iArr = new int[]{4, 3, 4, 4, 4, 2};
                    break;
                case 66:
                    iArr = new int[]{0, 0, 0, 1, 0, 2};
                    break;
                case 67:
                    iArr = new int[]{3, 2, 2, 3, 2, 2};
                    break;
                case 68:
                case 155:
                case 192:
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case UCrop.REQUEST_CROP /* 69 */:
                    iArr = new int[]{4, 2, 4, 0, 2, 2};
                    break;
                case 70:
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case 71:
                    iArr = new int[]{1, 1, 1, 1, 0, 2};
                    break;
                case 72:
                    iArr = new int[]{3, 4, 0, 0, 2, 2};
                    break;
                case 73:
                    iArr = new int[]{1, 1, 3, 2, 2, 2};
                    break;
                case 74:
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case AchievementLevelType.DAY_STREAK_LV_6 /* 75 */:
                    iArr = new int[]{1, 1, 0, 2, 2, 2};
                    break;
                case 76:
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case 77:
                    iArr = new int[]{0, 2, 1, 1, 2, 2};
                    break;
                case 78:
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case 79:
                case 97:
                case 104:
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case 80:
                case 130:
                    iArr = new int[]{1, 2, 2, 0, 2, 2};
                    break;
                case 81:
                case 199:
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case 82:
                    iArr = new int[]{3, 4, 4, 2, 2, 2};
                    break;
                case 83:
                    iArr = new int[]{2, 1, 1, 3, 2, 2};
                    break;
                case 85:
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case 86:
                    iArr = new int[]{2, 1, 2, 1, 2, 2};
                    break;
                case 87:
                    iArr = new int[]{2, 2, 4, 3, 3, 2};
                    break;
                case 88:
                    iArr = new int[]{4, 4, 1, 2, 2, 2};
                    break;
                case 89:
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case 90:
                    iArr = new int[]{0, 1, 0, 1, 1, 0};
                    break;
                case 91:
                case 115:
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case 94:
                    iArr = new int[]{3, 1, 3, 3, 2, 4};
                    break;
                case 95:
                    iArr = new int[]{1, 1, 1, 1, 1, 2};
                    break;
                case UCrop.RESULT_ERROR /* 96 */:
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case 98:
                    iArr = new int[]{1, 1, 3, 2, 2, 3};
                    break;
                case 99:
                    iArr = new int[]{3, 2, 2, 0, 2, 2};
                    break;
                case 100:
                    iArr = new int[]{3, 2, 3, 2, 2, 2};
                    break;
                case 101:
                    iArr = new int[]{4, 2, 3, 3, 4, 3};
                    break;
                case 103:
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case 105:
                    iArr = new int[]{2, 4, 3, 1, 2, 2};
                    break;
                case 107:
                    iArr = new int[]{0, 3, 2, 3, 4, 2};
                    break;
                case 108:
                    iArr = new int[]{3, 2, 1, 1, 1, 2};
                    break;
                case 109:
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case 110:
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case 112:
                case 230:
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case 114:
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case 117:
                    iArr = new int[]{2, 1, 2, 2, 3, 2};
                    break;
                case 118:
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case 119:
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case 120:
                    iArr = new int[]{2, 2, 1, 1, 2, 2};
                    break;
                case 122:
                case 138:
                    iArr = new int[]{3, 2, 3, 3, 4, 2};
                    break;
                case 124:
                case 168:
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case AchievementLevelType.DAY_STREAK_LV_7 /* 125 */:
                    iArr = new int[]{0, 1, 0, 1, 0, 2};
                    break;
                case 126:
                    iArr = new int[]{4, 0, 3, 2, 1, 3};
                    break;
                case 129:
                    iArr = new int[]{3, 3, 1, 1, 2, 2};
                    break;
                case 131:
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case 132:
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case 133:
                    iArr = new int[]{1, 2, 2, 3, 2, 2};
                    break;
                case 135:
                case 211:
                case 216:
                case 231:
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case 136:
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case 139:
                    iArr = new int[]{2, 0, 2, 2, 2, 2};
                    break;
                case 140:
                    iArr = new int[]{0, 2, 4, 4, 3, 1};
                    break;
                case 142:
                    iArr = new int[]{2, 1, 2, 3, 2, 2};
                    break;
                case 146:
                    iArr = new int[]{3, 1, 0, 2, 2, 2};
                    break;
                case 147:
                    iArr = new int[]{3, 2, 1, 3, 4, 2};
                    break;
                case 148:
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case 149:
                    iArr = new int[]{2, 4, 4, 4, 3, 2};
                    break;
                case 150:
                    iArr = new int[]{1, 0, 4, 1, 1, 0};
                    break;
                case 151:
                case 232:
                    iArr = new int[]{3, 1, 2, 2, 2, 2};
                    break;
                case 152:
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case 153:
                case 235:
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case 156:
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case 158:
                    iArr = new int[]{2, 1, 4, 3, 0, 4};
                    break;
                case 159:
                    iArr = new int[]{0, 0, 3, 0, 0, 2};
                    break;
                case 160:
                    iArr = new int[]{2, 2, 4, 3, 2, 2};
                    break;
                case 163:
                    iArr = new int[]{0, 0, 1, 2, 4, 2};
                    break;
                case 164:
                    iArr = new int[]{2, 3, 1, 2, 4, 2};
                    break;
                case 166:
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case 167:
                    iArr = new int[]{2, 2, 3, 1, 2, 2};
                    break;
                case 169:
                    iArr = new int[]{2, 1, 2, 3, 2, 1};
                    break;
                case 170:
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case 171:
                    iArr = new int[]{1, 0, 2, 2, 4, 4};
                    break;
                case 173:
                    iArr = new int[]{2, 0, 2, 1, 2, 0};
                    break;
                case 174:
                    iArr = new int[]{3, 4, 1, 3, 2, 2};
                    break;
                case 176:
                    iArr = new int[]{2, 2, 4, 1, 2, 2};
                    break;
                case 178:
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case 179:
                    iArr = new int[]{0, 3, 2, 3, 1, 2};
                    break;
                case AchievementLevelType.DAY_STREAK_LV_8 /* 180 */:
                    iArr = new int[]{0, 0, 1, 1, 3, 2};
                    break;
                case 181:
                    iArr = new int[]{1, 0, 0, 1, 2, 2};
                    break;
                case 182:
                    iArr = new int[]{1, 0, 0, 1, 3, 3};
                    break;
                case 183:
                    iArr = new int[]{3, 3, 2, 0, 2, 2};
                    break;
                case 184:
                    iArr = new int[]{3, 1, 1, 2, 2, 0};
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 185 */:
                case 238:
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case 189:
                    iArr = new int[]{2, 3, 3, 3, 1, 1};
                    break;
                case 193:
                    iArr = new int[]{0, 1, 1, 1, 2, 2};
                    break;
                case 196:
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case 197:
                    iArr = new int[]{2, 2, 3, 4, 4, 2};
                    break;
                case 198:
                    iArr = new int[]{2, 4, 4, 1, 2, 2};
                    break;
                case 200:
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case 201:
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case 205:
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case 207:
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case 212:
                    iArr = new int[]{3, 1, 1, 1, 2, 2};
                    break;
                case 213:
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case 215:
                    iArr = new int[]{2, 4, 1, 0, 2, 2};
                    break;
                case 217:
                    iArr = new int[]{0, 0, 0, 0, 0, 0};
                    break;
                case 218:
                    iArr = new int[]{3, 4, 2, 1, 3, 2};
                    break;
                case 220:
                    iArr = new int[]{3, 3, 2, 3, 4, 2};
                    break;
                case 221:
                    iArr = new int[]{2, 2, 4, 1, 3, 1};
                    break;
                case 222:
                    iArr = new int[]{2, 1, 1, 2, 1, 2};
                    break;
                case 223:
                    iArr = new int[]{1, 2, 3, 4, 3, 2};
                    break;
                case 227:
                    iArr = new int[]{2, 2, 1, 1, 2, 4};
                    break;
                case 228:
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case 229:
                    iArr = new int[]{0, 0, 1, 2, 2, 2};
                    break;
                case 233:
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case 236:
                    iArr = new int[]{2, 4, 2, 1, 1, 2};
                    break;
                case 237:
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            if (i11 == 2) {
                jLongValue = ((Long) f52067p.get(iArr[0])).longValue();
            } else if (i11 == 3) {
                jLongValue = ((Long) f52068q.get(iArr[1])).longValue();
            } else if (i11 == 4) {
                jLongValue = ((Long) f52069r.get(iArr[2])).longValue();
            } else if (i11 == 5) {
                jLongValue = ((Long) f52070s.get(iArr[3])).longValue();
            } else if (i11 == 7) {
                jLongValue = ((Long) f52067p.get(iArr[0])).longValue();
            } else if (i11 != 9) {
                jLongValue = i11 != 10 ? 1000000L : ((Long) f52071t.get(iArr[4])).longValue();
            } else {
                jLongValue = ((Long) f52072u.get(iArr[5])).longValue();
            }
            lValueOf = Long.valueOf(jLongValue);
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }
}

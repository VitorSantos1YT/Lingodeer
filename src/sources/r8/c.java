package r8;

import am.rVFB.LwKl;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.q2;
import b0.p2;
import b7.f0;
import b7.v;
import b7.w;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.common.primitives.Ints;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingodeer.data.model.AchievementLevelType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import lf.x0;
import x7.t;
import x7.u;
import y6.b0;
import y6.c0;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f48855a;

    static {
        String str = f0.f3975a;
        f48855a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(w wVar) {
        int i11 = wVar.f4040b;
        wVar.J(4);
        if (wVar.j() != 1751411826) {
            i11 += 4;
        }
        wVar.I(i11);
    }

    /* JADX WARN: Code duplicated, block: B:206:0x040e  */
    /* JADX WARN: Code duplicated, block: B:276:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:288:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:295:0x05df  */
    /* JADX WARN: Code duplicated, block: B:372:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:498:0x09e0 A[LOOP:18: B:498:0x09e0->B:635:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:503:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:504:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:506:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:629:? A[LOOP:15: B:486:0x09a7->B:629:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:? A[LOOP:16: B:490:0x09c1->B:631:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:? A[LOOP:17: B:493:0x09c9->B:633:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[LOOP:18: B:498:0x09e0->B:635:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0175  */
    public static void b(w wVar, int i11, int i12, int i13, int i14, String str, boolean z11, y6.l lVar, ar.f fVar, int i15) throws ParserException {
        int iC;
        int i16;
        int i17;
        int iX;
        int iJ;
        int iIntValue;
        int iW;
        int i18;
        y6.l lVarA;
        String str2;
        int i19;
        int i21;
        int i22;
        int i23;
        String str3;
        int i24;
        int i25;
        w wVar2;
        String strU;
        v vVar;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean zH;
        int i32;
        int i33;
        int i34;
        int i35;
        boolean z12;
        boolean zH2;
        int i36;
        int i37;
        boolean z13;
        String str4;
        int i38;
        w wVar3 = wVar;
        int iIntValue2 = i11;
        int i39 = i13;
        int[] iArr = x7.a.f55818f;
        int[] iArr2 = x7.a.f55816d;
        wVar3.I(i12 + 16);
        if (z11) {
            iC = wVar3.C();
            wVar3.J(6);
        } else {
            wVar3.J(8);
            iC = 0;
        }
        if (iC == 0 || iC == 1) {
            i16 = 2;
            i17 = 4;
            int iC2 = wVar3.C();
            wVar3.J(6);
            iX = wVar3.x();
            wVar3.I(wVar3.f4040b - 4);
            iJ = wVar3.j();
            if (iC == 1) {
                wVar3.J(16);
            }
            iIntValue = iC2;
            iW = -1;
        } else {
            if (iC != 2) {
                return;
            }
            wVar3.J(16);
            i16 = 2;
            int iRound = (int) Math.round(Double.longBitsToDouble(wVar3.q()));
            iIntValue = wVar3.A();
            wVar3.J(4);
            i17 = 4;
            int iA = wVar3.A();
            int iA2 = wVar3.A();
            boolean z14 = (iA2 & 1) != 0;
            boolean z15 = (iA2 & 2) != 0;
            if (z14) {
                if (iA == 32) {
                    i38 = 4;
                } else {
                    i38 = -1;
                }
            } else if (iA == 8) {
                i38 = 3;
            } else if (iA == 16) {
                i38 = z15 ? 268435456 : 2;
            } else if (iA == 24) {
                i38 = z15 ? 1342177280 : 21;
            } else if (iA == 32) {
                i38 = z15 ? 1610612736 : 22;
            } else {
                i38 = -1;
            }
            wVar3.J(8);
            iX = iRound;
            iW = i38;
            iJ = 0;
        }
        if (iIntValue2 == 1767992678) {
            iIntValue = -1;
            iX = -1;
        } else {
            if (iIntValue2 != 1935764850) {
                i18 = iIntValue2 == 1935767394 ? 16000 : 8000;
            }
            iX = i18;
            iIntValue = 1;
        }
        int i40 = wVar3.f4040b;
        if (iIntValue2 == 1701733217) {
            Pair pairH = h(wVar3, i12, i39);
            if (pairH != null) {
                iIntValue2 = ((Integer) pairH.first).intValue();
                lVarA = lVar == null ? null : lVar.a(((o) pairH.second).f48954b);
                ((o[]) fVar.f2848d)[i15] = (o) pairH.second;
            } else {
                lVarA = lVar;
            }
            wVar3.I(i40);
        } else {
            lVarA = lVar;
        }
        String str5 = "audio/mhm1";
        if (iIntValue2 == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue2 == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue2 == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue2 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue2 == 1685353320 || iIntValue2 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue2 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue2 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue2 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue2 == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue2 == 1936684916) {
            iW = i16;
            str2 = "audio/raw";
        } else if (iIntValue2 == 1953984371) {
            str2 = "audio/raw";
            iW = 268435456;
        } else if (iIntValue2 == 1819304813) {
            if (iW == -1) {
                iW = i16;
            }
            str2 = "audio/raw";
        } else if (iIntValue2 == 778924082 || iIntValue2 == 778924083) {
            str2 = "audio/mpeg";
        } else if (iIntValue2 == 1835557169) {
            str2 = "audio/mha1";
        } else if (iIntValue2 == 1835560241) {
            str2 = "audio/mhm1";
        } else if (iIntValue2 == 1634492771) {
            str2 = "audio/alac";
        } else if (iIntValue2 == 1634492791) {
            str2 = "audio/g711-alaw";
        } else if (iIntValue2 == 1970037111) {
            str2 = "audio/g711-mlaw";
        } else if (iIntValue2 == 1332770163) {
            str2 = "audio/opus";
        } else if (iIntValue2 == 1716281667) {
            str2 = "audio/flac";
        } else if (iIntValue2 == 1835823201) {
            str2 = "audio/true-hd";
        } else {
            str2 = iIntValue2 == 1767992678 ? "audio/iamf" : null;
        }
        p2 p2VarC = null;
        String str6 = null;
        List listU = null;
        i9.f fVar2 = null;
        while (i40 - i12 < i39) {
            wVar3.I(i40);
            int iJ2 = wVar3.j();
            iW = iW;
            x7.a.c("childAtomSize must be positive", iJ2 > 0);
            int iJ3 = wVar3.j();
            str6 = str6;
            if (iJ3 == 1835557187) {
                wVar3.I(i40 + 8);
                wVar3.J(1);
                int iW2 = wVar3.w();
                wVar3.J(1);
                String str7 = Objects.equals(str2, str5) ? String.format("mhm1.%02X", Integer.valueOf(iW2)) : String.format("mha1.%02X", Integer.valueOf(iW2));
                int iC3 = wVar3.C();
                byte[] bArr = new byte[iC3];
                String str8 = str7;
                wVar3.h(bArr, 0, iC3);
                str6 = str8;
                listU = listU == null ? ImmutableList.u(bArr) : ImmutableList.v(bArr, (byte[]) listU.get(0));
            } else {
                if (iJ3 == 1835557200) {
                    wVar3.I(i40 + 8);
                    int iW3 = wVar3.w();
                    if (iW3 > 0) {
                        byte[] bArr2 = new byte[iW3];
                        wVar3.h(bArr2, 0, iW3);
                        listU = listU == null ? ImmutableList.u(bArr2) : ImmutableList.v((byte[]) listU.get(0), bArr2);
                    }
                    listU = listU;
                    str6 = str6;
                } else {
                    if (iJ3 == 1702061171) {
                        i19 = 1702061171;
                    } else if (z11 && iJ3 == 2002876005) {
                        i19 = 1702061171;
                    } else if (iJ3 == 1651798644) {
                        wVar3.I(i40 + 8);
                        wVar3.J(i17);
                        listU = listU;
                        iIntValue2 = iIntValue2;
                        str2 = str2;
                        i40 = i40;
                        fVar2 = new i9.f(wVar3.y(), wVar3.y());
                        str5 = str5;
                        i23 = iJ2;
                    } else {
                        listU = listU;
                        i23 = iJ2;
                        if (iJ3 == 1684103987) {
                            wVar3.I(i40 + 8);
                            String string = Integer.toString(i14);
                            v vVar2 = new v();
                            vVar2.o(wVar3);
                            int i41 = iArr2[vVar2.i(i16)];
                            vVar2.t(8);
                            int i42 = iArr[vVar2.i(3)];
                            if (vVar2.i(1) != 0) {
                                i42++;
                            }
                            int i43 = x7.a.f55819g[vVar2.i(5)] * 1000;
                            vVar2.c();
                            wVar3.I(vVar2.f());
                            y6.o oVar = new y6.o();
                            oVar.f57253a = string;
                            oVar.m = d0.o("audio/ac3");
                            oVar.E = i42;
                            oVar.F = i41;
                            oVar.f57268q = lVarA;
                            oVar.f57256d = str;
                            oVar.f57260h = i43;
                            oVar.f57261i = i43;
                            fVar.f2849e = new y6.p(oVar);
                            str2 = str2;
                        } else if (iJ3 == 1684366131) {
                            wVar3.I(i40 + 8);
                            String string2 = Integer.toString(i14);
                            v vVar3 = new v();
                            vVar3.o(wVar3);
                            int i44 = vVar3.i(13) * 1000;
                            vVar3.t(3);
                            int i45 = iArr2[vVar3.i(2)];
                            vVar3.t(10);
                            int i46 = iArr[vVar3.i(3)];
                            if (vVar3.i(1) != 0) {
                                i46++;
                            }
                            int i47 = i46;
                            vVar3.t(3);
                            int i48 = vVar3.i(4);
                            vVar3.t(1);
                            if (i48 > 0) {
                                vVar3.t(6);
                                if (vVar3.i(1) != 0) {
                                    i47 += 2;
                                }
                                vVar3.t(1);
                            }
                            int i49 = i47;
                            if (vVar3.b() > 7) {
                                vVar3.t(7);
                                if (vVar3.i(1) != 0) {
                                    str4 = "audio/eac3-joc";
                                } else {
                                    str4 = "audio/eac3";
                                }
                            } else {
                                str4 = "audio/eac3";
                            }
                            vVar3.c();
                            wVar3.I(vVar3.f());
                            y6.o oVar2 = new y6.o();
                            oVar2.f57253a = string2;
                            oVar2.m = d0.o(str4);
                            oVar2.E = i49;
                            oVar2.F = i45;
                            oVar2.f57268q = lVarA;
                            oVar2.f57256d = str;
                            oVar2.f57261i = i44;
                            fVar.f2849e = new y6.p(oVar2);
                        } else {
                            str2 = str2;
                            str5 = str5;
                            if (iJ3 == 1684103988) {
                                wVar3.I(i40 + 8);
                                String string3 = Integer.toString(i14);
                                v vVar4 = new v();
                                vVar4.o(wVar3);
                                int iB = vVar4.b();
                                int i50 = vVar4.i(3);
                                if (i50 > 1) {
                                    throw ParserException.c("Unsupported AC-4 DSI version: " + i50);
                                }
                                int i51 = vVar4.i(7);
                                int i52 = vVar4.h() ? 48000 : 44100;
                                vVar4.t(4);
                                int i53 = vVar4.i(9);
                                if (i51 > 1) {
                                    if (i50 == 0) {
                                        throw ParserException.c("Invalid AC-4 DSI version: " + i50);
                                    }
                                    if (vVar4.h()) {
                                        vVar4.t(16);
                                        if (vVar4.h()) {
                                            vVar4.t(128);
                                        }
                                    }
                                }
                                if (i50 == 1) {
                                    if (vVar4.b() < 66) {
                                        throw ParserException.c("Invalid AC-4 DSI bitrate.");
                                    }
                                    vVar4.t(66);
                                    vVar4.c();
                                }
                                x7.b bVar = new x7.b();
                                bVar.f55844a = true;
                                bVar.f55845b = -1;
                                bVar.f55846c = -1;
                                bVar.f55847d = true;
                                i40 = i40;
                                bVar.f55848e = 2;
                                bVar.f55849f = 1;
                                bVar.f55850g = 0;
                                int i54 = 0;
                                while (true) {
                                    if (i54 < i53) {
                                        if (i50 == 0) {
                                            zH = vVar4.h();
                                            i28 = iX;
                                            i32 = vVar4.i(5);
                                            i33 = vVar4.i(5);
                                            i34 = 0;
                                            i35 = 0;
                                            z12 = false;
                                        } else {
                                            int i55 = i53;
                                            int i56 = vVar4.i(8);
                                            i28 = iX;
                                            int i57 = vVar4.i(8);
                                            int i58 = i57 == 255 ? vVar4.i(16) + i57 : i57;
                                            if (i56 > 2) {
                                                vVar4.t(i58 * 8);
                                                i54++;
                                                i53 = i55;
                                                iX = i28;
                                            } else {
                                                int iB2 = (iB - vVar4.b()) / 8;
                                                i32 = vVar4.i(5);
                                                z12 = i32 == 31;
                                                i33 = i56;
                                                i35 = iB2;
                                                i34 = i58;
                                                zH = false;
                                            }
                                        }
                                        bVar.f55849f = i33;
                                        i27 = iIntValue;
                                        if (zH || z12 || i32 != 6) {
                                            bVar.f55850g = vVar4.i(3);
                                            if (vVar4.h()) {
                                                vVar4.t(5);
                                            }
                                            vVar4.t(2);
                                            if (i50 == 1 && (i33 == 1 || i33 == 2)) {
                                                vVar4.t(2);
                                            }
                                            vVar4.t(5);
                                            vVar4.t(10);
                                            if (i50 == 1) {
                                                if (i33 > 0) {
                                                    bVar.f55844a = vVar4.h();
                                                }
                                                if (bVar.f55844a) {
                                                    if (i33 != 1) {
                                                        i36 = 2;
                                                        if (i33 == 2) {
                                                            i37 = vVar4.i(5);
                                                            if (i37 >= 0 && i37 <= 15) {
                                                                bVar.f55845b = i37;
                                                            }
                                                            if (i37 >= 11 || i37 > 14) {
                                                                i36 = 2;
                                                            } else {
                                                                bVar.f55847d = vVar4.h();
                                                                i36 = 2;
                                                                bVar.f55848e = vVar4.i(2);
                                                            }
                                                        }
                                                    } else {
                                                        i37 = vVar4.i(5);
                                                        if (i37 >= 0) {
                                                            bVar.f55845b = i37;
                                                        }
                                                        if (i37 >= 11) {
                                                            i36 = 2;
                                                        } else {
                                                            i36 = 2;
                                                        }
                                                    }
                                                    vVar4.t(24);
                                                } else {
                                                    i36 = 2;
                                                }
                                                if (i33 == 1 || i33 == i36) {
                                                    if (vVar4.h() && vVar4.h()) {
                                                        vVar4.t(i36);
                                                    }
                                                    if (vVar4.h()) {
                                                        vVar4.s();
                                                        int i59 = 8;
                                                        int i60 = vVar4.i(8);
                                                        int i61 = 0;
                                                        while (i61 < i60) {
                                                            vVar4.t(i59);
                                                            i61++;
                                                            i59 = 8;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!zH && !z12) {
                                                vVar4.s();
                                                if (i32 == 0 || i32 == 1 || i32 == 2) {
                                                    if (i33 == 0) {
                                                        for (int i62 = 0; i62 < 2; i62++) {
                                                            x7.a.o(vVar4, bVar);
                                                        }
                                                    } else {
                                                        for (int i63 = 0; i63 < 2; i63++) {
                                                            x7.a.p(vVar4, bVar);
                                                        }
                                                    }
                                                } else if (i32 == 3 || i32 == 4) {
                                                    if (i33 == 0) {
                                                        for (int i64 = 0; i64 < 3; i64++) {
                                                            x7.a.o(vVar4, bVar);
                                                        }
                                                    } else {
                                                        for (int i65 = 0; i65 < 3; i65++) {
                                                            x7.a.p(vVar4, bVar);
                                                        }
                                                    }
                                                } else if (i32 != 5) {
                                                    int i66 = vVar4.i(7);
                                                    for (int i67 = 0; i67 < i66; i67++) {
                                                        vVar4.t(8);
                                                    }
                                                } else if (i33 == 0) {
                                                    x7.a.o(vVar4, bVar);
                                                } else {
                                                    int i68 = vVar4.i(3);
                                                    for (int i69 = 0; i69 < i68 + 2; i69++) {
                                                        x7.a.p(vVar4, bVar);
                                                    }
                                                }
                                            } else if (i33 == 0) {
                                                x7.a.o(vVar4, bVar);
                                            } else {
                                                x7.a.p(vVar4, bVar);
                                            }
                                            vVar4.s();
                                            zH2 = vVar4.h();
                                        } else {
                                            i33 = i33;
                                            zH2 = true;
                                        }
                                        if (zH2) {
                                            int i70 = vVar4.i(7);
                                            for (int i71 = 0; i71 < i70; i71++) {
                                                vVar4.t(15);
                                            }
                                        }
                                        if (i33 <= 0) {
                                            i29 = 8;
                                        } else {
                                            if (vVar4.h()) {
                                                if (vVar4.b() < 66) {
                                                    z13 = false;
                                                } else {
                                                    vVar4.t(66);
                                                    z13 = true;
                                                }
                                                if (!z13) {
                                                    throw ParserException.c("Can't parse bitrate DSI.");
                                                }
                                            }
                                            if (vVar4.h()) {
                                                vVar4.c();
                                                vVar4.u(vVar4.i(16));
                                                int i72 = vVar4.i(5);
                                                for (int i73 = 0; i73 < i72; i73++) {
                                                    vVar4.t(3);
                                                    vVar4.t(8);
                                                }
                                                i29 = 8;
                                            } else {
                                                i29 = 8;
                                            }
                                        }
                                        vVar4.c();
                                        if (i50 == 1) {
                                            int iB3 = ((iB - vVar4.b()) / 8) - i35;
                                            if (i34 < iB3) {
                                                throw ParserException.c("pres_bytes is smaller than presentation bytes read.");
                                            }
                                            vVar4.u(i34 - iB3);
                                        }
                                        if (bVar.f55844a && bVar.f55845b == -1) {
                                            throw ParserException.c(LwKl.UxpHsZCJXO + i54);
                                        }
                                    } else {
                                        iIntValue2 = iIntValue2;
                                        i27 = iIntValue;
                                        i28 = iX;
                                        i29 = 8;
                                    }
                                    int i74 = 12;
                                    if (bVar.f55844a) {
                                        int i75 = bVar.f55845b;
                                        boolean z16 = bVar.f55847d;
                                        int i76 = bVar.f55848e;
                                        switch (i75) {
                                            case 0:
                                                i30 = 11;
                                                i31 = 1;
                                                break;
                                            case 1:
                                                i30 = 11;
                                                i31 = 2;
                                                break;
                                            case 2:
                                                i30 = 11;
                                                i31 = 3;
                                                break;
                                            case 3:
                                                i30 = 11;
                                                i31 = 5;
                                                break;
                                            case 4:
                                                i30 = 11;
                                                i31 = 6;
                                                break;
                                            case 5:
                                            case 7:
                                            case 9:
                                                i30 = 11;
                                                i31 = 7;
                                                break;
                                            case 6:
                                            case 8:
                                            case 10:
                                                i31 = i29;
                                                i30 = 11;
                                                break;
                                            case 11:
                                                i30 = 11;
                                                i31 = 11;
                                                break;
                                            case 12:
                                                i31 = 12;
                                                i30 = 11;
                                                break;
                                            case 13:
                                                i30 = 11;
                                                i31 = 13;
                                                break;
                                            case 14:
                                                i30 = 11;
                                                i31 = 14;
                                                break;
                                            case 15:
                                                i30 = 11;
                                                i31 = 24;
                                                break;
                                            default:
                                                i30 = 11;
                                                i31 = -1;
                                                break;
                                        }
                                        if (i75 == i30 || i75 == 12 || i75 == 13 || i75 == 14) {
                                            if (!z16) {
                                                i31 -= 2;
                                            }
                                            if (i76 == 0) {
                                                i31 -= 4;
                                            } else if (i76 == 1) {
                                                i31 -= 2;
                                            }
                                        }
                                        i74 = i31;
                                    } else {
                                        int i77 = bVar.f55846c;
                                        if (i77 > 0) {
                                            int i78 = i77 + 1;
                                            if (bVar.f55850g == 4 && i78 == 17) {
                                                i78 = 21;
                                            }
                                            i74 = i78;
                                        } else {
                                            int i79 = bVar.f55850g;
                                            if (i79 == 0) {
                                                i74 = 2;
                                            } else if (i79 == 1) {
                                                i74 = 6;
                                            } else if (i79 == 2) {
                                                i74 = i29;
                                            } else if (i79 == 3) {
                                                i74 = 10;
                                            } else if (i79 != 4) {
                                                b7.a.B("AC-4 level " + bVar.f55850g + " has not been defined.");
                                                i74 = 2;
                                            }
                                        }
                                    }
                                    if (i74 <= 0) {
                                        throw ParserException.c("Cannot determine channel count of presentation.");
                                    }
                                    Object[] objArr = {Integer.valueOf(i51), Integer.valueOf(bVar.f55849f), Integer.valueOf(bVar.f55850g)};
                                    String str9 = f0.f3975a;
                                    String str10 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                    y6.o oVar3 = new y6.o();
                                    oVar3.f57253a = string3;
                                    oVar3.m = d0.o("audio/ac4");
                                    oVar3.E = i74;
                                    oVar3.F = i52;
                                    oVar3.f57268q = lVarA;
                                    oVar3.f57256d = str;
                                    oVar3.f57262j = str10;
                                    fVar.f2849e = new y6.p(oVar3);
                                    i24 = i28;
                                    iIntValue = i27;
                                    iIntValue2 = iIntValue2;
                                    p2VarC = p2VarC;
                                    iIntValue = iIntValue;
                                    iX = i24;
                                    iW = iW;
                                    str6 = str6;
                                    i23 = i23;
                                }
                            } else {
                                int i80 = iIntValue2;
                                i40 = i40;
                                int i81 = iIntValue;
                                int i82 = iX;
                                if (iJ3 != 1684892784) {
                                    if (iJ3 == 1684305011 || iJ3 == 1969517683) {
                                        iIntValue2 = i80;
                                        y6.o oVar4 = new y6.o();
                                        oVar4.f57253a = Integer.toString(i14);
                                        oVar4.m = d0.o(str2);
                                        iIntValue = i81;
                                        oVar4.E = iIntValue;
                                        i24 = i82;
                                        oVar4.F = i24;
                                        oVar4.f57268q = lVarA;
                                        oVar4.f57256d = str;
                                        fVar.f2849e = new y6.p(oVar4);
                                    } else if (iJ3 == 1682927731) {
                                        int i83 = i23 - 8;
                                        byte[] bArr3 = f48855a;
                                        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i83);
                                        wVar3.I(i40 + 8);
                                        wVar3.h(bArrCopyOf, bArr3.length, i83);
                                        listU = x7.a.a(bArrCopyOf);
                                        i23 = i23;
                                        iX = i82;
                                        iIntValue = i81;
                                        iIntValue2 = i80;
                                    } else {
                                        if (iJ3 == 1684425825) {
                                            byte[] bArr4 = new byte[i23 - 8];
                                            bArr4[0] = 102;
                                            bArr4[1] = 76;
                                            bArr4[2] = 97;
                                            bArr4[3] = 67;
                                            wVar3.I(i40 + 12);
                                            wVar3.h(bArr4, 4, i23 - 12);
                                            listU = ImmutableList.u(bArr4);
                                            str6 = str6;
                                        } else if (iJ3 == 1634492771) {
                                            int i84 = i23 - 12;
                                            byte[] bArr5 = new byte[i84];
                                            wVar3.I(i40 + 12);
                                            wVar3.h(bArr5, 0, i84);
                                            byte[] bArr6 = b7.d.f3966a;
                                            w wVar4 = new w(bArr5);
                                            wVar4.I(9);
                                            int iW4 = wVar4.w();
                                            wVar4.I(20);
                                            Pair pairCreate = Pair.create(Integer.valueOf(wVar4.A()), Integer.valueOf(iW4));
                                            int iIntValue3 = ((Integer) pairCreate.first).intValue();
                                            p2VarC = p2VarC;
                                            iIntValue = ((Integer) pairCreate.second).intValue();
                                            listU = ImmutableList.u(bArr5);
                                            iX = iIntValue3;
                                            iW = iW;
                                            str6 = str6;
                                            iIntValue2 = i80;
                                        } else if (iJ3 == 1767990114) {
                                            wVar3.I(i40 + 9);
                                            long j11 = 0;
                                            for (int i85 = 0; i85 < 9; i85++) {
                                                if (wVar3.f4040b == wVar3.f4041c) {
                                                    throw new IllegalStateException("Attempting to read a byte over the limit.");
                                                }
                                                long jW = wVar3.w();
                                                j11 |= (jW & 127) << (i85 * 7);
                                                if ((jW & 128) == 0) {
                                                    int iB4 = Ints.b(j11);
                                                    byte[] bArr7 = new byte[iB4];
                                                    wVar3.h(bArr7, 0, iB4);
                                                    byte[] bArr8 = b7.d.f3966a;
                                                    wVar2 = new w(bArr7);
                                                    while ((wVar2.w() & 128) != 0) {
                                                    }
                                                    wVar2.J(4);
                                                    int iW5 = wVar2.w();
                                                    int iW6 = wVar2.w();
                                                    wVar2.J(1);
                                                    while ((wVar2.w() & 128) != 0) {
                                                    }
                                                    while ((wVar2.w() & 128) != 0) {
                                                    }
                                                    strU = wVar2.u(4, StandardCharsets.UTF_8);
                                                    if (strU.equals("mp4a")) {
                                                        while ((wVar2.w() & 128) != 0) {
                                                        }
                                                        wVar2.J(2);
                                                        vVar = new v();
                                                        vVar.o(wVar2);
                                                        i26 = vVar.i(5);
                                                        if (i26 == 31) {
                                                            i26 = vVar.i(6) + 32;
                                                        }
                                                        strU = nv.p.k(i26, strU, ".40.");
                                                    }
                                                    Object[] objArr2 = {Integer.valueOf(iW5), Integer.valueOf(iW6), strU};
                                                    String str11 = f0.f3975a;
                                                    String str12 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr2);
                                                    ImmutableList immutableListU = ImmutableList.u(bArr7);
                                                    str6 = str12;
                                                    listU = immutableListU;
                                                }
                                            }
                                            int iB5 = Ints.b(j11);
                                            byte[] bArr9 = new byte[iB5];
                                            wVar3.h(bArr9, 0, iB5);
                                            byte[] bArr10 = b7.d.f3966a;
                                            wVar2 = new w(bArr9);
                                            while ((wVar2.w() & 128) != 0) {
                                            }
                                            wVar2.J(4);
                                            int iW7 = wVar2.w();
                                            int iW8 = wVar2.w();
                                            wVar2.J(1);
                                            while ((wVar2.w() & 128) != 0) {
                                            }
                                            while ((wVar2.w() & 128) != 0) {
                                            }
                                            strU = wVar2.u(4, StandardCharsets.UTF_8);
                                            if (strU.equals("mp4a")) {
                                                while ((wVar2.w() & 128) != 0) {
                                                }
                                                wVar2.J(2);
                                                vVar = new v();
                                                vVar.o(wVar2);
                                                i26 = vVar.i(5);
                                                if (i26 == 31) {
                                                    i26 = vVar.i(6) + 32;
                                                }
                                                strU = nv.p.k(i26, strU, ".40.");
                                            }
                                            Object[] objArr3 = {Integer.valueOf(iW7), Integer.valueOf(iW8), strU};
                                            String str13 = f0.f3975a;
                                            String str14 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr3);
                                            ImmutableList immutableListU2 = ImmutableList.u(bArr9);
                                            str6 = str14;
                                            listU = immutableListU2;
                                        } else if (iJ3 == 1885564227) {
                                            wVar3.I(i40 + 12);
                                            ByteOrder byteOrder = (wVar3.w() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int iW9 = wVar3.w();
                                            iIntValue2 = i80;
                                            if (iIntValue2 == 1768973165) {
                                                iW = f0.w(iW9, byteOrder);
                                                i25 = -1;
                                            } else {
                                                iW = (iIntValue2 == 1718641517 && iW9 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : iW;
                                                i25 = -1;
                                            }
                                            p2VarC = p2VarC;
                                            str6 = str6;
                                            if (iW != i25) {
                                                str2 = "audio/raw";
                                            }
                                            i23 = i23;
                                            iX = i82;
                                            iIntValue = i81;
                                        } else {
                                            iIntValue2 = i80;
                                            i24 = i82;
                                            iIntValue = i81;
                                        }
                                        iX = i82;
                                        iIntValue = i81;
                                        iIntValue2 = i80;
                                    }
                                    p2VarC = p2VarC;
                                    iIntValue = iIntValue;
                                    iX = i24;
                                    iW = iW;
                                    str6 = str6;
                                    i23 = i23;
                                } else {
                                    if (iJ <= 0) {
                                        throw ParserException.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iJ);
                                    }
                                    p2VarC = p2VarC;
                                    iX = iJ;
                                    iW = iW;
                                    str6 = str6;
                                    i23 = i23;
                                    iIntValue2 = i80;
                                    iIntValue = 2;
                                }
                            }
                        }
                        i24 = iX;
                        p2VarC = p2VarC;
                        iIntValue = iIntValue;
                        iX = i24;
                        iW = iW;
                        str6 = str6;
                        i23 = i23;
                    }
                    if (iJ3 == i19) {
                        i23 = iJ2;
                        i21 = i40;
                        i22 = i21;
                    } else {
                        i21 = wVar3.f4040b;
                        i22 = i40;
                        x7.a.c(null, i21 >= i22);
                        while (true) {
                            i23 = iJ2;
                            if (i21 - i22 < i23) {
                                wVar3.I(i21);
                                int iJ4 = wVar3.j();
                                x7.a.c("childAtomSize must be positive", iJ4 > 0);
                                if (wVar3.j() != 1702061171) {
                                    i21 += iJ4;
                                    iJ2 = i23;
                                }
                            } else {
                                i21 = -1;
                            }
                        }
                    }
                    if (i21 != -1) {
                        p2VarC = c(i21, wVar3);
                        str3 = (String) p2VarC.f3638c;
                        byte[] bArr11 = (byte[]) p2VarC.f3639d;
                        if (bArr11 == null) {
                            i40 = i22;
                        } else if ("audio/vorbis".equals(str3)) {
                            w wVar5 = new w(bArr11);
                            wVar5.J(1);
                            int i86 = 0;
                            while (wVar5.a() > 0 && (wVar5.f4039a[wVar5.f4040b] & 255) == 255) {
                                i86 += 255;
                                wVar5.J(1);
                            }
                            int iW10 = wVar5.w() + i86;
                            int i87 = 0;
                            while (true) {
                                if (wVar5.a() > 0) {
                                    i40 = i22;
                                    if ((wVar5.f4039a[wVar5.f4040b] & 255) == 255) {
                                        i87 += 255;
                                        wVar5.J(1);
                                        i22 = i40;
                                    }
                                } else {
                                    i40 = i22;
                                }
                            }
                            int iW11 = wVar5.w() + i87;
                            byte[] bArr12 = new byte[iW10];
                            int i88 = wVar5.f4040b;
                            System.arraycopy(bArr11, i88, bArr12, 0, iW10);
                            int i89 = i88 + iW10 + iW11;
                            int length = bArr11.length - i89;
                            byte[] bArr13 = new byte[length];
                            System.arraycopy(bArr11, i89, bArr13, 0, length);
                            listU = ImmutableList.v(bArr12, bArr13);
                        } else {
                            i40 = i22;
                            if ("audio/mp4a-latm".equals(str3)) {
                                com.android.billingclient.api.i iVarN = x7.a.n(new v(bArr11, bArr11.length), false);
                                iX = iVarN.f7515a;
                                iIntValue = iVarN.f7516b;
                                str6 = iVarN.f7517c;
                            } else {
                                iX = iX;
                                iIntValue = iIntValue;
                                str6 = str6;
                            }
                            listU = ImmutableList.u(bArr11);
                        }
                        iX = iX;
                        iIntValue = iIntValue;
                        str6 = str6;
                    } else {
                        i40 = i22;
                        p2VarC = p2VarC;
                        iX = iX;
                        iIntValue = iIntValue;
                        str6 = str6;
                        str3 = str2;
                    }
                    str2 = str3;
                    iW = iW;
                }
                i40 += i23;
                i17 = 4;
                i16 = 2;
                wVar3 = wVar;
                i39 = i13;
                iIntValue2 = iIntValue2;
                p2VarC = p2VarC;
                listU = listU;
                str2 = str2;
                str5 = str5;
            }
            iIntValue2 = iIntValue2;
            i23 = iJ2;
            p2VarC = p2VarC;
            i40 += i23;
            i17 = 4;
            i16 = 2;
            wVar3 = wVar;
            i39 = i13;
            iIntValue2 = iIntValue2;
            p2VarC = p2VarC;
            listU = listU;
            str2 = str2;
            str5 = str5;
        }
        String str15 = str6;
        String str16 = str2;
        List list = listU;
        int i90 = iW;
        int i91 = iIntValue;
        int i92 = iX;
        if (((y6.p) fVar.f2849e) != null || str16 == null) {
            return;
        }
        y6.o oVar5 = new y6.o();
        oVar5.f57253a = Integer.toString(i14);
        oVar5.m = d0.o(str16);
        oVar5.f57262j = str15;
        oVar5.E = i91;
        oVar5.F = i92;
        oVar5.G = i90;
        oVar5.f57267p = list;
        oVar5.f57268q = lVarA;
        oVar5.f57256d = str;
        if (p2VarC != null) {
            p2 p2Var = p2VarC;
            oVar5.f57260h = Ints.e(p2Var.f3636a);
            oVar5.f57261i = Ints.e(p2Var.f3637b);
        } else {
            i9.f fVar3 = fVar2;
            if (fVar3 != null) {
                oVar5.f57260h = Ints.e(fVar3.f34275a);
                oVar5.f57261i = Ints.e(fVar3.f34276b);
            }
        }
        fVar.f2849e = new y6.p(oVar5);
    }

    public static p2 c(int i11, w wVar) {
        wVar.I(i11 + 12);
        wVar.J(1);
        d(wVar);
        wVar.J(2);
        int iW = wVar.w();
        if ((iW & 128) != 0) {
            wVar.J(2);
        }
        if ((iW & 64) != 0) {
            wVar.J(wVar.w());
        }
        if ((iW & 32) != 0) {
            wVar.J(2);
        }
        wVar.J(1);
        d(wVar);
        String strF = d0.f(wVar.w());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return new p2(strF, null, -1L, -1L);
        }
        wVar.J(4);
        long jY = wVar.y();
        long jY2 = wVar.y();
        wVar.J(1);
        int iD = d(wVar);
        long j11 = jY2;
        byte[] bArr = new byte[iD];
        wVar.h(bArr, 0, iD);
        if (j11 <= 0) {
            j11 = -1;
        }
        return new p2(strF, bArr, j11, jY > 0 ? jY : -1L);
    }

    public static int d(w wVar) {
        int iW = wVar.w();
        int i11 = iW & 127;
        while ((iW & 128) == 128) {
            iW = wVar.w();
            i11 = (i11 << 7) | (iW & 127);
        }
        return i11;
    }

    public static int e(int i11) {
        return (i11 >> 24) & 255;
    }

    public static c0 f(c7.d dVar) {
        c7.b bVar;
        c7.e eVarO = dVar.o(1751411826);
        c7.e eVarO2 = dVar.o(1801812339);
        c7.e eVarO3 = dVar.o(1768715124);
        if (eVarO != null && eVarO2 != null && eVarO3 != null) {
            w wVar = eVarO.f6650c;
            wVar.I(16);
            if (wVar.j() == 1835299937) {
                w wVar2 = eVarO2.f6650c;
                wVar2.I(12);
                int iJ = wVar2.j();
                String[] strArr = new String[iJ];
                for (int i11 = 0; i11 < iJ; i11++) {
                    int iJ2 = wVar2.j();
                    wVar2.J(4);
                    strArr[i11] = wVar2.u(iJ2 - 8, StandardCharsets.UTF_8);
                }
                w wVar3 = eVarO3.f6650c;
                wVar3.I(8);
                ArrayList arrayList = new ArrayList();
                while (wVar3.a() > 8) {
                    int i12 = wVar3.f4040b;
                    int iJ3 = wVar3.j();
                    int iJ4 = wVar3.j() - 1;
                    if (iJ4 < 0 || iJ4 >= iJ) {
                        defpackage.e.y(iJ4, "Skipped metadata with unknown key index: ");
                    } else {
                        String str = strArr[iJ4];
                        int i13 = i12 + iJ3;
                        while (true) {
                            int i14 = wVar3.f4040b;
                            if (i14 >= i13) {
                                bVar = null;
                                break;
                            }
                            int iJ5 = wVar3.j();
                            if (wVar3.j() == 1684108385) {
                                int iJ6 = wVar3.j();
                                int iJ7 = wVar3.j();
                                int i15 = iJ5 - 16;
                                byte[] bArr = new byte[i15];
                                wVar3.h(bArr, 0, i15);
                                bVar = new c7.b(str, bArr, iJ7, iJ6);
                                break;
                            }
                            wVar3.I(i14 + iJ5);
                        }
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                    }
                    wVar3.I(i12 + iJ3);
                }
                if (!arrayList.isEmpty()) {
                    return new c0(arrayList);
                }
            }
        }
        return null;
    }

    public static c7.h g(w wVar) {
        long jQ;
        long jQ2;
        wVar.I(8);
        if (e(wVar.j()) == 0) {
            jQ = wVar.y();
            jQ2 = wVar.y();
        } else {
            jQ = wVar.q();
            jQ2 = wVar.q();
        }
        return new c7.h(jQ, jQ2, wVar.y());
    }

    public static Pair h(w wVar, int i11, int i12) throws ParserException {
        o oVar;
        Pair pairCreate;
        int i13;
        int i14;
        int i15 = wVar.f4040b;
        while (i15 - i11 < i12) {
            wVar.I(i15);
            int iJ = wVar.j();
            x7.a.c("childAtomSize must be positive", iJ > 0);
            if (wVar.j() == 1936289382) {
                int i16 = i15 + 8;
                int i17 = 0;
                int i18 = -1;
                Integer numValueOf = null;
                String strU = null;
                while (i16 - i15 < iJ) {
                    wVar.I(i16);
                    int iJ2 = wVar.j();
                    int iJ3 = wVar.j();
                    if (iJ3 == 1718775137) {
                        numValueOf = Integer.valueOf(wVar.j());
                    } else if (iJ3 == 1935894637) {
                        wVar.J(4);
                        strU = wVar.u(4, StandardCharsets.UTF_8);
                    } else if (iJ3 == 1935894633) {
                        i18 = i16;
                        i17 = iJ2;
                    }
                    i16 += iJ2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strU) || "cbc1".equals(strU) || "cens".equals(strU) || "cbcs".equals(strU)) {
                    x7.a.c("frma atom is mandatory", numValueOf != null);
                    x7.a.c("schi atom is mandatory", i18 != -1);
                    int i19 = i18 + 8;
                    while (true) {
                        if (i19 - i18 >= i17) {
                            oVar = null;
                            break;
                        }
                        wVar.I(i19);
                        int iJ4 = wVar.j();
                        if (wVar.j() == 1952804451) {
                            int iE = e(wVar.j());
                            wVar.J(1);
                            if (iE == 0) {
                                wVar.J(1);
                                i14 = 0;
                                i13 = 0;
                            } else {
                                int iW = wVar.w();
                                i13 = iW & 15;
                                i14 = (iW & 240) >> 4;
                            }
                            boolean z11 = wVar.w() == 1;
                            int iW2 = wVar.w();
                            byte[] bArr2 = new byte[16];
                            wVar.h(bArr2, 0, 16);
                            if (z11 && iW2 == 0) {
                                int iW3 = wVar.w();
                                byte[] bArr3 = new byte[iW3];
                                wVar.h(bArr3, 0, iW3);
                                bArr = bArr3;
                            }
                            oVar = new o(z11, strU, iW2, bArr2, i14, i13, bArr);
                            break;
                        }
                        i19 += iJ4;
                    }
                    x7.a.c("tenc atom is mandatory", oVar != null);
                    String str = f0.f3975a;
                    pairCreate = Pair.create(numValueOf, oVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i15 += iJ;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:435:0x096f  */
    /* JADX WARN: Code duplicated, block: B:436:0x0972  */
    public static ar.f i(w wVar, q2 q2Var, String str, y6.l lVar, boolean z11) throws ParserException {
        int i11;
        y6.l lVar2;
        String str2;
        int i12;
        int i13;
        int i14;
        char c11;
        int i15;
        int i16;
        int i17;
        int i18;
        String str3;
        String str4;
        String str5;
        byte[] bArrCopyOfRange;
        int i19;
        int i21;
        char c12;
        int i22;
        int i23;
        int i24;
        int i25;
        int iG;
        y6.g gVar;
        int i26;
        int i27;
        int i28;
        y6.g gVar2;
        int i29;
        int i30;
        x0 x0Var;
        y6.l lVarA;
        int i31;
        int i32;
        String str6;
        ImmutableList immutableListU;
        long j11;
        w wVar2 = wVar;
        q2 q2Var2 = q2Var;
        String str7 = str;
        int i33 = q2Var2.f2594a;
        wVar2.I(12);
        int iJ = wVar2.j();
        ar.f fVar = new ar.f(iJ);
        int i34 = 0;
        while (i34 < iJ) {
            int i35 = wVar2.f4040b;
            int iJ2 = wVar2.j();
            String str8 = "childAtomSize must be positive";
            x7.a.c("childAtomSize must be positive", iJ2 > 0);
            int iJ3 = wVar2.j();
            byte b3 = 3;
            int i36 = 8;
            if (iJ3 == 1635148593 || iJ3 == 1635148595 || iJ3 == 1701733238 || iJ3 == 1831958048 || iJ3 == 1836070006 || iJ3 == 1752589105 || iJ3 == 1751479857 || iJ3 == 1932670515 || iJ3 == 1211250227 || iJ3 == 1748121139 || iJ3 == 1987063864 || iJ3 == 1987063865 || iJ3 == 1635135537 || iJ3 == 1685479798 || iJ3 == 1685479729 || iJ3 == 1685481573 || iJ3 == 1685481521 || iJ3 == 1634760241) {
                int i37 = q2Var2.f2596c;
                wVar2.I(i35 + 16);
                wVar2.J(16);
                int iC = wVar2.C();
                int iC2 = wVar2.C();
                wVar2.J(50);
                int i38 = wVar2.f4040b;
                i11 = i34;
                if (iJ3 == 1701733238) {
                    Pair pairH = h(wVar2, i35, iJ2);
                    if (pairH != null) {
                        iJ3 = ((Integer) pairH.first).intValue();
                        lVarA = lVar == null ? null : lVar.a(((o) pairH.second).f48954b);
                        ((o[]) fVar.f2848d)[i11] = (o) pairH.second;
                    } else {
                        i35 = i35;
                        lVarA = lVar;
                    }
                    wVar2.I(i38);
                    lVar2 = lVarA;
                } else {
                    i35 = i35;
                    lVar2 = lVar;
                }
                if (iJ3 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iJ3 == 1211250227 ? "video/3gpp" : null;
                }
                y6.l lVar3 = lVar2;
                i12 = i33;
                i13 = iJ;
                int i39 = 8;
                int i40 = 8;
                String str9 = str2;
                float fA = 1.0f;
                int i41 = -1;
                int i42 = -1;
                List listJ = null;
                int i43 = -1;
                ob.i iVar = null;
                ByteBuffer byteBufferOrder = null;
                boolean z12 = false;
                int i44 = -1;
                int i45 = -1;
                byte[] bArr = null;
                int i46 = -1;
                int i47 = -1;
                String str10 = null;
                i9.f fVar2 = null;
                p2 p2Var = null;
                int i48 = i38;
                int iG2 = -1;
                while (i48 - i35 < iJ2) {
                    wVar2.I(i48);
                    int i49 = wVar2.f4040b;
                    int i50 = i48;
                    int iJ4 = wVar2.j();
                    if (iJ4 == 0 && wVar2.f4040b - i35 == iJ2) {
                        break;
                    }
                    x7.a.c(str8, iJ4 > 0);
                    int iJ5 = wVar2.j();
                    int i51 = iJ2;
                    if (iJ5 == 1635148611) {
                        x7.a.c(null, str9 == null);
                        wVar2.I(i49 + 8);
                        x7.c cVarA = x7.c.a(wVar2);
                        listJ = cVarA.f55851a;
                        fVar.f2846b = cVarA.f55852b;
                        float f5 = !z12 ? cVarA.f55861k : fA;
                        String str11 = cVarA.f55862l;
                        int i52 = cVarA.f55860j;
                        i43 = cVarA.f55857g;
                        int i53 = cVarA.f55858h;
                        iG2 = cVarA.f55859i;
                        int i54 = cVarA.f55855e;
                        i39 = cVarA.f55856f;
                        i17 = i53;
                        i15 = iJ3;
                        fA = f5;
                        str10 = str11;
                        str5 = "video/avc";
                        i45 = i52;
                        i16 = i41;
                        i40 = i54;
                        i18 = i36;
                    } else {
                        i15 = iJ3;
                        if (iJ5 == 1752589123) {
                            x7.a.c(null, str9 == null);
                            wVar2.I(i49 + 8);
                            u uVarA = u.a(wVar2, false, null);
                            listJ = uVarA.f55932a;
                            fVar.f2846b = uVarA.f55933b;
                            float f11 = !z12 ? uVarA.f55943l : fA;
                            int i55 = uVarA.m;
                            int i56 = uVarA.f55934c;
                            String str12 = uVarA.f55944n;
                            int i57 = uVarA.f55942k;
                            if (i57 != -1) {
                                i41 = i57;
                            }
                            int i58 = uVarA.f55935d;
                            int i59 = uVarA.f55936e;
                            i43 = uVarA.f55939h;
                            int i60 = uVarA.f55940i;
                            i44 = i56;
                            int i61 = uVarA.f55941j;
                            int i62 = uVarA.f55937f;
                            i39 = uVarA.f55938g;
                            iVar = uVarA.f55945o;
                            str5 = "video/hevc";
                            str8 = str8;
                            i47 = i58;
                            fVar = fVar;
                            str10 = str12;
                            i46 = i59;
                            i17 = i60;
                            iG2 = i61;
                            i45 = i55;
                            i40 = i62;
                            fA = f11;
                            i16 = i41;
                            i18 = i36;
                        } else {
                            int i63 = i41;
                            if (iJ5 == 1818785347) {
                                x7.a.c("lhvC must follow hvcC atom", "video/hevc".equals(str9));
                                x7.a.c("must have at least two layers", iVar != null && ((ImmutableList) iVar.f44813b).size() >= 2);
                                wVar2.I(i49 + 8);
                                iVar.getClass();
                                u uVarA2 = u.a(wVar2, true, iVar);
                                x7.a.c("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", fVar.f2846b == uVarA2.f55933b);
                                int i64 = uVarA2.f55939h;
                                if (i64 != -1) {
                                    x7.a.c("colorSpace must be the same for both views", i43 == i64);
                                }
                                int i65 = uVarA2.f55940i;
                                if (i65 != -1) {
                                    x7.a.c("colorRange must be the same for both views", i42 == i65);
                                }
                                int i66 = uVarA2.f55941j;
                                if (i66 != -1) {
                                    x7.a.c("colorTransfer must be the same for both views", iG2 == i66);
                                }
                                x7.a.c("bitdepthLuma must be the same for both views", i40 == uVarA2.f55937f);
                                x7.a.c("bitdepthChroma must be the same for both views", i39 == uVarA2.f55938g);
                                if (listJ != null) {
                                    UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
                                    ImmutableList.Builder builder = new ImmutableList.Builder();
                                    builder.f(listJ);
                                    builder.f(uVarA2.f55932a);
                                    listJ = builder.j();
                                } else {
                                    x7.a.c("initializationData must be already set from hvcC atom", false);
                                }
                                str5 = "video/mv-hevc";
                                fVar = fVar;
                                i17 = i42;
                                str10 = uVarA2.f55944n;
                                iVar = iVar;
                                i18 = i36;
                                i16 = i63;
                                str8 = str8;
                            } else if (iJ5 == 1986361461) {
                                wVar2.I(i49 + 8);
                                int i67 = wVar2.f4040b;
                                x0 x0Var2 = null;
                                while (i67 - i49 < iJ4) {
                                    wVar2.I(i67);
                                    int iJ6 = wVar2.j();
                                    x7.a.c(str8, iJ6 > 0);
                                    int i68 = i39;
                                    if (wVar2.j() == 1702454643) {
                                        wVar2.I(i67 + 8);
                                        int i69 = wVar2.f4040b;
                                        while (true) {
                                            if (i69 - i67 >= iJ6) {
                                                x0Var = null;
                                                break;
                                            }
                                            wVar2.I(i69);
                                            int iJ7 = wVar2.j();
                                            x7.a.c(str8, iJ7 > 0);
                                            int i70 = i69;
                                            if (wVar2.j() == 1937011305) {
                                                wVar2.J(4);
                                                int iW = wVar2.w();
                                                boolean z13 = (iW & 1) == 1;
                                                boolean z14 = (iW & 2) == 2;
                                                boolean z15 = (iW & 8) == i36;
                                                h7.g gVar3 = new h7.g();
                                                gVar3.f31868a = z13;
                                                gVar3.f31869b = z14;
                                                gVar3.f31870c = z15;
                                                x0Var = new x0(gVar3, 27);
                                                break;
                                            }
                                            i69 = i70 + iJ7;
                                            i36 = 8;
                                        }
                                        x0Var2 = x0Var;
                                    } else {
                                        i40 = i40;
                                        i67 = i67;
                                        iJ6 = iJ6;
                                    }
                                    i67 += iJ6;
                                    i39 = i68;
                                    i40 = i40;
                                    i36 = 8;
                                }
                                int i71 = i39;
                                int i72 = i40;
                                n9.q qVar = x0Var2 == null ? null : new n9.q(x0Var2, 22);
                                if (qVar != null) {
                                    h7.g gVar4 = (h7.g) ((x0) qVar.f43673b).f40130b;
                                    boolean z16 = gVar4.f31870c;
                                    if (iVar == null || ((ImmutableList) iVar.f44813b).size() < 2) {
                                        i29 = i63;
                                        if (i29 == -1) {
                                            i30 = z16 ? 5 : 4;
                                        } else {
                                            i30 = i29;
                                        }
                                    } else {
                                        x7.a.c("both eye views must be marked as available", gVar4.f31868a && gVar4.f31869b);
                                        x7.a.c("for MV-HEVC, eye_views_reversed must be set to false", !z16);
                                        i29 = i63;
                                        i30 = i29;
                                    }
                                } else {
                                    i29 = i63;
                                    i30 = i29;
                                }
                                str8 = str8;
                                str5 = str9;
                                fVar = fVar;
                                i17 = i42;
                                iVar = iVar;
                                i39 = i71;
                                i40 = i72;
                                i16 = i30;
                                i18 = 8;
                            } else {
                                i39 = i39;
                                i40 = i40;
                                i16 = i63;
                                if (iJ5 == 1685480259 || iJ5 == 1685485123 || iJ5 == 1685485379) {
                                    str8 = str8;
                                    String str13 = str9;
                                    fVar = fVar;
                                    i17 = i42;
                                    iVar = iVar;
                                    i18 = 8;
                                    int i73 = iJ4 - 8;
                                    byte[] bArr2 = new byte[i73];
                                    wVar2.h(bArr2, 0, i73);
                                    if (listJ != null) {
                                        UnmodifiableListIterator unmodifiableListIterator2 = ImmutableList.f16771b;
                                        ImmutableList.Builder builder2 = new ImmutableList.Builder();
                                        builder2.f(listJ);
                                        builder2.h(bArr2);
                                        listJ = builder2.j();
                                    } else {
                                        x7.a.c("initializationData must already be set from hvcC or avcC atom", false);
                                    }
                                    wVar2.I(i49 + 8);
                                    c7.a aVarA = c7.a.a(wVar2);
                                    if (aVarA != null) {
                                        str3 = aVarA.f6641a;
                                        str4 = "video/dolby-vision";
                                    } else {
                                        str3 = str10;
                                        str4 = str13;
                                    }
                                    str5 = str4;
                                    str10 = str3;
                                } else {
                                    int i74 = 6;
                                    if (iJ5 == 1987076931) {
                                        x7.a.c(null, str9 == null);
                                        String str14 = i15 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        wVar2.I(i49 + 12);
                                        byte bW = (byte) wVar2.w();
                                        byte bW2 = (byte) wVar2.w();
                                        int iW2 = wVar2.w();
                                        int i75 = iW2 >> 4;
                                        byte b11 = (byte) ((iW2 >> 1) & 7);
                                        if (str14.equals("video/x-vnd.on2.vp9")) {
                                            byte[] bArr3 = b7.d.f3966a;
                                            byte[] bArr4 = new byte[12];
                                            bArr4[0] = 1;
                                            bArr4[1] = 1;
                                            bArr4[2] = bW;
                                            bArr4[b3] = 2;
                                            bArr4[4] = 1;
                                            bArr4[5] = bW2;
                                            bArr4[6] = b3;
                                            bArr4[7] = 1;
                                            bArr4[8] = (byte) i75;
                                            bArr4[9] = 4;
                                            bArr4[10] = 1;
                                            bArr4[11] = b11;
                                            listJ = ImmutableList.u(bArr4);
                                        }
                                        boolean z17 = (iW2 & 1) != 0;
                                        int iW3 = wVar2.w();
                                        int iW4 = wVar2.w();
                                        int iF = y6.g.f(iW3);
                                        int i76 = z17 ? 1 : 2;
                                        iG2 = y6.g.g(iW4);
                                        str8 = str8;
                                        i15 = i15;
                                        fVar = fVar;
                                        i40 = i75;
                                        str5 = str14;
                                        iVar = iVar;
                                        i17 = i76;
                                        i18 = 8;
                                        i16 = i16;
                                        i43 = iF;
                                        i39 = i40;
                                    } else {
                                        int i77 = 7;
                                        int i78 = 11;
                                        if (iJ5 == 1635135811) {
                                            int i79 = iJ4 - 8;
                                            byte[] bArr5 = new byte[i79];
                                            wVar2.h(bArr5, 0, i79);
                                            listJ = ImmutableList.u(bArr5);
                                            wVar2.I(i49 + 8);
                                            byte[] bArr6 = wVar2.f4039a;
                                            v vVar = new v(bArr6, bArr6.length);
                                            vVar.q(wVar2.f4040b * 8);
                                            vVar.u(1);
                                            int i80 = vVar.i(b3);
                                            vVar.t(6);
                                            boolean zH = vVar.h();
                                            boolean zH2 = vVar.h();
                                            int i81 = -1;
                                            if (i80 == 2 && zH) {
                                                i19 = zH2 ? 12 : 10;
                                                i21 = zH2 ? 12 : 10;
                                            } else if (i80 <= 2) {
                                                i19 = zH ? 10 : 8;
                                                i21 = zH ? 10 : 8;
                                            } else {
                                                i19 = -1;
                                                i21 = -1;
                                            }
                                            vVar.t(13);
                                            vVar.s();
                                            int i82 = vVar.i(4);
                                            if (i82 != 1) {
                                                b7.a.u("Unsupported obu_type: " + i82);
                                                gVar2 = new y6.g(-1, -1, -1, i19, i21, null);
                                            } else if (vVar.h()) {
                                                b7.a.u("Unsupported obu_extension_flag");
                                                gVar2 = new y6.g(-1, -1, -1, i19, i21, null);
                                            } else {
                                                boolean zH3 = vVar.h();
                                                vVar.s();
                                                if (!zH3 || vVar.i(8) <= 127) {
                                                    int i83 = vVar.i(3);
                                                    vVar.s();
                                                    if (vVar.h()) {
                                                        b7.a.u("Unsupported reduced_still_picture_header");
                                                        gVar2 = new y6.g(-1, -1, -1, i19, i21, null);
                                                    } else if (vVar.h()) {
                                                        b7.a.u("Unsupported timing_info_present_flag");
                                                        gVar2 = new y6.g(-1, -1, -1, i19, i21, null);
                                                    } else {
                                                        if (vVar.h()) {
                                                            b7.a.u("Unsupported initial_display_delay_present_flag");
                                                            gVar2 = new y6.g(-1, -1, -1, i19, i21, null);
                                                        } else {
                                                            int i84 = vVar.i(5);
                                                            int i85 = 0;
                                                            while (i85 <= i84) {
                                                                vVar.t(12);
                                                                if (vVar.i(5) > i77) {
                                                                    vVar.s();
                                                                }
                                                                i85++;
                                                                i77 = 7;
                                                            }
                                                            c12 = '\f';
                                                            int i86 = vVar.i(4);
                                                            int i87 = vVar.i(4);
                                                            vVar.t(i86 + 1);
                                                            vVar.t(i87 + 1);
                                                            if (vVar.h()) {
                                                                vVar.t(7);
                                                            }
                                                            vVar.t(7);
                                                            boolean zH4 = vVar.h();
                                                            if (zH4) {
                                                                vVar.t(2);
                                                            }
                                                            if (vVar.h()) {
                                                                i22 = 1;
                                                                i23 = 2;
                                                            } else {
                                                                i22 = 1;
                                                                i23 = vVar.i(1);
                                                            }
                                                            if (i23 > 0 && !vVar.h()) {
                                                                vVar.t(i22);
                                                            }
                                                            if (zH4) {
                                                                i24 = 3;
                                                                vVar.t(3);
                                                            } else {
                                                                i24 = 3;
                                                            }
                                                            vVar.t(i24);
                                                            boolean zH5 = vVar.h();
                                                            if (i83 == 2 && zH5) {
                                                                vVar.s();
                                                            }
                                                            boolean z18 = i83 != 1 && vVar.h();
                                                            if (vVar.h()) {
                                                                int i88 = vVar.i(8);
                                                                int i89 = vVar.i(8);
                                                                int i90 = vVar.i(8);
                                                                if (z18) {
                                                                    i26 = 1;
                                                                } else {
                                                                    i26 = 1;
                                                                    if (i88 == 1 && i89 == 13 && i90 == 0) {
                                                                        i27 = 1;
                                                                    }
                                                                    int iF2 = y6.g.f(i88);
                                                                    if (i27 == i26) {
                                                                        i28 = 1;
                                                                    } else {
                                                                        i28 = 2;
                                                                    }
                                                                    i25 = iF2;
                                                                    iG = y6.g.g(i89);
                                                                    i81 = i28;
                                                                }
                                                                i27 = vVar.i(i26);
                                                                int iF3 = y6.g.f(i88);
                                                                if (i27 == i26) {
                                                                    i28 = 1;
                                                                } else {
                                                                    i28 = 2;
                                                                }
                                                                i25 = iF3;
                                                                iG = y6.g.g(i89);
                                                                i81 = i28;
                                                            } else {
                                                                i25 = -1;
                                                                iG = -1;
                                                            }
                                                            gVar = new y6.g(i25, i81, iG, i19, i21, null);
                                                        }
                                                        int i91 = gVar.f57199e;
                                                        int i92 = gVar.f57200f;
                                                        int i93 = gVar.f57195a;
                                                        int i94 = gVar.f57196b;
                                                        iG2 = gVar.f57197c;
                                                        str5 = "video/av01";
                                                        i40 = i91;
                                                        i17 = i94;
                                                        i16 = i16;
                                                        i39 = i92;
                                                        i43 = i93;
                                                        i18 = 8;
                                                    }
                                                } else {
                                                    b7.a.u("Excessive obu_size");
                                                    gVar2 = new y6.g(-1, -1, -1, i19, i21, null);
                                                }
                                            }
                                            gVar = gVar2;
                                            c12 = '\f';
                                            int i95 = gVar.f57199e;
                                            int i96 = gVar.f57200f;
                                            int i97 = gVar.f57195a;
                                            int i98 = gVar.f57196b;
                                            iG2 = gVar.f57197c;
                                            str5 = "video/av01";
                                            i40 = i95;
                                            i17 = i98;
                                            i16 = i16;
                                            i39 = i96;
                                            i43 = i97;
                                            i18 = 8;
                                        } else if (iJ5 == 1668050025) {
                                            if (byteBufferOrder == null) {
                                                byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                            }
                                            ByteBuffer byteBuffer = byteBufferOrder;
                                            byteBuffer.position(21);
                                            byteBuffer.putShort(wVar2.t());
                                            byteBuffer.putShort(wVar2.t());
                                            byteBufferOrder = byteBuffer;
                                            str8 = str8;
                                            str5 = str9;
                                            fVar = fVar;
                                            i17 = i42;
                                            iVar = iVar;
                                            i40 = i40;
                                            i18 = 8;
                                            i16 = i16;
                                            i39 = i39;
                                        } else if (iJ5 == 1835295606) {
                                            if (byteBufferOrder == null) {
                                                byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                            }
                                            ByteBuffer byteBuffer2 = byteBufferOrder;
                                            short sT = wVar2.t();
                                            short sT2 = wVar2.t();
                                            short sT3 = wVar2.t();
                                            short sT4 = wVar2.t();
                                            str8 = str8;
                                            short sT5 = wVar2.t();
                                            str5 = str9;
                                            short sT6 = wVar2.t();
                                            i17 = i42;
                                            short sT7 = wVar2.t();
                                            iVar = iVar;
                                            short sT8 = wVar2.t();
                                            long jY = wVar2.y();
                                            long jY2 = wVar2.y();
                                            fVar = fVar;
                                            byteBuffer2.position(1);
                                            byteBuffer2.putShort(sT5);
                                            byteBuffer2.putShort(sT6);
                                            byteBuffer2.putShort(sT);
                                            byteBuffer2.putShort(sT2);
                                            byteBuffer2.putShort(sT3);
                                            byteBuffer2.putShort(sT4);
                                            byteBuffer2.putShort(sT7);
                                            byteBuffer2.putShort(sT8);
                                            byteBuffer2.putShort((short) (jY / 10000));
                                            byteBuffer2.putShort((short) (jY2 / 10000));
                                            i16 = i16;
                                            byteBufferOrder = byteBuffer2;
                                            i18 = 8;
                                        } else {
                                            str8 = str8;
                                            str5 = str9;
                                            fVar = fVar;
                                            i17 = i42;
                                            iVar = iVar;
                                            if (iJ5 == 1681012275) {
                                                x7.a.c(null, str5 == null);
                                                i16 = i16;
                                                str5 = "video/3gpp";
                                                i18 = 8;
                                            } else {
                                                if (iJ5 == 1702061171) {
                                                    x7.a.c(null, str5 == null);
                                                    p2 p2VarC = c(i49, wVar2);
                                                    String str15 = (String) p2VarC.f3638c;
                                                    byte[] bArr7 = (byte[]) p2VarC.f3639d;
                                                    if (bArr7 != null) {
                                                        listJ = ImmutableList.u(bArr7);
                                                    }
                                                    i16 = i16;
                                                    p2Var = p2VarC;
                                                    str5 = str15;
                                                } else if (iJ5 == 1651798644) {
                                                    wVar2.I(i49 + 8);
                                                    wVar2.J(4);
                                                    i16 = i16;
                                                    fVar2 = new i9.f(wVar2.y(), wVar2.y());
                                                } else if (iJ5 == 1885434736) {
                                                    wVar2.I(i49 + 8);
                                                    i16 = i16;
                                                    fA = wVar2.A() / wVar2.A();
                                                    i39 = i39;
                                                    i40 = i40;
                                                    i18 = 8;
                                                    z12 = true;
                                                } else if (iJ5 == 1937126244) {
                                                    int i99 = i49 + 8;
                                                    while (true) {
                                                        if (i99 - i49 >= iJ4) {
                                                            bArrCopyOfRange = null;
                                                            break;
                                                        }
                                                        wVar2.I(i99);
                                                        int iJ8 = wVar2.j();
                                                        if (wVar2.j() == 1886547818) {
                                                            bArrCopyOfRange = Arrays.copyOfRange(wVar2.f4039a, i99, iJ8 + i99);
                                                            break;
                                                        }
                                                        i99 += iJ8;
                                                    }
                                                    i16 = i16;
                                                    bArr = bArrCopyOfRange;
                                                } else if (iJ5 == 1936995172) {
                                                    int iW5 = wVar2.w();
                                                    wVar2.J(3);
                                                    if (iW5 == 0) {
                                                        int iW6 = wVar2.w();
                                                        if (iW6 == 0) {
                                                            i16 = 0;
                                                        } else if (iW6 == 1) {
                                                            i16 = 1;
                                                        } else if (iW6 == 2) {
                                                            i16 = 2;
                                                        } else if (iW6 == 3) {
                                                            i16 = 3;
                                                        }
                                                    }
                                                    i16 = i16;
                                                } else if (iJ5 == 1634760259) {
                                                    int i100 = iJ4 - 12;
                                                    byte[] bArr8 = new byte[i100];
                                                    wVar2.I(i49 + 12);
                                                    wVar2.h(bArr8, 0, i100);
                                                    listJ = ImmutableList.u(bArr8);
                                                    w wVar3 = new w(bArr8);
                                                    v vVar2 = new v(bArr8, i100);
                                                    i18 = 8;
                                                    vVar2.q(wVar3.f4040b * 8);
                                                    vVar2.u(1);
                                                    int i101 = vVar2.i(8);
                                                    int i102 = -1;
                                                    int i103 = -1;
                                                    int i104 = 0;
                                                    int i105 = -1;
                                                    int i106 = -1;
                                                    int i107 = -1;
                                                    while (i104 < i101) {
                                                        vVar2.u(1);
                                                        int i108 = vVar2.i(8);
                                                        int iG3 = i107;
                                                        int i109 = i106;
                                                        int i110 = i105;
                                                        int i111 = i103;
                                                        int i112 = i102;
                                                        int i113 = 0;
                                                        while (i113 < i108) {
                                                            vVar2.t(i74);
                                                            boolean zH6 = vVar2.h();
                                                            vVar2.s();
                                                            int i114 = i78;
                                                            vVar2.u(i114);
                                                            vVar2.t(4);
                                                            int i115 = vVar2.i(4) + 8;
                                                            vVar2.u(1);
                                                            if (zH6) {
                                                                int i116 = vVar2.i(8);
                                                                int i117 = vVar2.i(8);
                                                                vVar2.u(1);
                                                                boolean zH7 = vVar2.h();
                                                                int iF4 = y6.g.f(i116);
                                                                int i118 = zH7 ? 1 : 2;
                                                                iG3 = y6.g.g(i117);
                                                                i110 = i118;
                                                                i109 = iF4;
                                                            }
                                                            i113++;
                                                            i78 = i114;
                                                            i112 = i115;
                                                            i111 = i112;
                                                            i74 = 6;
                                                        }
                                                        i104++;
                                                        i102 = i112;
                                                        i103 = i111;
                                                        i105 = i110;
                                                        i106 = i109;
                                                        i107 = iG3;
                                                        i74 = 6;
                                                    }
                                                    i16 = i16;
                                                    str5 = "video/apv";
                                                    i39 = i102;
                                                    i40 = i103;
                                                    i17 = i105;
                                                    i43 = i106;
                                                    iG2 = i107;
                                                } else {
                                                    i18 = 8;
                                                    if (iJ5 == 1668246642 && i43 == -1 && iG2 == -1) {
                                                        int iJ9 = wVar2.j();
                                                        if (iJ9 == 1852009592 || iJ9 == 1852009571) {
                                                            int iC3 = wVar2.C();
                                                            int iC4 = wVar2.C();
                                                            wVar2.J(2);
                                                            boolean z19 = iJ4 == 19 && (wVar2.w() & 128) != 0;
                                                            int iF5 = y6.g.f(iC3);
                                                            int i119 = z19 ? 1 : 2;
                                                            iG2 = y6.g.g(iC4);
                                                            i17 = i119;
                                                            i43 = iF5;
                                                        } else {
                                                            b7.a.B("Unsupported color type: " + c7.f.c(iJ9));
                                                        }
                                                    }
                                                    i16 = i16;
                                                    i39 = i39;
                                                    i40 = i40;
                                                }
                                                i18 = 8;
                                            }
                                        }
                                    }
                                }
                                i40 = i40;
                            }
                        }
                        i48 = i50 + iJ4;
                        i36 = i18;
                        i41 = i16;
                        iJ2 = i51;
                        iJ3 = i15;
                        str8 = str8;
                        str9 = str5;
                        i42 = i17;
                        iVar = iVar;
                        fVar = fVar;
                        b3 = 3;
                    }
                    i48 = i50 + iJ4;
                    i36 = i18;
                    i41 = i16;
                    iJ2 = i51;
                    iJ3 = i15;
                    str8 = str8;
                    str9 = str5;
                    i42 = i17;
                    iVar = iVar;
                    fVar = fVar;
                    b3 = 3;
                }
                int i120 = i39;
                int i121 = i40;
                i14 = iJ2;
                int i122 = i41;
                String str16 = str9;
                ar.f fVar3 = fVar;
                int i123 = i42;
                c11 = '\f';
                if (str16 == null) {
                    str7 = str;
                    fVar = fVar3;
                } else {
                    y6.o oVar = new y6.o();
                    oVar.f57253a = Integer.toString(i12);
                    oVar.m = d0.o(str16);
                    oVar.f57262j = str10;
                    oVar.f57271t = iC;
                    oVar.f57272u = iC2;
                    oVar.f57273v = i47;
                    oVar.f57274w = i46;
                    oVar.f57277z = fA;
                    oVar.f57276y = i37;
                    oVar.A = bArr;
                    oVar.B = i122;
                    oVar.f57267p = listJ;
                    oVar.f57266o = i45;
                    oVar.D = i44;
                    oVar.f57268q = lVar3;
                    str7 = str;
                    oVar.f57256d = str7;
                    oVar.C = new y6.g(i43, i123, iG2, i121, i120, byteBufferOrder != null ? byteBufferOrder.array() : null);
                    i9.f fVar4 = fVar2;
                    if (fVar4 != null) {
                        oVar.f57260h = Ints.e(fVar4.f34275a);
                        oVar.f57261i = Ints.e(fVar4.f34276b);
                    } else {
                        p2 p2Var2 = p2Var;
                        if (p2Var2 != null) {
                            oVar.f57260h = Ints.e(p2Var2.f3636a);
                            oVar.f57261i = Ints.e(p2Var2.f3637b);
                        }
                    }
                    fVar = fVar3;
                    fVar.f2849e = new y6.p(oVar);
                }
            } else {
                if (iJ3 == 1836069985 || iJ3 == 1701733217 || iJ3 == 1633889587 || iJ3 == 1700998451 || iJ3 == 1633889588 || iJ3 == 1835823201 || iJ3 == 1685353315 || iJ3 == 1685353317 || iJ3 == 1685353320 || iJ3 == 1685353324 || iJ3 == 1685353336 || iJ3 == 1935764850 || iJ3 == 1935767394 || iJ3 == 1819304813 || iJ3 == 1936684916 || iJ3 == 1953984371 || iJ3 == 778924082 || iJ3 == 778924083 || iJ3 == 1835557169 || iJ3 == 1835560241 || iJ3 == 1634492771 || iJ3 == 1634492791 || iJ3 == 1970037111 || iJ3 == 1332770163 || iJ3 == 1716281667 || iJ3 == 1767992678 || iJ3 == 1768973165 || iJ3 == 1718641517) {
                    wVar2 = wVar;
                    i35 = i35;
                    iJ2 = iJ2;
                    b(wVar2, iJ3, i35, iJ2, q2Var2.f2594a, str7, z11, lVar, fVar, i34);
                    str7 = str;
                } else if (iJ3 == 1414810956 || iJ3 == 1954034535 || iJ3 == 2004251764 || iJ3 == 1937010800 || iJ3 == 1664495672 || iJ3 == 1836070003) {
                    wVar2.I(i35 + 16);
                    String str17 = "application/ttml+xml";
                    long j12 = Long.MAX_VALUE;
                    if (iJ3 != 1414810956) {
                        if (iJ3 == 1954034535) {
                            int i124 = iJ2 - 16;
                            byte[] bArr9 = new byte[i124];
                            wVar2.h(bArr9, 0, i124);
                            immutableListU = ImmutableList.u(bArr9);
                            str17 = "application/x-quicktime-tx3g";
                            i31 = i35;
                            i32 = iJ2;
                        } else {
                            if (iJ3 == 2004251764) {
                                str17 = "application/x-mp4-vtt";
                            } else if (iJ3 == 1937010800) {
                                j12 = 0;
                            } else if (iJ3 == 1664495672) {
                                fVar.f2847c = 1;
                                str17 = "application/x-mp4-cea-608";
                            } else {
                                if (iJ3 != 1836070003) {
                                    throw new IllegalStateException();
                                }
                                int i125 = wVar2.f4040b;
                                wVar2.J(4);
                                if (wVar2.j() == 1702061171) {
                                    byte[] bArr10 = (byte[]) c(i125, wVar2).f3639d;
                                    if (bArr10 == null || bArr10.length != 64) {
                                        i31 = i35;
                                        i32 = iJ2;
                                    } else {
                                        int i126 = q2Var2.f2597d;
                                        int i127 = q2Var2.f2598e;
                                        b7.a.j(bArr10.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i128 = 0;
                                        while (i128 < bArr10.length - 3) {
                                            byte[] bArr11 = bArr10;
                                            int iD = Ints.d(bArr10[i128], bArr10[i128 + 1], bArr10[i128 + 2], bArr11[i128 + 3]);
                                            int i129 = (iD >> 16) & 255;
                                            int i130 = ((iD >> 8) & 255) - 128;
                                            int i131 = (iD & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(f0.g(defpackage.e.D(i131, 17790, 10000, i129), 0, 255) | (f0.g((i129 - ((i131 * 3455) / 10000)) - ((i130 * 7169) / 10000), 0, 255) << 8) | (f0.g(defpackage.e.D(i130, 14075, 10000, i129), 0, 255) << 16))));
                                            i128 += 4;
                                            bArr10 = bArr11;
                                            i35 = i35;
                                            iJ2 = iJ2;
                                        }
                                        i31 = i35;
                                        i32 = iJ2;
                                        StringBuilder sbK = w4.c.k("size: ", i126, "x", i127, "\npalette: ");
                                        sbK.append(new Joiner(", ").c(arrayList));
                                        sbK.append("\n");
                                        String string = sbK.toString();
                                        String str18 = f0.f3975a;
                                        immutableListU = ImmutableList.u(string.getBytes(StandardCharsets.UTF_8));
                                        str6 = "application/vobsub";
                                    }
                                } else {
                                    i31 = i35;
                                    i32 = iJ2;
                                    str6 = null;
                                    immutableListU = null;
                                }
                                str17 = str6;
                            }
                            i31 = i35;
                            i32 = iJ2;
                            j11 = j12;
                            immutableListU = null;
                            if (str17 != null) {
                                y6.o oVar2 = new y6.o();
                                oVar2.f57253a = Integer.toString(i33);
                                oVar2.m = d0.o(str17);
                                oVar2.f57256d = str7;
                                oVar2.f57269r = j11;
                                oVar2.f57267p = immutableListU;
                                fVar.f2849e = new y6.p(oVar2);
                            }
                        }
                        j11 = Long.MAX_VALUE;
                        if (str17 != null) {
                            y6.o oVar3 = new y6.o();
                            oVar3.f57253a = Integer.toString(i33);
                            oVar3.m = d0.o(str17);
                            oVar3.f57256d = str7;
                            oVar3.f57269r = j11;
                            oVar3.f57267p = immutableListU;
                            fVar.f2849e = new y6.p(oVar3);
                        }
                    } else {
                        i31 = i35;
                        i32 = iJ2;
                        j11 = j12;
                        immutableListU = null;
                        if (str17 != null) {
                            y6.o oVar4 = new y6.o();
                            oVar4.f57253a = Integer.toString(i33);
                            oVar4.m = d0.o(str17);
                            oVar4.f57256d = str7;
                            oVar4.f57269r = j11;
                            oVar4.f57267p = immutableListU;
                            fVar.f2849e = new y6.p(oVar4);
                        }
                    }
                    c11 = '\f';
                    wVar2 = wVar;
                    i12 = i33;
                    i13 = iJ;
                    i35 = i31;
                    i14 = i32;
                    i11 = i34;
                } else if (iJ3 == 1835365492) {
                    wVar2.I(i35 + 16);
                    if (iJ3 == 1835365492) {
                        wVar2.r();
                        String strR = wVar2.r();
                        if (strR != null) {
                            y6.o oVar5 = new y6.o();
                            oVar5.f57253a = Integer.toString(i33);
                            oVar5.m = d0.o(strR);
                            fVar.f2849e = new y6.p(oVar5);
                        }
                    }
                } else if (iJ3 == 1667329389) {
                    y6.o oVar6 = new y6.o();
                    oVar6.f57253a = Integer.toString(i33);
                    oVar6.m = d0.o("application/x-camera-motion");
                    fVar.f2849e = new y6.p(oVar6);
                }
                i35 = i35;
                i14 = iJ2;
                i11 = i34;
                i12 = i33;
                i13 = iJ;
                c11 = '\f';
            }
            wVar2.I(i35 + i14);
            i34 = i11 + 1;
            q2Var2 = q2Var;
            i33 = i12;
            iJ = i13;
        }
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01df  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f2 A[EDGE_INSN: B:106:0x01f2->B:105:0x01ef BREAK  A[LOOP:17: B:96:0x01d2->B:107:0x01fe]] */
    /* JADX WARN: Code duplicated, block: B:107:0x01fe A[LOOP:17: B:96:0x01d2->B:107:0x01fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x022b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0249  */
    /* JADX WARN: Code duplicated, block: B:146:0x02da  */
    /* JADX WARN: Code duplicated, block: B:150:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:155:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:156:0x0309  */
    /* JADX WARN: Code duplicated, block: B:158:0x031d  */
    /* JADX WARN: Code duplicated, block: B:172:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:237:0x057a  */
    /* JADX WARN: Code duplicated, block: B:239:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:241:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:243:0x05aa A[LOOP:13: B:240:0x05a2->B:243:0x05aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:248:0x05e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x05e5 A[ADDED_TO_REGION, LOOP:14: B:249:0x05e5->B:251:0x05e9, LOOP_START, PHI: r14 r15 r26
      0x05e5: PHI (r14v13 int) = (r14v9 int), (r14v14 int) binds: [B:248:0x05e3, B:251:0x05e9] A[DONT_GENERATE, DONT_INLINE]
      0x05e5: PHI (r15v18 int) = (r15v16 int), (r15v20 int) binds: [B:248:0x05e3, B:251:0x05e9] A[DONT_GENERATE, DONT_INLINE]
      0x05e5: PHI (r26v6 int) = (r26v2 int), (r26v7 int) binds: [B:248:0x05e3, B:251:0x05e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:250:0x05e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x0603  */
    /* JADX WARN: Code duplicated, block: B:258:0x060b  */
    /* JADX WARN: Code duplicated, block: B:259:0x060d  */
    /* JADX WARN: Code duplicated, block: B:262:0x0612  */
    /* JADX WARN: Code duplicated, block: B:264:0x061a  */
    /* JADX WARN: Code duplicated, block: B:267:0x062a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x0639  */
    /* JADX WARN: Code duplicated, block: B:274:0x0660 A[DONT_INVERT, LOOP:15: B:274:0x0660->B:278:0x066a, LOOP_START, PHI: r26
      0x0660: PHI (r26v3 int) = (r26v2 int), (r26v4 int) binds: [B:273:0x065e, B:278:0x066a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:275:0x0662  */
    /* JADX WARN: Code duplicated, block: B:278:0x066a A[LOOP:15: B:274:0x0660->B:278:0x066a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x0670 A[EDGE_INSN: B:279:0x0670->B:280:0x0671 BREAK  A[LOOP:15: B:274:0x0660->B:278:0x066a]] */
    /* JADX WARN: Code duplicated, block: B:281:0x0673 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:288:0x0681  */
    /* JADX WARN: Code duplicated, block: B:290:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:291:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:296:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:303:0x070a  */
    /* JADX WARN: Code duplicated, block: B:305:0x071c  */
    /* JADX WARN: Code duplicated, block: B:333:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:336:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:338:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:341:0x07ed A[LOOP:5: B:339:0x07ea->B:341:0x07ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x081d  */
    /* JADX WARN: Code duplicated, block: B:344:0x081e A[PHI: r15
      0x081e: PHI (r15v23 int) = (r15v22 int), (r15v32 int) binds: [B:335:0x07db, B:343:0x081d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:346:0x0826  */
    /* JADX WARN: Code duplicated, block: B:347:0x0828  */
    /* JADX WARN: Code duplicated, block: B:351:0x083d  */
    /* JADX WARN: Code duplicated, block: B:353:0x0848  */
    /* JADX WARN: Code duplicated, block: B:356:0x0872  */
    /* JADX WARN: Code duplicated, block: B:360:0x0880  */
    /* JADX WARN: Code duplicated, block: B:363:0x0888  */
    /* JADX WARN: Code duplicated, block: B:368:0x0898  */
    /* JADX WARN: Code duplicated, block: B:372:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:374:0x08af A[LOOP:9: B:370:0x089e->B:374:0x08af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:377:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:378:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:380:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:384:0x08df  */
    /* JADX WARN: Code duplicated, block: B:385:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:388:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:389:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:391:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:392:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:394:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:396:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:397:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:401:0x0908  */
    /* JADX WARN: Code duplicated, block: B:403:0x0912  */
    /* JADX WARN: Code duplicated, block: B:406:0x0921  */
    /* JADX WARN: Code duplicated, block: B:408:0x0949  */
    /* JADX WARN: Code duplicated, block: B:411:0x0950  */
    /* JADX WARN: Code duplicated, block: B:418:0x0985  */
    /* JADX WARN: Code duplicated, block: B:429:0x09b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x087e A[ADDED_TO_REGION, EDGE_INSN: B:443:0x087e->B:359:0x087e BREAK  A[LOOP:7: B:354:0x086e->B:358:0x0878], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x0895 A[ADDED_TO_REGION, EDGE_INSN: B:445:0x0895->B:366:0x0895 BREAK  A[LOOP:8: B:361:0x0882->B:365:0x0890], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x08b2 A[EDGE_INSN: B:447:0x08b2->B:375:0x08b2 BREAK  A[LOOP:9: B:370:0x089e->B:374:0x08af], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x08b2 A[EDGE_INSN: B:448:0x08b2->B:375:0x08b2 BREAK  A[LOOP:9: B:370:0x089e->B:374:0x08af], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x0956 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x0650 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x05c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x05bf A[EDGE_INSN: B:459:0x05bf->B:244:0x05bf BREAK  A[LOOP:13: B:240:0x05a2->B:243:0x05aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x0670 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x0668 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0168  */
    /* JADX WARN: Code duplicated, block: B:81:0x016b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0179  */
    /* JADX WARN: Code duplicated, block: B:86:0x0181  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d4  */
    public static ArrayList j(c7.d dVar, t tVar, long j11, y6.l lVar, boolean z11, boolean z12, Function function) {
        int i11;
        long jR;
        long jY;
        ArrayList arrayList;
        int i12;
        q2 q2Var;
        long j12;
        long j13;
        long j14;
        long jR2;
        w wVar;
        int iE;
        int i13;
        long jY2;
        int i14;
        int i15;
        int i16;
        long j15;
        char[] cArr;
        int i17;
        String str;
        c7.e eVarO;
        ar.f fVarI;
        int i18;
        long[] jArr;
        long[] jArr2;
        y6.p pVar;
        int i19;
        y6.p pVar2;
        n nVar;
        c7.c cVar;
        c0 c0Var;
        c0 c0Var2;
        c7.d dVarN;
        Pair pairCreate;
        char c11;
        long jB;
        long j16;
        b pVar3;
        boolean z13;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        long[] jArr3;
        int[] iArr;
        long[] jArr4;
        int[] iArr2;
        int i21;
        int iA5;
        w wVar2;
        int i22;
        int iA6;
        long j17;
        long j18;
        long j19;
        int i23;
        int iA7;
        int i24;
        b bVar;
        int i25;
        int i26;
        int iJ;
        int i27;
        int i28;
        long[] jArr5;
        int[] iArrCopyOf;
        long[] jArrCopyOf;
        int[] iArrCopyOf2;
        int i29;
        long j21;
        boolean z14;
        String str2;
        int i30;
        long[] jArr6;
        int[] iArr3;
        long j22;
        boolean zA;
        int i31;
        int iO;
        int i32;
        long j23;
        long[] jArr7;
        int[] iArr4;
        long j24;
        long j25;
        y6.p pVar4;
        int i33;
        long[] jArr8;
        long[] jArr9;
        long jR3;
        long[] jArr10;
        int i34;
        long j26;
        int i35;
        int[] iArr5;
        boolean z15;
        int[] iArr6;
        int[] iArr7;
        int i36;
        int i37;
        boolean z16;
        int i38;
        int[] iArr8;
        int[] iArr9;
        boolean z17;
        boolean z18;
        long[] jArr11;
        int[] iArr10;
        int[] iArr11;
        long[] jArr12;
        int i39;
        boolean z19;
        int i40;
        int i41;
        long j27;
        q qVar;
        long j28;
        int i42;
        int i43;
        boolean z20;
        long jR4;
        int[] iArr12;
        int[] iArr13;
        long j29;
        int[] iArr14;
        int i44;
        boolean z21;
        long j30;
        int i45;
        int i46;
        int i47;
        boolean z22;
        int i48;
        int i49;
        int i50;
        long j31;
        int i51;
        q qVar2;
        long jR5;
        int iQ;
        c7.d dVar2 = dVar;
        ArrayList arrayList2 = new ArrayList();
        int i52 = 0;
        for (ArrayList arrayList3 = dVar2.f6649e; i52 < arrayList3.size(); arrayList3 = arrayList) {
            c7.d dVar3 = (c7.d) arrayList3.get(i52);
            if (dVar3.f6652b != 1953653099) {
                arrayList = arrayList3;
                arrayList2 = arrayList2;
                i18 = i52;
            } else {
                c7.e eVarO2 = dVar2.o(1836476516);
                eVarO2.getClass();
                c7.d dVarN2 = dVar3.n(1835297121);
                dVarN2.getClass();
                c7.e eVarO3 = dVarN2.o(1751411826);
                eVarO3.getClass();
                w wVar3 = eVarO3.f6650c;
                wVar3.I(16);
                int iJ2 = wVar3.j();
                if (iJ2 == 1936684398) {
                    i11 = 1;
                } else if (iJ2 == 1986618469) {
                    i11 = 2;
                } else if (iJ2 == 1952807028 || iJ2 == 1935832172 || iJ2 == 1937072756 || iJ2 == 1668047728 || iJ2 == 1937072752) {
                    i11 = 3;
                } else {
                    i11 = iJ2 == 1835365473 ? 5 : -1;
                }
                int i53 = 1;
                if (i11 == -1) {
                    arrayList = arrayList3;
                    i18 = i52;
                    nVar = null;
                } else {
                    c7.e eVarO4 = dVar3.o(1953196132);
                    eVarO4.getClass();
                    w wVar4 = eVarO4.f6650c;
                    wVar4.I(8);
                    int iE2 = e(wVar4.j());
                    wVar4.J(iE2 != 0 ? 16 : 8);
                    int iJ3 = wVar4.j();
                    wVar4.J(4);
                    int i54 = wVar4.f4040b;
                    int i55 = iE2 == 0 ? 4 : 8;
                    int i56 = 0;
                    while (true) {
                        jR = -9223372036854775807L;
                        if (i56 >= i55) {
                            wVar4.J(i55);
                        } else {
                            if (wVar4.f4039a[i54 + i56] != -1) {
                                jY = iE2 == 0 ? wVar4.y() : wVar4.B();
                                if (jY != 0) {
                                    break;
                                }
                                break;
                            }
                            i56++;
                        }
                        jY = -9223372036854775807L;
                        break;
                    }
                    wVar4.J(10);
                    int iC = wVar4.C();
                    wVar4.J(4);
                    int iJ4 = wVar4.j();
                    int iJ5 = wVar4.j();
                    wVar4.J(4);
                    int iJ6 = wVar4.j();
                    int iJ7 = wVar4.j();
                    if (iJ4 == 0 && iJ5 == 65536) {
                        arrayList = arrayList3;
                        if ((iJ6 == -65536 || iJ6 == 65536) && iJ7 == 0) {
                            i12 = 90;
                        }
                        wVar4.J(16);
                        short sT = wVar4.t();
                        wVar4.J(2);
                        short sT2 = wVar4.t();
                        q2Var = new q2();
                        q2Var.f2594a = iJ3;
                        q2Var.f2595b = iC;
                        q2Var.f2596c = i12;
                        q2Var.f2597d = sT;
                        q2Var.f2598e = sT2;
                        if (j11 == -9223372036854775807L) {
                            j12 = jY;
                        } else {
                            j12 = j11;
                        }
                        j13 = g(eVarO2.f6650c).f6657c;
                        if (j12 == -9223372036854775807L) {
                            j14 = j13;
                            jR2 = -9223372036854775807L;
                        } else {
                            String str3 = f0.f3975a;
                            j14 = j13;
                            jR2 = f0.R(j12, 1000000L, j14, RoundingMode.DOWN);
                        }
                        c7.d dVarN3 = dVarN2.n(1835626086);
                        dVarN3.getClass();
                        c7.d dVarN4 = dVarN3.n(1937007212);
                        dVarN4.getClass();
                        c7.e eVarO5 = dVarN2.o(1835296868);
                        eVarO5.getClass();
                        wVar = eVarO5.f6650c;
                        wVar.I(8);
                        iE = e(wVar.j());
                        if (iE == 0) {
                            i13 = 8;
                        } else {
                            i13 = 16;
                        }
                        wVar.J(i13);
                        jY2 = wVar.y();
                        i14 = wVar.f4040b;
                        if (iE == 0) {
                            i15 = 4;
                        } else {
                            i15 = 8;
                        }
                        i16 = 0;
                        while (true) {
                            if (i16 < i15) {
                                wVar.J(i15);
                                break;
                            }
                            if (wVar.f4039a[i14 + i16] != -1) {
                                if (iE == 0) {
                                    jB = wVar.y();
                                } else {
                                    jB = wVar.B();
                                }
                                j16 = jB;
                                if (j16 != 0) {
                                    break;
                                }
                                String str4 = f0.f3975a;
                                jR = f0.R(j16, 1000000L, jY2, RoundingMode.DOWN);
                                break;
                            }
                            i16++;
                        }
                        j15 = jR;
                        int iC2 = wVar.C();
                        cArr = new char[]{(char) (((iC2 >> 10) & 31) + 96), (char) (((iC2 >> 5) & 31) + 96), (char) ((iC2 & 31) + 96)};
                        i17 = 0;
                        while (true) {
                            if (i17 < 3) {
                                str = new String(cArr);
                                break;
                            }
                            c11 = cArr[i17];
                            if (c11 >= 'a' || c11 > 'z') {
                                str = null;
                                break;
                            }
                            i17++;
                        }
                        eVarO = dVarN4.o(1937011556);
                        if (eVarO != null) {
                            throw ParserException.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                        }
                        fVarI = i(eVarO.f6650c, q2Var, str, lVar, z12);
                        if (!z11 || (dVarN = dVar3.n(1701082227)) == null) {
                            i18 = i52;
                        } else {
                            c7.e eVarO6 = dVarN.o(1701606260);
                            if (eVarO6 == null) {
                                i18 = i52;
                                pairCreate = null;
                            } else {
                                w wVar5 = eVarO6.f6650c;
                                wVar5.I(8);
                                int iE3 = e(wVar5.j());
                                int iA8 = wVar5.A();
                                long[] jArr13 = new long[iA8];
                                long[] jArr14 = new long[iA8];
                                int i57 = 0;
                                while (i57 < iA8) {
                                    int i58 = i53;
                                    jArr13[i57] = iE3 == i58 ? wVar5.B() : wVar5.y();
                                    jArr14[i57] = iE3 == i58 ? wVar5.q() : wVar5.j();
                                    if (wVar5.t() != 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    wVar5.J(2);
                                    i57++;
                                    i52 = i52;
                                    i53 = 1;
                                }
                                i18 = i52;
                                pairCreate = Pair.create(jArr13, jArr14);
                            }
                            if (pairCreate != null) {
                                long[] jArr15 = (long[]) pairCreate.first;
                                jArr2 = (long[]) pairCreate.second;
                                jArr = jArr15;
                            }
                            pVar = (y6.p) fVarI.f2849e;
                            if (pVar == null) {
                                nVar = null;
                            } else {
                                i19 = q2Var.f2595b;
                                if (i19 != 0) {
                                    cVar = new c7.c(i19);
                                    y6.o oVarA = pVar.a();
                                    c0Var = ((y6.p) fVarI.f2849e).f57290l;
                                    if (c0Var != null) {
                                        c0Var2 = c0Var.a(cVar);
                                    } else {
                                        c0Var2 = new c0(cVar);
                                    }
                                    oVarA.f57263k = c0Var2;
                                    pVar2 = new y6.p(oVarA);
                                } else {
                                    pVar2 = pVar;
                                }
                                nVar = new n(q2Var.f2594a, i11, jY2, j14, jR2, j15, pVar2, fVarI.f2847c, (o[]) fVarI.f2848d, fVarI.f2846b, jArr, jArr2);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        pVar = (y6.p) fVarI.f2849e;
                        if (pVar == null) {
                            nVar = null;
                        } else {
                            i19 = q2Var.f2595b;
                            if (i19 != 0) {
                                cVar = new c7.c(i19);
                                y6.o oVarA2 = pVar.a();
                                c0Var = ((y6.p) fVarI.f2849e).f57290l;
                                if (c0Var != null) {
                                    c0Var2 = c0Var.a(cVar);
                                } else {
                                    c0Var2 = new c0(cVar);
                                }
                                oVarA2.f57263k = c0Var2;
                                pVar2 = new y6.p(oVarA2);
                            } else {
                                pVar2 = pVar;
                            }
                            nVar = new n(q2Var.f2594a, i11, jY2, j14, jR2, j15, pVar2, fVarI.f2847c, (o[]) fVarI.f2848d, fVarI.f2846b, jArr, jArr2);
                        }
                    } else {
                        arrayList = arrayList3;
                    }
                    i12 = (iJ4 == 0 && iJ5 == -65536 && (iJ6 == 65536 || iJ6 == -65536) && iJ7 == 0) ? 270 : ((iJ4 == -65536 || iJ4 == 65536) && iJ5 == 0 && iJ6 == 0 && iJ7 == -65536) ? AchievementLevelType.DAY_STREAK_LV_8 : 0;
                    wVar4.J(16);
                    short sT3 = wVar4.t();
                    wVar4.J(2);
                    short sT4 = wVar4.t();
                    q2Var = new q2();
                    q2Var.f2594a = iJ3;
                    q2Var.f2595b = iC;
                    q2Var.f2596c = i12;
                    q2Var.f2597d = sT3;
                    q2Var.f2598e = sT4;
                    if (j11 == -9223372036854775807L) {
                        j12 = jY;
                    } else {
                        j12 = j11;
                    }
                    j13 = g(eVarO2.f6650c).f6657c;
                    if (j12 == -9223372036854775807L) {
                        j14 = j13;
                        jR2 = -9223372036854775807L;
                    } else {
                        String str5 = f0.f3975a;
                        j14 = j13;
                        jR2 = f0.R(j12, 1000000L, j14, RoundingMode.DOWN);
                    }
                    c7.d dVarN5 = dVarN2.n(1835626086);
                    dVarN5.getClass();
                    c7.d dVarN6 = dVarN5.n(1937007212);
                    dVarN6.getClass();
                    c7.e eVarO7 = dVarN2.o(1835296868);
                    eVarO7.getClass();
                    wVar = eVarO7.f6650c;
                    wVar.I(8);
                    iE = e(wVar.j());
                    if (iE == 0) {
                        i13 = 8;
                    } else {
                        i13 = 16;
                    }
                    wVar.J(i13);
                    jY2 = wVar.y();
                    i14 = wVar.f4040b;
                    if (iE == 0) {
                        i15 = 4;
                    } else {
                        i15 = 8;
                    }
                    i16 = 0;
                    while (true) {
                        if (i16 < i15) {
                            wVar.J(i15);
                            break;
                        }
                        if (wVar.f4039a[i14 + i16] != -1) {
                            if (iE == 0) {
                                jB = wVar.y();
                            } else {
                                jB = wVar.B();
                            }
                            j16 = jB;
                            if (j16 != 0) {
                                break;
                            }
                            String str6 = f0.f3975a;
                            jR = f0.R(j16, 1000000L, jY2, RoundingMode.DOWN);
                            break;
                        }
                        i16++;
                    }
                    j15 = jR;
                    int iC3 = wVar.C();
                    cArr = new char[]{(char) (((iC3 >> 10) & 31) + 96), (char) (((iC3 >> 5) & 31) + 96), (char) ((iC3 & 31) + 96)};
                    i17 = 0;
                    while (true) {
                        if (i17 < 3) {
                            c11 = cArr[i17];
                            if (c11 >= 'a') {
                            }
                            str = null;
                            break;
                        }
                        str = new String(cArr);
                        break;
                        i17++;
                    }
                    eVarO = dVarN6.o(1937011556);
                    if (eVarO != null) {
                        throw ParserException.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                    }
                    fVarI = i(eVarO.f6650c, q2Var, str, lVar, z12);
                    if (z11) {
                        i18 = i52;
                        jArr = null;
                        jArr2 = null;
                    } else {
                        i18 = i52;
                        jArr = null;
                        jArr2 = null;
                    }
                    pVar = (y6.p) fVarI.f2849e;
                    if (pVar == null) {
                        nVar = null;
                    } else {
                        i19 = q2Var.f2595b;
                        if (i19 != 0) {
                            cVar = new c7.c(i19);
                            y6.o oVarA3 = pVar.a();
                            c0Var = ((y6.p) fVarI.f2849e).f57290l;
                            if (c0Var != null) {
                                c0Var2 = c0Var.a(cVar);
                            } else {
                                c0Var2 = new c0(cVar);
                            }
                            oVarA3.f57263k = c0Var2;
                            pVar2 = new y6.p(oVarA3);
                        } else {
                            pVar2 = pVar;
                        }
                        nVar = new n(q2Var.f2594a, i11, jY2, j14, jR2, j15, pVar2, fVarI.f2847c, (o[]) fVarI.f2848d, fVarI.f2846b, jArr, jArr2);
                    }
                }
                n nVarA = (n) function.apply(nVar);
                if (nVarA == null) {
                    arrayList2 = arrayList2;
                } else {
                    y6.p pVar5 = nVarA.f48947g;
                    c7.d dVarN7 = dVar3.n(1835297121);
                    dVarN7.getClass();
                    c7.d dVarN8 = dVarN7.n(1835626086);
                    dVarN8.getClass();
                    c7.d dVarN9 = dVarN8.n(1937007212);
                    dVarN9.getClass();
                    c7.e eVarO8 = dVarN9.o(1937011578);
                    if (eVarO8 != null) {
                        b.a aVar = new b.a();
                        w wVar6 = eVarO8.f6650c;
                        aVar.f3415c = wVar6;
                        wVar6.I(12);
                        int iA9 = wVar6.A();
                        if ("audio/raw".equals(pVar5.f57291n)) {
                            iQ = f0.q(pVar5.H) * pVar5.F;
                            if (iA9 == 0 || iA9 % iQ != 0) {
                                b7.a.B("Audio sample size mismatch. stsd sample size: " + iQ + ", stsz sample size: " + iA9);
                            } else {
                                iQ = iA9;
                            }
                        } else {
                            iQ = iA9;
                        }
                        if (iQ == 0) {
                            iQ = -1;
                        }
                        aVar.f3413a = iQ;
                        aVar.f3414b = wVar6.A();
                        pVar3 = aVar;
                    } else {
                        c7.e eVarO9 = dVarN9.o(1937013298);
                        if (eVarO9 == null) {
                            throw ParserException.a(null, "Track has no sample table size information");
                        }
                        pVar3 = new b7.p(eVarO9);
                    }
                    int iJ8 = pVar3.j();
                    if (iJ8 == 0) {
                        qVar = new q(nVarA, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                    } else {
                        if (nVarA.f48942b == 2) {
                            long j32 = nVarA.f48946f;
                            if (j32 > 0) {
                                y6.o oVarA4 = pVar5.a();
                                oVarA4.f57275x = iJ8 / (j32 / 1000000.0f);
                                nVarA = nVarA.a(new y6.p(oVarA4));
                            }
                        }
                        y6.p pVar6 = nVarA.f48947g;
                        c7.e eVarO10 = dVarN9.o(1937007471);
                        if (eVarO10 == null) {
                            eVarO10 = dVarN9.o(1668232756);
                            eVarO10.getClass();
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        w wVar7 = eVarO10.f6650c;
                        c7.e eVarO11 = dVarN9.o(1937011555);
                        eVarO11.getClass();
                        w wVar8 = eVarO11.f6650c;
                        c7.e eVarO12 = dVarN9.o(1937011827);
                        eVarO12.getClass();
                        w wVar9 = eVarO12.f6650c;
                        c7.e eVarO13 = dVarN9.o(1937011571);
                        w wVar10 = eVarO13 != null ? eVarO13.f6650c : null;
                        c7.e eVarO14 = dVarN9.o(1668576371);
                        w wVar11 = eVarO14 != null ? eVarO14.f6650c : null;
                        a aVar2 = new a(wVar8, wVar7, z13);
                        wVar9.I(12);
                        int iA10 = wVar9.A() - 1;
                        int iA11 = wVar9.A();
                        int iA12 = wVar9.A();
                        if (wVar11 != null) {
                            wVar11.I(12);
                            iA = wVar11.A();
                        } else {
                            iA = 0;
                        }
                        if (wVar10 != null) {
                            wVar10.I(12);
                            iA2 = wVar10.A();
                            if (iA2 > 0) {
                                iA3 = wVar10.A() - 1;
                                wVar11 = wVar11;
                            } else {
                                wVar10 = null;
                            }
                            iA4 = pVar3.a();
                            String str7 = pVar6.f57291n;
                            if (iA4 == -1 && (("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && iA10 == 0 && iA == 0 && iA2 == 0)) {
                                int i59 = aVar2.f48846a;
                                long[] jArr16 = new long[i59];
                                int[] iArr15 = new int[i59];
                                while (aVar2.a()) {
                                    int i60 = aVar2.f48847b;
                                    jArr16[i60] = aVar2.f48849d;
                                    iArr15[i60] = aVar2.f48848c;
                                }
                                long j33 = iA12;
                                int i61 = OSSConstants.DEFAULT_BUFFER_SIZE / iA4;
                                int iE4 = 0;
                                for (int i62 = 0; i62 < i59; i62++) {
                                    iE4 += f0.e(iArr15[i62], i61);
                                }
                                jArr5 = new long[iE4];
                                int[] iArr16 = new int[iE4];
                                jArr6 = new long[iE4];
                                iArrCopyOf2 = new int[iE4];
                                int i63 = 0;
                                int i64 = 0;
                                int i65 = 0;
                                int i66 = 0;
                                int i67 = 0;
                                while (i65 < i59) {
                                    int i68 = iArr15[i65];
                                    long j34 = jArr16[i65];
                                    int i69 = i67;
                                    int i70 = i59;
                                    int iMax = i66;
                                    int i71 = i69;
                                    int i72 = i64;
                                    int i73 = i68;
                                    while (i73 > 0) {
                                        int iMin = Math.min(i61, i73);
                                        jArr5[i71] = j34;
                                        int i74 = i61;
                                        int i75 = iA4 * iMin;
                                        iArr16[i71] = i75;
                                        i72 += i75;
                                        iMax = Math.max(iMax, i75);
                                        jArr6[i71] = ((long) i63) * j33;
                                        iArrCopyOf2[i71] = 1;
                                        j34 += (long) iArr16[i71];
                                        i63 += iMin;
                                        i73 -= iMin;
                                        i71++;
                                        i61 = i74;
                                        iArr15 = iArr15;
                                    }
                                    int i76 = i61;
                                    i65++;
                                    int i77 = i71;
                                    i66 = iMax;
                                    i59 = i70;
                                    i67 = i77;
                                    i64 = i72;
                                    i61 = i76;
                                }
                                j21 = j33 * ((long) i63);
                                j22 = i64;
                                iArr3 = iArr16;
                                i30 = i66;
                            } else {
                                jArr3 = new long[iJ8];
                                iArr = new int[iJ8];
                                jArr4 = new long[iJ8];
                                iArr2 = new int[iJ8];
                                i21 = iA2;
                                iA5 = iA11;
                                wVar2 = wVar10;
                                i22 = iA;
                                iA6 = iA3;
                                j17 = 0;
                                j18 = 0;
                                j19 = 0;
                                i23 = 0;
                                iA7 = 0;
                                i24 = 0;
                                bVar = pVar3;
                                i25 = iA10;
                                i26 = 0;
                                iJ = 0;
                                while (true) {
                                    if (i26 >= iJ8) {
                                        i27 = i25;
                                        i28 = iA5;
                                        jArr5 = jArr3;
                                        iArrCopyOf = iArr;
                                        jArrCopyOf = jArr4;
                                        iArrCopyOf2 = iArr2;
                                        break;
                                    }
                                    zA = true;
                                    while (i24 == 0) {
                                        zA = aVar2.a();
                                        if (!zA) {
                                            break;
                                        }
                                        int i78 = i25;
                                        long j35 = aVar2.f48849d;
                                        i24 = aVar2.f48848c;
                                        j19 = j35;
                                        i25 = i78;
                                        iA5 = iA5;
                                        iJ8 = iJ8;
                                    }
                                    i31 = iJ8;
                                    i27 = i25;
                                    i28 = iA5;
                                    if (!zA) {
                                        b7.a.B("Unexpected end of chunk data");
                                        long[] jArrCopyOf2 = Arrays.copyOf(jArr3, i26);
                                        iArrCopyOf = Arrays.copyOf(iArr, i26);
                                        jArrCopyOf = Arrays.copyOf(jArr4, i26);
                                        jArr5 = jArrCopyOf2;
                                        iJ8 = i26;
                                        iArrCopyOf2 = Arrays.copyOf(iArr2, i26);
                                        break;
                                    }
                                    if (wVar11 != null) {
                                        while (iA7 == 0 && i22 > 0) {
                                            iA7 = wVar11.A();
                                            iJ = wVar11.j();
                                            i22--;
                                        }
                                        iA7--;
                                    }
                                    jArr3[i26] = j19;
                                    iO = bVar.o();
                                    iArr[i26] = iO;
                                    j17 += (long) iO;
                                    if (iO > i23) {
                                        i23 = iO;
                                    }
                                    jArr4[i26] = j18 + ((long) iJ);
                                    if (wVar2 == null) {
                                        i32 = 1;
                                    } else {
                                        i32 = 0;
                                    }
                                    iArr2[i26] = i32;
                                    if (i26 == iA6) {
                                        iArr2[i26] = 1;
                                        i21--;
                                        if (i21 > 0) {
                                            wVar2.getClass();
                                            iA6 = wVar2.A() - 1;
                                        }
                                    }
                                    j18 += (long) iA12;
                                    iA5 = i28 - 1;
                                    if (iA5 == 0 || i27 <= 0) {
                                        i25 = i27;
                                    } else {
                                        i25 = i27 - 1;
                                        iA5 = wVar9.A();
                                        iA12 = wVar9.j();
                                    }
                                    j19 += (long) iArr[i26];
                                    i24--;
                                    i26++;
                                    iA6 = iA6;
                                    iA12 = iA12;
                                    iJ8 = i31;
                                }
                                i29 = i24;
                                j21 = j18 + ((long) iJ);
                                if (wVar11 == null) {
                                    z14 = true;
                                    break;
                                }
                                while (true) {
                                    if (i22 <= 0) {
                                        z14 = true;
                                        break;
                                    }
                                    if (wVar11.A() != 0) {
                                        z14 = false;
                                        break;
                                    }
                                    wVar11.j();
                                    i22--;
                                }
                                if (i21 == 0 || i28 != 0 || i29 != 0 || i27 != 0 || iA7 != 0 || !z14) {
                                    StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                    ep.a.v(nVarA.f48941a, i21, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb2);
                                    ep.a.v(i28, i29, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb2);
                                    sb2.append(i27);
                                    sb2.append(", remainingSamplesAtTimestampOffset ");
                                    sb2.append(iA7);
                                    if (z14) {
                                        str2 = BuildConfig.VERSION_NAME;
                                    } else {
                                        str2 = ", ctts invalid";
                                    }
                                    sb2.append(str2);
                                    b7.a.B(sb2.toString());
                                }
                                i30 = i23;
                                jArr6 = jArrCopyOf;
                                iArr3 = iArrCopyOf;
                                j22 = j17;
                            }
                            j23 = j21;
                            jArr7 = jArr5;
                            iArr4 = iArrCopyOf2;
                            j24 = nVarA.f48946f;
                            if (j24 > 0) {
                                jR5 = f0.R(j22 * 8, 1000000L, j24, RoundingMode.HALF_DOWN);
                                if (jR5 > 0 && jR5 < 2147483647L) {
                                    y6.o oVarA5 = pVar6.a();
                                    oVarA5.f57260h = (int) jR5;
                                    nVarA = nVarA.a(new y6.p(oVarA5));
                                }
                            }
                            j25 = nVarA.f48943c;
                            pVar4 = nVarA.f48947g;
                            i33 = nVarA.f48942b;
                            jArr8 = nVarA.f48950j;
                            jArr9 = nVarA.f48949i;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jR3 = f0.R(j23, 1000000L, j25, roundingMode);
                            if (jArr9 == null) {
                                f0.Q(jArr6, j25);
                                qVar2 = new q(nVarA, jArr7, iArr3, i30, jArr6, iArr4, jR3);
                            } else {
                                if (jArr9.length == 1 || i33 != 1 || jArr6.length < 2) {
                                    jArr10 = jArr8;
                                    i34 = iJ8;
                                    j26 = j23;
                                } else {
                                    jArr8.getClass();
                                    long j36 = jArr8[0];
                                    i34 = iJ8;
                                    long jR6 = f0.R(jArr9[0], nVarA.f48943c, nVarA.f48944d, roundingMode) + j36;
                                    int length = jArr6.length - 1;
                                    jArr10 = jArr8;
                                    int iG = f0.g(4, 0, length);
                                    int iG2 = f0.g(jArr6.length - 4, 0, length);
                                    long j37 = jArr6[0];
                                    if (j37 <= j36 && j36 < jArr6[iG] && jArr6[iG2] < jR6 && jR6 <= j23) {
                                        long j38 = j23 - jR6;
                                        long jR7 = f0.R(j36 - j37, pVar4.G, nVarA.f48943c, roundingMode);
                                        j26 = j23;
                                        long jR8 = f0.R(j38, pVar4.G, nVarA.f48943c, roundingMode);
                                        if ((jR7 != 0 || jR8 != 0) && jR7 <= 2147483647L && jR8 <= 2147483647L) {
                                            tVar.f55930a = (int) jR7;
                                            tVar.f55931b = (int) jR8;
                                            f0.Q(jArr6, j25);
                                            qVar2 = new q(nVarA, jArr7, iArr3, i30, jArr6, iArr4, f0.R(jArr9[0], 1000000L, nVarA.f48944d, roundingMode));
                                        }
                                    } else {
                                        j26 = j23;
                                    }
                                    i35 = 1;
                                    if (jArr9.length != 1) {
                                        iArr5 = iArr3;
                                        if (i33 == i35) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        iArr6 = new int[jArr9.length];
                                        iArr7 = new int[jArr9.length];
                                        jArr10.getClass();
                                        i36 = 0;
                                        i37 = 0;
                                        z16 = false;
                                        i38 = 0;
                                        while (i37 < jArr9.length) {
                                            iArr12 = iArr6;
                                            iArr13 = iArr7;
                                            j29 = jArr10[i37];
                                            if (j29 != -1) {
                                                i44 = i37;
                                                boolean z23 = z16;
                                                long jR9 = f0.R(jArr9[i37], nVarA.f48943c, nVarA.f48944d, RoundingMode.DOWN);
                                                iArr14 = iArr12;
                                                iArr14[i44] = f0.d(jArr6, j29, true);
                                                j30 = j29 + jR9;
                                                iArr13[i44] = f0.a(jArr6, j30, z15);
                                                i45 = iArr14[i44];
                                                while (true) {
                                                    i46 = iArr14[i44];
                                                    if (i46 < 0 || (iArr4[i46] & 1) != 0) {
                                                        break;
                                                    }
                                                    iArr14[i44] = i46 - 1;
                                                }
                                                if (i46 < 0) {
                                                    iArr14[i44] = i45;
                                                    while (true) {
                                                        i50 = iArr14[i44];
                                                        if (i50 >= iArr13[i44] || (iArr4[i50] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr14[i44] = i50 + 1;
                                                    }
                                                }
                                                if (i33 == 2 && iArr14[i44] != iArr13[i44]) {
                                                    while (true) {
                                                        i48 = iArr13[i44];
                                                        if (i48 < jArr6.length - 1) {
                                                            break;
                                                        }
                                                        i49 = i48 + 1;
                                                        if (jArr6[i49] <= j30) {
                                                            break;
                                                        }
                                                        iArr13[i44] = i49;
                                                    }
                                                }
                                                int i79 = iArr13[i44];
                                                i47 = iArr14[i44];
                                                int i80 = (i79 - i47) + i38;
                                                if (i36 != i47) {
                                                    z22 = true;
                                                } else {
                                                    z22 = false;
                                                }
                                                z21 = z23 | z22;
                                                i36 = i79;
                                                i38 = i80;
                                            } else {
                                                iArr14 = iArr12;
                                                i44 = i37;
                                                z21 = z16;
                                            }
                                            i37 = i44 + 1;
                                            iArr7 = iArr13;
                                            z16 = z21;
                                            iArr6 = iArr14;
                                        }
                                        iArr8 = iArr6;
                                        iArr9 = iArr7;
                                        boolean z24 = z16;
                                        if (i38 != i34) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        z18 = z24 | z17;
                                        if (z18) {
                                            jArr11 = new long[i38];
                                        } else {
                                            jArr11 = jArr7;
                                        }
                                        if (z18) {
                                            iArr10 = new int[i38];
                                        } else {
                                            iArr10 = iArr5;
                                        }
                                        if (z18) {
                                            i30 = 0;
                                        }
                                        if (z18) {
                                            iArr11 = new int[i38];
                                        } else {
                                            iArr11 = iArr4;
                                        }
                                        jArr12 = new long[i38];
                                        i39 = 0;
                                        z19 = false;
                                        i40 = 0;
                                        i41 = i30;
                                        j27 = 0;
                                        while (i39 < jArr9.length) {
                                            j28 = jArr10[i39];
                                            i42 = iArr8[i39];
                                            i43 = iArr9[i39];
                                            z20 = z18;
                                            if (z18) {
                                                int i81 = i43 - i42;
                                                System.arraycopy(jArr7, i42, jArr11, i40, i81);
                                                System.arraycopy(iArr5, i42, iArr10, i40, i81);
                                                System.arraycopy(iArr4, i42, iArr11, i40, i81);
                                            }
                                            int i82 = i41;
                                            while (i42 < i43) {
                                                long[] jArr17 = jArr11;
                                                int[] iArr17 = iArr10;
                                                long j39 = nVarA.f48944d;
                                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                long jR10 = f0.R(j27, 1000000L, j39, roundingMode2);
                                                jR4 = f0.R(jArr6[i42] - j28, 1000000L, nVarA.f48943c, roundingMode2);
                                                if (jR4 < 0) {
                                                    z19 = true;
                                                }
                                                jArr12[i40] = jR10 + jR4;
                                                if (!z20 && iArr17[i40] > i82) {
                                                    i82 = iArr5[i42];
                                                }
                                                i40++;
                                                i42++;
                                                jArr11 = jArr17;
                                                iArr10 = iArr17;
                                            }
                                            j27 += jArr9[i39];
                                            i39++;
                                            i41 = i82;
                                            z18 = z20;
                                            jArr11 = jArr11;
                                            iArr10 = iArr10;
                                        }
                                        long[] jArr18 = jArr11;
                                        int[] iArr18 = iArr10;
                                        long jR11 = f0.R(j27, 1000000L, nVarA.f48944d, RoundingMode.DOWN);
                                        if (z19) {
                                            y6.o oVarA6 = pVar4.a();
                                            oVarA6.f57270s = true;
                                            nVarA = nVarA.a(new y6.p(oVarA6));
                                        }
                                        arrayList2 = arrayList2;
                                        qVar = new q(nVarA, jArr18, iArr18, i41, jArr12, iArr11, jR11);
                                    } else if (jArr9[0] == 0) {
                                        jArr10.getClass();
                                        j31 = jArr10[0];
                                        for (i51 = 0; i51 < jArr6.length; i51++) {
                                            jArr6[i51] = f0.R(jArr6[i51] - j31, 1000000L, nVarA.f48943c, RoundingMode.DOWN);
                                        }
                                        q qVar3 = new q(nVarA, jArr7, iArr3, i30, jArr6, iArr4, f0.R(j26 - j31, 1000000L, nVarA.f48943c, RoundingMode.DOWN));
                                        arrayList2 = arrayList2;
                                        qVar = qVar3;
                                    } else {
                                        i35 = 1;
                                        iArr5 = iArr3;
                                        if (i33 == i35) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        iArr6 = new int[jArr9.length];
                                        iArr7 = new int[jArr9.length];
                                        jArr10.getClass();
                                        i36 = 0;
                                        i37 = 0;
                                        z16 = false;
                                        i38 = 0;
                                        while (i37 < jArr9.length) {
                                            iArr12 = iArr6;
                                            iArr13 = iArr7;
                                            j29 = jArr10[i37];
                                            if (j29 != -1) {
                                                i44 = i37;
                                                boolean z25 = z16;
                                                long jR12 = f0.R(jArr9[i37], nVarA.f48943c, nVarA.f48944d, RoundingMode.DOWN);
                                                iArr14 = iArr12;
                                                iArr14[i44] = f0.d(jArr6, j29, true);
                                                j30 = j29 + jR12;
                                                iArr13[i44] = f0.a(jArr6, j30, z15);
                                                i45 = iArr14[i44];
                                                while (true) {
                                                    i46 = iArr14[i44];
                                                    if (i46 < 0) {
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr14[i44] = i46 - 1;
                                                }
                                                if (i46 < 0) {
                                                    iArr14[i44] = i45;
                                                    while (true) {
                                                        i50 = iArr14[i44];
                                                        if (i50 >= iArr13[i44]) {
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr14[i44] = i50 + 1;
                                                    }
                                                }
                                                if (i33 == 2) {
                                                    while (true) {
                                                        i48 = iArr13[i44];
                                                        if (i48 < jArr6.length - 1) {
                                                            break;
                                                            break;
                                                        }
                                                        i49 = i48 + 1;
                                                        if (jArr6[i49] <= j30) {
                                                            break;
                                                            break;
                                                        }
                                                        iArr13[i44] = i49;
                                                    }
                                                }
                                                int i710 = iArr13[i44];
                                                i47 = iArr14[i44];
                                                int i83 = (i710 - i47) + i38;
                                                if (i36 != i47) {
                                                    z22 = true;
                                                } else {
                                                    z22 = false;
                                                }
                                                z21 = z25 | z22;
                                                i36 = i710;
                                                i38 = i83;
                                            } else {
                                                iArr14 = iArr12;
                                                i44 = i37;
                                                z21 = z16;
                                            }
                                            i37 = i44 + 1;
                                            iArr7 = iArr13;
                                            z16 = z21;
                                            iArr6 = iArr14;
                                        }
                                        iArr8 = iArr6;
                                        iArr9 = iArr7;
                                        boolean z26 = z16;
                                        if (i38 != i34) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        z18 = z26 | z17;
                                        if (z18) {
                                            jArr11 = new long[i38];
                                        } else {
                                            jArr11 = jArr7;
                                        }
                                        if (z18) {
                                            iArr10 = new int[i38];
                                        } else {
                                            iArr10 = iArr5;
                                        }
                                        if (z18) {
                                            i30 = 0;
                                        }
                                        if (z18) {
                                            iArr11 = new int[i38];
                                        } else {
                                            iArr11 = iArr4;
                                        }
                                        jArr12 = new long[i38];
                                        i39 = 0;
                                        z19 = false;
                                        i40 = 0;
                                        i41 = i30;
                                        j27 = 0;
                                        while (i39 < jArr9.length) {
                                            j28 = jArr10[i39];
                                            i42 = iArr8[i39];
                                            i43 = iArr9[i39];
                                            z20 = z18;
                                            if (z18) {
                                                int i84 = i43 - i42;
                                                System.arraycopy(jArr7, i42, jArr11, i40, i84);
                                                System.arraycopy(iArr5, i42, iArr10, i40, i84);
                                                System.arraycopy(iArr4, i42, iArr11, i40, i84);
                                            }
                                            int i85 = i41;
                                            while (i42 < i43) {
                                                long[] jArr19 = jArr11;
                                                int[] iArr19 = iArr10;
                                                long j310 = nVarA.f48944d;
                                                RoundingMode roundingMode3 = RoundingMode.DOWN;
                                                long jR13 = f0.R(j27, 1000000L, j310, roundingMode3);
                                                jR4 = f0.R(jArr6[i42] - j28, 1000000L, nVarA.f48943c, roundingMode3);
                                                if (jR4 < 0) {
                                                    z19 = true;
                                                }
                                                jArr12[i40] = jR13 + jR4;
                                                if (!z20) {
                                                }
                                                i40++;
                                                i42++;
                                                jArr11 = jArr19;
                                                iArr10 = iArr19;
                                            }
                                            j27 += jArr9[i39];
                                            i39++;
                                            i41 = i85;
                                            z18 = z20;
                                            jArr11 = jArr11;
                                            iArr10 = iArr10;
                                        }
                                        long[] jArr110 = jArr11;
                                        int[] iArr110 = iArr10;
                                        long jR14 = f0.R(j27, 1000000L, nVarA.f48944d, RoundingMode.DOWN);
                                        if (z19) {
                                            y6.o oVarA7 = pVar4.a();
                                            oVarA7.f57270s = true;
                                            nVarA = nVarA.a(new y6.p(oVarA7));
                                        }
                                        arrayList2 = arrayList2;
                                        qVar = new q(nVarA, jArr110, iArr110, i41, jArr12, iArr11, jR14);
                                    }
                                    arrayList2.add(qVar);
                                }
                                i35 = 1;
                                if (jArr9.length != 1) {
                                    iArr5 = iArr3;
                                    if (i33 == i35) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    iArr6 = new int[jArr9.length];
                                    iArr7 = new int[jArr9.length];
                                    jArr10.getClass();
                                    i36 = 0;
                                    i37 = 0;
                                    z16 = false;
                                    i38 = 0;
                                    while (i37 < jArr9.length) {
                                        iArr12 = iArr6;
                                        iArr13 = iArr7;
                                        j29 = jArr10[i37];
                                        if (j29 != -1) {
                                            i44 = i37;
                                            boolean z27 = z16;
                                            long jR15 = f0.R(jArr9[i37], nVarA.f48943c, nVarA.f48944d, RoundingMode.DOWN);
                                            iArr14 = iArr12;
                                            iArr14[i44] = f0.d(jArr6, j29, true);
                                            j30 = j29 + jR15;
                                            iArr13[i44] = f0.a(jArr6, j30, z15);
                                            i45 = iArr14[i44];
                                            while (true) {
                                                i46 = iArr14[i44];
                                                if (i46 < 0) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr14[i44] = i46 - 1;
                                            }
                                            if (i46 < 0) {
                                                iArr14[i44] = i45;
                                                while (true) {
                                                    i50 = iArr14[i44];
                                                    if (i50 >= iArr13[i44]) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr14[i44] = i50 + 1;
                                                }
                                            }
                                            if (i33 == 2) {
                                                while (true) {
                                                    i48 = iArr13[i44];
                                                    if (i48 < jArr6.length - 1) {
                                                        break;
                                                        break;
                                                    }
                                                    i49 = i48 + 1;
                                                    if (jArr6[i49] <= j30) {
                                                        break;
                                                        break;
                                                    }
                                                    iArr13[i44] = i49;
                                                }
                                            }
                                            int i711 = iArr13[i44];
                                            i47 = iArr14[i44];
                                            int i86 = (i711 - i47) + i38;
                                            if (i36 != i47) {
                                                z22 = true;
                                            } else {
                                                z22 = false;
                                            }
                                            z21 = z27 | z22;
                                            i36 = i711;
                                            i38 = i86;
                                        } else {
                                            iArr14 = iArr12;
                                            i44 = i37;
                                            z21 = z16;
                                        }
                                        i37 = i44 + 1;
                                        iArr7 = iArr13;
                                        z16 = z21;
                                        iArr6 = iArr14;
                                    }
                                    iArr8 = iArr6;
                                    iArr9 = iArr7;
                                    boolean z28 = z16;
                                    if (i38 != i34) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    z18 = z28 | z17;
                                    if (z18) {
                                        jArr11 = new long[i38];
                                    } else {
                                        jArr11 = jArr7;
                                    }
                                    if (z18) {
                                        iArr10 = new int[i38];
                                    } else {
                                        iArr10 = iArr5;
                                    }
                                    if (z18) {
                                        i30 = 0;
                                    }
                                    if (z18) {
                                        iArr11 = new int[i38];
                                    } else {
                                        iArr11 = iArr4;
                                    }
                                    jArr12 = new long[i38];
                                    i39 = 0;
                                    z19 = false;
                                    i40 = 0;
                                    i41 = i30;
                                    j27 = 0;
                                    while (i39 < jArr9.length) {
                                        j28 = jArr10[i39];
                                        i42 = iArr8[i39];
                                        i43 = iArr9[i39];
                                        z20 = z18;
                                        if (z18) {
                                            int i87 = i43 - i42;
                                            System.arraycopy(jArr7, i42, jArr11, i40, i87);
                                            System.arraycopy(iArr5, i42, iArr10, i40, i87);
                                            System.arraycopy(iArr4, i42, iArr11, i40, i87);
                                        }
                                        int i88 = i41;
                                        while (i42 < i43) {
                                            long[] jArr111 = jArr11;
                                            int[] iArr111 = iArr10;
                                            long j311 = nVarA.f48944d;
                                            RoundingMode roundingMode4 = RoundingMode.DOWN;
                                            long jR16 = f0.R(j27, 1000000L, j311, roundingMode4);
                                            jR4 = f0.R(jArr6[i42] - j28, 1000000L, nVarA.f48943c, roundingMode4);
                                            if (jR4 < 0) {
                                                z19 = true;
                                            }
                                            jArr12[i40] = jR16 + jR4;
                                            if (!z20) {
                                            }
                                            i40++;
                                            i42++;
                                            jArr11 = jArr111;
                                            iArr10 = iArr111;
                                        }
                                        j27 += jArr9[i39];
                                        i39++;
                                        i41 = i88;
                                        z18 = z20;
                                        jArr11 = jArr11;
                                        iArr10 = iArr10;
                                    }
                                    long[] jArr112 = jArr11;
                                    int[] iArr112 = iArr10;
                                    long jR17 = f0.R(j27, 1000000L, nVarA.f48944d, RoundingMode.DOWN);
                                    if (z19) {
                                        y6.o oVarA8 = pVar4.a();
                                        oVarA8.f57270s = true;
                                        nVarA = nVarA.a(new y6.p(oVarA8));
                                    }
                                    arrayList2 = arrayList2;
                                    qVar = new q(nVarA, jArr112, iArr112, i41, jArr12, iArr11, jR17);
                                } else if (jArr9[0] == 0) {
                                    jArr10.getClass();
                                    j31 = jArr10[0];
                                    while (i51 < jArr6.length) {
                                        jArr6[i51] = f0.R(jArr6[i51] - j31, 1000000L, nVarA.f48943c, RoundingMode.DOWN);
                                    }
                                    q qVar4 = new q(nVarA, jArr7, iArr3, i30, jArr6, iArr4, f0.R(j26 - j31, 1000000L, nVarA.f48943c, RoundingMode.DOWN));
                                    arrayList2 = arrayList2;
                                    qVar = qVar4;
                                } else {
                                    i35 = 1;
                                    iArr5 = iArr3;
                                    if (i33 == i35) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    iArr6 = new int[jArr9.length];
                                    iArr7 = new int[jArr9.length];
                                    jArr10.getClass();
                                    i36 = 0;
                                    i37 = 0;
                                    z16 = false;
                                    i38 = 0;
                                    while (i37 < jArr9.length) {
                                        iArr12 = iArr6;
                                        iArr13 = iArr7;
                                        j29 = jArr10[i37];
                                        if (j29 != -1) {
                                            i44 = i37;
                                            boolean z29 = z16;
                                            long jR18 = f0.R(jArr9[i37], nVarA.f48943c, nVarA.f48944d, RoundingMode.DOWN);
                                            iArr14 = iArr12;
                                            iArr14[i44] = f0.d(jArr6, j29, true);
                                            j30 = j29 + jR18;
                                            iArr13[i44] = f0.a(jArr6, j30, z15);
                                            i45 = iArr14[i44];
                                            while (true) {
                                                i46 = iArr14[i44];
                                                if (i46 < 0) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr14[i44] = i46 - 1;
                                            }
                                            if (i46 < 0) {
                                                iArr14[i44] = i45;
                                                while (true) {
                                                    i50 = iArr14[i44];
                                                    if (i50 >= iArr13[i44]) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr14[i44] = i50 + 1;
                                                }
                                            }
                                            if (i33 == 2) {
                                                while (true) {
                                                    i48 = iArr13[i44];
                                                    if (i48 < jArr6.length - 1) {
                                                        break;
                                                        break;
                                                    }
                                                    i49 = i48 + 1;
                                                    if (jArr6[i49] <= j30) {
                                                        break;
                                                        break;
                                                    }
                                                    iArr13[i44] = i49;
                                                }
                                            }
                                            int i712 = iArr13[i44];
                                            i47 = iArr14[i44];
                                            int i89 = (i712 - i47) + i38;
                                            if (i36 != i47) {
                                                z22 = true;
                                            } else {
                                                z22 = false;
                                            }
                                            z21 = z29 | z22;
                                            i36 = i712;
                                            i38 = i89;
                                        } else {
                                            iArr14 = iArr12;
                                            i44 = i37;
                                            z21 = z16;
                                        }
                                        i37 = i44 + 1;
                                        iArr7 = iArr13;
                                        z16 = z21;
                                        iArr6 = iArr14;
                                    }
                                    iArr8 = iArr6;
                                    iArr9 = iArr7;
                                    boolean z210 = z16;
                                    if (i38 != i34) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    z18 = z210 | z17;
                                    if (z18) {
                                        jArr11 = new long[i38];
                                    } else {
                                        jArr11 = jArr7;
                                    }
                                    if (z18) {
                                        iArr10 = new int[i38];
                                    } else {
                                        iArr10 = iArr5;
                                    }
                                    if (z18) {
                                        i30 = 0;
                                    }
                                    if (z18) {
                                        iArr11 = new int[i38];
                                    } else {
                                        iArr11 = iArr4;
                                    }
                                    jArr12 = new long[i38];
                                    i39 = 0;
                                    z19 = false;
                                    i40 = 0;
                                    i41 = i30;
                                    j27 = 0;
                                    while (i39 < jArr9.length) {
                                        j28 = jArr10[i39];
                                        i42 = iArr8[i39];
                                        i43 = iArr9[i39];
                                        z20 = z18;
                                        if (z18) {
                                            int i810 = i43 - i42;
                                            System.arraycopy(jArr7, i42, jArr11, i40, i810);
                                            System.arraycopy(iArr5, i42, iArr10, i40, i810);
                                            System.arraycopy(iArr4, i42, iArr11, i40, i810);
                                        }
                                        int i811 = i41;
                                        while (i42 < i43) {
                                            long[] jArr113 = jArr11;
                                            int[] iArr113 = iArr10;
                                            long j312 = nVarA.f48944d;
                                            RoundingMode roundingMode5 = RoundingMode.DOWN;
                                            long jR19 = f0.R(j27, 1000000L, j312, roundingMode5);
                                            jR4 = f0.R(jArr6[i42] - j28, 1000000L, nVarA.f48943c, roundingMode5);
                                            if (jR4 < 0) {
                                                z19 = true;
                                            }
                                            jArr12[i40] = jR19 + jR4;
                                            if (!z20) {
                                            }
                                            i40++;
                                            i42++;
                                            jArr11 = jArr113;
                                            iArr10 = iArr113;
                                        }
                                        j27 += jArr9[i39];
                                        i39++;
                                        i41 = i811;
                                        z18 = z20;
                                        jArr11 = jArr11;
                                        iArr10 = iArr10;
                                    }
                                    long[] jArr114 = jArr11;
                                    int[] iArr114 = iArr10;
                                    long jR110 = f0.R(j27, 1000000L, nVarA.f48944d, RoundingMode.DOWN);
                                    if (z19) {
                                        y6.o oVarA9 = pVar4.a();
                                        oVarA9.f57270s = true;
                                        nVarA = nVarA.a(new y6.p(oVarA9));
                                    }
                                    arrayList2 = arrayList2;
                                    qVar = new q(nVarA, jArr114, iArr114, i41, jArr12, iArr11, jR110);
                                }
                                arrayList2.add(qVar);
                            }
                            qVar = qVar2;
                        } else {
                            iA2 = 0;
                        }
                        iA3 = -1;
                        iA4 = pVar3.a();
                        String str8 = pVar6.f57291n;
                        if (iA4 == -1) {
                            jArr3 = new long[iJ8];
                            iArr = new int[iJ8];
                            jArr4 = new long[iJ8];
                            iArr2 = new int[iJ8];
                            i21 = iA2;
                            iA5 = iA11;
                            wVar2 = wVar10;
                            i22 = iA;
                            iA6 = iA3;
                            j17 = 0;
                            j18 = 0;
                            j19 = 0;
                            i23 = 0;
                            iA7 = 0;
                            i24 = 0;
                            bVar = pVar3;
                            i25 = iA10;
                            i26 = 0;
                            iJ = 0;
                            while (true) {
                                if (i26 >= iJ8) {
                                    i27 = i25;
                                    i28 = iA5;
                                    jArr5 = jArr3;
                                    iArrCopyOf = iArr;
                                    jArrCopyOf = jArr4;
                                    iArrCopyOf2 = iArr2;
                                    break;
                                }
                                zA = true;
                                while (i24 == 0) {
                                    zA = aVar2.a();
                                    if (!zA) {
                                        break;
                                        break;
                                    }
                                    int i713 = i25;
                                    long j313 = aVar2.f48849d;
                                    i24 = aVar2.f48848c;
                                    j19 = j313;
                                    i25 = i713;
                                    iA5 = iA5;
                                    iJ8 = iJ8;
                                }
                                i31 = iJ8;
                                i27 = i25;
                                i28 = iA5;
                                if (!zA) {
                                    b7.a.B("Unexpected end of chunk data");
                                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i26);
                                    iArrCopyOf = Arrays.copyOf(iArr, i26);
                                    jArrCopyOf = Arrays.copyOf(jArr4, i26);
                                    jArr5 = jArrCopyOf3;
                                    iJ8 = i26;
                                    iArrCopyOf2 = Arrays.copyOf(iArr2, i26);
                                    break;
                                }
                                if (wVar11 != null) {
                                    while (iA7 == 0) {
                                        iA7 = wVar11.A();
                                        iJ = wVar11.j();
                                        i22--;
                                    }
                                    iA7--;
                                }
                                jArr3[i26] = j19;
                                iO = bVar.o();
                                iArr[i26] = iO;
                                j17 += (long) iO;
                                if (iO > i23) {
                                    i23 = iO;
                                }
                                jArr4[i26] = j18 + ((long) iJ);
                                if (wVar2 == null) {
                                    i32 = 1;
                                } else {
                                    i32 = 0;
                                }
                                iArr2[i26] = i32;
                                if (i26 == iA6) {
                                    iArr2[i26] = 1;
                                    i21--;
                                    if (i21 > 0) {
                                        wVar2.getClass();
                                        iA6 = wVar2.A() - 1;
                                    }
                                }
                                j18 += (long) iA12;
                                iA5 = i28 - 1;
                                if (iA5 == 0) {
                                    i25 = i27;
                                } else {
                                    i25 = i27;
                                }
                                j19 += (long) iArr[i26];
                                i24--;
                                i26++;
                                iA6 = iA6;
                                iA12 = iA12;
                                iJ8 = i31;
                            }
                            i29 = i24;
                            j21 = j18 + ((long) iJ);
                            if (wVar11 == null) {
                                z14 = true;
                                break;
                            }
                            while (true) {
                                if (i22 <= 0) {
                                    z14 = true;
                                    break;
                                }
                                if (wVar11.A() != 0) {
                                    z14 = false;
                                    break;
                                }
                                wVar11.j();
                                i22--;
                            }
                            if (i21 == 0) {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                ep.a.v(nVarA.f48941a, i21, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb3);
                                ep.a.v(i28, i29, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb3);
                                sb3.append(i27);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(iA7);
                                if (z14) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = BuildConfig.VERSION_NAME;
                                }
                                sb3.append(str2);
                                b7.a.B(sb3.toString());
                            } else {
                                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                                ep.a.v(nVarA.f48941a, i21, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb4);
                                ep.a.v(i28, i29, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb4);
                                sb4.append(i27);
                                sb4.append(", remainingSamplesAtTimestampOffset ");
                                sb4.append(iA7);
                                if (z14) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = BuildConfig.VERSION_NAME;
                                }
                                sb4.append(str2);
                                b7.a.B(sb4.toString());
                            }
                            i30 = i23;
                            jArr6 = jArrCopyOf;
                            iArr3 = iArrCopyOf;
                            j22 = j17;
                        } else {
                            jArr3 = new long[iJ8];
                            iArr = new int[iJ8];
                            jArr4 = new long[iJ8];
                            iArr2 = new int[iJ8];
                            i21 = iA2;
                            iA5 = iA11;
                            wVar2 = wVar10;
                            i22 = iA;
                            iA6 = iA3;
                            j17 = 0;
                            j18 = 0;
                            j19 = 0;
                            i23 = 0;
                            iA7 = 0;
                            i24 = 0;
                            bVar = pVar3;
                            i25 = iA10;
                            i26 = 0;
                            iJ = 0;
                            while (true) {
                                if (i26 >= iJ8) {
                                    i27 = i25;
                                    i28 = iA5;
                                    jArr5 = jArr3;
                                    iArrCopyOf = iArr;
                                    jArrCopyOf = jArr4;
                                    iArrCopyOf2 = iArr2;
                                    break;
                                }
                                zA = true;
                                while (i24 == 0) {
                                    zA = aVar2.a();
                                    if (!zA) {
                                        break;
                                        break;
                                    }
                                    int i714 = i25;
                                    long j314 = aVar2.f48849d;
                                    i24 = aVar2.f48848c;
                                    j19 = j314;
                                    i25 = i714;
                                    iA5 = iA5;
                                    iJ8 = iJ8;
                                }
                                i31 = iJ8;
                                i27 = i25;
                                i28 = iA5;
                                if (!zA) {
                                    b7.a.B("Unexpected end of chunk data");
                                    long[] jArrCopyOf4 = Arrays.copyOf(jArr3, i26);
                                    iArrCopyOf = Arrays.copyOf(iArr, i26);
                                    jArrCopyOf = Arrays.copyOf(jArr4, i26);
                                    jArr5 = jArrCopyOf4;
                                    iJ8 = i26;
                                    iArrCopyOf2 = Arrays.copyOf(iArr2, i26);
                                    break;
                                }
                                if (wVar11 != null) {
                                    while (iA7 == 0) {
                                        iA7 = wVar11.A();
                                        iJ = wVar11.j();
                                        i22--;
                                    }
                                    iA7--;
                                }
                                jArr3[i26] = j19;
                                iO = bVar.o();
                                iArr[i26] = iO;
                                j17 += (long) iO;
                                if (iO > i23) {
                                    i23 = iO;
                                }
                                jArr4[i26] = j18 + ((long) iJ);
                                if (wVar2 == null) {
                                    i32 = 1;
                                } else {
                                    i32 = 0;
                                }
                                iArr2[i26] = i32;
                                if (i26 == iA6) {
                                    iArr2[i26] = 1;
                                    i21--;
                                    if (i21 > 0) {
                                        wVar2.getClass();
                                        iA6 = wVar2.A() - 1;
                                    }
                                }
                                j18 += (long) iA12;
                                iA5 = i28 - 1;
                                if (iA5 == 0) {
                                    i25 = i27;
                                } else {
                                    i25 = i27;
                                }
                                j19 += (long) iArr[i26];
                                i24--;
                                i26++;
                                iA6 = iA6;
                                iA12 = iA12;
                                iJ8 = i31;
                            }
                            i29 = i24;
                            j21 = j18 + ((long) iJ);
                            if (wVar11 == null) {
                                z14 = true;
                                break;
                            }
                            while (true) {
                                if (i22 <= 0) {
                                    z14 = true;
                                    break;
                                }
                                if (wVar11.A() != 0) {
                                    z14 = false;
                                    break;
                                }
                                wVar11.j();
                                i22--;
                            }
                            if (i21 == 0) {
                                StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                                ep.a.v(nVarA.f48941a, i21, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb5);
                                ep.a.v(i28, i29, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb5);
                                sb5.append(i27);
                                sb5.append(", remainingSamplesAtTimestampOffset ");
                                sb5.append(iA7);
                                if (z14) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = BuildConfig.VERSION_NAME;
                                }
                                sb5.append(str2);
                                b7.a.B(sb5.toString());
                            } else {
                                StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                                ep.a.v(nVarA.f48941a, i21, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb6);
                                ep.a.v(i28, i29, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb6);
                                sb6.append(i27);
                                sb6.append(", remainingSamplesAtTimestampOffset ");
                                sb6.append(iA7);
                                if (z14) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = BuildConfig.VERSION_NAME;
                                }
                                sb6.append(str2);
                                b7.a.B(sb6.toString());
                            }
                            i30 = i23;
                            jArr6 = jArrCopyOf;
                            iArr3 = iArrCopyOf;
                            j22 = j17;
                        }
                        j23 = j21;
                        jArr7 = jArr5;
                        iArr4 = iArrCopyOf2;
                        j24 = nVarA.f48946f;
                        if (j24 > 0) {
                            jR5 = f0.R(j22 * 8, 1000000L, j24, RoundingMode.HALF_DOWN);
                            if (jR5 > 0) {
                                y6.o oVarA10 = pVar6.a();
                                oVarA10.f57260h = (int) jR5;
                                nVarA = nVarA.a(new y6.p(oVarA10));
                            }
                        }
                        j25 = nVarA.f48943c;
                        pVar4 = nVarA.f48947g;
                        i33 = nVarA.f48942b;
                        jArr8 = nVarA.f48950j;
                        jArr9 = nVarA.f48949i;
                        RoundingMode roundingMode6 = RoundingMode.DOWN;
                        jR3 = f0.R(j23, 1000000L, j25, roundingMode6);
                        if (jArr9 == null) {
                            f0.Q(jArr6, j25);
                            qVar2 = new q(nVarA, jArr7, iArr3, i30, jArr6, iArr4, jR3);
                        } else {
                            if (jArr9.length == 1) {
                                jArr10 = jArr8;
                                i34 = iJ8;
                                j26 = j23;
                            } else {
                                jArr10 = jArr8;
                                i34 = iJ8;
                                j26 = j23;
                            }
                            i35 = 1;
                            if (jArr9.length != 1) {
                                iArr5 = iArr3;
                                if (i33 == i35) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                iArr6 = new int[jArr9.length];
                                iArr7 = new int[jArr9.length];
                                jArr10.getClass();
                                i36 = 0;
                                i37 = 0;
                                z16 = false;
                                i38 = 0;
                                while (i37 < jArr9.length) {
                                    iArr12 = iArr6;
                                    iArr13 = iArr7;
                                    j29 = jArr10[i37];
                                    if (j29 != -1) {
                                        i44 = i37;
                                        boolean z211 = z16;
                                        long jR111 = f0.R(jArr9[i37], nVarA.f48943c, nVarA.f48944d, RoundingMode.DOWN);
                                        iArr14 = iArr12;
                                        iArr14[i44] = f0.d(jArr6, j29, true);
                                        j30 = j29 + jR111;
                                        iArr13[i44] = f0.a(jArr6, j30, z15);
                                        i45 = iArr14[i44];
                                        while (true) {
                                            i46 = iArr14[i44];
                                            if (i46 < 0) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr14[i44] = i46 - 1;
                                        }
                                        if (i46 < 0) {
                                            iArr14[i44] = i45;
                                            while (true) {
                                                i50 = iArr14[i44];
                                                if (i50 >= iArr13[i44]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr14[i44] = i50 + 1;
                                            }
                                        }
                                        if (i33 == 2) {
                                            while (true) {
                                                i48 = iArr13[i44];
                                                if (i48 < jArr6.length - 1) {
                                                    break;
                                                    break;
                                                }
                                                i49 = i48 + 1;
                                                if (jArr6[i49] <= j30) {
                                                    break;
                                                    break;
                                                }
                                                iArr13[i44] = i49;
                                            }
                                        }
                                        int i715 = iArr13[i44];
                                        i47 = iArr14[i44];
                                        int i812 = (i715 - i47) + i38;
                                        if (i36 != i47) {
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                        }
                                        z21 = z211 | z22;
                                        i36 = i715;
                                        i38 = i812;
                                    } else {
                                        iArr14 = iArr12;
                                        i44 = i37;
                                        z21 = z16;
                                    }
                                    i37 = i44 + 1;
                                    iArr7 = iArr13;
                                    z16 = z21;
                                    iArr6 = iArr14;
                                }
                                iArr8 = iArr6;
                                iArr9 = iArr7;
                                boolean z212 = z16;
                                if (i38 != i34) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                z18 = z212 | z17;
                                if (z18) {
                                    jArr11 = new long[i38];
                                } else {
                                    jArr11 = jArr7;
                                }
                                if (z18) {
                                    iArr10 = new int[i38];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z18) {
                                    i30 = 0;
                                }
                                if (z18) {
                                    iArr11 = new int[i38];
                                } else {
                                    iArr11 = iArr4;
                                }
                                jArr12 = new long[i38];
                                i39 = 0;
                                z19 = false;
                                i40 = 0;
                                i41 = i30;
                                j27 = 0;
                                while (i39 < jArr9.length) {
                                    j28 = jArr10[i39];
                                    i42 = iArr8[i39];
                                    i43 = iArr9[i39];
                                    z20 = z18;
                                    if (z18) {
                                        int i813 = i43 - i42;
                                        System.arraycopy(jArr7, i42, jArr11, i40, i813);
                                        System.arraycopy(iArr5, i42, iArr10, i40, i813);
                                        System.arraycopy(iArr4, i42, iArr11, i40, i813);
                                    }
                                    int i814 = i41;
                                    while (i42 < i43) {
                                        long[] jArr115 = jArr11;
                                        int[] iArr115 = iArr10;
                                        long j315 = nVarA.f48944d;
                                        RoundingMode roundingMode7 = RoundingMode.DOWN;
                                        long jR112 = f0.R(j27, 1000000L, j315, roundingMode7);
                                        jR4 = f0.R(jArr6[i42] - j28, 1000000L, nVarA.f48943c, roundingMode7);
                                        if (jR4 < 0) {
                                            z19 = true;
                                        }
                                        jArr12[i40] = jR112 + jR4;
                                        if (!z20) {
                                        }
                                        i40++;
                                        i42++;
                                        jArr11 = jArr115;
                                        iArr10 = iArr115;
                                    }
                                    j27 += jArr9[i39];
                                    i39++;
                                    i41 = i814;
                                    z18 = z20;
                                    jArr11 = jArr11;
                                    iArr10 = iArr10;
                                }
                                long[] jArr116 = jArr11;
                                int[] iArr116 = iArr10;
                                long jR113 = f0.R(j27, 1000000L, nVarA.f48944d, RoundingMode.DOWN);
                                if (z19) {
                                    y6.o oVarA11 = pVar4.a();
                                    oVarA11.f57270s = true;
                                    nVarA = nVarA.a(new y6.p(oVarA11));
                                }
                                arrayList2 = arrayList2;
                                qVar = new q(nVarA, jArr116, iArr116, i41, jArr12, iArr11, jR113);
                            } else if (jArr9[0] == 0) {
                                jArr10.getClass();
                                j31 = jArr10[0];
                                while (i51 < jArr6.length) {
                                    jArr6[i51] = f0.R(jArr6[i51] - j31, 1000000L, nVarA.f48943c, RoundingMode.DOWN);
                                }
                                q qVar5 = new q(nVarA, jArr7, iArr3, i30, jArr6, iArr4, f0.R(j26 - j31, 1000000L, nVarA.f48943c, RoundingMode.DOWN));
                                arrayList2 = arrayList2;
                                qVar = qVar5;
                            } else {
                                i35 = 1;
                                iArr5 = iArr3;
                                if (i33 == i35) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                iArr6 = new int[jArr9.length];
                                iArr7 = new int[jArr9.length];
                                jArr10.getClass();
                                i36 = 0;
                                i37 = 0;
                                z16 = false;
                                i38 = 0;
                                while (i37 < jArr9.length) {
                                    iArr12 = iArr6;
                                    iArr13 = iArr7;
                                    j29 = jArr10[i37];
                                    if (j29 != -1) {
                                        i44 = i37;
                                        boolean z213 = z16;
                                        long jR114 = f0.R(jArr9[i37], nVarA.f48943c, nVarA.f48944d, RoundingMode.DOWN);
                                        iArr14 = iArr12;
                                        iArr14[i44] = f0.d(jArr6, j29, true);
                                        j30 = j29 + jR114;
                                        iArr13[i44] = f0.a(jArr6, j30, z15);
                                        i45 = iArr14[i44];
                                        while (true) {
                                            i46 = iArr14[i44];
                                            if (i46 < 0) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr14[i44] = i46 - 1;
                                        }
                                        if (i46 < 0) {
                                            iArr14[i44] = i45;
                                            while (true) {
                                                i50 = iArr14[i44];
                                                if (i50 >= iArr13[i44]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr14[i44] = i50 + 1;
                                            }
                                        }
                                        if (i33 == 2) {
                                            while (true) {
                                                i48 = iArr13[i44];
                                                if (i48 < jArr6.length - 1) {
                                                    break;
                                                    break;
                                                }
                                                i49 = i48 + 1;
                                                if (jArr6[i49] <= j30) {
                                                    break;
                                                    break;
                                                }
                                                iArr13[i44] = i49;
                                            }
                                        }
                                        int i716 = iArr13[i44];
                                        i47 = iArr14[i44];
                                        int i815 = (i716 - i47) + i38;
                                        if (i36 != i47) {
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                        }
                                        z21 = z213 | z22;
                                        i36 = i716;
                                        i38 = i815;
                                    } else {
                                        iArr14 = iArr12;
                                        i44 = i37;
                                        z21 = z16;
                                    }
                                    i37 = i44 + 1;
                                    iArr7 = iArr13;
                                    z16 = z21;
                                    iArr6 = iArr14;
                                }
                                iArr8 = iArr6;
                                iArr9 = iArr7;
                                boolean z214 = z16;
                                if (i38 != i34) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                z18 = z214 | z17;
                                if (z18) {
                                    jArr11 = new long[i38];
                                } else {
                                    jArr11 = jArr7;
                                }
                                if (z18) {
                                    iArr10 = new int[i38];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z18) {
                                    i30 = 0;
                                }
                                if (z18) {
                                    iArr11 = new int[i38];
                                } else {
                                    iArr11 = iArr4;
                                }
                                jArr12 = new long[i38];
                                i39 = 0;
                                z19 = false;
                                i40 = 0;
                                i41 = i30;
                                j27 = 0;
                                while (i39 < jArr9.length) {
                                    j28 = jArr10[i39];
                                    i42 = iArr8[i39];
                                    i43 = iArr9[i39];
                                    z20 = z18;
                                    if (z18) {
                                        int i816 = i43 - i42;
                                        System.arraycopy(jArr7, i42, jArr11, i40, i816);
                                        System.arraycopy(iArr5, i42, iArr10, i40, i816);
                                        System.arraycopy(iArr4, i42, iArr11, i40, i816);
                                    }
                                    int i817 = i41;
                                    while (i42 < i43) {
                                        long[] jArr117 = jArr11;
                                        int[] iArr117 = iArr10;
                                        long j316 = nVarA.f48944d;
                                        RoundingMode roundingMode8 = RoundingMode.DOWN;
                                        long jR115 = f0.R(j27, 1000000L, j316, roundingMode8);
                                        jR4 = f0.R(jArr6[i42] - j28, 1000000L, nVarA.f48943c, roundingMode8);
                                        if (jR4 < 0) {
                                            z19 = true;
                                        }
                                        jArr12[i40] = jR115 + jR4;
                                        if (!z20) {
                                        }
                                        i40++;
                                        i42++;
                                        jArr11 = jArr117;
                                        iArr10 = iArr117;
                                    }
                                    j27 += jArr9[i39];
                                    i39++;
                                    i41 = i817;
                                    z18 = z20;
                                    jArr11 = jArr11;
                                    iArr10 = iArr10;
                                }
                                long[] jArr118 = jArr11;
                                int[] iArr118 = iArr10;
                                long jR116 = f0.R(j27, 1000000L, nVarA.f48944d, RoundingMode.DOWN);
                                if (z19) {
                                    y6.o oVarA12 = pVar4.a();
                                    oVarA12.f57270s = true;
                                    nVarA = nVarA.a(new y6.p(oVarA12));
                                }
                                arrayList2 = arrayList2;
                                qVar = new q(nVarA, jArr118, iArr118, i41, jArr12, iArr11, jR116);
                            }
                            arrayList2.add(qVar);
                        }
                        qVar = qVar2;
                    }
                    arrayList2.add(qVar);
                }
            }
            i52 = i18 + 1;
            dVar2 = dVar;
            arrayList2 = arrayList2;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:196:0x035a  */
    /* JADX WARN: Code duplicated, block: B:199:0x035f A[EDGE_INSN: B:199:0x035f->B:202:0x037c BREAK  A[LOOP:4: B:160:0x02eb->B:200:0x036f]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static c0 k(c7.e eVar) {
        boolean z11;
        int i11;
        c0 c0Var;
        c0 c0VarB;
        c0 c0Var2;
        int iX;
        c0 c0Var3;
        boolean z12;
        Object objJ;
        w wVar = eVar.f6650c;
        int i12 = 8;
        wVar.I(8);
        boolean z13 = false;
        c0 c0Var4 = new c0(new b0[0]);
        while (wVar.a() >= i12) {
            int i13 = wVar.f4040b;
            int iJ = wVar.j();
            int iJ2 = wVar.j();
            String str = null;
            if (iJ2 == 1835365473) {
                wVar.I(i13);
                int i14 = i13 + iJ;
                wVar.J(i12);
                a(wVar);
                while (true) {
                    int i15 = wVar.f4040b;
                    if (i15 < i14) {
                        int iJ3 = wVar.j();
                        if (wVar.j() == 1768715124) {
                            wVar.I(i15);
                            int i16 = i15 + iJ3;
                            wVar.J(i12);
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                int i17 = wVar.f4040b;
                                if (i17 >= i16) {
                                    break;
                                }
                                int iJ4 = wVar.j() + i17;
                                int iJ5 = wVar.j();
                                int i18 = (iJ5 >> 24) & 255;
                                if (i18 == 169 || i18 == 253) {
                                    z12 = z13 ? 1 : 0;
                                    int i19 = 16777215 & iJ5;
                                    if (i19 == 6516084) {
                                        int iJ6 = wVar.j();
                                        if (wVar.j() == 1684108385) {
                                            wVar.J(8);
                                            String strS = wVar.s(iJ6 - 16);
                                            objJ = new l8.e("und", strS, strS);
                                        } else {
                                            b7.a.B("Failed to parse comment attribute: " + c7.f.c(iJ5));
                                            objJ = null;
                                        }
                                    } else if (i19 == 7233901 || i19 == 7631467) {
                                        objJ = m.j(iJ5, wVar, "TIT2");
                                    } else if (i19 == 6516589 || i19 == 7828084) {
                                        objJ = m.j(iJ5, wVar, "TCOM");
                                    } else if (i19 == 6578553) {
                                        objJ = m.j(iJ5, wVar, "TDRC");
                                    } else if (i19 == 4280916) {
                                        objJ = m.j(iJ5, wVar, "TPE1");
                                    } else if (i19 == 7630703) {
                                        objJ = m.j(iJ5, wVar, "TSSE");
                                    } else if (i19 == 6384738) {
                                        objJ = m.j(iJ5, wVar, "TALB");
                                    } else if (i19 == 7108978) {
                                        objJ = m.j(iJ5, wVar, "USLT");
                                    } else if (i19 == 6776174) {
                                        objJ = m.j(iJ5, wVar, "TCON");
                                    } else if (i19 == 6779504) {
                                        objJ = m.j(iJ5, wVar, scNRoQgKSYX.Mwrnkv);
                                    } else {
                                        b7.a.n("Skipped unknown metadata entry: " + c7.f.c(iJ5));
                                        wVar.I(iJ4);
                                        objJ = null;
                                    }
                                    wVar.I(iJ4);
                                } else {
                                    if (iJ5 == 1735291493) {
                                        try {
                                            String strA = l8.k.a(m.g(wVar) - 1);
                                            if (strA != null) {
                                                objJ = new l8.o(ImmutableList.u(strA), "TCON", str);
                                            } else {
                                                b7.a.B("Failed to parse standard genre code");
                                                objJ = str;
                                            }
                                        } catch (Throwable th2) {
                                            wVar.I(iJ4);
                                            throw th2;
                                        }
                                    } else if (iJ5 == 1684632427) {
                                        objJ = m.f(iJ5, wVar, "TPOS");
                                    } else if (iJ5 == 1953655662) {
                                        objJ = m.f(iJ5, wVar, "TRCK");
                                    } else if (iJ5 == 1953329263) {
                                        objJ = m.h(iJ5, "TBPM", wVar, true, z13);
                                    } else if (iJ5 == 1668311404) {
                                        objJ = m.h(iJ5, "TCMP", wVar, true, true);
                                    } else if (iJ5 == 1668249202) {
                                        objJ = m.e(wVar);
                                    } else if (iJ5 == 1631670868) {
                                        objJ = m.j(iJ5, wVar, "TPE2");
                                    } else if (iJ5 == 1936682605) {
                                        objJ = m.j(iJ5, wVar, "TSOT");
                                    } else if (iJ5 == 1936679276) {
                                        objJ = m.j(iJ5, wVar, "TSOA");
                                    } else if (iJ5 == 1936679282) {
                                        objJ = m.j(iJ5, wVar, "TSOP");
                                    } else if (iJ5 == 1936679265) {
                                        objJ = m.j(iJ5, wVar, "TSO2");
                                    } else if (iJ5 == 1936679791) {
                                        objJ = m.j(iJ5, wVar, "TSOC");
                                    } else if (iJ5 == 1920233063) {
                                        objJ = m.h(iJ5, "ITUNESADVISORY", wVar, z13, z13);
                                    } else if (iJ5 == 1885823344) {
                                        objJ = m.h(iJ5, "ITUNESGAPLESS", wVar, z13, true);
                                    } else if (iJ5 == 1936683886) {
                                        objJ = m.j(iJ5, wVar, "TVSHOWSORT");
                                    } else if (iJ5 == 1953919848) {
                                        objJ = m.j(iJ5, wVar, "TVSHOW");
                                    } else if (iJ5 == 757935405) {
                                        String strS2 = str;
                                        String strS3 = strS2;
                                        int i21 = -1;
                                        int i22 = -1;
                                        while (true) {
                                            int i23 = wVar.f4040b;
                                            if (i23 >= iJ4) {
                                                break;
                                            }
                                            int iJ7 = wVar.j();
                                            int iJ8 = wVar.j();
                                            wVar.J(4);
                                            boolean z14 = z13;
                                            if (iJ8 == 1835360622) {
                                                strS2 = wVar.s(iJ7 - 12);
                                            } else if (iJ8 == 1851878757) {
                                                strS3 = wVar.s(iJ7 - 12);
                                            } else {
                                                if (iJ8 == 1684108385) {
                                                    i21 = i23;
                                                    i22 = iJ7;
                                                }
                                                wVar.J(iJ7 - 12);
                                            }
                                            z13 = z14 ? 1 : 0;
                                        }
                                        z12 = z13;
                                        if (strS2 == null || strS3 == null || i21 == -1) {
                                            objJ = null;
                                        } else {
                                            wVar.I(i21);
                                            wVar.J(16);
                                            objJ = new l8.l(strS2, strS3, wVar.s(i22 - 16));
                                        }
                                        wVar.I(iJ4);
                                    } else {
                                        z12 = z13 ? 1 : 0;
                                        b7.a.n("Skipped unknown metadata entry: " + c7.f.c(iJ5));
                                        wVar.I(iJ4);
                                        objJ = null;
                                    }
                                    wVar.I(iJ4);
                                    z12 = z13 ? 1 : 0;
                                }
                                if (objJ != null) {
                                    arrayList.add(objJ);
                                }
                                z13 = z12;
                                str = null;
                            }
                            z11 = z13 ? 1 : 0;
                            if (!arrayList.isEmpty()) {
                                c0Var3 = new c0(arrayList);
                                break;
                            }
                            break;
                        }
                        Object[] objArr = z13 ? 1 : 0;
                        wVar.I(i15 + iJ3);
                        z13 = objArr == true ? 1 : 0;
                        i12 = 8;
                        str = null;
                    } else {
                        z11 = z13 ? 1 : 0;
                    }
                    c0Var3 = null;
                    break;
                }
                c0Var4 = c0Var4.b(c0Var3);
                i11 = 8;
            } else {
                z11 = z13 ? 1 : 0;
                if (iJ2 == 1936553057) {
                    wVar.I(i13);
                    int i24 = i13 + iJ;
                    wVar.J(12);
                    while (true) {
                        int i25 = wVar.f4040b;
                        if (i25 < i24) {
                            int iJ9 = wVar.j();
                            if (wVar.j() == 1935766900) {
                                if (iJ9 >= 16) {
                                    wVar.J(4);
                                    int i26 = -1;
                                    int i27 = z11 ? 1 : 0;
                                    int i28 = i27;
                                    while (i27 < 2) {
                                        int iW = wVar.w();
                                        int iW2 = wVar.w();
                                        if (iW == 0) {
                                            i26 = iW2;
                                        } else if (iW == 1) {
                                            i28 = iW2;
                                        }
                                        i27++;
                                    }
                                    if (i26 != 12) {
                                        if (i26 != 13) {
                                            if (i26 != 21) {
                                                iX = -2147483647;
                                            } else {
                                                i11 = 8;
                                                if (wVar.a() < 8 || wVar.f4040b + 8 > i24) {
                                                    iX = -2147483647;
                                                } else {
                                                    int iJ10 = wVar.j();
                                                    int iJ11 = wVar.j();
                                                    if (iJ10 < 12 || iJ11 != 1936877170) {
                                                        iX = -2147483647;
                                                    } else {
                                                        iX = wVar.x();
                                                    }
                                                }
                                            }
                                            if (iX == -2147483647) {
                                                m8.d dVar = new m8.d(i28 == true ? 1 : 0, iX);
                                                b0[] b0VarArr = new b0[1];
                                                b0VarArr[z11 ? 1 : 0] = dVar;
                                                c0Var2 = new c0(b0VarArr);
                                                break;
                                            }
                                            break;
                                        }
                                        iX = 120;
                                    } else {
                                        iX = 240;
                                    }
                                    i11 = 8;
                                    if (iX == -2147483647) {
                                        m8.d dVar2 = new m8.d(i28 == true ? 1 : 0, iX);
                                        b0[] b0VarArr2 = new b0[1];
                                        b0VarArr2[z11 ? 1 : 0] = dVar2;
                                        c0Var2 = new c0(b0VarArr2);
                                        break;
                                    }
                                    break;
                                }
                                c0Var2 = null;
                                i11 = 8;
                                break;
                            }
                            wVar.I(i25 + iJ9);
                        } else {
                            i11 = 8;
                        }
                        c0Var2 = null;
                        break;
                    }
                    c0VarB = c0Var4.b(c0Var2);
                } else {
                    i11 = 8;
                    if (iJ2 == -1451722374) {
                        short sT = wVar.t();
                        wVar.J(2);
                        String strU = wVar.u(sT, StandardCharsets.UTF_8);
                        int iMax = Math.max(strU.lastIndexOf(43), strU.lastIndexOf(45));
                        try {
                            try {
                                c7.g gVar = new c7.g(Float.parseFloat(strU.substring(z11 ? 1 : 0, iMax)), Float.parseFloat(strU.substring(iMax, strU.length() - 1)));
                                b0[] b0VarArr3 = new b0[1];
                                z11 = false;
                                z11 = false;
                                try {
                                    b0VarArr3[0] = gVar;
                                    c0Var = new c0(b0VarArr3);
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    c0Var = null;
                                }
                            } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                                z11 = false;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                            z11 = z11 ? 1 : 0;
                        }
                        c0VarB = c0Var4.b(c0Var);
                    }
                }
                c0Var4 = c0VarB;
            }
            wVar.I(i13 + iJ);
            i12 = i11;
            z13 = z11;
        }
        return c0Var4;
    }
}

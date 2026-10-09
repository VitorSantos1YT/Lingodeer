package ue;

import a0.c2;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import androidx.compose.material.ripple.RippleContainer;
import bt.d7;
import bt.v5;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.facebook.FacebookException;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.characterstroke.CharacterStroke;
import com.yalantis.ucrop.view.CropImageView;
import d0.s1;
import f0.t0;
import fr.p3;
import j0.t1;
import j0.v1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kotlin.jvm.internal.c0;
import l1.b1;
import l1.k1;
import l1.x1;
import l2.h0;
import lf.y0;
import ot.f2;
import re.d0;
import tg.i0;
import tg.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f52925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l2.e f52926b;

    public static void A(AtomicLong atomicLong, long j11) {
        long j12;
        long j13;
        do {
            j12 = atomicLong.get();
            if (j12 == Long.MAX_VALUE) {
                return;
            }
            j13 = j12 - j11;
            if (j13 < 0) {
                qx.b.B(new IllegalStateException(defpackage.e.h(j13, "More produced than requested: ")));
                j13 = 0;
            }
        } while (!atomicLong.compareAndSet(j12, j13));
    }

    public static void B(HashMap map) {
        SharedPreferences sharedPreferences = re.s.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        y yVar = y.DATASETID;
        Object obj = map.get(yVar.a());
        y yVar2 = y.URL;
        Object obj2 = map.get(yVar2.a());
        y yVar3 = y.ACCESSKEY;
        Object obj3 = map.get(yVar3.a());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(yVar.a(), obj.toString());
        editorEdit.putString(yVar2.a(), obj2.toString());
        editorEdit.putString(yVar3.a(), obj3.toString());
        editorEdit.apply();
        p3 p3Var = y0.f40132d;
        p3.s(d0.APP_EVENTS, "ue.f".toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }

    public static final CourseCharacter C(CharacterStroke characterStroke, bh.v vVar, CharacterStroke characterStroke2) {
        CharacterStroke characterStrokeCopy$default;
        kotlin.jvm.internal.m.f(characterStroke, "<this>");
        if (vVar == null || characterStroke2 == null) {
            characterStrokeCopy$default = characterStroke;
        } else {
            characterStrokeCopy$default = CharacterStroke.copy$default(characterStroke, 0L, vVar.f4400b, null, null, null, characterStroke2.getStrokeData(), 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554397, null);
        }
        CourseCharacter courseCharacterB = xt.d.B(characterStrokeCopy$default);
        qy.q qVar = fv.b.f28186a;
        return courseCharacterB.copy((7124 & 1) != 0 ? courseCharacterB.characterId : 0L, (7124 & 2) != 0 ? courseCharacterB.character : null, (7124 & 4) != 0 ? courseCharacterB.charPath : null, (7124 & 8) != 0 ? courseCharacterB.zhuYin : null, (7124 & 16) != 0 ? courseCharacterB.animation : 0, (7124 & 32) != 0 ? courseCharacterB.translation : null, (7124 & 64) != 0 ? courseCharacterB.tipsAnimation : null, (7124 & 128) != 0 ? courseCharacterB.partStrings : null, (7124 & 256) != 0 ? courseCharacterB.polygonStrings : null, (7124 & 512) != 0 ? courseCharacterB.drillJson : null, (7124 & 1024) != 0 ? courseCharacterB.audioUri : Uri.parse(fv.b.l0(courseCharacterB.getZhuYin())), (7124 & 2048) != 0 ? courseCharacterB.animationUri : null, (7124 & 4096) != 0 ? courseCharacterB.options : null);
    }

    public static final bh.v D(CharacterStroke characterStroke, int i11) {
        Long lU0;
        if (i11 == 1) {
            List listW0 = oz.q.W0(characterStroke.getPinyin(), new String[]{"_"}, 2, 2);
            String str = (String) ry.m.t0(0, listW0);
            if (str != null && (lU0 = oz.x.u0(str)) != null) {
                long jLongValue = lU0.longValue();
                String str2 = (String) ry.m.t0(1, listW0);
                if (str2 != null) {
                    if (str2.length() <= 0 || str2.equals(characterStroke.getCharacter())) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        return new bh.v(jLongValue, str2);
                    }
                }
            }
        }
        return null;
    }

    public static void E(String identifier) {
        boolean zContains;
        kotlin.jvm.internal.m.f(identifier, "identifier");
        if (identifier.length() == 0 || identifier.length() > 40) {
            throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{identifier, 40}, 2)));
        }
        HashSet hashSet = se.f.f51591f;
        synchronized (hashSet) {
            zContains = hashSet.contains(identifier);
        }
        if (zContains) {
            return;
        }
        Pattern patternCompile = Pattern.compile("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$");
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        if (!patternCompile.matcher(identifier).matches()) {
            throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{identifier}, 1)));
        }
        synchronized (hashSet) {
            hashSet.add(identifier);
        }
    }

    public static Object F(fz.e eVar, Object obj, vy.d dVar) {
        kotlin.jvm.internal.m.f(eVar, "<this>");
        vy.i context = dVar.getContext();
        Object dVar2 = context == vy.j.f54321a ? new wy.d(dVar) : new wy.e(dVar, context);
        c0.d(2, eVar);
        return eVar.invoke(obj, dVar2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x010c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0116  */
    /* JADX WARN: Code duplicated, block: B:105:0x0119  */
    /* JADX WARN: Code duplicated, block: B:107:0x011e  */
    /* JADX WARN: Code duplicated, block: B:110:0x012e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0131  */
    /* JADX WARN: Code duplicated, block: B:114:0x013a  */
    /* JADX WARN: Code duplicated, block: B:116:0x014a  */
    /* JADX WARN: Code duplicated, block: B:133:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x017d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0180  */
    /* JADX WARN: Code duplicated, block: B:138:0x0186  */
    /* JADX WARN: Code duplicated, block: B:139:0x0191  */
    /* JADX WARN: Code duplicated, block: B:141:0x0196  */
    /* JADX WARN: Code duplicated, block: B:142:0x019d  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01be  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:162:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:164:0x023c  */
    /* JADX WARN: Code duplicated, block: B:167:0x024f  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:99:0x0104  */
    public static final void a(z1.r rVar, l0.w wVar, t1 t1Var, j0.h hVar, z1.d dVar, t0 t0Var, boolean z11, d0.i iVar, fz.c cVar, l1.n nVar, int i11, int i12) {
        int i13;
        l0.w wVarA;
        t1 t1Var2;
        int i14;
        j0.h hVar2;
        int i15;
        z1.d dVar2;
        int i16;
        t0 t0Var2;
        int i17;
        boolean z12;
        int i18;
        d0.i iVar2;
        boolean z13;
        l1.s sVar;
        z1.r rVar2;
        l0.w wVar2;
        t1 t1Var3;
        j0.h hVar3;
        z1.d dVar3;
        t0 t0Var3;
        boolean z14;
        x1 x1VarT;
        z1.r rVar3;
        int i19;
        t1 v1Var;
        d0.i iVarA;
        z1.d dVar4;
        t0 t0Var4;
        boolean z15;
        z1.r rVar4;
        b0.x xVarA;
        boolean zF;
        Object objQ;
        int i21;
        int i22;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(53695811);
        int i23 = i12 & 1;
        if (i23 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar2.f(rVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                wVarA = wVar;
                int i24 = sVar2.f(wVarA) ? 32 : 16;
                i13 |= i24;
            } else {
                wVarA = wVar;
            }
            i13 |= i24;
        } else {
            wVarA = wVar;
        }
        int i25 = i12 & 4;
        if (i25 == 0) {
            if ((i11 & 384) == 0) {
                t1Var2 = t1Var;
                i13 |= sVar2.f(t1Var2) ? 256 : 128;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if (sVar2.g(false)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    hVar2 = hVar;
                    if (sVar2.f(hVar2)) {
                        i22 = 16384;
                    }
                    i13 |= i22;
                } else {
                    hVar2 = hVar;
                }
                i22 = OSSConstants.DEFAULT_BUFFER_SIZE;
                i13 |= i22;
            } else {
                hVar2 = hVar;
            }
            i15 = i12 & 32;
            if (i15 != 0) {
                if ((196608 & i11) == 0) {
                    dVar2 = dVar;
                    if (sVar2.f(dVar2)) {
                        i16 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i16 = 65536;
                    }
                    i13 |= i16;
                }
                if ((1572864 & i11) == 0) {
                    if ((i12 & 64) == 0) {
                        t0Var2 = t0Var;
                        int i26 = sVar2.f(t0Var2) ? 1048576 : 524288;
                        i13 |= i26;
                    } else {
                        t0Var2 = t0Var;
                    }
                    i13 |= i26;
                } else {
                    t0Var2 = t0Var;
                }
                i17 = i12 & 128;
                if (i17 != 0) {
                    if ((12582912 & i11) == 0) {
                        z12 = z11;
                        if (sVar2.g(z12)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i13 |= i18;
                    }
                    if ((i11 & 100663296) == 0) {
                        if ((i12 & 256) == 0) {
                            iVar2 = iVar;
                            int i27 = sVar2.f(iVar2) ? 67108864 : 33554432;
                            i13 |= i27;
                        } else {
                            iVar2 = iVar;
                        }
                        i13 |= i27;
                    } else {
                        iVar2 = iVar;
                    }
                    if ((i11 & 805306368) != 0) {
                        if (sVar2.h(cVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (sVar2.T(i13 & 1, z13)) {
                        sVar2.Y();
                        if ((i11 & 1) != 0 || sVar2.C()) {
                            if (i23 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i12 & 2) != 0) {
                                i19 = 0;
                                wVarA = l0.y.a(0, sVar2, 3);
                                i13 &= -113;
                            } else {
                                i19 = 0;
                            }
                            if (i25 != 0) {
                                float f5 = i19;
                                v1Var = new v1(f5, f5, f5, f5);
                            } else {
                                v1Var = t1Var2;
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                hVar2 = j0.i.f35305c;
                            }
                            if (i15 != 0) {
                                dVar2 = z1.c.O;
                            }
                            if ((i12 & 64) != 0) {
                                xVarA = c2.a(sVar2);
                                zF = sVar2.f(xVarA);
                                objQ = sVar2.Q();
                                if (zF || objQ == l1.m.f39353a) {
                                    objQ = new f0.l(xVarA);
                                    sVar2.o0(objQ);
                                }
                                i13 &= -3670017;
                                t0Var2 = (f0.l) objQ;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 256) != 0) {
                                i13 &= -234881025;
                                iVarA = s1.a(sVar2);
                            } else {
                                iVarA = iVar2;
                            }
                            dVar4 = dVar2;
                            t0Var4 = t0Var2;
                            z15 = z12;
                            rVar4 = rVar3;
                        } else {
                            sVar2.W();
                            if ((i12 & 2) != 0) {
                                i13 &= -113;
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                            }
                            if ((i12 & 256) != 0) {
                                i13 &= -234881025;
                            }
                            v1Var = t1Var2;
                            hVar2 = hVar2;
                            iVarA = iVar2;
                            dVar4 = dVar2;
                            t0Var4 = t0Var2;
                            z15 = z12;
                            rVar4 = rVar;
                        }
                        l0.w wVar3 = wVarA;
                        sVar2.q();
                        int i28 = i13 >> 3;
                        sVar = sVar2;
                        v10.c.a(rVar4, wVar3, v1Var, true, t0Var4, z15, iVarA, dVar4, hVar2, null, null, cVar, sVar, (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (458752 & i28) | (3670016 & i28) | (i28 & 29360128) | ((i13 << 12) & 1879048192), ((i13 >> 12) & 14) | ((i13 >> 18) & 7168), 6400);
                        rVar2 = rVar4;
                        wVar2 = wVar3;
                        t1Var3 = v1Var;
                        t0Var3 = t0Var4;
                        z14 = z15;
                        iVar2 = iVarA;
                        dVar3 = dVar4;
                        hVar3 = hVar2;
                    } else {
                        sVar = sVar2;
                        sVar.W();
                        rVar2 = rVar;
                        wVar2 = wVarA;
                        t1Var3 = t1Var2;
                        hVar3 = hVar2;
                        dVar3 = dVar2;
                        t0Var3 = t0Var2;
                        z14 = z12;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new l0.b(rVar2, wVar2, t1Var3, hVar3, dVar3, t0Var3, z14, iVar2, cVar, i11, i12);
                    }
                }
                i13 |= 12582912;
                z12 = z11;
                if ((i11 & 100663296) == 0) {
                    if ((i12 & 256) == 0) {
                        iVar2 = iVar;
                        if (sVar2.f(iVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        iVar2 = iVar;
                    }
                    i13 |= i27;
                } else {
                    iVar2 = iVar;
                }
                if ((i11 & 805306368) != 0) {
                    if (sVar2.h(cVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i13 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar2.T(i13 & 1, z13)) {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i23 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i12 & 2) != 0) {
                            i19 = 0;
                            wVarA = l0.y.a(0, sVar2, 3);
                            i13 &= -113;
                        } else {
                            i19 = 0;
                        }
                        if (i25 != 0) {
                            float f11 = i19;
                            v1Var = new v1(f11, f11, f11, f11);
                        } else {
                            v1Var = t1Var2;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            hVar2 = j0.i.f35305c;
                        }
                        if (i15 != 0) {
                            dVar2 = z1.c.O;
                        }
                        if ((i12 & 64) != 0) {
                            xVarA = c2.a(sVar2);
                            zF = sVar2.f(xVarA);
                            objQ = sVar2.Q();
                            if (zF) {
                                objQ = new f0.l(xVarA);
                                sVar2.o0(objQ);
                            } else {
                                objQ = new f0.l(xVarA);
                                sVar2.o0(objQ);
                            }
                            i13 &= -3670017;
                            t0Var2 = (f0.l) objQ;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 256) != 0) {
                            i13 &= -234881025;
                            iVarA = s1.a(sVar2);
                        } else {
                            iVarA = iVar2;
                        }
                        dVar4 = dVar2;
                        t0Var4 = t0Var2;
                        z15 = z12;
                        rVar4 = rVar3;
                    } else {
                        if (i23 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i12 & 2) != 0) {
                            i19 = 0;
                            wVarA = l0.y.a(0, sVar2, 3);
                            i13 &= -113;
                        } else {
                            i19 = 0;
                        }
                        if (i25 != 0) {
                            float f12 = i19;
                            v1Var = new v1(f12, f12, f12, f12);
                        } else {
                            v1Var = t1Var2;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            hVar2 = j0.i.f35305c;
                        }
                        if (i15 != 0) {
                            dVar2 = z1.c.O;
                        }
                        if ((i12 & 64) != 0) {
                            xVarA = c2.a(sVar2);
                            zF = sVar2.f(xVarA);
                            objQ = sVar2.Q();
                            if (zF) {
                                objQ = new f0.l(xVarA);
                                sVar2.o0(objQ);
                            } else {
                                objQ = new f0.l(xVarA);
                                sVar2.o0(objQ);
                            }
                            i13 &= -3670017;
                            t0Var2 = (f0.l) objQ;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 256) != 0) {
                            i13 &= -234881025;
                            iVarA = s1.a(sVar2);
                        } else {
                            iVarA = iVar2;
                        }
                        dVar4 = dVar2;
                        t0Var4 = t0Var2;
                        z15 = z12;
                        rVar4 = rVar3;
                    }
                    l0.w wVar4 = wVarA;
                    sVar2.q();
                    int i29 = i13 >> 3;
                    sVar = sVar2;
                    v10.c.a(rVar4, wVar4, v1Var, true, t0Var4, z15, iVarA, dVar4, hVar2, null, null, cVar, sVar, (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (458752 & i29) | (3670016 & i29) | (i29 & 29360128) | ((i13 << 12) & 1879048192), ((i13 >> 12) & 14) | ((i13 >> 18) & 7168), 6400);
                    rVar2 = rVar4;
                    wVar2 = wVar4;
                    t1Var3 = v1Var;
                    t0Var3 = t0Var4;
                    z14 = z15;
                    iVar2 = iVarA;
                    dVar3 = dVar4;
                    hVar3 = hVar2;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    rVar2 = rVar;
                    wVar2 = wVarA;
                    t1Var3 = t1Var2;
                    hVar3 = hVar2;
                    dVar3 = dVar2;
                    t0Var3 = t0Var2;
                    z14 = z12;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new l0.b(rVar2, wVar2, t1Var3, hVar3, dVar3, t0Var3, z14, iVar2, cVar, i11, i12);
                }
            }
            i13 |= 196608;
            dVar2 = dVar;
            if ((1572864 & i11) == 0) {
                if ((i12 & 64) == 0) {
                    t0Var2 = t0Var;
                    if (sVar2.f(t0Var2)) {
                    }
                    i13 |= i26;
                } else {
                    t0Var2 = t0Var;
                }
                i13 |= i26;
            } else {
                t0Var2 = t0Var;
            }
            i17 = i12 & 128;
            if (i17 != 0) {
                if ((12582912 & i11) == 0) {
                    z12 = z11;
                    if (sVar2.g(z12)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i13 |= i18;
                }
                if ((i11 & 100663296) == 0) {
                    if ((i12 & 256) == 0) {
                        iVar2 = iVar;
                        if (sVar2.f(iVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        iVar2 = iVar;
                    }
                    i13 |= i27;
                } else {
                    iVar2 = iVar;
                }
                if ((i11 & 805306368) != 0) {
                    if (sVar2.h(cVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i13 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar2.T(i13 & 1, z13)) {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i23 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i12 & 2) != 0) {
                            i19 = 0;
                            wVarA = l0.y.a(0, sVar2, 3);
                            i13 &= -113;
                        } else {
                            i19 = 0;
                        }
                        if (i25 != 0) {
                            float f13 = i19;
                            v1Var = new v1(f13, f13, f13, f13);
                        } else {
                            v1Var = t1Var2;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            hVar2 = j0.i.f35305c;
                        }
                        if (i15 != 0) {
                            dVar2 = z1.c.O;
                        }
                        if ((i12 & 64) != 0) {
                            xVarA = c2.a(sVar2);
                            zF = sVar2.f(xVarA);
                            objQ = sVar2.Q();
                            if (zF) {
                                objQ = new f0.l(xVarA);
                                sVar2.o0(objQ);
                            } else {
                                objQ = new f0.l(xVarA);
                                sVar2.o0(objQ);
                            }
                            i13 &= -3670017;
                            t0Var2 = (f0.l) objQ;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 256) != 0) {
                            i13 &= -234881025;
                            iVarA = s1.a(sVar2);
                        } else {
                            iVarA = iVar2;
                        }
                        dVar4 = dVar2;
                        t0Var4 = t0Var2;
                        z15 = z12;
                        rVar4 = rVar3;
                    } else {
                        if (i23 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i12 & 2) != 0) {
                            i19 = 0;
                            wVarA = l0.y.a(0, sVar2, 3);
                            i13 &= -113;
                        } else {
                            i19 = 0;
                        }
                        if (i25 != 0) {
                            float f14 = i19;
                            v1Var = new v1(f14, f14, f14, f14);
                        } else {
                            v1Var = t1Var2;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            hVar2 = j0.i.f35305c;
                        }
                        if (i15 != 0) {
                            dVar2 = z1.c.O;
                        }
                        if ((i12 & 64) != 0) {
                            xVarA = c2.a(sVar2);
                            zF = sVar2.f(xVarA);
                            objQ = sVar2.Q();
                            if (zF) {
                                objQ = new f0.l(xVarA);
                                sVar2.o0(objQ);
                            } else {
                                objQ = new f0.l(xVarA);
                                sVar2.o0(objQ);
                            }
                            i13 &= -3670017;
                            t0Var2 = (f0.l) objQ;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 256) != 0) {
                            i13 &= -234881025;
                            iVarA = s1.a(sVar2);
                        } else {
                            iVarA = iVar2;
                        }
                        dVar4 = dVar2;
                        t0Var4 = t0Var2;
                        z15 = z12;
                        rVar4 = rVar3;
                    }
                    l0.w wVar5 = wVarA;
                    sVar2.q();
                    int i210 = i13 >> 3;
                    sVar = sVar2;
                    v10.c.a(rVar4, wVar5, v1Var, true, t0Var4, z15, iVarA, dVar4, hVar2, null, null, cVar, sVar, (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (458752 & i210) | (3670016 & i210) | (i210 & 29360128) | ((i13 << 12) & 1879048192), ((i13 >> 12) & 14) | ((i13 >> 18) & 7168), 6400);
                    rVar2 = rVar4;
                    wVar2 = wVar5;
                    t1Var3 = v1Var;
                    t0Var3 = t0Var4;
                    z14 = z15;
                    iVar2 = iVarA;
                    dVar3 = dVar4;
                    hVar3 = hVar2;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    rVar2 = rVar;
                    wVar2 = wVarA;
                    t1Var3 = t1Var2;
                    hVar3 = hVar2;
                    dVar3 = dVar2;
                    t0Var3 = t0Var2;
                    z14 = z12;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new l0.b(rVar2, wVar2, t1Var3, hVar3, dVar3, t0Var3, z14, iVar2, cVar, i11, i12);
                }
            }
            i13 |= 12582912;
            z12 = z11;
            if ((i11 & 100663296) == 0) {
                if ((i12 & 256) == 0) {
                    iVar2 = iVar;
                    if (sVar2.f(iVar2)) {
                    }
                    i13 |= i27;
                } else {
                    iVar2 = iVar;
                }
                i13 |= i27;
            } else {
                iVar2 = iVar;
            }
            if ((i11 & 805306368) != 0) {
                if (sVar2.h(cVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            if ((i13 & 306783379) != 306783378) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar2.T(i13 & 1, z13)) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i23 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i12 & 2) != 0) {
                        i19 = 0;
                        wVarA = l0.y.a(0, sVar2, 3);
                        i13 &= -113;
                    } else {
                        i19 = 0;
                    }
                    if (i25 != 0) {
                        float f15 = i19;
                        v1Var = new v1(f15, f15, f15, f15);
                    } else {
                        v1Var = t1Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        hVar2 = j0.i.f35305c;
                    }
                    if (i15 != 0) {
                        dVar2 = z1.c.O;
                    }
                    if ((i12 & 64) != 0) {
                        xVarA = c2.a(sVar2);
                        zF = sVar2.f(xVarA);
                        objQ = sVar2.Q();
                        if (zF) {
                            objQ = new f0.l(xVarA);
                            sVar2.o0(objQ);
                        } else {
                            objQ = new f0.l(xVarA);
                            sVar2.o0(objQ);
                        }
                        i13 &= -3670017;
                        t0Var2 = (f0.l) objQ;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 256) != 0) {
                        i13 &= -234881025;
                        iVarA = s1.a(sVar2);
                    } else {
                        iVarA = iVar2;
                    }
                    dVar4 = dVar2;
                    t0Var4 = t0Var2;
                    z15 = z12;
                    rVar4 = rVar3;
                } else {
                    if (i23 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i12 & 2) != 0) {
                        i19 = 0;
                        wVarA = l0.y.a(0, sVar2, 3);
                        i13 &= -113;
                    } else {
                        i19 = 0;
                    }
                    if (i25 != 0) {
                        float f16 = i19;
                        v1Var = new v1(f16, f16, f16, f16);
                    } else {
                        v1Var = t1Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        hVar2 = j0.i.f35305c;
                    }
                    if (i15 != 0) {
                        dVar2 = z1.c.O;
                    }
                    if ((i12 & 64) != 0) {
                        xVarA = c2.a(sVar2);
                        zF = sVar2.f(xVarA);
                        objQ = sVar2.Q();
                        if (zF) {
                            objQ = new f0.l(xVarA);
                            sVar2.o0(objQ);
                        } else {
                            objQ = new f0.l(xVarA);
                            sVar2.o0(objQ);
                        }
                        i13 &= -3670017;
                        t0Var2 = (f0.l) objQ;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 256) != 0) {
                        i13 &= -234881025;
                        iVarA = s1.a(sVar2);
                    } else {
                        iVarA = iVar2;
                    }
                    dVar4 = dVar2;
                    t0Var4 = t0Var2;
                    z15 = z12;
                    rVar4 = rVar3;
                }
                l0.w wVar6 = wVarA;
                sVar2.q();
                int i211 = i13 >> 3;
                sVar = sVar2;
                v10.c.a(rVar4, wVar6, v1Var, true, t0Var4, z15, iVarA, dVar4, hVar2, null, null, cVar, sVar, (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (458752 & i211) | (3670016 & i211) | (i211 & 29360128) | ((i13 << 12) & 1879048192), ((i13 >> 12) & 14) | ((i13 >> 18) & 7168), 6400);
                rVar2 = rVar4;
                wVar2 = wVar6;
                t1Var3 = v1Var;
                t0Var3 = t0Var4;
                z14 = z15;
                iVar2 = iVarA;
                dVar3 = dVar4;
                hVar3 = hVar2;
            } else {
                sVar = sVar2;
                sVar.W();
                rVar2 = rVar;
                wVar2 = wVarA;
                t1Var3 = t1Var2;
                hVar3 = hVar2;
                dVar3 = dVar2;
                t0Var3 = t0Var2;
                z14 = z12;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new l0.b(rVar2, wVar2, t1Var3, hVar3, dVar3, t0Var3, z14, iVar2, cVar, i11, i12);
            }
        }
        i13 |= 384;
        t1Var2 = t1Var;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if (sVar2.g(false)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                hVar2 = hVar;
                if (sVar2.f(hVar2)) {
                    i22 = 16384;
                }
                i13 |= i22;
            } else {
                hVar2 = hVar;
            }
            i22 = OSSConstants.DEFAULT_BUFFER_SIZE;
            i13 |= i22;
        } else {
            hVar2 = hVar;
        }
        i15 = i12 & 32;
        if (i15 != 0) {
            if ((196608 & i11) == 0) {
                dVar2 = dVar;
                if (sVar2.f(dVar2)) {
                    i16 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i16 = 65536;
                }
                i13 |= i16;
            }
            if ((1572864 & i11) == 0) {
                if ((i12 & 64) == 0) {
                    t0Var2 = t0Var;
                    if (sVar2.f(t0Var2)) {
                    }
                    i13 |= i26;
                } else {
                    t0Var2 = t0Var;
                }
                i13 |= i26;
            } else {
                t0Var2 = t0Var;
            }
            i17 = i12 & 128;
            if (i17 != 0) {
                if ((12582912 & i11) == 0) {
                    z12 = z11;
                    if (sVar2.g(z12)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i13 |= i18;
                }
                if ((i11 & 100663296) == 0) {
                    if ((i12 & 256) == 0) {
                        iVar2 = iVar;
                        if (sVar2.f(iVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        iVar2 = iVar;
                    }
                    i13 |= i27;
                } else {
                    iVar2 = iVar;
                }
                if ((i11 & 805306368) != 0) {
                    if (sVar2.h(cVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i13 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar2.T(i13 & 1, z13)) {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i23 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i12 & 2) != 0) {
                            i19 = 0;
                            wVarA = l0.y.a(0, sVar2, 3);
                            i13 &= -113;
                        } else {
                            i19 = 0;
                        }
                        if (i25 != 0) {
                            float f17 = i19;
                            v1Var = new v1(f17, f17, f17, f17);
                        } else {
                            v1Var = t1Var2;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            hVar2 = j0.i.f35305c;
                        }
                        if (i15 != 0) {
                            dVar2 = z1.c.O;
                        }
                        if ((i12 & 64) != 0) {
                            xVarA = c2.a(sVar2);
                            zF = sVar2.f(xVarA);
                            objQ = sVar2.Q();
                            if (zF) {
                                objQ = new f0.l(xVarA);
                                sVar2.o0(objQ);
                            } else {
                                objQ = new f0.l(xVarA);
                                sVar2.o0(objQ);
                            }
                            i13 &= -3670017;
                            t0Var2 = (f0.l) objQ;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 256) != 0) {
                            i13 &= -234881025;
                            iVarA = s1.a(sVar2);
                        } else {
                            iVarA = iVar2;
                        }
                        dVar4 = dVar2;
                        t0Var4 = t0Var2;
                        z15 = z12;
                        rVar4 = rVar3;
                    } else {
                        if (i23 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i12 & 2) != 0) {
                            i19 = 0;
                            wVarA = l0.y.a(0, sVar2, 3);
                            i13 &= -113;
                        } else {
                            i19 = 0;
                        }
                        if (i25 != 0) {
                            float f18 = i19;
                            v1Var = new v1(f18, f18, f18, f18);
                        } else {
                            v1Var = t1Var2;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            hVar2 = j0.i.f35305c;
                        }
                        if (i15 != 0) {
                            dVar2 = z1.c.O;
                        }
                        if ((i12 & 64) != 0) {
                            xVarA = c2.a(sVar2);
                            zF = sVar2.f(xVarA);
                            objQ = sVar2.Q();
                            if (zF) {
                                objQ = new f0.l(xVarA);
                                sVar2.o0(objQ);
                            } else {
                                objQ = new f0.l(xVarA);
                                sVar2.o0(objQ);
                            }
                            i13 &= -3670017;
                            t0Var2 = (f0.l) objQ;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 256) != 0) {
                            i13 &= -234881025;
                            iVarA = s1.a(sVar2);
                        } else {
                            iVarA = iVar2;
                        }
                        dVar4 = dVar2;
                        t0Var4 = t0Var2;
                        z15 = z12;
                        rVar4 = rVar3;
                    }
                    l0.w wVar7 = wVarA;
                    sVar2.q();
                    int i212 = i13 >> 3;
                    sVar = sVar2;
                    v10.c.a(rVar4, wVar7, v1Var, true, t0Var4, z15, iVarA, dVar4, hVar2, null, null, cVar, sVar, (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (458752 & i212) | (3670016 & i212) | (i212 & 29360128) | ((i13 << 12) & 1879048192), ((i13 >> 12) & 14) | ((i13 >> 18) & 7168), 6400);
                    rVar2 = rVar4;
                    wVar2 = wVar7;
                    t1Var3 = v1Var;
                    t0Var3 = t0Var4;
                    z14 = z15;
                    iVar2 = iVarA;
                    dVar3 = dVar4;
                    hVar3 = hVar2;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    rVar2 = rVar;
                    wVar2 = wVarA;
                    t1Var3 = t1Var2;
                    hVar3 = hVar2;
                    dVar3 = dVar2;
                    t0Var3 = t0Var2;
                    z14 = z12;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new l0.b(rVar2, wVar2, t1Var3, hVar3, dVar3, t0Var3, z14, iVar2, cVar, i11, i12);
                }
            }
            i13 |= 12582912;
            z12 = z11;
            if ((i11 & 100663296) == 0) {
                if ((i12 & 256) == 0) {
                    iVar2 = iVar;
                    if (sVar2.f(iVar2)) {
                    }
                    i13 |= i27;
                } else {
                    iVar2 = iVar;
                }
                i13 |= i27;
            } else {
                iVar2 = iVar;
            }
            if ((i11 & 805306368) != 0) {
                if (sVar2.h(cVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            if ((i13 & 306783379) != 306783378) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar2.T(i13 & 1, z13)) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i23 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i12 & 2) != 0) {
                        i19 = 0;
                        wVarA = l0.y.a(0, sVar2, 3);
                        i13 &= -113;
                    } else {
                        i19 = 0;
                    }
                    if (i25 != 0) {
                        float f19 = i19;
                        v1Var = new v1(f19, f19, f19, f19);
                    } else {
                        v1Var = t1Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        hVar2 = j0.i.f35305c;
                    }
                    if (i15 != 0) {
                        dVar2 = z1.c.O;
                    }
                    if ((i12 & 64) != 0) {
                        xVarA = c2.a(sVar2);
                        zF = sVar2.f(xVarA);
                        objQ = sVar2.Q();
                        if (zF) {
                            objQ = new f0.l(xVarA);
                            sVar2.o0(objQ);
                        } else {
                            objQ = new f0.l(xVarA);
                            sVar2.o0(objQ);
                        }
                        i13 &= -3670017;
                        t0Var2 = (f0.l) objQ;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 256) != 0) {
                        i13 &= -234881025;
                        iVarA = s1.a(sVar2);
                    } else {
                        iVarA = iVar2;
                    }
                    dVar4 = dVar2;
                    t0Var4 = t0Var2;
                    z15 = z12;
                    rVar4 = rVar3;
                } else {
                    if (i23 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i12 & 2) != 0) {
                        i19 = 0;
                        wVarA = l0.y.a(0, sVar2, 3);
                        i13 &= -113;
                    } else {
                        i19 = 0;
                    }
                    if (i25 != 0) {
                        float f110 = i19;
                        v1Var = new v1(f110, f110, f110, f110);
                    } else {
                        v1Var = t1Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        hVar2 = j0.i.f35305c;
                    }
                    if (i15 != 0) {
                        dVar2 = z1.c.O;
                    }
                    if ((i12 & 64) != 0) {
                        xVarA = c2.a(sVar2);
                        zF = sVar2.f(xVarA);
                        objQ = sVar2.Q();
                        if (zF) {
                            objQ = new f0.l(xVarA);
                            sVar2.o0(objQ);
                        } else {
                            objQ = new f0.l(xVarA);
                            sVar2.o0(objQ);
                        }
                        i13 &= -3670017;
                        t0Var2 = (f0.l) objQ;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 256) != 0) {
                        i13 &= -234881025;
                        iVarA = s1.a(sVar2);
                    } else {
                        iVarA = iVar2;
                    }
                    dVar4 = dVar2;
                    t0Var4 = t0Var2;
                    z15 = z12;
                    rVar4 = rVar3;
                }
                l0.w wVar8 = wVarA;
                sVar2.q();
                int i213 = i13 >> 3;
                sVar = sVar2;
                v10.c.a(rVar4, wVar8, v1Var, true, t0Var4, z15, iVarA, dVar4, hVar2, null, null, cVar, sVar, (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (458752 & i213) | (3670016 & i213) | (i213 & 29360128) | ((i13 << 12) & 1879048192), ((i13 >> 12) & 14) | ((i13 >> 18) & 7168), 6400);
                rVar2 = rVar4;
                wVar2 = wVar8;
                t1Var3 = v1Var;
                t0Var3 = t0Var4;
                z14 = z15;
                iVar2 = iVarA;
                dVar3 = dVar4;
                hVar3 = hVar2;
            } else {
                sVar = sVar2;
                sVar.W();
                rVar2 = rVar;
                wVar2 = wVarA;
                t1Var3 = t1Var2;
                hVar3 = hVar2;
                dVar3 = dVar2;
                t0Var3 = t0Var2;
                z14 = z12;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new l0.b(rVar2, wVar2, t1Var3, hVar3, dVar3, t0Var3, z14, iVar2, cVar, i11, i12);
            }
        }
        i13 |= 196608;
        dVar2 = dVar;
        if ((1572864 & i11) == 0) {
            if ((i12 & 64) == 0) {
                t0Var2 = t0Var;
                if (sVar2.f(t0Var2)) {
                }
                i13 |= i26;
            } else {
                t0Var2 = t0Var;
            }
            i13 |= i26;
        } else {
            t0Var2 = t0Var;
        }
        i17 = i12 & 128;
        if (i17 != 0) {
            if ((12582912 & i11) == 0) {
                z12 = z11;
                if (sVar2.g(z12)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i13 |= i18;
            }
            if ((i11 & 100663296) == 0) {
                if ((i12 & 256) == 0) {
                    iVar2 = iVar;
                    if (sVar2.f(iVar2)) {
                    }
                    i13 |= i27;
                } else {
                    iVar2 = iVar;
                }
                i13 |= i27;
            } else {
                iVar2 = iVar;
            }
            if ((i11 & 805306368) != 0) {
                if (sVar2.h(cVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            if ((i13 & 306783379) != 306783378) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar2.T(i13 & 1, z13)) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i23 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i12 & 2) != 0) {
                        i19 = 0;
                        wVarA = l0.y.a(0, sVar2, 3);
                        i13 &= -113;
                    } else {
                        i19 = 0;
                    }
                    if (i25 != 0) {
                        float f111 = i19;
                        v1Var = new v1(f111, f111, f111, f111);
                    } else {
                        v1Var = t1Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        hVar2 = j0.i.f35305c;
                    }
                    if (i15 != 0) {
                        dVar2 = z1.c.O;
                    }
                    if ((i12 & 64) != 0) {
                        xVarA = c2.a(sVar2);
                        zF = sVar2.f(xVarA);
                        objQ = sVar2.Q();
                        if (zF) {
                            objQ = new f0.l(xVarA);
                            sVar2.o0(objQ);
                        } else {
                            objQ = new f0.l(xVarA);
                            sVar2.o0(objQ);
                        }
                        i13 &= -3670017;
                        t0Var2 = (f0.l) objQ;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 256) != 0) {
                        i13 &= -234881025;
                        iVarA = s1.a(sVar2);
                    } else {
                        iVarA = iVar2;
                    }
                    dVar4 = dVar2;
                    t0Var4 = t0Var2;
                    z15 = z12;
                    rVar4 = rVar3;
                } else {
                    if (i23 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i12 & 2) != 0) {
                        i19 = 0;
                        wVarA = l0.y.a(0, sVar2, 3);
                        i13 &= -113;
                    } else {
                        i19 = 0;
                    }
                    if (i25 != 0) {
                        float f112 = i19;
                        v1Var = new v1(f112, f112, f112, f112);
                    } else {
                        v1Var = t1Var2;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        hVar2 = j0.i.f35305c;
                    }
                    if (i15 != 0) {
                        dVar2 = z1.c.O;
                    }
                    if ((i12 & 64) != 0) {
                        xVarA = c2.a(sVar2);
                        zF = sVar2.f(xVarA);
                        objQ = sVar2.Q();
                        if (zF) {
                            objQ = new f0.l(xVarA);
                            sVar2.o0(objQ);
                        } else {
                            objQ = new f0.l(xVarA);
                            sVar2.o0(objQ);
                        }
                        i13 &= -3670017;
                        t0Var2 = (f0.l) objQ;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 256) != 0) {
                        i13 &= -234881025;
                        iVarA = s1.a(sVar2);
                    } else {
                        iVarA = iVar2;
                    }
                    dVar4 = dVar2;
                    t0Var4 = t0Var2;
                    z15 = z12;
                    rVar4 = rVar3;
                }
                l0.w wVar9 = wVarA;
                sVar2.q();
                int i214 = i13 >> 3;
                sVar = sVar2;
                v10.c.a(rVar4, wVar9, v1Var, true, t0Var4, z15, iVarA, dVar4, hVar2, null, null, cVar, sVar, (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (458752 & i214) | (3670016 & i214) | (i214 & 29360128) | ((i13 << 12) & 1879048192), ((i13 >> 12) & 14) | ((i13 >> 18) & 7168), 6400);
                rVar2 = rVar4;
                wVar2 = wVar9;
                t1Var3 = v1Var;
                t0Var3 = t0Var4;
                z14 = z15;
                iVar2 = iVarA;
                dVar3 = dVar4;
                hVar3 = hVar2;
            } else {
                sVar = sVar2;
                sVar.W();
                rVar2 = rVar;
                wVar2 = wVarA;
                t1Var3 = t1Var2;
                hVar3 = hVar2;
                dVar3 = dVar2;
                t0Var3 = t0Var2;
                z14 = z12;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new l0.b(rVar2, wVar2, t1Var3, hVar3, dVar3, t0Var3, z14, iVar2, cVar, i11, i12);
            }
        }
        i13 |= 12582912;
        z12 = z11;
        if ((i11 & 100663296) == 0) {
            if ((i12 & 256) == 0) {
                iVar2 = iVar;
                if (sVar2.f(iVar2)) {
                }
                i13 |= i27;
            } else {
                iVar2 = iVar;
            }
            i13 |= i27;
        } else {
            iVar2 = iVar;
        }
        if ((i11 & 805306368) != 0) {
            if (sVar2.h(cVar)) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i13 |= i21;
        }
        if ((i13 & 306783379) != 306783378) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (sVar2.T(i13 & 1, z13)) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i23 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar;
                }
                if ((i12 & 2) != 0) {
                    i19 = 0;
                    wVarA = l0.y.a(0, sVar2, 3);
                    i13 &= -113;
                } else {
                    i19 = 0;
                }
                if (i25 != 0) {
                    float f113 = i19;
                    v1Var = new v1(f113, f113, f113, f113);
                } else {
                    v1Var = t1Var2;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    hVar2 = j0.i.f35305c;
                }
                if (i15 != 0) {
                    dVar2 = z1.c.O;
                }
                if ((i12 & 64) != 0) {
                    xVarA = c2.a(sVar2);
                    zF = sVar2.f(xVarA);
                    objQ = sVar2.Q();
                    if (zF) {
                        objQ = new f0.l(xVarA);
                        sVar2.o0(objQ);
                    } else {
                        objQ = new f0.l(xVarA);
                        sVar2.o0(objQ);
                    }
                    i13 &= -3670017;
                    t0Var2 = (f0.l) objQ;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if ((i12 & 256) != 0) {
                    i13 &= -234881025;
                    iVarA = s1.a(sVar2);
                } else {
                    iVarA = iVar2;
                }
                dVar4 = dVar2;
                t0Var4 = t0Var2;
                z15 = z12;
                rVar4 = rVar3;
            } else {
                if (i23 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar;
                }
                if ((i12 & 2) != 0) {
                    i19 = 0;
                    wVarA = l0.y.a(0, sVar2, 3);
                    i13 &= -113;
                } else {
                    i19 = 0;
                }
                if (i25 != 0) {
                    float f114 = i19;
                    v1Var = new v1(f114, f114, f114, f114);
                } else {
                    v1Var = t1Var2;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    hVar2 = j0.i.f35305c;
                }
                if (i15 != 0) {
                    dVar2 = z1.c.O;
                }
                if ((i12 & 64) != 0) {
                    xVarA = c2.a(sVar2);
                    zF = sVar2.f(xVarA);
                    objQ = sVar2.Q();
                    if (zF) {
                        objQ = new f0.l(xVarA);
                        sVar2.o0(objQ);
                    } else {
                        objQ = new f0.l(xVarA);
                        sVar2.o0(objQ);
                    }
                    i13 &= -3670017;
                    t0Var2 = (f0.l) objQ;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if ((i12 & 256) != 0) {
                    i13 &= -234881025;
                    iVarA = s1.a(sVar2);
                } else {
                    iVarA = iVar2;
                }
                dVar4 = dVar2;
                t0Var4 = t0Var2;
                z15 = z12;
                rVar4 = rVar3;
            }
            l0.w wVar10 = wVarA;
            sVar2.q();
            int i215 = i13 >> 3;
            sVar = sVar2;
            v10.c.a(rVar4, wVar10, v1Var, true, t0Var4, z15, iVarA, dVar4, hVar2, null, null, cVar, sVar, (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (458752 & i215) | (3670016 & i215) | (i215 & 29360128) | ((i13 << 12) & 1879048192), ((i13 >> 12) & 14) | ((i13 >> 18) & 7168), 6400);
            rVar2 = rVar4;
            wVar2 = wVar10;
            t1Var3 = v1Var;
            t0Var3 = t0Var4;
            z14 = z15;
            iVar2 = iVarA;
            dVar3 = dVar4;
            hVar3 = hVar2;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar2 = rVar;
            wVar2 = wVarA;
            t1Var3 = t1Var2;
            hVar3 = hVar2;
            dVar3 = dVar2;
            t0Var3 = t0Var2;
            z14 = z12;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l0.b(rVar2, wVar2, t1Var3, hVar3, dVar3, t0Var3, z14, iVar2, cVar, i11, i12);
        }
    }

    public static final void b(z1.r rVar, l0.w wVar, t1 t1Var, j0.h hVar, z1.d dVar, t0 t0Var, boolean z11, fz.c cVar, l1.n nVar, int i11) {
        t1 t1Var2;
        j0.h hVar2;
        z1.d dVar2;
        t0 t0Var2;
        boolean z12;
        int i12;
        boolean z13;
        z1.d dVar3;
        t0 t0Var3;
        t1 t1Var3;
        j0.h hVar3;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-740714857);
        int i13 = i11 | (sVar.f(rVar) ? 4 : 2) | (sVar.f(wVar) ? 32 : 16) | 13315456 | (sVar.h(cVar) ? 67108864 : 33554432);
        if (sVar.T(i13 & 1, (38347923 & i13) != 38347922)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                float f5 = 0;
                v1 v1Var = new v1(f5, f5, f5, f5);
                j0.d dVar4 = j0.i.f35305c;
                z1.h hVar4 = z1.c.O;
                b0.x xVarA = c2.a(sVar);
                boolean zF = sVar.f(xVarA);
                Object objQ = sVar.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new f0.l(xVarA);
                    sVar.o0(objQ);
                }
                i12 = i13 & (-3727361);
                z13 = true;
                dVar3 = hVar4;
                t0Var3 = (f0.l) objQ;
                t1Var3 = v1Var;
                hVar3 = dVar4;
            } else {
                sVar.W();
                i12 = i13 & (-3727361);
                t1Var3 = t1Var;
                hVar3 = hVar;
                dVar3 = dVar;
                t0Var3 = t0Var;
                z13 = z11;
            }
            sVar.q();
            a(rVar, wVar, t1Var3, hVar3, dVar3, t0Var3, z13, s1.a(sVar), cVar, sVar, (33554430 & i12) | ((i12 << 3) & 1879048192), 0);
            t1Var2 = t1Var3;
            hVar2 = hVar3;
            dVar2 = dVar3;
            t0Var2 = t0Var3;
            z12 = z13;
        } else {
            sVar.W();
            t1Var2 = t1Var;
            hVar2 = hVar;
            dVar2 = dVar;
            t0Var2 = t0Var;
            z12 = z11;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v5(rVar, wVar, t1Var2, hVar2, dVar2, t0Var2, z12, cVar, i11);
        }
    }

    public static final void c(z1.r rVar, l0.w wVar, v1 v1Var, j0.f fVar, z1.i iVar, t0 t0Var, boolean z11, d0.i iVar2, fz.c cVar, l1.n nVar, int i11) {
        z1.r rVar2;
        l0.w wVar2;
        z1.i iVar3;
        t0 t0Var2;
        boolean z12;
        d0.i iVar4;
        l0.w wVarA;
        d0.i iVarA;
        int i12;
        z1.r rVar3;
        boolean z13;
        t0 t0Var3;
        z1.i iVar5;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1884325601);
        int i13 = i11 | 46861334 | (sVar.h(cVar) ? 536870912 : 268435456);
        if (sVar.T(i13 & 1, (306783379 & i13) != 306783378)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                wVarA = l0.y.a(0, sVar, 3);
                z1.i iVar6 = z1.c.L;
                b0.x xVarA = c2.a(sVar);
                boolean zF = sVar.f(xVarA);
                Object objQ = sVar.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new f0.l(xVarA);
                    sVar.o0(objQ);
                }
                iVarA = s1.a(sVar);
                i12 = i13 & (-238551153);
                rVar3 = z1.o.f58481a;
                z13 = true;
                t0Var3 = (f0.l) objQ;
                iVar5 = iVar6;
            } else {
                sVar.W();
                wVarA = wVar;
                iVar5 = iVar;
                t0Var3 = t0Var;
                z13 = z11;
                iVarA = iVar2;
                i12 = i13 & (-238551153);
                rVar3 = rVar;
            }
            sVar.q();
            v10.c.a(rVar3, wVarA, v1Var, false, t0Var3, z13, iVarA, null, null, iVar5, fVar, cVar, sVar, 1600902, 432 | ((i12 >> 18) & 7168), 1792);
            z1.i iVar7 = iVar5;
            iVar4 = iVarA;
            iVar3 = iVar7;
            rVar2 = rVar3;
            wVar2 = wVarA;
            t0Var2 = t0Var3;
            z12 = z13;
        } else {
            sVar.W();
            rVar2 = rVar;
            wVar2 = wVar;
            iVar3 = iVar;
            t0Var2 = t0Var;
            z12 = z11;
            iVar4 = iVar2;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d7(rVar2, wVar2, v1Var, fVar, iVar3, t0Var2, z12, iVar4, cVar, i11);
        }
    }

    public static final void d(i0 i0Var, String content, qg.b bVar, l1.n nVar, int i11) {
        int i12;
        qg.b bVar2;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        kotlin.jvm.internal.m.f(content, "content");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-312389850);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(i0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(content) ? 32 : 16;
        }
        int i13 = i12 | 3456;
        if ((i13 & 1171) == 1170 && sVar.F()) {
            sVar.W();
            bVar2 = bVar;
        } else {
            sVar.d0(505833815);
            boolean z11 = (i13 & 896) == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new qg.c();
                sVar.o0(objQ);
            }
            qg.c cVar = (qg.c) objQ;
            sVar.p(false);
            sVar.d0(505840729);
            boolean zH = sVar.h(cVar) | ((i13 & 112) == 32);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new qg.e(0, cVar, content, null);
                sVar.o0(objQ2);
            }
            sVar.p(false);
            sg.q qVar = (sg.q) l1.t.D(null, cVar, content, (fz.e) objQ2, sVar, ((i13 << 3) & 896) | 6).getValue();
            if (qVar != null) {
                se.i.b(i0Var, qVar, sVar, ((i13 >> 3) & 896) | (i13 & 14));
            }
            bVar2 = qg.b.f47727a;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new qg.d(i0Var, content, bVar2, i11, 0);
        }
    }

    public static final void e(z1.r rVar, l1.v1 v1Var, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        t1.d dVar2 = x0.i.f55597a;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-714464401);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(v1Var) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(dVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(dVar) ? 2048 : 1024;
        }
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                k1 k1Var = new k1(null, l1.g.f39300d);
                sVar.o0(k1Var);
                objQ = k1Var;
            }
            z0.c cVarK = k(dVar2, sVar, (i12 >> 6) & 14);
            l1.t.a(v1Var.a(cVarK), t1.e.d(274270255, new u0(rVar, (b1) objQ, dVar, cVarK), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new qg.d(rVar, v1Var, dVar, i11);
        }
    }

    public static final RippleContainer f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof RippleContainer) {
                return (RippleContainer) childAt;
            }
        }
        RippleContainer rippleContainer = new RippleContainer(viewGroup.getContext());
        viewGroup.addView(rippleContainer);
        return rippleContainer;
    }

    public static final ViewGroup g(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }

    public static final float h(List list, Resources resources) {
        float dimension = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dimension += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return dimension;
    }

    public static long i(AtomicLong atomicLong, long j11) {
        long j12;
        do {
            j12 = atomicLong.get();
            if (j12 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j12, j(j12, j11)));
        return j12;
    }

    public static long j(long j11, long j12) {
        long j13 = j11 + j12;
        if (j13 < 0) {
            return Long.MAX_VALUE;
        }
        return j13;
    }

    public static final z0.c k(t1.d dVar, l1.n nVar, int i11) {
        boolean z11 = (((i11 & 14) ^ 6) > 4 && ((l1.s) nVar).f(dVar)) || (i11 & 6) == 4;
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (z11 || objQ == gVar) {
            objQ = new z0.c(dVar);
            sVar.o0(objQ);
        }
        z0.c cVar = (z0.c) objQ;
        boolean zF = sVar.f(cVar);
        Object objQ2 = sVar.Q();
        if (zF || objQ2 == gVar) {
            objQ2 = new yb.a(cVar, 2);
            sVar.o0(objQ2);
        }
        l1.t.c(cVar, (fz.c) objQ2, sVar);
        return cVar;
    }

    public static final nz.l l(sg.q qVar, boolean z11) {
        kotlin.jvm.internal.m.f(qVar, "<this>");
        sg.r rVar = qVar.f51657b;
        return !z11 ? nz.n.U(rVar.f51659b, new f2(24)) : nz.n.U(rVar.f51660c, new f2(25));
    }

    public static float m(float f5, float f11, float f12) {
        if (f5 < f11) {
            return f11;
        }
        return f5 > f12 ? f12 : f5;
    }

    public static int n(int i11, int i12, int i13) {
        if (i11 < i12) {
            return i12;
        }
        return i11 > i13 ? i13 : i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vy.d o(fz.e eVar, vy.d dVar, vy.d dVar2) {
        kotlin.jvm.internal.m.f(eVar, "<this>");
        if (eVar instanceof xy.a) {
            return ((xy.a) eVar).create(dVar, dVar2);
        }
        vy.i context = dVar2.getContext();
        return context == vy.j.f54321a ? new wy.b(eVar, dVar2, dVar) : new wy.c(dVar2, context, eVar, dVar);
    }

    public static final float p(DialogLayout dialogLayout, int i11) {
        Resources resources = dialogLayout.getResources();
        kotlin.jvm.internal.m.b(resources, "resources");
        return TypedValue.applyDimension(1, i11, resources.getDisplayMetrics());
    }

    public static nz.i q(sg.q qVar, fz.c cVar) {
        kotlin.jvm.internal.m.f(qVar, "<this>");
        return nz.n.R(l(qVar, false), cVar);
    }

    public static a2.s r(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new a2.s(z6.c.g(view));
        }
        return null;
    }

    public static final l2.e s() {
        l2.e eVar = f52926b;
        if (eVar != null) {
            return eVar;
        }
        l2.d dVar = new l2.d("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i11 = h0.f39633a;
        g2.y0 y0Var = new g2.y0(g2.x.f28615b);
        l2.f fVar = new l2.f(0);
        fVar.g(19.0f, 6.41f);
        fVar.e(17.59f, 5.0f);
        fVar.e(12.0f, 10.59f);
        fVar.e(6.41f, 5.0f);
        fVar.e(5.0f, 6.41f);
        fVar.e(10.59f, 12.0f);
        fVar.e(5.0f, 17.59f);
        fVar.e(6.41f, 19.0f);
        fVar.e(12.0f, 13.41f);
        fVar.e(17.59f, 19.0f);
        fVar.e(19.0f, 17.59f);
        fVar.e(13.41f, 12.0f);
        fVar.b();
        l2.d.a(dVar, fVar.f39601b, y0Var);
        l2.e eVarB = dVar.b();
        f52926b = eVarB;
        return eVarB;
    }

    public static float t(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? e5.e.b(edgeEffect) : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public static final u3.j u(j3.u0 u0Var, int i11) {
        j3.t0 t0Var = u0Var.f35797a;
        j3.x xVar = u0Var.f35798b;
        if (t0Var.f35784a.f35700b.length() != 0) {
            int iD = xVar.d(i11);
            if ((i11 != 0 && iD == xVar.d(i11 - 1)) || (i11 != t0Var.f35784a.f35700b.length() && iD == xVar.d(i11 + 1))) {
                return u0Var.a(i11);
            }
        }
        return u0Var.h(i11);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x007c, B:29:0x0084, B:30:0x008f, B:37:0x009f, B:24:0x006b, B:39:0x00a2, B:41:0x00a7, B:42:0x00a8, B:23:0x0065, B:31:0x0090, B:33:0x0096), top: B:57:0x0021, outer: #1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #3 {, blocks: (B:31:0x0090, B:33:0x0096), top: B:61:0x0090, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x007c, B:29:0x0084, B:30:0x008f, B:37:0x009f, B:24:0x006b, B:39:0x00a2, B:41:0x00a7, B:42:0x00a8, B:23:0x0065, B:31:0x0090, B:33:0x0096), top: B:57:0x0021, outer: #1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:33:0x0096, B:36:0x009e], limit reached: 61 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:27:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object v(xy.c r10) {
        /*
            boolean r0 = r10 instanceof m6.c
            if (r0 == 0) goto L13
            r0 = r10
            m6.c r0 = (m6.c) r0
            int r1 = r0.f40871f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40871f = r1
            goto L18
        L13:
            m6.c r0 = new m6.c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f40870e
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f40871f
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 != r5) goto L34
            tz.c r2 = r0.f40869d
            tz.v r6 = r0.f40868c
            ui.k r7 = r0.f40867b
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.f40866a
            com.bumptech.glide.e.F(r10)     // Catch: java.lang.Throwable -> L31
            goto L7c
        L31:
            r10 = move-exception
            goto Lb4
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3c:
            com.bumptech.glide.e.F(r10)
            r10 = 6
            tz.h r6 = qx.p.b(r5, r10, r4)
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r10.<init>(r3)
            a0.e r2 = new a0.e
            r7 = 16
            r2.<init>(r7, r10, r6)
            java.lang.Object r7 = x1.l.f55691c
            monitor-enter(r7)
            java.lang.Object r8 = x1.l.f55697i     // Catch: java.lang.Throwable -> Lbe
            java.util.ArrayList r8 = ry.m.G0(r2, r8)     // Catch: java.lang.Throwable -> Lbe
            x1.l.f55697i = r8     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r7)
            x1.l.a()
            ui.k r7 = new ui.k
            r8 = 5
            r7.<init>(r2, r8)
            tz.c r2 = new tz.c     // Catch: java.lang.Throwable -> L31
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r8 = r10
        L6b:
            r0.f40866a = r8     // Catch: java.lang.Throwable -> L31
            r0.f40867b = r7     // Catch: java.lang.Throwable -> L31
            r0.f40868c = r6     // Catch: java.lang.Throwable -> L31
            r0.f40869d = r2     // Catch: java.lang.Throwable -> L31
            r0.f40871f = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r2.a(r0)     // Catch: java.lang.Throwable -> L31
            if (r10 != r1) goto L7c
            return r1
        L7c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L31
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto La9
            java.lang.Object r10 = r2.c()     // Catch: java.lang.Throwable -> L31
            qy.b0 r10 = (qy.b0) r10     // Catch: java.lang.Throwable -> L31
            r8.set(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = x1.l.f55691c     // Catch: java.lang.Throwable -> L31
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L31
            x1.a r9 = x1.l.f55698j     // Catch: java.lang.Throwable -> La6
            y.j0 r9 = r9.f55643h     // Catch: java.lang.Throwable -> La6
            if (r9 == 0) goto L9e
            boolean r9 = r9.h()     // Catch: java.lang.Throwable -> La6
            if (r9 != r5) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r3
        L9f:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L6b
            x1.l.a()     // Catch: java.lang.Throwable -> L31
            goto L6b
        La6:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        La9:
            r6.cancel(r4)     // Catch: java.lang.Throwable -> Lb2
            r7.b()
            qy.b0 r10 = qy.b0.f48488a
            return r10
        Lb2:
            r10 = move-exception
            goto Lba
        Lb4:
            throw r10     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r0 = move-exception
            se.i.g(r6, r10)     // Catch: java.lang.Throwable -> Lb2
            throw r0     // Catch: java.lang.Throwable -> Lb2
        Lba:
            r7.b()
            throw r10
        Lbe:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.f.v(xy.c):java.lang.Object");
    }

    public static final int w(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    public static vy.d x(vy.d dVar) {
        vy.d<Object> dVarIntercepted;
        kotlin.jvm.internal.m.f(dVar, "<this>");
        xy.c cVar = dVar instanceof xy.c ? (xy.c) dVar : null;
        return (cVar == null || (dVarIntercepted = cVar.intercepted()) == null) ? dVar : dVarIntercepted;
    }

    public static ij.n y() {
        if (ij.n.f34440v == null) {
            synchronized (ij.n.class) {
                if (ij.n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    ij.n.f34440v = new ij.n(lingoSkillApplication);
                }
            }
        }
        ij.n nVar = ij.n.f34440v;
        kotlin.jvm.internal.m.c(nVar);
        return nVar;
    }

    public static float z(EdgeEffect edgeEffect, float f5, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e5.e.c(edgeEffect, f5, f11);
        }
        e5.d.a(edgeEffect, f5, f11);
        return f5;
    }
}

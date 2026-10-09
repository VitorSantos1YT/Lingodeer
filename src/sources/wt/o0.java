package wt;

import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.LessonTestProgress;
import com.lingodeer.data.model.UserInfo;
import com.yalantis.ucrop.view.CropImageView;
import fr.d4;
import fr.s3;
import fr.x4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import uz.i1;
import uz.x0;
import vt.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f55334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ur.c f55335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.k0 f55336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.n0 f55337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt.c f55338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0 f55339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vz.i f55340g;

    public o0(h1 h1Var, ur.c cVar, vt.k0 k0Var, vt.n0 n0Var, vt.c cVar2) {
        this.f55334a = h1Var;
        this.f55335b = cVar;
        this.f55336c = k0Var;
        this.f55337d = n0Var;
        this.f55338e = cVar2;
        this.f55339f = new m0(((x4) h1Var).f27974g, this, 0);
        this.f55340g = x0.B(((vt.d) cVar2).f54198h, new dt.x((vy.d) null, this, 26));
    }

    public static /* synthetic */ Object b(o0 o0Var, CoursePracticeType coursePracticeType, int i11, vy.d dVar, int i12) {
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        return o0Var.a(coursePracticeType, i11, 1.0f, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(CoursePracticeType type, int i11, float f5, vy.d dVar) {
        g0 g0Var;
        int iFloor;
        Object objM;
        if (dVar instanceof g0) {
            g0Var = (g0) dVar;
            int i12 = g0Var.f55274d;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                g0Var.f55274d = i12 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, dVar);
            }
        } else {
            g0Var = new g0(this, dVar);
        }
        Object obj = g0Var.f55272b;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i13 = g0Var.f55274d;
        int i14 = 1;
        if (i13 == 0) {
            com.bumptech.glide.e.F(obj);
            kotlin.jvm.internal.m.f(type, "type");
            switch (f0.f55267a[type.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 8:
                case 9:
                case 11:
                case 12:
                case 14:
                case 15:
                case 20:
                case 21:
                case 22:
                    i11 = 20;
                    float f11 = i11;
                    if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        f5 = 0.0f;
                    }
                    iFloor = (int) Math.floor(f11 * f5);
                    g0Var.f55271a = iFloor;
                    g0Var.f55274d = 1;
                    x4 x4Var = (x4) this.f55334a;
                    yz.f fVar = rz.o0.f50940a;
                    objM = rz.e0.M(yz.e.f58387a, new s3(x4Var, iFloor, null, i14), g0Var);
                    if (objM != obj2) {
                        objM = qy.b0.f48488a;
                    }
                    if (objM == obj2) {
                        return obj2;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                case 10:
                case 13:
                    i11 = 30;
                    float f12 = i11;
                    if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        f5 = 0.0f;
                    }
                    iFloor = (int) Math.floor(f12 * f5);
                    g0Var.f55271a = iFloor;
                    g0Var.f55274d = 1;
                    x4 x4Var2 = (x4) this.f55334a;
                    yz.f fVar2 = rz.o0.f50940a;
                    objM = rz.e0.M(yz.e.f58387a, new s3(x4Var2, iFloor, null, i14), g0Var);
                    if (objM != obj2) {
                        objM = qy.b0.f48488a;
                    }
                    if (objM == obj2) {
                        return obj2;
                    }
                    break;
                case 16:
                    i11 /= 2;
                    if (i11 > 20) {
                        i11 = 20;
                    }
                    if (i11 < 1) {
                        i11 = 1;
                    }
                    float f13 = i11;
                    if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        f5 = 0.0f;
                    }
                    iFloor = (int) Math.floor(f13 * f5);
                    g0Var.f55271a = iFloor;
                    g0Var.f55274d = 1;
                    x4 x4Var3 = (x4) this.f55334a;
                    yz.f fVar3 = rz.o0.f50940a;
                    objM = rz.e0.M(yz.e.f58387a, new s3(x4Var3, iFloor, null, i14), g0Var);
                    if (objM != obj2) {
                        objM = qy.b0.f48488a;
                    }
                    if (objM == obj2) {
                        return obj2;
                    }
                    break;
                case 17:
                case 18:
                case 19:
                    float f14 = i11;
                    if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        f5 = 0.0f;
                    }
                    iFloor = (int) Math.floor(f14 * f5);
                    g0Var.f55271a = iFloor;
                    g0Var.f55274d = 1;
                    x4 x4Var4 = (x4) this.f55334a;
                    yz.f fVar4 = rz.o0.f50940a;
                    objM = rz.e0.M(yz.e.f58387a, new s3(x4Var4, iFloor, null, i14), g0Var);
                    if (objM != obj2) {
                        objM = qy.b0.f48488a;
                    }
                    if (objM == obj2) {
                        return obj2;
                    }
                    break;
                case 23:
                    i11 = 0;
                    float f15 = i11;
                    if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        f5 = 0.0f;
                    }
                    iFloor = (int) Math.floor(f15 * f5);
                    g0Var.f55271a = iFloor;
                    g0Var.f55274d = 1;
                    x4 x4Var5 = (x4) this.f55334a;
                    yz.f fVar5 = rz.o0.f50940a;
                    objM = rz.e0.M(yz.e.f58387a, new s3(x4Var5, iFloor, null, i14), g0Var);
                    if (objM != obj2) {
                        objM = qy.b0.f48488a;
                    }
                    if (objM == obj2) {
                        return obj2;
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iFloor = g0Var.f55271a;
            com.bumptech.glide.e.F(obj);
        }
        return new Integer(iFloor);
    }

    public final Object c(xy.i iVar) {
        Object objC = cf.x.C(iVar, ((x4) this.f55334a).f27968a.z().f2966a, false, true, new au.a(0));
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objC != aVar) {
            objC = b0Var;
        }
        if (objC != aVar) {
            objC = b0Var;
        }
        return objC == aVar ? objC : b0Var;
    }

    public final Object d(int i11, xy.i iVar) {
        x4 x4Var = (x4) this.f55334a;
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new s3(x4Var, i11, null, 0), iVar);
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objM != aVar) {
            objM = b0Var;
        }
        return objM == aVar ? objM : b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(xy.c cVar) {
        h0 h0Var;
        int i11;
        int iA;
        int i12;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i13 = h0Var.f55282e;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                h0Var.f55282e = i13 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object objG = h0Var.f55280c;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i14 = h0Var.f55282e;
        vt.n0 n0Var = this.f55337d;
        if (i14 == 0) {
            com.bumptech.glide.e.F(objG);
            i11 = ((fr.o0) n0Var).f27733a.emojiStatus;
            h0Var.f55278a = i11;
            h0Var.f55282e = 1;
            objG = g(h0Var);
            if (objG != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            i11 = h0Var.f55278a;
            com.bumptech.glide.e.F(objG);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = h0Var.f55279b;
            com.bumptech.glide.e.F(objG);
        }
        i1 i1Var = ((vt.d) this.f55338e).f54207r;
        tt.b bVar = new tt.b(Integer.valueOf(i12));
        i1Var.getClass();
        i1Var.l(null, bVar);
        iA = i12;
        return new Integer(iA);
        iA = ks.c.a(i11, (Set) objG);
        if (iA != i11) {
            h0Var.f55278a = i11;
            h0Var.f55279b = iA;
            h0Var.f55282e = 2;
            if (((fr.o0) n0Var).E(iA, h0Var) != obj) {
                i12 = iA;
                i1 i1Var2 = ((vt.d) this.f55338e).f54207r;
                tt.b bVar2 = new tt.b(Integer.valueOf(i12));
                i1Var2.getClass();
                i1Var2.l(null, bVar2);
                iA = i12;
            }
            return obj;
        }
        return new Integer(iA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(xy.c cVar) {
        i0 i0Var;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i11 = i0Var.f55288c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i0Var.f55288c = i11 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object objU = i0Var.f55286a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = i0Var.f55288c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objU);
            gp.r rVarN = ((x4) this.f55334a).n();
            i0Var.f55288c = 1;
            objU = x0.u(rVarN, i0Var);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objU);
        }
        return ((UserInfo) objU).getAnimatedEmojis();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(xy.c cVar) {
        k0 k0Var;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i11 = k0Var.f55300c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k0Var.f55300c = i11 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        Object objF = k0Var.f55298a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = k0Var.f55300c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objF);
            k0Var.f55300c = 1;
            objF = f(k0Var);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objF);
        }
        List listW0 = oz.q.W0((CharSequence) objF, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listW0.iterator();
        while (it.hasNext()) {
            String string = oz.q.i1((String) it.next()).toString();
            if (string.length() <= 0) {
                string = null;
            }
            Integer numT0 = string != null ? oz.x.t0(string) : null;
            if (numT0 != null) {
                arrayList.add(numT0);
            }
        }
        return ry.m.f1(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x013c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:58:0x018c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x018d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object h(long j11, String str, CoursePracticeType coursePracticeType, xy.c cVar) {
        n0 n0Var;
        String str2;
        CoursePracticeType coursePracticeType2;
        LessonTestProgress lessonTestProgress;
        int i11;
        LessonTestProgress lessonTestProgressCopy$default;
        LessonTestProgress lessonTestProgressCopy$default2;
        LessonTestProgress lessonTestProgressCopy$default3;
        LessonTestProgress lessonTestProgressCopy$default4;
        LessonTestProgress lessonTestProgressCopy$default5;
        LessonTestProgress lessonTestProgressCopy$default6;
        long j12 = j11;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i12 = n0Var.f55333f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                n0Var.f55333f = i12 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objU = n0Var.f55331d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = n0Var.f55333f;
        qy.b0 b0Var = qy.b0.f48488a;
        h1 h1Var = this.f55334a;
        switch (i13) {
            case 0:
                com.bumptech.glide.e.F(objU);
                d4 d4VarM = ((x4) h1Var).m(b7.e0.k(j12, xt.d.k(((fr.o0) this.f55337d).f27733a.keyLanguage), "_"));
                n0Var.f55329b = str;
                n0Var.f55330c = coursePracticeType;
                n0Var.f55328a = j12;
                n0Var.f55333f = 1;
                objU = x0.u(d4VarM, n0Var);
                if (objU != aVar) {
                    str2 = str;
                    coursePracticeType2 = coursePracticeType;
                    lessonTestProgress = (LessonTestProgress) objU;
                    i11 = f0.f55267a[coursePracticeType2.ordinal()];
                    if (i11 != 2) {
                        lessonTestProgressCopy$default = LessonTestProgress.copy$default(lessonTestProgress, null, null, str2, null, null, null, null, 123, null);
                        n0Var.f55329b = null;
                        n0Var.f55330c = null;
                        n0Var.f55328a = j12;
                        n0Var.f55333f = 3;
                        if (((x4) h1Var).t(lessonTestProgressCopy$default, n0Var) != aVar) {
                            return b0Var;
                        }
                    } else if (i11 != 3) {
                        lessonTestProgressCopy$default2 = LessonTestProgress.copy$default(lessonTestProgress, null, str2, null, null, null, null, null, AchievementLevelType.DAY_STREAK_LV_7, null);
                        n0Var.f55329b = null;
                        n0Var.f55330c = null;
                        n0Var.f55328a = j12;
                        n0Var.f55333f = 2;
                        if (((x4) h1Var).t(lessonTestProgressCopy$default2, n0Var) != aVar) {
                            return b0Var;
                        }
                    } else if (i11 != 4) {
                        lessonTestProgressCopy$default3 = LessonTestProgress.copy$default(lessonTestProgress, null, null, null, str2, null, null, null, 119, null);
                        n0Var.f55329b = null;
                        n0Var.f55330c = null;
                        n0Var.f55328a = j12;
                        n0Var.f55333f = 4;
                        if (((x4) h1Var).t(lessonTestProgressCopy$default3, n0Var) != aVar) {
                            return b0Var;
                        }
                    } else if (i11 != 5) {
                        lessonTestProgressCopy$default4 = LessonTestProgress.copy$default(lessonTestProgress, null, null, null, null, str2, null, null, 111, null);
                        n0Var.f55329b = null;
                        n0Var.f55330c = null;
                        n0Var.f55328a = j12;
                        n0Var.f55333f = 5;
                        if (((x4) h1Var).t(lessonTestProgressCopy$default4, n0Var) != aVar) {
                            return b0Var;
                        }
                    } else {
                        if (i11 == 6) {
                            if (i11 == 8) {
                                lessonTestProgressCopy$default6 = LessonTestProgress.copy$default(lessonTestProgress, null, null, null, null, null, null, str2, 63, null);
                                n0Var.f55329b = null;
                                n0Var.f55330c = null;
                                n0Var.f55328a = j12;
                                n0Var.f55333f = 7;
                                if (((x4) h1Var).t(lessonTestProgressCopy$default6, n0Var) == aVar) {
                                }
                            }
                            return b0Var;
                        }
                        lessonTestProgressCopy$default5 = LessonTestProgress.copy$default(lessonTestProgress, null, null, null, null, null, str2, null, 95, null);
                        n0Var.f55329b = null;
                        n0Var.f55330c = null;
                        n0Var.f55328a = j12;
                        n0Var.f55333f = 6;
                        if (((x4) h1Var).t(lessonTestProgressCopy$default5, n0Var) != aVar) {
                            return b0Var;
                        }
                    }
                }
                return aVar;
            case 1:
                j12 = n0Var.f55328a;
                coursePracticeType2 = n0Var.f55330c;
                String str3 = n0Var.f55329b;
                com.bumptech.glide.e.F(objU);
                str2 = str3;
                lessonTestProgress = (LessonTestProgress) objU;
                i11 = f0.f55267a[coursePracticeType2.ordinal()];
                if (i11 != 2) {
                    lessonTestProgressCopy$default = LessonTestProgress.copy$default(lessonTestProgress, null, null, str2, null, null, null, null, 123, null);
                    n0Var.f55329b = null;
                    n0Var.f55330c = null;
                    n0Var.f55328a = j12;
                    n0Var.f55333f = 3;
                    if (((x4) h1Var).t(lessonTestProgressCopy$default, n0Var) != aVar) {
                        return aVar;
                    }
                    return b0Var;
                }
                if (i11 != 3) {
                    lessonTestProgressCopy$default2 = LessonTestProgress.copy$default(lessonTestProgress, null, str2, null, null, null, null, null, AchievementLevelType.DAY_STREAK_LV_7, null);
                    n0Var.f55329b = null;
                    n0Var.f55330c = null;
                    n0Var.f55328a = j12;
                    n0Var.f55333f = 2;
                    if (((x4) h1Var).t(lessonTestProgressCopy$default2, n0Var) != aVar) {
                        return aVar;
                    }
                    return b0Var;
                }
                if (i11 != 4) {
                    lessonTestProgressCopy$default3 = LessonTestProgress.copy$default(lessonTestProgress, null, null, null, str2, null, null, null, 119, null);
                    n0Var.f55329b = null;
                    n0Var.f55330c = null;
                    n0Var.f55328a = j12;
                    n0Var.f55333f = 4;
                    if (((x4) h1Var).t(lessonTestProgressCopy$default3, n0Var) != aVar) {
                        return aVar;
                    }
                    return b0Var;
                }
                if (i11 != 5) {
                    lessonTestProgressCopy$default4 = LessonTestProgress.copy$default(lessonTestProgress, null, null, null, null, str2, null, null, 111, null);
                    n0Var.f55329b = null;
                    n0Var.f55330c = null;
                    n0Var.f55328a = j12;
                    n0Var.f55333f = 5;
                    if (((x4) h1Var).t(lessonTestProgressCopy$default4, n0Var) != aVar) {
                        return aVar;
                    }
                    return b0Var;
                }
                if (i11 == 6) {
                    lessonTestProgressCopy$default5 = LessonTestProgress.copy$default(lessonTestProgress, null, null, null, null, null, str2, null, 95, null);
                    n0Var.f55329b = null;
                    n0Var.f55330c = null;
                    n0Var.f55328a = j12;
                    n0Var.f55333f = 6;
                    if (((x4) h1Var).t(lessonTestProgressCopy$default5, n0Var) != aVar) {
                        return aVar;
                    }
                    return b0Var;
                }
                if (i11 == 8) {
                    lessonTestProgressCopy$default6 = LessonTestProgress.copy$default(lessonTestProgress, null, null, null, null, null, null, str2, 63, null);
                    n0Var.f55329b = null;
                    n0Var.f55330c = null;
                    n0Var.f55328a = j12;
                    n0Var.f55333f = 7;
                    if (((x4) h1Var).t(lessonTestProgressCopy$default6, n0Var) == aVar) {
                        return aVar;
                    }
                }
                return b0Var;
            case 2:
                com.bumptech.glide.e.F(objU);
                return b0Var;
            case 3:
                com.bumptech.glide.e.F(objU);
                return b0Var;
            case 4:
                com.bumptech.glide.e.F(objU);
                return b0Var;
            case 5:
                com.bumptech.glide.e.F(objU);
                return b0Var;
            case 6:
                com.bumptech.glide.e.F(objU);
                return b0Var;
            case 7:
                com.bumptech.glide.e.F(objU);
                return b0Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

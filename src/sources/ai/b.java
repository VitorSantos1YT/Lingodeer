package ai;

import a5.f;
import an.c;
import cf.x;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.LingoSkillApplication;
import gm.g;
import java.util.ArrayList;
import jp.i;
import kotlin.jvm.internal.m;
import qp.a4;
import qp.b0;
import qp.b1;
import qp.b2;
import qp.d1;
import qp.f0;
import qp.f1;
import qp.f2;
import qp.f4;
import qp.h1;
import qp.h3;
import qp.i0;
import qp.i2;
import qp.j;
import qp.j4;
import qp.k2;
import qp.k3;
import qp.l0;
import qp.l1;
import qp.n;
import qp.n1;
import qp.n4;
import qp.p0;
import qp.p3;
import qp.p4;
import qp.q1;
import qp.s;
import qp.s1;
import qp.s2;
import qp.s3;
import qp.t4;
import qp.u4;
import qp.v0;
import qp.v1;
import qp.v2;
import qp.v3;
import qp.w;
import qp.w4;
import qp.x0;
import qp.x3;
import qp.y0;
import qp.y1;
import qp.z0;
import qp.z2;
import qp.z4;
import ry.l;
import si.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends lp.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f724g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, mp.b bVar, boolean z11, String str2, boolean z12, int i11) {
        super(str, bVar, z11, str2, z12);
        this.f724g = i11;
    }

    private final hi.a A(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 0;
        int i14 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, i13);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i14);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 0) : new a4(e(), m.f47799b);
                case 4:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 0) : new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    if (x.n().isLessonTestChallenge) {
                        return new p0(e(), m.f47799b);
                    }
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 1) : new t4(e(), m.f47799b);
                case 10:
                    LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 1) : new u4(e(), m.f47799b);
                case 11:
                    LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new v0(e(), m.f47799b) : new w4(e(), m.f47799b);
                default:
                    return null;
            }
        }
        if (i11 != 1) {
            return null;
        }
        switch (i12) {
            case 0:
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
            case 1:
                return new n1(e(), m.f47799b);
            case 2:
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new j(e(), m.f47799b) : new q1(e(), m.f47799b);
            case 3:
                return new s1(e(), m.f47799b);
            case 4:
            case 14:
                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new f0(e(), m.f47799b) : new h3(e(), m.f47799b);
            case 5:
                LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new n(e(), m.f47799b) : new y1(e(), m.f47799b);
            case 6:
                LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new s(e(), m.f47799b) : new b2(e(), m.f47799b);
            case 7:
                LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                if (x.n().isLessonTestChallenge) {
                    return new w(e(), m.f47799b);
                }
                return null;
            case 8:
                return new i2(e(), m.f47799b);
            case 9:
            case 11:
            default:
                return null;
            case 10:
                return new s2(e(), m.f47799b);
            case 12:
                return new v2(e(), m.f47799b);
            case 13:
                LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                if (x.n().isKeyboard) {
                    return new an.b(e(), m.f47799b, 9);
                }
                return x.n().isLessonTestChallenge ? new b0(e(), m.f47799b) : new z2(e(), m.f47799b);
        }
    }

    private final hi.a B(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, 0);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i13);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    return new a4(e(), m.f47799b);
                case 4:
                    return new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                default:
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    return new t4(e(), m.f47799b);
                case 10:
                    return new u4(e(), m.f47799b);
                case 11:
                    return new w4(e(), m.f47799b);
            }
        }
        if (i11 != 1) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return null;
                }
                return new i(e(), this.f40182f);
            }
            mp.b bVarE2 = e();
            long j12 = m.f47799b;
            ArrayList optionIds2 = m.f47801d;
            m.e(optionIds2, "optionIds");
            return new h1(bVarE2, j12, optionIds2);
        }
        switch (i12) {
            case 0:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
            case 1:
                return new n1(e(), m.f47799b);
            case 2:
                return new q1(e(), m.f47799b);
            case 3:
                return new s1(e(), m.f47799b);
            case 4:
                return new h3(e(), m.f47799b);
            case 5:
                return new y1(e(), m.f47799b);
            case 6:
                return new b2(e(), m.f47799b);
            case 7:
                return new f2(e(), m.f47799b);
            case 8:
                return new s3(e(), m.f47799b);
            case 9:
                return new k2(e(), m.f47799b);
            case 10:
                return new s2(e(), m.f47799b);
            case 11:
            default:
                return null;
            case 12:
                return new v2(e(), m.f47799b);
            case 13:
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                return x.n().isKeyboard ? new bk.b(e(), m.f47799b) : new z2(e(), m.f47799b);
        }
    }

    private final hi.a C(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 0;
        int i14 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, i13);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i14);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    return new a4(e(), m.f47799b);
                case 4:
                    return new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                default:
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    return new t4(e(), m.f47799b);
                case 10:
                    return new u4(e(), m.f47799b);
                case 11:
                    return new w4(e(), m.f47799b);
            }
        }
        if (i11 == 1) {
            switch (i12) {
                case 0:
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                case 1:
                    return new n1(e(), m.f47799b);
                case 2:
                    return new q1(e(), m.f47799b);
                case 3:
                    return new s1(e(), m.f47799b);
                case 4:
                    return new h3(e(), m.f47799b);
                case 5:
                    return new y1(e(), m.f47799b);
                case 6:
                    return new b2(e(), m.f47799b);
                case 7:
                    return new f2(e(), m.f47799b);
                case 8:
                    return new s3(e(), m.f47799b);
                case 9:
                    return new k2(e(), m.f47799b);
                case 10:
                    return new s2(e(), m.f47799b);
                case 11:
                default:
                    return null;
                case 12:
                    return new v2(e(), m.f47799b);
                case 13:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isKeyboard ? new bk.b(e(), m.f47799b) : new z2(e(), m.f47799b);
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return null;
                }
                return new i(e(), this.f40182f);
            }
            mp.b bVarE2 = e();
            long j12 = m.f47799b;
            ArrayList optionIds2 = m.f47801d;
            m.e(optionIds2, "optionIds");
            return new h1(bVarE2, j12, optionIds2);
        }
        if (i12 == 0) {
            return new x0(e(), m.f47799b);
        }
        if (i12 == 1) {
            return new y0(e(), m.f47799b);
        }
        if (i12 == 2) {
            return new z0(e(), m.f47799b, m.f47801d);
        }
        if (i12 != 3) {
            return null;
        }
        return new b1(e(), m.f47799b, i13);
    }

    private final hi.a m(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 0;
        int i14 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, i13);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i14);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    return new a4(e(), m.f47799b);
                case 4:
                    return new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                default:
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    return new t4(e(), m.f47799b);
                case 10:
                    return new u4(e(), m.f47799b);
                case 11:
                    return new w4(e(), m.f47799b);
            }
        }
        if (i11 == 1) {
            switch (i12) {
                case 0:
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                case 1:
                    return new n1(e(), m.f47799b);
                case 2:
                    return new q1(e(), m.f47799b);
                case 3:
                    return new s1(e(), m.f47799b);
                case 4:
                    return new h3(e(), m.f47799b);
                case 5:
                    return new y1(e(), m.f47799b);
                case 6:
                    return new b2(e(), m.f47799b);
                case 7:
                    return new f2(e(), m.f47799b);
                case 8:
                    return new s3(e(), m.f47799b);
                case 9:
                    return new k2(e(), m.f47799b);
                case 10:
                    return new s2(e(), m.f47799b);
                case 11:
                default:
                    return null;
                case 12:
                    return new v2(e(), m.f47799b);
                case 13:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isKeyboard ? new bk.b(e(), m.f47799b) : new z2(e(), m.f47799b);
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return null;
                }
                return new i(e(), this.f40182f);
            }
            mp.b bVarE2 = e();
            long j12 = m.f47799b;
            ArrayList optionIds2 = m.f47801d;
            m.e(optionIds2, "optionIds");
            return new h1(bVarE2, j12, optionIds2);
        }
        if (i12 == 0) {
            return new x0(e(), m.f47799b);
        }
        if (i12 == 1) {
            return new y0(e(), m.f47799b);
        }
        if (i12 == 2) {
            return new z0(e(), m.f47799b, m.f47801d);
        }
        if (i12 != 3) {
            return null;
        }
        return new b1(e(), m.f47799b, i13);
    }

    private final hi.a n(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 0;
        int i14 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, i13);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i14);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 0) : new a4(e(), m.f47799b);
                case 4:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 0) : new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    if (x.n().isLessonTestChallenge) {
                        return new p0(e(), m.f47799b);
                    }
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 1) : new t4(e(), m.f47799b);
                case 10:
                    LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 1) : new u4(e(), m.f47799b);
                case 11:
                    LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new v0(e(), m.f47799b) : new w4(e(), m.f47799b);
                case 12:
                default:
                    return null;
                case 13:
                    return new eo.a(e(), m.f47799b, m.f47801d, 0);
            }
        }
        if (i11 != 1) {
            return null;
        }
        switch (i12) {
            case 0:
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
            case 1:
                return new n1(e(), m.f47799b);
            case 2:
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new j(e(), m.f47799b) : new q1(e(), m.f47799b);
            case 3:
                return new s1(e(), m.f47799b);
            case 4:
            case 14:
                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new f0(e(), m.f47799b) : new h3(e(), m.f47799b);
            case 5:
                LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new n(e(), m.f47799b) : new y1(e(), m.f47799b);
            case 6:
                LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new s(e(), m.f47799b) : new b2(e(), m.f47799b);
            case 7:
                LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                if (x.n().isLessonTestChallenge) {
                    return new w(e(), m.f47799b);
                }
                return null;
            case 8:
                return new i2(e(), m.f47799b);
            case 9:
            case 11:
            default:
                return null;
            case 10:
                return new s2(e(), m.f47799b);
            case 12:
                return new v2(e(), m.f47799b);
            case 13:
                LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                if (x.n().isKeyboard) {
                    return new an.b(e(), m.f47799b, i14);
                }
                return x.n().isLessonTestChallenge ? new b0(e(), m.f47799b) : new z2(e(), m.f47799b);
        }
    }

    private final hi.a o(qi.a m) {
        m.f(m, "m");
        int i11 = 1;
        if (FirebaseRemoteConfig.d().b("jp_test_new_unit1")) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (l.D(new Integer[]{3, 9}, Integer.valueOf(x.n().locateLanguage)) && x.n().keyLanguage == 1) {
                int i12 = m.f47798a;
                if (i12 != 0) {
                    if (i12 == 1 && l.D(new Integer[]{13, 2879, 2880, 2895, 3070, 3073, 3135, 3136}, Integer.valueOf((int) m.f47799b))) {
                        return null;
                    }
                } else if (l.D(new Integer[]{16, 18}, Integer.valueOf((int) m.f47799b))) {
                    return null;
                }
            }
        }
        int i13 = m.f47798a;
        int i14 = 2;
        int i15 = 0;
        if (i13 == -1) {
            int i16 = m.f47800c;
            if (i16 != 0) {
                if (i16 == 1) {
                    return new f1(e(), m.f47799b, i15);
                }
                if (i16 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i11);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i13 == 0) {
            switch (m.f47800c) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 0) : new a4(e(), m.f47799b);
                case 4:
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 0) : new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    mp.b bVarE2 = e();
                    long j12 = m.f47799b;
                    ArrayList optionIds2 = m.f47801d;
                    m.e(optionIds2, "optionIds");
                    return new c(bVarE2, j12, optionIds2, 1);
                case 7:
                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                    if (x.n().isLessonTestChallenge) {
                        return new p0(e(), m.f47799b);
                    }
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 1) : new t4(e(), m.f47799b);
                case 10:
                    LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 1) : new u4(e(), m.f47799b);
                case 11:
                    LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new v0(e(), m.f47799b) : new w4(e(), m.f47799b);
                default:
                    return null;
            }
        }
        if (i13 != 1) {
            if (i13 == 2) {
                return new g(e(), m.f47799b, false);
            }
            if (i13 != 4) {
                return null;
            }
            return new g(e(), m.f47799b, true);
        }
        switch (m.f47800c) {
            case 0:
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
            case 1:
                return new n1(e(), m.f47799b);
            case 2:
                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new j(e(), m.f47799b) : new q1(e(), m.f47799b);
            case 3:
                return new s1(e(), m.f47799b);
            case 4:
            case 14:
                LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new f0(e(), m.f47799b) : new v1(e(), m.f47799b);
            case 5:
                LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new n(e(), m.f47799b) : new y1(e(), m.f47799b);
            case 6:
                LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new s(e(), m.f47799b) : new b2(e(), m.f47799b);
            case 7:
                LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                if (x.n().isLessonTestChallenge) {
                    return new w(e(), m.f47799b);
                }
                return null;
            case 8:
                return new i2(e(), m.f47799b);
            case 9:
            case 11:
            default:
                return null;
            case 10:
                return new s2(e(), m.f47799b);
            case 12:
                LingoSkillApplication lingoSkillApplication14 = LingoSkillApplication.f21665b;
                if (x.n().locateLanguage == 3) {
                    return new v2(e(), m.f47799b);
                }
                return null;
            case 13:
                LingoSkillApplication lingoSkillApplication15 = LingoSkillApplication.f21665b;
                if (x.n().isKeyboard) {
                    return new an.b(e(), m.f47799b, i14);
                }
                return x.n().isLessonTestChallenge ? new b0(e(), m.f47799b) : new z2(e(), m.f47799b);
        }
    }

    private final hi.a p(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 0;
        int i14 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, i13);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i14);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 0) : new a4(e(), m.f47799b);
                case 4:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 0) : new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    if (x.n().isLessonTestChallenge) {
                        return new p0(e(), m.f47799b);
                    }
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 1) : new t4(e(), m.f47799b);
                case 10:
                    LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 1) : new u4(e(), m.f47799b);
                case 11:
                    LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new v0(e(), m.f47799b) : new w4(e(), m.f47799b);
                default:
                    return null;
            }
        }
        if (i11 != 1) {
            return null;
        }
        switch (i12) {
            case 0:
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
            case 1:
                return new n1(e(), m.f47799b);
            case 2:
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new j(e(), m.f47799b) : new q1(e(), m.f47799b);
            case 3:
                return new s1(e(), m.f47799b);
            case 4:
            case 14:
                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new f0(e(), m.f47799b) : new h3(e(), m.f47799b);
            case 5:
                LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new n(e(), m.f47799b) : new y1(e(), m.f47799b);
            case 6:
                LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new s(e(), m.f47799b) : new b2(e(), m.f47799b);
            case 7:
                LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                if (x.n().isLessonTestChallenge) {
                    return new w(e(), m.f47799b);
                }
                return null;
            case 8:
                return new i2(e(), m.f47799b);
            case 9:
            case 11:
            default:
                return null;
            case 10:
                return new s2(e(), m.f47799b);
            case 12:
                return new v2(e(), m.f47799b);
            case 13:
                LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                if (x.n().isKeyboard) {
                    return new an.b(e(), m.f47799b, 3);
                }
                return x.n().isLessonTestChallenge ? new b0(e(), m.f47799b) : new z2(e(), m.f47799b);
        }
    }

    private final hi.a q(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 0;
        int i14 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, i13);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i14);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    return new a4(e(), m.f47799b);
                case 4:
                    return new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                default:
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    return new t4(e(), m.f47799b);
                case 10:
                    return new u4(e(), m.f47799b);
                case 11:
                    return new w4(e(), m.f47799b);
            }
        }
        if (i11 == 1) {
            switch (i12) {
                case 0:
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                case 1:
                    return new n1(e(), m.f47799b);
                case 2:
                    return new q1(e(), m.f47799b);
                case 3:
                    return new s1(e(), m.f47799b);
                case 4:
                    return new h3(e(), m.f47799b);
                case 5:
                    return new y1(e(), m.f47799b);
                case 6:
                    return new b2(e(), m.f47799b);
                case 7:
                    return new f2(e(), m.f47799b);
                case 8:
                    return new s3(e(), m.f47799b);
                case 9:
                    return new k2(e(), m.f47799b);
                case 10:
                    return new s2(e(), m.f47799b);
                case 11:
                default:
                    return null;
                case 12:
                    return new v2(e(), m.f47799b);
                case 13:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isKeyboard ? new bk.b(e(), m.f47799b) : new z2(e(), m.f47799b);
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return null;
                }
                return new i(e(), this.f40182f);
            }
            mp.b bVarE2 = e();
            long j12 = m.f47799b;
            ArrayList optionIds2 = m.f47801d;
            m.e(optionIds2, "optionIds");
            return new h1(bVarE2, j12, optionIds2);
        }
        if (i12 == 0) {
            return new x0(e(), m.f47799b);
        }
        if (i12 == 1) {
            return new y0(e(), m.f47799b);
        }
        if (i12 == 2) {
            return new z0(e(), m.f47799b, m.f47801d);
        }
        if (i12 != 3) {
            return null;
        }
        return new b1(e(), m.f47799b, i13);
    }

    private final hi.a r(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 0;
        int i14 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, i13);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i14);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    return new a4(e(), m.f47799b);
                case 4:
                    return new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                default:
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    return new t4(e(), m.f47799b);
                case 10:
                    return new u4(e(), m.f47799b);
                case 11:
                    return new w4(e(), m.f47799b);
            }
        }
        if (i11 == 1) {
            switch (i12) {
                case 0:
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                case 1:
                    return new n1(e(), m.f47799b);
                case 2:
                    return new q1(e(), m.f47799b);
                case 3:
                    return new s1(e(), m.f47799b);
                case 4:
                    return new h3(e(), m.f47799b);
                case 5:
                    return new y1(e(), m.f47799b);
                case 6:
                    return new b2(e(), m.f47799b);
                case 7:
                    return new f2(e(), m.f47799b);
                case 8:
                    return new s3(e(), m.f47799b);
                case 9:
                    return new k2(e(), m.f47799b);
                case 10:
                    return new s2(e(), m.f47799b);
                case 11:
                default:
                    return null;
                case 12:
                    return new v2(e(), m.f47799b);
                case 13:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isKeyboard ? new bk.b(e(), m.f47799b) : new z2(e(), m.f47799b);
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return null;
                }
                return new i(e(), this.f40182f);
            }
            mp.b bVarE2 = e();
            long j12 = m.f47799b;
            ArrayList optionIds2 = m.f47801d;
            m.e(optionIds2, "optionIds");
            return new h1(bVarE2, j12, optionIds2);
        }
        if (i12 == 0) {
            return new x0(e(), m.f47799b);
        }
        if (i12 == 1) {
            return new y0(e(), m.f47799b);
        }
        if (i12 == 2) {
            return new z0(e(), m.f47799b, m.f47801d);
        }
        if (i12 != 3) {
            return null;
        }
        return new b1(e(), m.f47799b, i13);
    }

    private final hi.a s(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = 1;
        if (i11 == -1) {
            int i13 = m.f47800c;
            if (i13 != 0) {
                if (i13 == 1) {
                    return new f1(e(), m.f47799b, 0);
                }
                if (i13 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i12);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (m.f47800c) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    return new a4(e(), m.f47799b);
                case 4:
                    return new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                default:
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    return new t4(e(), m.f47799b);
                case 10:
                    return new u4(e(), m.f47799b);
                case 11:
                    return new w4(e(), m.f47799b);
            }
        }
        if (i11 != 1) {
            return null;
        }
        switch (m.f47800c) {
            case 0:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
            case 1:
                return new n1(e(), m.f47799b);
            case 2:
                return new q1(e(), m.f47799b);
            case 3:
                return new s1(e(), m.f47799b);
            case 4:
                return new v1(e(), m.f47799b);
            case 5:
                return new y1(e(), m.f47799b);
            case 6:
                return new b2(e(), m.f47799b);
            case 7:
            case 9:
            case 11:
            default:
                return null;
            case 8:
                return new i2(e(), m.f47799b);
            case 10:
                return new s2(e(), m.f47799b);
            case 12:
                return new v2(e(), m.f47799b);
            case 13:
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                return x.n().isKeyboard ? new an.b(e(), m.f47799b, 4) : new z2(e(), m.f47799b);
        }
    }

    private final hi.a t(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 0;
        int i14 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, i13);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i14);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 0) : new a4(e(), m.f47799b);
                case 4:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 0) : new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    if (x.n().isLessonTestChallenge) {
                        return new p0(e(), m.f47799b);
                    }
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 1) : new t4(e(), m.f47799b);
                case 10:
                    LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 1) : new u4(e(), m.f47799b);
                case 11:
                    LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new v0(e(), m.f47799b) : new w4(e(), m.f47799b);
                default:
                    return null;
            }
        }
        if (i11 != 1) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return null;
                }
                return new i(e(), this.f40182f);
            }
            mp.b bVarE2 = e();
            long j12 = m.f47799b;
            ArrayList optionIds2 = m.f47801d;
            m.e(optionIds2, "optionIds");
            return new h1(bVarE2, j12, optionIds2);
        }
        switch (i12) {
            case 0:
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
            case 1:
                return new n1(e(), m.f47799b);
            case 2:
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new j(e(), m.f47799b) : new q1(e(), m.f47799b);
            case 3:
                return new s1(e(), m.f47799b);
            case 4:
            case 14:
                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new f0(e(), m.f47799b) : new h3(e(), m.f47799b);
            case 5:
                LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new n(e(), m.f47799b) : new y1(e(), m.f47799b);
            case 6:
                LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new s(e(), m.f47799b) : new b2(e(), m.f47799b);
            case 7:
                LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new w(e(), m.f47799b) : new f2(e(), m.f47799b);
            case 8:
                return new i2(e(), m.f47799b);
            case 9:
            case 11:
            default:
                return null;
            case 10:
                return new s2(e(), m.f47799b);
            case 12:
                return new v2(e(), m.f47799b);
            case 13:
                LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                if (x.n().isKeyboard) {
                    return new an.b(e(), m.f47799b, 5);
                }
                return x.n().isLessonTestChallenge ? new b0(e(), m.f47799b) : new z2(e(), m.f47799b);
        }
    }

    private final hi.a u(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 0;
        int i14 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, i13);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i14);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    return new a4(e(), m.f47799b);
                case 4:
                    return new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                default:
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    return new t4(e(), m.f47799b);
                case 10:
                    return new u4(e(), m.f47799b);
                case 11:
                    return new w4(e(), m.f47799b);
            }
        }
        if (i11 == 1) {
            switch (i12) {
                case 0:
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                case 1:
                    return new n1(e(), m.f47799b);
                case 2:
                    return new q1(e(), m.f47799b);
                case 3:
                    return new s1(e(), m.f47799b);
                case 4:
                    return new h3(e(), m.f47799b);
                case 5:
                    return new y1(e(), m.f47799b);
                case 6:
                    return new b2(e(), m.f47799b);
                case 7:
                    return new f2(e(), m.f47799b);
                case 8:
                    return new s3(e(), m.f47799b);
                case 9:
                    return new k2(e(), m.f47799b);
                case 10:
                    return new s2(e(), m.f47799b);
                case 11:
                default:
                    return null;
                case 12:
                    return new v2(e(), m.f47799b);
                case 13:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isKeyboard ? new bk.b(e(), m.f47799b) : new z2(e(), m.f47799b);
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return null;
                }
                return new i(e(), this.f40182f);
            }
            mp.b bVarE2 = e();
            long j12 = m.f47799b;
            ArrayList optionIds2 = m.f47801d;
            m.e(optionIds2, "optionIds");
            return new h1(bVarE2, j12, optionIds2);
        }
        if (i12 == 0) {
            return new x0(e(), m.f47799b);
        }
        if (i12 == 1) {
            return new y0(e(), m.f47799b);
        }
        if (i12 == 2) {
            return new z0(e(), m.f47799b, m.f47801d);
        }
        if (i12 != 3) {
            return null;
        }
        return new b1(e(), m.f47799b, i13);
    }

    private final hi.a v(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, 0);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i13);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    return new a4(e(), m.f47799b);
                case 4:
                    return new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                case 12:
                default:
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    return new t4(e(), m.f47799b);
                case 10:
                    return new u4(e(), m.f47799b);
                case 11:
                    return new w4(e(), m.f47799b);
                case 13:
                    return new eo.a(e(), m.f47799b, m.f47801d, 1);
            }
        }
        if (i11 != 1) {
            return null;
        }
        switch (i12) {
            case 0:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
            case 1:
                return new n1(e(), m.f47799b);
            case 2:
                return new q1(e(), m.f47799b);
            case 3:
                return new s1(e(), m.f47799b);
            case 4:
                return new v1(e(), m.f47799b);
            case 5:
                return new y1(e(), m.f47799b);
            case 6:
                return new b2(e(), m.f47799b);
            case 7:
            case 9:
            case 11:
            default:
                return null;
            case 8:
                return new i2(e(), m.f47799b);
            case 10:
                return new s2(e(), m.f47799b);
            case 12:
                return new v2(e(), m.f47799b);
            case 13:
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                return x.n().isKeyboard ? new an.b(e(), m.f47799b, 6) : new z2(e(), m.f47799b);
        }
    }

    private final hi.a w(qi.a m) {
        m.f(m, "m");
        mp.b bVarE = e();
        int i11 = m.f47798a;
        int i12 = 0;
        int i13 = 1;
        if (i11 == -1) {
            int i14 = m.f47800c;
            if (i14 == 0) {
                long j11 = m.f47799b;
                ArrayList optionIds = m.f47801d;
                m.e(optionIds, "optionIds");
                return new d1(bVarE, j11, optionIds);
            }
            if (i14 == 1) {
                return new f1(bVarE, m.f47799b, i12);
            }
            if (i14 != 2) {
                return null;
            }
            return new f1(bVarE, m.f47799b, i13);
        }
        if (i11 == 0) {
            switch (m.f47800c) {
                case 1:
                    return new v3(bVarE, m.f47799b);
                case 2:
                    return new x3(bVarE, m.f47799b);
                case 3:
                    return new i0(bVarE, m.f47799b, 2);
                case 4:
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 0) : new f4(e(), m.f47799b);
                case 5:
                    return new j4(bVarE, m.f47799b);
                case 6:
                    long j12 = m.f47799b;
                    ArrayList optionIds2 = m.f47801d;
                    m.e(optionIds2, "optionIds");
                    return new c(bVarE, j12, optionIds2, 2);
                case 7:
                default:
                    return null;
                case 8:
                    return new p4(bVarE, m.f47799b);
                case 9:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 1) : new t4(bVarE, m.f47799b);
                case 10:
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    return x.n().isLessonTestChallenge ? new i0(bVarE, m.f47799b, 1) : new u4(bVarE, m.f47799b);
                case 11:
                    return new w4(bVarE, m.f47799b);
                case 12:
                    z4 z4Var = new z4(bVarE, m.f47799b, 1);
                    z4Var.m = 4;
                    return z4Var;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            return new d(bVarE, m.f47799b);
        }
        int i15 = m.f47800c;
        if (i15 == 10) {
            return new s2(bVarE, m.f47799b);
        }
        int i16 = 7;
        if (i15 == 31) {
            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
            if (x.n().isAudioModel) {
                return new p3(e(), m.f47799b);
            }
            if (x.n().isKeyboard) {
                return new an.b(e(), m.f47799b, i16);
            }
            return x.n().isLessonTestChallenge ? new b0(e(), m.f47799b) : new z2(e(), m.f47799b);
        }
        if (i15 == 12) {
            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
            if (x.n().locateLanguage == 3) {
                return new v2(bVarE, m.f47799b);
            }
            return null;
        }
        if (i15 == 13) {
            LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
            if (x.n().isKeyboard) {
                return new an.b(e(), m.f47799b, i16);
            }
            return x.n().isLessonTestChallenge ? new b0(e(), m.f47799b) : new z2(e(), m.f47799b);
        }
        switch (i15) {
            case 0:
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                return x.n().isAudioModel ? new l1(bVarE, m.f47799b) : new k3(bVarE, m.f47799b);
            case 1:
                return new n1(bVarE, m.f47799b);
            case 2:
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new j(bVarE, m.f47799b) : new q1(bVarE, m.f47799b);
            case 3:
                return new s1(bVarE, m.f47799b);
            case 4:
                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new f0(e(), m.f47799b) : new v1(bVarE, m.f47799b);
            case 5:
                LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new n(e(), m.f47799b) : new y1(e(), m.f47799b);
            case 6:
                return new b2(e(), m.f47799b);
            case 7:
                LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                if (x.n().isLessonTestChallenge) {
                    return new w(e(), m.f47799b);
                }
                return null;
            case 8:
                return new i2(bVarE, m.f47799b);
            default:
                return null;
        }
    }

    private final hi.a x(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 0;
        int i14 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, i13);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i14);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    return new a4(e(), m.f47799b);
                case 4:
                    return new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                default:
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    return new t4(e(), m.f47799b);
                case 10:
                    return new u4(e(), m.f47799b);
                case 11:
                    return new w4(e(), m.f47799b);
            }
        }
        if (i11 == 1) {
            switch (i12) {
                case 0:
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                case 1:
                    return new n1(e(), m.f47799b);
                case 2:
                    return new q1(e(), m.f47799b);
                case 3:
                    return new s1(e(), m.f47799b);
                case 4:
                    return new h3(e(), m.f47799b);
                case 5:
                    return new y1(e(), m.f47799b);
                case 6:
                    return new b2(e(), m.f47799b);
                case 7:
                    return new f2(e(), m.f47799b);
                case 8:
                    return new s3(e(), m.f47799b);
                case 9:
                    return new k2(e(), m.f47799b);
                case 10:
                    return new s2(e(), m.f47799b);
                case 11:
                default:
                    return null;
                case 12:
                    return new v2(e(), m.f47799b);
                case 13:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isKeyboard ? new bk.b(e(), m.f47799b) : new z2(e(), m.f47799b);
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return null;
                }
                return new i(e(), this.f40182f);
            }
            mp.b bVarE2 = e();
            long j12 = m.f47799b;
            ArrayList optionIds2 = m.f47801d;
            m.e(optionIds2, "optionIds");
            return new h1(bVarE2, j12, optionIds2);
        }
        if (i12 == 0) {
            return new x0(e(), m.f47799b);
        }
        if (i12 == 1) {
            return new y0(e(), m.f47799b);
        }
        if (i12 == 2) {
            return new z0(e(), m.f47799b, m.f47801d);
        }
        if (i12 != 3) {
            return null;
        }
        return new b1(e(), m.f47799b, i13);
    }

    private final hi.a y(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, 0);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i13);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    return new a4(e(), m.f47799b);
                case 4:
                    return new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                case 12:
                default:
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    return new t4(e(), m.f47799b);
                case 10:
                    return new u4(e(), m.f47799b);
                case 11:
                    return new w4(e(), m.f47799b);
                case 13:
                    return new eo.a(e(), m.f47799b, m.f47801d, 2);
            }
        }
        if (i11 != 1) {
            return null;
        }
        switch (i12) {
            case 0:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
            case 1:
                return new n1(e(), m.f47799b);
            case 2:
                return new q1(e(), m.f47799b);
            case 3:
                return new s1(e(), m.f47799b);
            case 4:
                return new v1(e(), m.f47799b);
            case 5:
                return new y1(e(), m.f47799b);
            case 6:
                return new b2(e(), m.f47799b);
            case 7:
            case 9:
            case 11:
            default:
                return null;
            case 8:
                return new i2(e(), m.f47799b);
            case 10:
                return new s2(e(), m.f47799b);
            case 12:
                return new v2(e(), m.f47799b);
            case 13:
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                return x.n().isKeyboard ? new an.b(e(), m.f47799b, 8) : new z2(e(), m.f47799b);
        }
    }

    private final hi.a z(qi.a m) {
        m.f(m, "m");
        int i11 = m.f47798a;
        int i12 = m.f47800c;
        int i13 = 0;
        int i14 = 1;
        if (i11 == -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return new f1(e(), m.f47799b, i13);
                }
                if (i12 != 2) {
                    return null;
                }
                return new f1(e(), m.f47799b, i14);
            }
            mp.b bVarE = e();
            long j11 = m.f47799b;
            ArrayList optionIds = m.f47801d;
            m.e(optionIds, "optionIds");
            return new d1(bVarE, j11, optionIds);
        }
        if (i11 == 0) {
            switch (i12) {
                case 1:
                    return new v3(e(), m.f47799b);
                case 2:
                    return new x3(e(), m.f47799b);
                case 3:
                    return new a4(e(), m.f47799b);
                case 4:
                    return new f4(e(), m.f47799b);
                case 5:
                    return new j4(e(), m.f47799b);
                case 6:
                    return new n4(e(), m.f47799b, m.f47801d);
                case 7:
                default:
                    return null;
                case 8:
                    return new p4(e(), m.f47799b);
                case 9:
                    return new t4(e(), m.f47799b);
                case 10:
                    return new u4(e(), m.f47799b);
                case 11:
                    return new w4(e(), m.f47799b);
            }
        }
        if (i11 == 1) {
            switch (i12) {
                case 0:
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                case 1:
                    return new n1(e(), m.f47799b);
                case 2:
                    return new q1(e(), m.f47799b);
                case 3:
                    return new s1(e(), m.f47799b);
                case 4:
                    return new h3(e(), m.f47799b);
                case 5:
                    return new y1(e(), m.f47799b);
                case 6:
                    return new b2(e(), m.f47799b);
                case 7:
                    return new f2(e(), m.f47799b);
                case 8:
                    return new s3(e(), m.f47799b);
                case 9:
                    return new k2(e(), m.f47799b);
                case 10:
                    return new s2(e(), m.f47799b);
                case 11:
                default:
                    return null;
                case 12:
                    return new v2(e(), m.f47799b);
                case 13:
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    return x.n().isKeyboard ? new bk.b(e(), m.f47799b) : new z2(e(), m.f47799b);
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return null;
                }
                return new i(e(), this.f40182f);
            }
            mp.b bVarE2 = e();
            long j12 = m.f47799b;
            ArrayList optionIds2 = m.f47801d;
            m.e(optionIds2, "optionIds");
            return new h1(bVarE2, j12, optionIds2);
        }
        if (i12 == 0) {
            return new x0(e(), m.f47799b);
        }
        if (i12 == 1) {
            return new y0(e(), m.f47799b);
        }
        if (i12 == 2) {
            return new z0(e(), m.f47799b, m.f47801d);
        }
        if (i12 != 3) {
            return null;
        }
        return new b1(e(), m.f47799b, i13);
    }

    @Override // lp.a
    public f d() {
        switch (this.f724g) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
        }
        return new f(24, false);
    }

    @Override // lp.a
    public oi.c f() {
        int i11 = 0;
        int i12 = 1;
        switch (this.f724g) {
            case 0:
                return new oi.c(2);
            case 1:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new bn.a(1) : new oi.c(2);
            case 2:
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new bn.a(3) : new oi.c(2);
            case 3:
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new bn.a(0) : new oi.c(2);
            case 4:
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new ck.a() : new ck.b(i11);
            case 5:
                return new oi.c(2);
            case 6:
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new bn.a(1) : new oi.c(2);
            case 7:
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new bn.a(2) : new oi.c(2);
            case 8:
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new bn.a(3) : new oi.c(2);
            case 9:
                return new oi.c(2);
            case 10:
                return new oi.c(2);
            case 11:
                return new ck.b(i12);
            case 12:
                LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new bn.a(3) : new oi.c(2);
            case 13:
                return new oi.c(2);
            case 14:
                return new oi.c(2);
            case 15:
                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new bn.a(4) : new oi.c(2);
            case 16:
                return new oi.c(2);
            case 17:
                return new oi.c(2);
            case 18:
                return new oi.c(2);
            case 19:
                LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                return x.n().isLessonTestChallenge ? new bn.a(5) : new oi.c(2);
            case 20:
                return new oi.c(2);
            case 21:
                return new oi.c(2);
            default:
                return new oi.c(2);
        }
    }

    @Override // lp.a
    public final hi.a g(qi.a m) {
        int i11 = this.f724g;
        String str = this.f40182f;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        switch (i11) {
            case 0:
                m.f(m, "m");
                int i15 = m.f47798a;
                int i16 = m.f47800c;
                if (i15 == -1) {
                    if (i16 != 0) {
                        if (i16 == 1) {
                            return new f1(e(), m.f47799b, i13);
                        }
                        if (i16 != 2) {
                            return null;
                        }
                        return new f1(e(), m.f47799b, i14);
                    }
                    mp.b bVarE = e();
                    long j11 = m.f47799b;
                    ArrayList optionIds = m.f47801d;
                    m.e(optionIds, "optionIds");
                    return new d1(bVarE, j11, optionIds);
                }
                if (i15 == 0) {
                    switch (i16) {
                        case 1:
                            return new v3(e(), m.f47799b);
                        case 2:
                            return new x3(e(), m.f47799b);
                        case 3:
                            return new a4(e(), m.f47799b);
                        case 4:
                            return new f4(e(), m.f47799b);
                        case 5:
                            return new b1(e(), m.f47799b, i14);
                        case 6:
                            return new n4(e(), m.f47799b, m.f47801d);
                        case 7:
                        case 12:
                        default:
                            return null;
                        case 8:
                            return new p4(e(), m.f47799b);
                        case 9:
                            return new t4(e(), m.f47799b);
                        case 10:
                            return new b1(e(), m.f47799b, i12);
                        case 11:
                            return new w4(e(), m.f47799b);
                        case 13:
                            return new eo.a(e(), m.f47799b, m.f47801d, 0);
                    }
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        return null;
                    }
                    if (i16 == 0) {
                        return new x0(e(), m.f47799b);
                    }
                    if (i16 == 1) {
                        return new y0(e(), m.f47799b);
                    }
                    if (i16 == 2) {
                        return new z0(e(), m.f47799b, m.f47801d);
                    }
                    if (i16 != 3) {
                        return null;
                    }
                    return new b1(e(), m.f47799b, i13);
                }
                switch (i16) {
                    case 0:
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                    case 1:
                        return new n1(e(), m.f47799b);
                    case 2:
                        return new q1(e(), m.f47799b);
                    case 3:
                        return new s1(e(), m.f47799b);
                    case 4:
                        return new h3(e(), m.f47799b);
                    case 5:
                        return new y1(e(), m.f47799b);
                    case 6:
                        return new b2(e(), m.f47799b);
                    case 7:
                        return new f2(e(), m.f47799b);
                    case 8:
                        return new s3(e(), m.f47799b);
                    case 9:
                    case 11:
                    default:
                        return null;
                    case 10:
                        return new s2(e(), m.f47799b);
                    case 12:
                        return new v2(e(), m.f47799b);
                    case 13:
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        return x.n().isKeyboard ? new an.b(e(), m.f47799b, 10) : new z2(e(), m.f47799b);
                }
            case 1:
                m.f(m, "m");
                int i17 = m.f47798a;
                int i18 = m.f47800c;
                if (i17 == -1) {
                    if (i18 != 0) {
                        if (i18 == 1) {
                            return new f1(e(), m.f47799b, i13);
                        }
                        if (i18 != 2) {
                            return null;
                        }
                        return new f1(e(), m.f47799b, i14);
                    }
                    mp.b bVarE2 = e();
                    long j12 = m.f47799b;
                    ArrayList optionIds2 = m.f47801d;
                    m.e(optionIds2, "optionIds");
                    return new d1(bVarE2, j12, optionIds2);
                }
                if (i17 == 0) {
                    switch (i18) {
                        case 1:
                            return new v3(e(), m.f47799b);
                        case 2:
                            return new x3(e(), m.f47799b);
                        case 3:
                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 0) : new a4(e(), m.f47799b);
                        case 4:
                            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 0) : new f4(e(), m.f47799b);
                        case 5:
                            return new j4(e(), m.f47799b);
                        case 6:
                            return new n4(e(), m.f47799b, m.f47801d);
                        case 7:
                            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                            if (x.n().isLessonTestChallenge) {
                                return new p0(e(), m.f47799b);
                            }
                            return null;
                        case 8:
                            return new p4(e(), m.f47799b);
                        case 9:
                            LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 1) : new t4(e(), m.f47799b);
                        case 10:
                            LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 1) : new u4(e(), m.f47799b);
                        case 11:
                            LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new v0(e(), m.f47799b) : new w4(e(), m.f47799b);
                        case 12:
                        default:
                            return null;
                        case 13:
                            return new eo.a(e(), m.f47799b, m.f47801d, 0);
                    }
                }
                if (i17 != 1) {
                    return null;
                }
                switch (i18) {
                    case 0:
                        LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                        return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                    case 1:
                        return new n1(e(), m.f47799b);
                    case 2:
                        LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new j(e(), m.f47799b) : new q1(e(), m.f47799b);
                    case 3:
                        return new s1(e(), m.f47799b);
                    case 4:
                    case 14:
                        LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new f0(e(), m.f47799b) : new h3(e(), m.f47799b);
                    case 5:
                        LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new n(e(), m.f47799b) : new y1(e(), m.f47799b);
                    case 6:
                        LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new s(e(), m.f47799b) : new b2(e(), m.f47799b);
                    case 7:
                        LingoSkillApplication lingoSkillApplication14 = LingoSkillApplication.f21665b;
                        if (x.n().isLessonTestChallenge) {
                            return new w(e(), m.f47799b);
                        }
                        return null;
                    case 8:
                        return new i2(e(), m.f47799b);
                    case 9:
                    case 11:
                    default:
                        return null;
                    case 10:
                        return new s2(e(), m.f47799b);
                    case 12:
                        return new v2(e(), m.f47799b);
                    case 13:
                        LingoSkillApplication lingoSkillApplication15 = LingoSkillApplication.f21665b;
                        if (x.n().isKeyboard) {
                            return new an.b(e(), m.f47799b, i14);
                        }
                        return x.n().isLessonTestChallenge ? new b0(e(), m.f47799b) : new z2(e(), m.f47799b);
                }
            case 2:
                m.f(m, "m");
                int i19 = m.f47798a;
                int i21 = m.f47800c;
                if (i19 == -1) {
                    if (i21 != 0) {
                        if (i21 == 1) {
                            return new f1(e(), m.f47799b, i13);
                        }
                        if (i21 != 2) {
                            return null;
                        }
                        return new f1(e(), m.f47799b, i14);
                    }
                    mp.b bVarE3 = e();
                    long j13 = m.f47799b;
                    ArrayList optionIds3 = m.f47801d;
                    m.e(optionIds3, "optionIds");
                    return new d1(bVarE3, j13, optionIds3);
                }
                if (i19 == 0) {
                    switch (i21) {
                        case 1:
                            return new v3(e(), m.f47799b);
                        case 2:
                            return new x3(e(), m.f47799b);
                        case 3:
                            LingoSkillApplication lingoSkillApplication16 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 0) : new a4(e(), m.f47799b);
                        case 4:
                            LingoSkillApplication lingoSkillApplication17 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 0) : new f4(e(), m.f47799b);
                        case 5:
                            return new j4(e(), m.f47799b);
                        case 6:
                            return new n4(e(), m.f47799b, m.f47801d);
                        case 7:
                            LingoSkillApplication lingoSkillApplication18 = LingoSkillApplication.f21665b;
                            if (x.n().isLessonTestChallenge) {
                                return new p0(e(), m.f47799b);
                            }
                            return null;
                        case 8:
                            return new p4(e(), m.f47799b);
                        case 9:
                            LingoSkillApplication lingoSkillApplication19 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 1) : new t4(e(), m.f47799b);
                        case 10:
                            LingoSkillApplication lingoSkillApplication20 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 1) : new u4(e(), m.f47799b);
                        case 11:
                            LingoSkillApplication lingoSkillApplication21 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new v0(e(), m.f47799b) : new w4(e(), m.f47799b);
                        default:
                            return null;
                    }
                }
                if (i19 != 1) {
                    if (i19 != 3) {
                        if (i19 != 4) {
                            return null;
                        }
                        return new i(e(), str);
                    }
                    try {
                        mp.b bVarE4 = e();
                        long j14 = m.f47799b;
                        ArrayList optionIds4 = m.f47801d;
                        m.e(optionIds4, "optionIds");
                        return new h1(bVarE4, j14, optionIds4);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        return null;
                    }
                }
                switch (i21) {
                    case 0:
                        LingoSkillApplication lingoSkillApplication22 = LingoSkillApplication.f21665b;
                        return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                    case 1:
                        return new n1(e(), m.f47799b);
                    case 2:
                        LingoSkillApplication lingoSkillApplication23 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new j(e(), m.f47799b) : new q1(e(), m.f47799b);
                    case 3:
                        return new s1(e(), m.f47799b);
                    case 4:
                    case 14:
                        LingoSkillApplication lingoSkillApplication24 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new f0(e(), m.f47799b) : new h3(e(), m.f47799b);
                    case 5:
                        LingoSkillApplication lingoSkillApplication25 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new n(e(), m.f47799b) : new y1(e(), m.f47799b);
                    case 6:
                        LingoSkillApplication lingoSkillApplication26 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new s(e(), m.f47799b) : new b2(e(), m.f47799b);
                    case 7:
                        LingoSkillApplication lingoSkillApplication27 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new w(e(), m.f47799b) : new f2(e(), m.f47799b);
                    case 8:
                        return new i2(e(), m.f47799b);
                    case 9:
                    case 11:
                    default:
                        return null;
                    case 10:
                        return new s2(e(), m.f47799b);
                    case 12:
                        return new v2(e(), m.f47799b);
                    case 13:
                        LingoSkillApplication lingoSkillApplication28 = LingoSkillApplication.f21665b;
                        if (x.n().isKeyboard) {
                            return new an.b(e(), m.f47799b, 8);
                        }
                        return x.n().isLessonTestChallenge ? new b0(e(), m.f47799b) : new z2(e(), m.f47799b);
                }
            case 3:
                m.f(m, "m");
                int i22 = m.f47798a;
                int i23 = m.f47800c;
                if (i22 == -1) {
                    if (i23 != 0) {
                        if (i23 == 1) {
                            return new f1(e(), m.f47799b, i13);
                        }
                        if (i23 != 2) {
                            return null;
                        }
                        return new f1(e(), m.f47799b, i14);
                    }
                    mp.b bVarE5 = e();
                    long j15 = m.f47799b;
                    ArrayList optionIds5 = m.f47801d;
                    m.e(optionIds5, "optionIds");
                    return new d1(bVarE5, j15, optionIds5);
                }
                if (i22 == 0) {
                    switch (i23) {
                        case 1:
                            return new v3(e(), m.f47799b);
                        case 2:
                            return new x3(e(), m.f47799b);
                        case 3:
                            LingoSkillApplication lingoSkillApplication29 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 0) : new a4(e(), m.f47799b);
                        case 4:
                            LingoSkillApplication lingoSkillApplication30 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 0) : new f4(e(), m.f47799b);
                        case 5:
                            return new j4(e(), m.f47799b);
                        case 6:
                            mp.b bVarE6 = e();
                            long j16 = m.f47799b;
                            ArrayList optionIds6 = m.f47801d;
                            m.e(optionIds6, "optionIds");
                            return new c(bVarE6, j16, optionIds6, 0);
                        case 7:
                            LingoSkillApplication lingoSkillApplication31 = LingoSkillApplication.f21665b;
                            if (x.n().isLessonTestChallenge) {
                                return new p0(e(), m.f47799b);
                            }
                            return null;
                        case 8:
                            return new p4(e(), m.f47799b);
                        case 9:
                            LingoSkillApplication lingoSkillApplication32 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 1) : new t4(e(), m.f47799b);
                        case 10:
                            LingoSkillApplication lingoSkillApplication33 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 1) : new u4(e(), m.f47799b);
                        case 11:
                            LingoSkillApplication lingoSkillApplication34 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new v0(e(), m.f47799b) : new w4(e(), m.f47799b);
                        default:
                            return null;
                    }
                }
                if (i22 != 1) {
                    if (i22 != 4) {
                        return null;
                    }
                    return new g(e(), m.f47799b, true);
                }
                switch (i23) {
                    case 0:
                        LingoSkillApplication lingoSkillApplication35 = LingoSkillApplication.f21665b;
                        return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                    case 1:
                        return new n1(e(), m.f47799b);
                    case 2:
                        LingoSkillApplication lingoSkillApplication36 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new j(e(), m.f47799b) : new q1(e(), m.f47799b);
                    case 3:
                        return new s1(e(), m.f47799b);
                    case 4:
                    case 14:
                        LingoSkillApplication lingoSkillApplication37 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new f0(e(), m.f47799b) : new v1(e(), m.f47799b);
                    case 5:
                        LingoSkillApplication lingoSkillApplication38 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new n(e(), m.f47799b) : new y1(e(), m.f47799b);
                    case 6:
                        LingoSkillApplication lingoSkillApplication39 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new s(e(), m.f47799b) : new b2(e(), m.f47799b);
                    case 7:
                        LingoSkillApplication lingoSkillApplication40 = LingoSkillApplication.f21665b;
                        if (x.n().isLessonTestChallenge) {
                            return new w(e(), m.f47799b);
                        }
                        return null;
                    case 8:
                        return new i2(e(), m.f47799b);
                    case 9:
                    case 11:
                    default:
                        return null;
                    case 10:
                        return new s2(e(), m.f47799b);
                    case 12:
                        LingoSkillApplication lingoSkillApplication41 = LingoSkillApplication.f21665b;
                        if (x.n().locateLanguage == 3) {
                            return new v2(e(), m.f47799b);
                        }
                        return null;
                    case 13:
                        LingoSkillApplication lingoSkillApplication42 = LingoSkillApplication.f21665b;
                        if (x.n().isKeyboard) {
                            return new an.b(e(), m.f47799b, i13);
                        }
                        return x.n().isLessonTestChallenge ? new b0(e(), m.f47799b) : new z2(e(), m.f47799b);
                }
            case 4:
                m.f(m, "m");
                int i24 = m.f47798a;
                int i25 = m.f47800c;
                if (i24 == -1) {
                    if (i25 != 0) {
                        if (i25 == 1) {
                            return new f1(e(), m.f47799b, i13);
                        }
                        if (i25 != 2) {
                            return null;
                        }
                        return new f1(e(), m.f47799b, i14);
                    }
                    mp.b bVarE7 = e();
                    long j17 = m.f47799b;
                    ArrayList optionIds7 = m.f47801d;
                    m.e(optionIds7, "optionIds");
                    return new d1(bVarE7, j17, optionIds7);
                }
                if (i24 == 0) {
                    switch (i25) {
                        case 1:
                            return new v3(e(), m.f47799b);
                        case 2:
                            return new x3(e(), m.f47799b);
                        case 3:
                            LingoSkillApplication lingoSkillApplication43 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 0) : new a4(e(), m.f47799b);
                        case 4:
                            LingoSkillApplication lingoSkillApplication44 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 0) : new f4(e(), m.f47799b);
                        case 5:
                            return new j4(e(), m.f47799b);
                        case 6:
                            return new n4(e(), m.f47799b, m.f47801d);
                        case 7:
                            LingoSkillApplication lingoSkillApplication45 = LingoSkillApplication.f21665b;
                            if (x.n().isLessonTestChallenge) {
                                return new p0(e(), m.f47799b);
                            }
                            return null;
                        case 8:
                            return new p4(e(), m.f47799b);
                        case 9:
                            LingoSkillApplication lingoSkillApplication46 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new l0(e(), m.f47799b, 1) : new t4(e(), m.f47799b);
                        case 10:
                            LingoSkillApplication lingoSkillApplication47 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new i0(e(), m.f47799b, 1) : new u4(e(), m.f47799b);
                        case 11:
                            LingoSkillApplication lingoSkillApplication48 = LingoSkillApplication.f21665b;
                            return x.n().isLessonTestChallenge ? new v0(e(), m.f47799b) : new w4(e(), m.f47799b);
                        default:
                            return null;
                    }
                }
                if (i24 != 1) {
                    return null;
                }
                switch (i25) {
                    case 0:
                        LingoSkillApplication lingoSkillApplication49 = LingoSkillApplication.f21665b;
                        return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                    case 1:
                        return new n1(e(), m.f47799b);
                    case 2:
                        LingoSkillApplication lingoSkillApplication50 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new j(e(), m.f47799b) : new q1(e(), m.f47799b);
                    case 3:
                        return new s1(e(), m.f47799b);
                    case 4:
                    case 14:
                        LingoSkillApplication lingoSkillApplication51 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new f0(e(), m.f47799b) : new h3(e(), m.f47799b);
                    case 5:
                        LingoSkillApplication lingoSkillApplication52 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new n(e(), m.f47799b) : new y1(e(), m.f47799b);
                    case 6:
                        LingoSkillApplication lingoSkillApplication53 = LingoSkillApplication.f21665b;
                        return x.n().isLessonTestChallenge ? new s(e(), m.f47799b) : new b2(e(), m.f47799b);
                    case 7:
                        LingoSkillApplication lingoSkillApplication54 = LingoSkillApplication.f21665b;
                        if (x.n().isLessonTestChallenge) {
                            return new w(e(), m.f47799b);
                        }
                        return null;
                    case 8:
                        return new i2(e(), m.f47799b);
                    case 9:
                    case 11:
                    default:
                        return null;
                    case 10:
                        return new s2(e(), m.f47799b);
                    case 12:
                        return new v2(e(), m.f47799b);
                    case 13:
                        LingoSkillApplication lingoSkillApplication55 = LingoSkillApplication.f21665b;
                        if (x.n().isKeyboard) {
                            return new bk.b(e(), m.f47799b);
                        }
                        return x.n().isLessonTestChallenge ? new b0(e(), m.f47799b) : new z2(e(), m.f47799b);
                }
            case 5:
                return m(m);
            case 6:
                return n(m);
            case 7:
                return o(m);
            case 8:
                return p(m);
            case 9:
                return q(m);
            case 10:
                return r(m);
            case 11:
                return s(m);
            case 12:
                return t(m);
            case 13:
                return u(m);
            case 14:
                return v(m);
            case 15:
                return w(m);
            case 16:
                return x(m);
            case 17:
                return y(m);
            case 18:
                return z(m);
            case 19:
                return A(m);
            case 20:
                return B(m);
            case 21:
                return C(m);
            default:
                m.f(m, "m");
                int i26 = m.f47798a;
                int i27 = m.f47800c;
                if (i26 == -1) {
                    if (i27 != 0) {
                        if (i27 == 1) {
                            return new f1(e(), m.f47799b, i13);
                        }
                        if (i27 != 2) {
                            return null;
                        }
                        return new f1(e(), m.f47799b, i14);
                    }
                    mp.b bVarE8 = e();
                    long j18 = m.f47799b;
                    ArrayList optionIds8 = m.f47801d;
                    m.e(optionIds8, "optionIds");
                    return new d1(bVarE8, j18, optionIds8);
                }
                if (i26 == 0) {
                    switch (i27) {
                        case 1:
                            return new v3(e(), m.f47799b);
                        case 2:
                            return new x3(e(), m.f47799b);
                        case 3:
                            return new a4(e(), m.f47799b);
                        case 4:
                            return new f4(e(), m.f47799b);
                        case 5:
                            return new j4(e(), m.f47799b);
                        case 6:
                            return new n4(e(), m.f47799b, m.f47801d);
                        case 7:
                        default:
                            return null;
                        case 8:
                            return new p4(e(), m.f47799b);
                        case 9:
                            return new t4(e(), m.f47799b);
                        case 10:
                            return new u4(e(), m.f47799b);
                        case 11:
                            return new w4(e(), m.f47799b);
                    }
                }
                if (i26 == 1) {
                    switch (i27) {
                        case 0:
                            LingoSkillApplication lingoSkillApplication56 = LingoSkillApplication.f21665b;
                            return x.n().isAudioModel ? new l1(e(), m.f47799b) : new k3(e(), m.f47799b);
                        case 1:
                            return new n1(e(), m.f47799b);
                        case 2:
                            return new q1(e(), m.f47799b);
                        case 3:
                            return new s1(e(), m.f47799b);
                        case 4:
                            return new h3(e(), m.f47799b);
                        case 5:
                            return new y1(e(), m.f47799b);
                        case 6:
                            return new b2(e(), m.f47799b);
                        case 7:
                            return new f2(e(), m.f47799b);
                        case 8:
                            return new s3(e(), m.f47799b);
                        case 9:
                            return new k2(e(), m.f47799b);
                        case 10:
                            return new s2(e(), m.f47799b);
                        case 11:
                        default:
                            return null;
                        case 12:
                            return new v2(e(), m.f47799b);
                        case 13:
                            LingoSkillApplication lingoSkillApplication57 = LingoSkillApplication.f21665b;
                            return x.n().isKeyboard ? new bk.b(e(), m.f47799b) : new z2(e(), m.f47799b);
                    }
                }
                if (i26 != 2) {
                    if (i26 != 3) {
                        if (i26 != 4) {
                            return null;
                        }
                        return new i(e(), str);
                    }
                    mp.b bVarE9 = e();
                    long j19 = m.f47799b;
                    ArrayList optionIds9 = m.f47801d;
                    m.e(optionIds9, "optionIds");
                    return new h1(bVarE9, j19, optionIds9);
                }
                if (i27 == 0) {
                    return new x0(e(), m.f47799b);
                }
                if (i27 == 1) {
                    return new y0(e(), m.f47799b);
                }
                if (i27 == 2) {
                    return new z0(e(), m.f47799b, m.f47801d);
                }
                if (i27 != 3) {
                    return null;
                }
                return new b1(e(), m.f47799b, i13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(mp.b bVar, int i11) {
        super(bVar);
        this.f724g = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String repeatRegex, jp.p0 view, boolean z11, String str, boolean z12, int i11) {
        super(repeatRegex, view, z11, str, z12);
        this.f724g = i11;
        switch (i11) {
            case 12:
                m.f(repeatRegex, "repeatRegex");
                m.f(view, "view");
                super(repeatRegex, view, z11, str, z12);
                break;
            case 20:
                m.f(repeatRegex, "repeatRegex");
                m.f(view, "view");
                super(repeatRegex, view, z11, str, z12);
                break;
            default:
                m.f(repeatRegex, "repeatRegex");
                m.f(view, "view");
                break;
        }
    }
}

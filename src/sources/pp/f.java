package pp;

import android.os.Bundle;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Lesson;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import jp.p0;
import kotlin.jvm.internal.m;
import ns.o;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends e {
    public final long U;
    public final boolean V;
    public String W;
    public Lesson X;
    public boolean Y;
    public boolean Z;

    public f(p0 p0Var, long j11, boolean z11, boolean z12) {
        super(p0Var, z11);
        this.U = j11;
        this.V = z12;
        this.Z = true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0040  */
    @Override // pp.e
    public final boolean d(qi.a testModel) {
        int i11;
        int i12;
        int i13;
        m.f(testModel, "testModel");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i14 = x.n().keyLanguage;
        Env env = this.f46980e;
        if (i14 == 0) {
            i11 = env.csDisplay;
            if ((i11 == 0 && i11 != 1) || testModel.f47798a != 0 || testModel.f47800c != 9) {
                return false;
            }
        } else if (i14 == 1) {
            i12 = env.jsDisPlay;
            if ((i12 == 1 && i12 != 2 && i12 != 5) || testModel.f47798a != 0) {
                return false;
            }
            i13 = testModel.f47800c;
            if (i13 == 5 && i13 != 9) {
                return false;
            }
        } else {
            if (i14 != 2) {
                switch (i14) {
                    case 11:
                        i11 = env.csDisplay;
                        if (i11 == 0) {
                        }
                        break;
                    case 12:
                        i12 = env.jsDisPlay;
                        if (i12 == 1) {
                        }
                        i13 = testModel.f47800c;
                        if (i13 == 5) {
                        }
                        break;
                    case 13:
                        break;
                    default:
                        return false;
                }
            }
            int i15 = env.koDisPlay;
            if ((i15 != 0 && i15 != 1) || testModel.f47798a != 0 || testModel.f47800c != 9) {
                return false;
            }
        }
        return true;
    }

    @Override // pp.e
    public final boolean g() {
        return this.Z;
    }

    @Override // pp.e
    public final ArrayList h() {
        if (this.f46977b) {
            return new ArrayList();
        }
        Thread.currentThread().getName();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2 && i11 != 7 && i11 != 51 && i11 != 55 && i11 != 57 && i11 != 61 && i11 != 63 && i11 != 65) {
                switch (i11) {
                    case 11:
                        break;
                    case 12:
                    case 13:
                        break;
                    default:
                        q qVar = fv.b.f28186a;
                        Lesson lesson = this.X;
                        if (lesson == null) {
                            m.n("lesson");
                            throw null;
                        }
                        String strQ = fv.b.q(lesson.getLessonId());
                        Lesson lesson2 = this.X;
                        if (lesson2 == null) {
                            m.n("lesson");
                            throw null;
                        }
                        fv.a aVar = new fv.a(2L, strQ, fv.b.n(lesson2.getLessonId()));
                        Lesson lesson3 = this.X;
                        if (lesson3 == null) {
                            m.n("lesson");
                            throw null;
                        }
                        String strK = fv.g.k(lesson3.getLessonId());
                        Lesson lesson4 = this.X;
                        if (lesson4 != null) {
                            return o.b(aVar, new fv.a(3L, strK, fv.b.s(lesson4.getLessonId())));
                        }
                        m.n("lesson");
                        throw null;
                }
            }
            q qVar2 = fv.b.f28186a;
            Lesson lesson5 = this.X;
            if (lesson5 == null) {
                m.n("lesson");
                throw null;
            }
            String strI = fv.b.i(lesson5.getLessonId());
            Lesson lesson6 = this.X;
            if (lesson6 == null) {
                m.n("lesson");
                throw null;
            }
            fv.a aVar2 = new fv.a(1L, strI, fv.b.f(lesson6.getLessonId()));
            Lesson lesson7 = this.X;
            if (lesson7 == null) {
                m.n("lesson");
                throw null;
            }
            String strQ2 = fv.b.q(lesson7.getLessonId());
            Lesson lesson8 = this.X;
            if (lesson8 == null) {
                m.n("lesson");
                throw null;
            }
            fv.a aVar3 = new fv.a(2L, strQ2, fv.b.n(lesson8.getLessonId()));
            Lesson lesson9 = this.X;
            if (lesson9 == null) {
                m.n("lesson");
                throw null;
            }
            String strK2 = fv.g.k(lesson9.getLessonId());
            Lesson lesson10 = this.X;
            if (lesson10 != null) {
                return o.b(aVar2, aVar3, new fv.a(3L, strK2, fv.b.s(lesson10.getLessonId())));
            }
            m.n("lesson");
            throw null;
        }
        q qVar3 = fv.b.f28186a;
        Lesson lesson11 = this.X;
        if (lesson11 == null) {
            m.n("lesson");
            throw null;
        }
        String strI2 = fv.b.i(lesson11.getLessonId());
        Lesson lesson12 = this.X;
        if (lesson12 == null) {
            m.n("lesson");
            throw null;
        }
        fv.a aVar4 = new fv.a(1L, strI2, fv.b.f(lesson12.getLessonId()));
        Lesson lesson13 = this.X;
        if (lesson13 == null) {
            m.n("lesson");
            throw null;
        }
        String strQ3 = fv.b.q(lesson13.getLessonId());
        Lesson lesson14 = this.X;
        if (lesson14 == null) {
            m.n("lesson");
            throw null;
        }
        fv.a aVar5 = new fv.a(2L, strQ3, fv.b.n(lesson14.getLessonId()));
        Lesson lesson15 = this.X;
        if (lesson15 == null) {
            m.n("lesson");
            throw null;
        }
        String strK3 = fv.g.k(lesson15.getLessonId());
        Lesson lesson16 = this.X;
        if (lesson16 == null) {
            m.n("lesson");
            throw null;
        }
        fv.a aVar6 = new fv.a(3L, strK3, fv.b.s(lesson16.getLessonId()));
        Lesson lesson17 = this.X;
        if (lesson17 == null) {
            m.n("lesson");
            throw null;
        }
        String strT = fv.b.t(lesson17.getLessonId());
        Lesson lesson18 = this.X;
        if (lesson18 != null) {
            return o.b(aVar4, aVar5, aVar6, new fv.a(8L, strT, fv.b.u(lesson18.getLessonId())));
        }
        m.n("lesson");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0285  */
    /* JADX WARN: Code duplicated, block: B:156:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:157:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:158:0x0301  */
    /* JADX WARN: Code duplicated, block: B:159:0x0304  */
    /* JADX WARN: Code duplicated, block: B:160:0x0307  */
    /* JADX WARN: Code duplicated, block: B:161:0x030a  */
    /* JADX WARN: Code duplicated, block: B:162:0x030d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0369  */
    /* JADX WARN: Code duplicated, block: B:180:0x037d  */
    /* JADX WARN: Code duplicated, block: B:198:0x03de  */
    /* JADX WARN: Code duplicated, block: B:199:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:207:0x0418  */
    /* JADX WARN: Code duplicated, block: B:208:0x042c  */
    /* JADX WARN: Code duplicated, block: B:216:0x0452  */
    /* JADX WARN: Code duplicated, block: B:217:0x0466  */
    /* JADX WARN: Code duplicated, block: B:235:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:236:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:244:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:245:0x050f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0535  */
    /* JADX WARN: Code duplicated, block: B:254:0x0549  */
    /* JADX WARN: Code duplicated, block: B:310:0x068a  */
    /* JADX WARN: Code duplicated, block: B:312:0x0690  */
    /* JADX WARN: Code duplicated, block: B:315:0x06a5  */
    @Override // pp.e
    public final void r(Bundle bundle) {
        String str;
        ai.b bVar;
        ai.b bVar2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ai.b bVar3;
        ai.b bVar4;
        Thread.currentThread().getName();
        long j11 = this.U;
        if (ij.d.f34419e == null) {
            synchronized (ij.d.class) {
                if (ij.d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    ij.d.f34419e = new ij.d(lingoSkillApplication);
                }
            }
        }
        ij.d dVar = ij.d.f34419e;
        m.c(dVar);
        Object objLoad = dVar.p().load(Long.valueOf(j11));
        m.e(objLoad, "load(...)");
        Lesson lesson = (Lesson) objLoad;
        this.X = lesson;
        this.T = lesson.getUnitId();
        Env env = this.f46980e;
        int i11 = 0;
        int i12 = 1;
        if (env.isRepeatRegex) {
            Lesson lesson2 = this.X;
            if (lesson2 == null) {
                m.n("lesson");
                throw null;
            }
            String repeatRegex = lesson2.getRepeatRegex();
            m.e(repeatRegex, "getRepeatRegex(...)");
            this.W = repeatRegex;
            this.Y = true;
        } else if (env.isLessonTestChallenge) {
            Lesson lesson3 = this.X;
            if (lesson3 == null) {
                m.n("lesson");
                throw null;
            }
            String challengeRegex = lesson3.getChallengeRegex();
            m.e(challengeRegex, "getChallengeRegex(...)");
            this.W = challengeRegex;
            this.Y = true;
        } else {
            Lesson lesson4 = this.X;
            if (lesson4 == null) {
                m.n("lesson");
                throw null;
            }
            String lastRegex = lesson4.getLastRegex();
            m.e(lastRegex, "getLastRegex(...)");
            this.W = lastRegex;
            this.Y = false;
        }
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        int i13 = x.n().keyLanguage;
        if (i13 == 40) {
            if (bundle == null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                p0 view = this.f46976a;
                m.f(view, "view");
                bVar = new ai.b(view, i12);
            } else {
                str = this.W;
                if (str == null) {
                    m.n("mRepeatRegex");
                    throw null;
                }
                p0 view2 = this.f46976a;
                boolean z11 = this.Y;
                boolean z12 = this.f46977b;
                m.f(view2, "view");
                bVar = new ai.b(str, (mp.b) view2, z11, BuildConfig.VERSION_NAME, z12, 1);
            }
        } else if (i13 != 57) {
            if (i13 != 61) {
                if (i13 != 63) {
                    if (i13 != 65) {
                        if (i13 != 69) {
                            switch (i13) {
                                case 0:
                                    if (bundle == null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        p0 view3 = this.f46976a;
                                        m.f(view3, "view");
                                        bVar = new ai.b(view3, 15);
                                    } else {
                                        str2 = this.W;
                                        if (str2 != null) {
                                            m.n("mRepeatRegex");
                                            throw null;
                                        }
                                        p0 view4 = this.f46976a;
                                        boolean z13 = this.Y;
                                        boolean z14 = this.f46977b;
                                        m.f(view4, "view");
                                        bVar2 = new ai.b(str2, (mp.b) view4, z13, BuildConfig.VERSION_NAME, z14, 15);
                                        bVar = bVar2;
                                    }
                                    break;
                                case 1:
                                    if (bundle == null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        p0 view5 = this.f46976a;
                                        m.f(view5, "view");
                                        bVar = new ai.b(view5, 7);
                                    } else {
                                        str3 = this.W;
                                        if (str3 != null) {
                                            m.n("mRepeatRegex");
                                            throw null;
                                        }
                                        p0 view6 = this.f46976a;
                                        boolean z15 = this.Y;
                                        boolean z16 = this.f46977b;
                                        m.f(view6, "view");
                                        bVar2 = new ai.b(str3, (mp.b) view6, z15, BuildConfig.VERSION_NAME, z16, 7);
                                        bVar = bVar2;
                                    }
                                    break;
                                case 2:
                                    if (bundle == null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        p0 view7 = this.f46976a;
                                        m.f(view7, "view");
                                        bVar = new ai.b(view7, 3);
                                    } else {
                                        str4 = this.W;
                                        if (str4 != null) {
                                            m.n("mRepeatRegex");
                                            throw null;
                                        }
                                        p0 view8 = this.f46976a;
                                        boolean z17 = this.Y;
                                        boolean z18 = this.f46977b;
                                        m.f(view8, "view");
                                        bVar2 = new ai.b(str4, (mp.b) view8, z17, BuildConfig.VERSION_NAME, z18, 3);
                                        bVar = bVar2;
                                    }
                                    break;
                                case 3:
                                    if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        p0 view9 = this.f46976a;
                                        m.f(view9, "view");
                                        bVar = new ai.b(view9, 4);
                                    } else {
                                        String str9 = this.W;
                                        if (str9 == null) {
                                            m.n("mRepeatRegex");
                                            throw null;
                                        }
                                        p0 view10 = this.f46976a;
                                        boolean z19 = this.Y;
                                        boolean z20 = this.f46977b;
                                        m.f(view10, "view");
                                        bVar2 = new ai.b(str9, (mp.b) view10, z19, BuildConfig.VERSION_NAME, z20, 4);
                                        bVar = bVar2;
                                    }
                                    break;
                                case 4:
                                    if (bundle == null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        p0 view11 = this.f46976a;
                                        m.f(view11, "view");
                                        bVar = new ai.b(view11, 8);
                                    } else {
                                        str5 = this.W;
                                        if (str5 != null) {
                                            m.n("mRepeatRegex");
                                            throw null;
                                        }
                                        p0 view12 = this.f46976a;
                                        boolean z21 = this.Y;
                                        boolean z22 = this.f46977b;
                                        m.f(view12, "view");
                                        bVar2 = new ai.b(str5, (mp.b) view12, z21, BuildConfig.VERSION_NAME, z22, 8);
                                        bVar = bVar2;
                                    }
                                    break;
                                case 5:
                                    if (bundle == null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        p0 view13 = this.f46976a;
                                        m.f(view13, "view");
                                        bVar = new ai.b(view13, 17);
                                    } else {
                                        str6 = this.W;
                                        if (str6 != null) {
                                            m.n("mRepeatRegex");
                                            throw null;
                                        }
                                        p0 view14 = this.f46976a;
                                        boolean z23 = this.Y;
                                        boolean z24 = this.f46977b;
                                        m.f(view14, "view");
                                        bVar2 = new ai.b(str6, (mp.b) view14, z23, BuildConfig.VERSION_NAME, z24, 17);
                                        bVar = bVar2;
                                    }
                                    break;
                                case 6:
                                    if (bundle == null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        p0 view15 = this.f46976a;
                                        m.f(view15, "view");
                                        bVar = new ai.b(view15, 14);
                                    } else {
                                        str7 = this.W;
                                        if (str7 != null) {
                                            m.n("mRepeatRegex");
                                            throw null;
                                        }
                                        p0 view16 = this.f46976a;
                                        boolean z25 = this.Y;
                                        boolean z26 = this.f46977b;
                                        m.f(view16, "view");
                                        bVar2 = new ai.b(str7, (mp.b) view16, z25, BuildConfig.VERSION_NAME, z26, 14);
                                        bVar = bVar2;
                                    }
                                    break;
                                case 7:
                                    if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        p0 view17 = this.f46976a;
                                        m.f(view17, "view");
                                        bVar = new ai.b(view17, 11);
                                    } else {
                                        String str10 = this.W;
                                        if (str10 == null) {
                                            m.n("mRepeatRegex");
                                            throw null;
                                        }
                                        p0 view18 = this.f46976a;
                                        boolean z27 = this.Y;
                                        boolean z28 = this.f46977b;
                                        m.f(view18, "view");
                                        bVar2 = new ai.b(str10, (mp.b) view18, z27, BuildConfig.VERSION_NAME, z28, 11);
                                        bVar = bVar2;
                                    }
                                    break;
                                case 8:
                                    if (bundle == null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        p0 view19 = this.f46976a;
                                        m.f(view19, "view");
                                        bVar = new ai.b(view19, 19);
                                    } else {
                                        str8 = this.W;
                                        if (str8 != null) {
                                            m.n("mRepeatRegex");
                                            throw null;
                                        }
                                        p0 view20 = this.f46976a;
                                        boolean z29 = this.Y;
                                        boolean z30 = this.f46977b;
                                        m.f(view20, "view");
                                        bVar2 = new ai.b(str8, (mp.b) view20, z29, BuildConfig.VERSION_NAME, z30, 19);
                                        bVar = bVar2;
                                    }
                                    break;
                                default:
                                    switch (i13) {
                                        case 10:
                                        case 22:
                                            if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                p0 view21 = this.f46976a;
                                                m.f(view21, "view");
                                                bVar = new ai.b(view21, 6);
                                            } else {
                                                String str11 = this.W;
                                                if (str11 == null) {
                                                    m.n("mRepeatRegex");
                                                    throw null;
                                                }
                                                p0 view22 = this.f46976a;
                                                boolean z31 = this.Y;
                                                boolean z32 = this.f46977b;
                                                m.f(view22, "view");
                                                bVar2 = new ai.b(str11, (mp.b) view22, z31, BuildConfig.VERSION_NAME, z32, 6);
                                                bVar = bVar2;
                                            }
                                            break;
                                        case 11:
                                            if (bundle == null) {
                                            }
                                            str2 = this.W;
                                            if (str2 != null) {
                                                m.n("mRepeatRegex");
                                                throw null;
                                            }
                                            p0 view23 = this.f46976a;
                                            boolean z110 = this.Y;
                                            boolean z111 = this.f46977b;
                                            m.f(view23, "view");
                                            bVar2 = new ai.b(str2, (mp.b) view23, z110, BuildConfig.VERSION_NAME, z111, 15);
                                            bVar = bVar2;
                                            break;
                                            break;
                                        case 12:
                                            if (bundle == null) {
                                            }
                                            str3 = this.W;
                                            if (str3 != null) {
                                                m.n("mRepeatRegex");
                                                throw null;
                                            }
                                            p0 view24 = this.f46976a;
                                            boolean z112 = this.Y;
                                            boolean z113 = this.f46977b;
                                            m.f(view24, "view");
                                            bVar2 = new ai.b(str3, (mp.b) view24, z112, BuildConfig.VERSION_NAME, z113, 7);
                                            bVar = bVar2;
                                            break;
                                            break;
                                        case 13:
                                            if (bundle == null) {
                                            }
                                            str4 = this.W;
                                            if (str4 != null) {
                                                m.n("mRepeatRegex");
                                                throw null;
                                            }
                                            p0 view25 = this.f46976a;
                                            boolean z114 = this.Y;
                                            boolean z115 = this.f46977b;
                                            m.f(view25, "view");
                                            bVar2 = new ai.b(str4, (mp.b) view25, z114, BuildConfig.VERSION_NAME, z115, 3);
                                            bVar = bVar2;
                                            break;
                                            break;
                                        case 14:
                                            if (bundle == null) {
                                            }
                                            str5 = this.W;
                                            if (str5 != null) {
                                                m.n("mRepeatRegex");
                                                throw null;
                                            }
                                            p0 view110 = this.f46976a;
                                            boolean z210 = this.Y;
                                            boolean z211 = this.f46977b;
                                            m.f(view110, "view");
                                            bVar2 = new ai.b(str5, (mp.b) view110, z210, BuildConfig.VERSION_NAME, z211, 8);
                                            bVar = bVar2;
                                            break;
                                            break;
                                        case 15:
                                            if (bundle == null) {
                                            }
                                            str6 = this.W;
                                            if (str6 != null) {
                                                m.n("mRepeatRegex");
                                                throw null;
                                            }
                                            p0 view111 = this.f46976a;
                                            boolean z212 = this.Y;
                                            boolean z213 = this.f46977b;
                                            m.f(view111, "view");
                                            bVar2 = new ai.b(str6, (mp.b) view111, z212, BuildConfig.VERSION_NAME, z213, 17);
                                            bVar = bVar2;
                                            break;
                                            break;
                                        case 16:
                                            if (bundle == null) {
                                            }
                                            str7 = this.W;
                                            if (str7 != null) {
                                                m.n("mRepeatRegex");
                                                throw null;
                                            }
                                            p0 view112 = this.f46976a;
                                            boolean z214 = this.Y;
                                            boolean z215 = this.f46977b;
                                            m.f(view112, "view");
                                            bVar2 = new ai.b(str7, (mp.b) view112, z214, BuildConfig.VERSION_NAME, z215, 14);
                                            bVar = bVar2;
                                            break;
                                            break;
                                        case 17:
                                            if (bundle == null) {
                                            }
                                            str8 = this.W;
                                            if (str8 != null) {
                                                m.n("mRepeatRegex");
                                                throw null;
                                            }
                                            p0 view26 = this.f46976a;
                                            boolean z216 = this.Y;
                                            boolean z33 = this.f46977b;
                                            m.f(view26, "view");
                                            bVar2 = new ai.b(str8, (mp.b) view26, z216, BuildConfig.VERSION_NAME, z33, 19);
                                            bVar = bVar2;
                                            break;
                                            break;
                                        case 18:
                                            if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                p0 view27 = this.f46976a;
                                                m.f(view27, "view");
                                                bVar = new ai.b(view27, 18);
                                            } else {
                                                String str12 = this.W;
                                                if (str12 == null) {
                                                    m.n("mRepeatRegex");
                                                    throw null;
                                                }
                                                p0 view28 = this.f46976a;
                                                boolean z34 = this.Y;
                                                boolean z35 = this.f46977b;
                                                String str13 = BuildConfig.VERSION_NAME;
                                                m.f(view28, "view");
                                                bVar2 = new ai.b(str12, (mp.b) view28, z34, str13, z35, 18);
                                                bVar = bVar2;
                                            }
                                            break;
                                        case 19:
                                            if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                p0 view29 = this.f46976a;
                                                m.f(view29, "view");
                                                bVar = new ai.b(view29, 13);
                                            } else {
                                                String str14 = this.W;
                                                if (str14 == null) {
                                                    m.n("mRepeatRegex");
                                                    throw null;
                                                }
                                                p0 view30 = this.f46976a;
                                                boolean z36 = this.Y;
                                                boolean z37 = this.f46977b;
                                                String str15 = BuildConfig.VERSION_NAME;
                                                m.f(view30, "view");
                                                bVar2 = new ai.b(str14, (mp.b) view30, z36, str15, z37, 13);
                                                bVar = bVar2;
                                            }
                                            break;
                                        case 20:
                                            if (bundle == null) {
                                                str = this.W;
                                                if (str == null) {
                                                    m.n("mRepeatRegex");
                                                    throw null;
                                                }
                                                p0 view31 = this.f46976a;
                                                boolean z116 = this.Y;
                                                boolean z117 = this.f46977b;
                                                m.f(view31, "view");
                                                bVar = new ai.b(str, (mp.b) view31, z116, BuildConfig.VERSION_NAME, z117, 1);
                                            } else {
                                                str = this.W;
                                                if (str == null) {
                                                    m.n("mRepeatRegex");
                                                    throw null;
                                                }
                                                p0 view32 = this.f46976a;
                                                boolean z118 = this.Y;
                                                boolean z119 = this.f46977b;
                                                m.f(view32, "view");
                                                bVar = new ai.b(str, (mp.b) view32, z118, BuildConfig.VERSION_NAME, z119, 1);
                                            }
                                            break;
                                        case 21:
                                            if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                p0 view33 = this.f46976a;
                                                m.f(view33, "view");
                                                bVar = new ai.b(view33, 21);
                                            } else {
                                                String str16 = this.W;
                                                if (str16 == null) {
                                                    m.n("mRepeatRegex");
                                                    throw null;
                                                }
                                                p0 view34 = this.f46976a;
                                                boolean z38 = this.Y;
                                                boolean z39 = this.f46977b;
                                                String str17 = BuildConfig.VERSION_NAME;
                                                m.f(view34, "view");
                                                bVar2 = new ai.b(str16, (mp.b) view34, z38, str17, z39, 21);
                                                bVar = bVar2;
                                            }
                                            break;
                                        default:
                                            switch (i13) {
                                                case 47:
                                                case 48:
                                                    if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                        p0 view35 = this.f46976a;
                                                        m.f(view35, "view");
                                                        bVar = new ai.b(view35, 12);
                                                    } else {
                                                        if (this.V) {
                                                            p0 p0Var = this.f46976a;
                                                            boolean z40 = this.Y;
                                                            Lesson lesson5 = this.X;
                                                            if (lesson5 == null) {
                                                                m.n("lesson");
                                                                throw null;
                                                            }
                                                            String normalRegex = lesson5.getNormalRegex();
                                                            m.e(normalRegex, "getNormalRegex(...)");
                                                            bVar3 = new ai.b(BuildConfig.VERSION_NAME, p0Var, z40, normalRegex, this.f46977b, 12);
                                                        } else {
                                                            String str18 = this.W;
                                                            if (str18 == null) {
                                                                m.n("mRepeatRegex");
                                                                throw null;
                                                            }
                                                            p0 p0Var2 = this.f46976a;
                                                            boolean z41 = this.Y;
                                                            Lesson lesson6 = this.X;
                                                            if (lesson6 == null) {
                                                                m.n("lesson");
                                                                throw null;
                                                            }
                                                            String normalRegex2 = lesson6.getNormalRegex();
                                                            m.e(normalRegex2, "getNormalRegex(...)");
                                                            bVar3 = new ai.b(str18, p0Var2, z41, normalRegex2, this.f46977b, 12);
                                                        }
                                                        bVar = bVar3;
                                                    }
                                                    break;
                                                case 49:
                                                case 50:
                                                    if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                        p0 view36 = this.f46976a;
                                                        m.f(view36, "view");
                                                        bVar = new ai.b(view36, 20);
                                                    } else {
                                                        if (this.V) {
                                                            p0 p0Var3 = this.f46976a;
                                                            boolean z42 = this.Y;
                                                            Lesson lesson7 = this.X;
                                                            if (lesson7 == null) {
                                                                m.n("lesson");
                                                                throw null;
                                                            }
                                                            String normalRegex3 = lesson7.getNormalRegex();
                                                            m.e(normalRegex3, "getNormalRegex(...)");
                                                            bVar3 = new ai.b(BuildConfig.VERSION_NAME, p0Var3, z42, normalRegex3, this.f46977b, 20);
                                                        } else {
                                                            String str19 = this.W;
                                                            if (str19 == null) {
                                                                m.n("mRepeatRegex");
                                                                throw null;
                                                            }
                                                            p0 p0Var4 = this.f46976a;
                                                            boolean z43 = this.Y;
                                                            Lesson lesson8 = this.X;
                                                            if (lesson8 == null) {
                                                                m.n("lesson");
                                                                throw null;
                                                            }
                                                            String normalRegex4 = lesson8.getNormalRegex();
                                                            m.e(normalRegex4, "getNormalRegex(...)");
                                                            bVar3 = new ai.b(str19, p0Var4, z43, normalRegex4, this.f46977b, 20);
                                                        }
                                                        bVar = bVar3;
                                                    }
                                                    break;
                                                default:
                                                    switch (i13) {
                                                        case 53:
                                                        case 54:
                                                            if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                                p0 view37 = this.f46976a;
                                                                m.f(view37, "view");
                                                                bVar = new ai.b(view37, 2);
                                                            } else {
                                                                if (this.V) {
                                                                    p0 p0Var5 = this.f46976a;
                                                                    boolean z44 = this.Y;
                                                                    Lesson lesson9 = this.X;
                                                                    if (lesson9 == null) {
                                                                        m.n("lesson");
                                                                        throw null;
                                                                    }
                                                                    String normalRegex5 = lesson9.getNormalRegex();
                                                                    m.e(normalRegex5, "getNormalRegex(...)");
                                                                    bVar4 = new ai.b(BuildConfig.VERSION_NAME, p0Var5, z44, normalRegex5, this.f46977b, 2);
                                                                } else {
                                                                    String str20 = this.W;
                                                                    if (str20 == null) {
                                                                        m.n("mRepeatRegex");
                                                                        throw null;
                                                                    }
                                                                    p0 p0Var6 = this.f46976a;
                                                                    boolean z45 = this.Y;
                                                                    Lesson lesson10 = this.X;
                                                                    if (lesson10 == null) {
                                                                        m.n("lesson");
                                                                        throw null;
                                                                    }
                                                                    String normalRegex6 = lesson10.getNormalRegex();
                                                                    m.e(normalRegex6, "getNormalRegex(...)");
                                                                    bVar4 = new ai.b(str20, p0Var6, z45, normalRegex6, this.f46977b, 2);
                                                                }
                                                                bVar = bVar4;
                                                            }
                                                            break;
                                                        case 55:
                                                            break;
                                                        default:
                                                            throw new IllegalArgumentException();
                                                    }
                                                case 51:
                                                    if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                        p0 view38 = this.f46976a;
                                                        m.f(view38, "view");
                                                        bVar = new ai.b(view38, i11);
                                                    } else {
                                                        String str21 = this.W;
                                                        if (str21 == null) {
                                                            m.n("mRepeatRegex");
                                                            throw null;
                                                        }
                                                        p0 view39 = this.f46976a;
                                                        boolean z46 = this.Y;
                                                        boolean z47 = this.f46977b;
                                                        m.f(view39, "view");
                                                        bVar = new ai.b(str21, (mp.b) view39, z46, BuildConfig.VERSION_NAME, z47, 0);
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                            String str22 = this.W;
                            if (str22 == null) {
                                m.n("mRepeatRegex");
                                throw null;
                            }
                            p0 view40 = this.f46976a;
                            boolean z48 = this.Y;
                            boolean z49 = this.f46977b;
                            String str23 = BuildConfig.VERSION_NAME;
                            m.f(view40, "view");
                            bVar2 = new ai.b(str22, (mp.b) view40, z48, str23, z49, 9);
                            bVar = bVar2;
                        } else {
                            p0 view41 = this.f46976a;
                            m.f(view41, "view");
                            bVar = new ai.b(view41, 9);
                        }
                    } else if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                        String str24 = this.W;
                        if (str24 == null) {
                            m.n("mRepeatRegex");
                            throw null;
                        }
                        p0 view42 = this.f46976a;
                        boolean z50 = this.Y;
                        boolean z51 = this.f46977b;
                        String str25 = BuildConfig.VERSION_NAME;
                        m.f(view42, "view");
                        bVar2 = new ai.b(str24, (mp.b) view42, z50, str25, z51, 5);
                        bVar = bVar2;
                    } else {
                        p0 view43 = this.f46976a;
                        m.f(view43, "view");
                        bVar = new ai.b(view43, 5);
                    }
                } else if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                    String str26 = this.W;
                    if (str26 == null) {
                        m.n("mRepeatRegex");
                        throw null;
                    }
                    p0 view44 = this.f46976a;
                    boolean z52 = this.Y;
                    boolean z53 = this.f46977b;
                    String str27 = BuildConfig.VERSION_NAME;
                    m.f(view44, "view");
                    bVar2 = new ai.b(str26, (mp.b) view44, z52, str27, z53, 22);
                    bVar = bVar2;
                } else {
                    p0 view45 = this.f46976a;
                    m.f(view45, "view");
                    bVar = new ai.b(view45, 22);
                }
            } else if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                String str28 = this.W;
                if (str28 == null) {
                    m.n("mRepeatRegex");
                    throw null;
                }
                p0 view46 = this.f46976a;
                boolean z54 = this.Y;
                boolean z55 = this.f46977b;
                String str29 = BuildConfig.VERSION_NAME;
                m.f(view46, "view");
                bVar2 = new ai.b(str28, (mp.b) view46, z54, str29, z55, 10);
                bVar = bVar2;
            } else {
                p0 view47 = this.f46976a;
                m.f(view47, "view");
                bVar = new ai.b(view47, 10);
            }
        } else if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
            String str30 = this.W;
            if (str30 == null) {
                m.n("mRepeatRegex");
                throw null;
            }
            p0 view48 = this.f46976a;
            boolean z56 = this.Y;
            boolean z57 = this.f46977b;
            String str31 = BuildConfig.VERSION_NAME;
            m.f(view48, "view");
            bVar2 = new ai.b(str30, (mp.b) view48, z56, str31, z57, 16);
            bVar = bVar2;
        } else {
            p0 view49 = this.f46976a;
            m.f(view49, "view");
            bVar = new ai.b(view49, 16);
        }
        this.f46981f = bVar;
    }

    @Override // pp.e
    public final void x(qi.a testModel) {
        List list;
        m.f(testModel, "testModel");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    switch (i11) {
                    }
                }
            }
            List list2 = testModel.f47802e;
            if (list2 != null && testModel.f47800c == 5) {
                list2.remove((Object) 5);
                return;
            } else {
                if (list2 == null || testModel.f47800c != 9) {
                    return;
                }
                list2.remove((Object) 9);
                return;
            }
        }
        if (testModel.f47798a == 0 && testModel.f47800c == 9 && (list = testModel.f47802e) != null) {
            list.remove((Object) 9);
        }
    }

    @Override // pp.e
    public final void y() {
        this.Z = true;
    }
}

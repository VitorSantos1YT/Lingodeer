package jr;

import android.content.Context;
import android.os.Bundle;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b0.c2;
import b0.f1;
import b7.e0;
import bh.a1;
import bh.x0;
import com.google.api.Service;
import com.google.common.util.concurrent.ListenableFuture;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.ReviewStatus;
import com.lingodeer.data.model.SyllableLessonStatus;
import com.lingodeer.data.model.SyllableWriteLesson;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.yalantis.ucrop.view.CropImageView;
import fr.f4;
import fr.n3;
import fr.o0;
import h1.x8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kr.c1;
import l1.b1;
import l1.z1;
import mt.q2;
import n9.n1;
import n9.w0;
import n9.y1;
import ot.o1;
import ot.o2;
import rt.b6;
import rt.dd;
import rt.e3;
import rt.j2;
import rt.ja;
import rt.m9;
import rt.mf;
import rt.y9;
import vt.n0;
import vt.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f36646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f36647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f36648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f36649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f36644a = i11;
        this.f36648e = obj;
        this.f36649f = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:46:0x011a A[RETURN] */
    private final Object e(Object obj) {
        int i11;
        Object objM;
        String str = (String) this.f36646c;
        ur.a aVar = (ur.a) this.f36648e;
        pt.d dVar = (pt.d) this.f36647d;
        n0 n0Var = dVar.f47144a;
        final CourseLesson courseLesson = (CourseLesson) this.f36649f;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f36645b;
        qy.b0 b0Var = qy.b0.f48488a;
        final int i13 = 0;
        final int i14 = 2;
        final int i15 = 1;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2 || i12 == 3) {
                    com.bumptech.glide.e.F(obj);
                    if (ry.l.D(new Integer[]{new Integer(51), new Integer(55)}, new Integer(((o0) n0Var).f27733a.keyLanguage))) {
                        this.f36645b = 4;
                        if (((o0) n0Var).P(false, this) != aVar2) {
                            i11 = pt.c.f47143a[CoursePracticeType.valueOf(str).ordinal()];
                            if (i11 != 2) {
                                aVar.c("jxz_main_dialogue_warmup", new fz.a() { // from class: pt.b
                                    @Override // fz.a
                                    public final Object invoke() {
                                        Bundle bundle;
                                        int unitSortIndex;
                                        String str2;
                                        switch (i13) {
                                            case 0:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            case 1:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            default:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                        }
                                        e0.v(unitSortIndex, bundle, str2, "unit");
                                        return bundle;
                                    }
                                });
                            } else if (i11 != 3) {
                                aVar.c("jxz_main_dialogue_practice", new fz.a() { // from class: pt.b
                                    @Override // fz.a
                                    public final Object invoke() {
                                        Bundle bundle;
                                        int unitSortIndex;
                                        String str2;
                                        switch (i15) {
                                            case 0:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            case 1:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            default:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                        }
                                        e0.v(unitSortIndex, bundle, str2, "unit");
                                        return bundle;
                                    }
                                });
                            } else if (i11 != 4) {
                                aVar.c("jxz_main_lesson_start", new z1(28, courseLesson, str));
                            } else {
                                aVar.c("jxz_main_dialogue_speak", new fz.a() { // from class: pt.b
                                    @Override // fz.a
                                    public final Object invoke() {
                                        Bundle bundle;
                                        int unitSortIndex;
                                        String str2;
                                        switch (i14) {
                                            case 0:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            case 1:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            default:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                        }
                                        e0.v(unitSortIndex, bundle, str2, "unit");
                                        return bundle;
                                    }
                                });
                            }
                            vt.k0 k0Var = dVar.f47145b;
                            int i16 = ((o0) n0Var).f27733a.keyLanguage;
                            long unitId = courseLesson.getUnitId();
                            int sortIndex = courseLesson.getSortIndex();
                            this.f36645b = 5;
                            a1 a1Var = (a1) k0Var;
                            a1Var.getClass();
                            yz.f fVar = rz.o0.f50940a;
                            objM = rz.e0.M(yz.e.f58387a, new x0(i16, sortIndex, unitId, a1Var, null), this);
                            if (objM != aVar2) {
                                objM = b0Var;
                            }
                            if (objM != aVar2) {
                            }
                        }
                    } else {
                        i11 = pt.c.f47143a[CoursePracticeType.valueOf(str).ordinal()];
                        if (i11 != 2) {
                            aVar.c("jxz_main_dialogue_warmup", new fz.a() { // from class: pt.b
                                @Override // fz.a
                                public final Object invoke() {
                                    Bundle bundle;
                                    int unitSortIndex;
                                    String str2;
                                    switch (i13) {
                                        case 0:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        case 1:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        default:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                    }
                                    e0.v(unitSortIndex, bundle, str2, "unit");
                                    return bundle;
                                }
                            });
                        } else if (i11 != 3) {
                            aVar.c("jxz_main_dialogue_practice", new fz.a() { // from class: pt.b
                                @Override // fz.a
                                public final Object invoke() {
                                    Bundle bundle;
                                    int unitSortIndex;
                                    String str2;
                                    switch (i15) {
                                        case 0:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        case 1:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        default:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                    }
                                    e0.v(unitSortIndex, bundle, str2, "unit");
                                    return bundle;
                                }
                            });
                        } else if (i11 != 4) {
                            aVar.c("jxz_main_lesson_start", new z1(28, courseLesson, str));
                        } else {
                            aVar.c("jxz_main_dialogue_speak", new fz.a() { // from class: pt.b
                                @Override // fz.a
                                public final Object invoke() {
                                    Bundle bundle;
                                    int unitSortIndex;
                                    String str2;
                                    switch (i14) {
                                        case 0:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        case 1:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        default:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                    }
                                    e0.v(unitSortIndex, bundle, str2, "unit");
                                    return bundle;
                                }
                            });
                        }
                        vt.k0 k0Var2 = dVar.f47145b;
                        int i17 = ((o0) n0Var).f27733a.keyLanguage;
                        long unitId2 = courseLesson.getUnitId();
                        int sortIndex2 = courseLesson.getSortIndex();
                        this.f36645b = 5;
                        a1 a1Var2 = (a1) k0Var2;
                        a1Var2.getClass();
                        yz.f fVar2 = rz.o0.f50940a;
                        objM = rz.e0.M(yz.e.f58387a, new x0(i17, sortIndex2, unitId2, a1Var2, null), this);
                        if (objM != aVar2) {
                            objM = b0Var;
                        }
                        if (objM != aVar2) {
                        }
                    }
                    return aVar2;
                }
                if (i12 != 4) {
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            }
            com.bumptech.glide.e.F(obj);
            i11 = pt.c.f47143a[CoursePracticeType.valueOf(str).ordinal()];
            if (i11 != 2) {
                aVar.c("jxz_main_dialogue_warmup", new fz.a() { // from class: pt.b
                    @Override // fz.a
                    public final Object invoke() {
                        Bundle bundle;
                        int unitSortIndex;
                        String str2;
                        switch (i13) {
                            case 0:
                                bundle = new Bundle();
                                unitSortIndex = courseLesson.getUnitSortIndex();
                                str2 = "U";
                                break;
                            case 1:
                                bundle = new Bundle();
                                unitSortIndex = courseLesson.getUnitSortIndex();
                                str2 = "U";
                                break;
                            default:
                                bundle = new Bundle();
                                unitSortIndex = courseLesson.getUnitSortIndex();
                                str2 = "U";
                                break;
                        }
                        e0.v(unitSortIndex, bundle, str2, "unit");
                        return bundle;
                    }
                });
            } else if (i11 != 3) {
                aVar.c("jxz_main_dialogue_practice", new fz.a() { // from class: pt.b
                    @Override // fz.a
                    public final Object invoke() {
                        Bundle bundle;
                        int unitSortIndex;
                        String str2;
                        switch (i15) {
                            case 0:
                                bundle = new Bundle();
                                unitSortIndex = courseLesson.getUnitSortIndex();
                                str2 = "U";
                                break;
                            case 1:
                                bundle = new Bundle();
                                unitSortIndex = courseLesson.getUnitSortIndex();
                                str2 = "U";
                                break;
                            default:
                                bundle = new Bundle();
                                unitSortIndex = courseLesson.getUnitSortIndex();
                                str2 = "U";
                                break;
                        }
                        e0.v(unitSortIndex, bundle, str2, "unit");
                        return bundle;
                    }
                });
            } else if (i11 != 4) {
                aVar.c("jxz_main_lesson_start", new z1(28, courseLesson, str));
            } else {
                aVar.c("jxz_main_dialogue_speak", new fz.a() { // from class: pt.b
                    @Override // fz.a
                    public final Object invoke() {
                        Bundle bundle;
                        int unitSortIndex;
                        String str2;
                        switch (i14) {
                            case 0:
                                bundle = new Bundle();
                                unitSortIndex = courseLesson.getUnitSortIndex();
                                str2 = "U";
                                break;
                            case 1:
                                bundle = new Bundle();
                                unitSortIndex = courseLesson.getUnitSortIndex();
                                str2 = "U";
                                break;
                            default:
                                bundle = new Bundle();
                                unitSortIndex = courseLesson.getUnitSortIndex();
                                str2 = "U";
                                break;
                        }
                        e0.v(unitSortIndex, bundle, str2, "unit");
                        return bundle;
                    }
                });
            }
            vt.k0 k0Var3 = dVar.f47145b;
            int i18 = ((o0) n0Var).f27733a.keyLanguage;
            long unitId3 = courseLesson.getUnitId();
            int sortIndex3 = courseLesson.getSortIndex();
            this.f36645b = 5;
            a1 a1Var3 = (a1) k0Var3;
            a1Var3.getClass();
            yz.f fVar3 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new x0(i18, sortIndex3, unitId3, a1Var3, null), this);
            if (objM != aVar2) {
                objM = b0Var;
            }
            if (objM != aVar2) {
                return aVar2;
            }
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        if (pt.c.f47143a[CoursePracticeType.valueOf(str).ordinal()] == 1) {
            this.f36645b = 1;
            if (((o0) n0Var).P(true, this) != aVar2) {
                i11 = pt.c.f47143a[CoursePracticeType.valueOf(str).ordinal()];
                if (i11 != 2) {
                    aVar.c("jxz_main_dialogue_warmup", new fz.a() { // from class: pt.b
                        @Override // fz.a
                        public final Object invoke() {
                            Bundle bundle;
                            int unitSortIndex;
                            String str2;
                            switch (i13) {
                                case 0:
                                    bundle = new Bundle();
                                    unitSortIndex = courseLesson.getUnitSortIndex();
                                    str2 = "U";
                                    break;
                                case 1:
                                    bundle = new Bundle();
                                    unitSortIndex = courseLesson.getUnitSortIndex();
                                    str2 = "U";
                                    break;
                                default:
                                    bundle = new Bundle();
                                    unitSortIndex = courseLesson.getUnitSortIndex();
                                    str2 = "U";
                                    break;
                            }
                            e0.v(unitSortIndex, bundle, str2, "unit");
                            return bundle;
                        }
                    });
                } else if (i11 != 3) {
                    aVar.c("jxz_main_dialogue_practice", new fz.a() { // from class: pt.b
                        @Override // fz.a
                        public final Object invoke() {
                            Bundle bundle;
                            int unitSortIndex;
                            String str2;
                            switch (i15) {
                                case 0:
                                    bundle = new Bundle();
                                    unitSortIndex = courseLesson.getUnitSortIndex();
                                    str2 = "U";
                                    break;
                                case 1:
                                    bundle = new Bundle();
                                    unitSortIndex = courseLesson.getUnitSortIndex();
                                    str2 = "U";
                                    break;
                                default:
                                    bundle = new Bundle();
                                    unitSortIndex = courseLesson.getUnitSortIndex();
                                    str2 = "U";
                                    break;
                            }
                            e0.v(unitSortIndex, bundle, str2, "unit");
                            return bundle;
                        }
                    });
                } else if (i11 != 4) {
                    aVar.c("jxz_main_lesson_start", new z1(28, courseLesson, str));
                } else {
                    aVar.c("jxz_main_dialogue_speak", new fz.a() { // from class: pt.b
                        @Override // fz.a
                        public final Object invoke() {
                            Bundle bundle;
                            int unitSortIndex;
                            String str2;
                            switch (i14) {
                                case 0:
                                    bundle = new Bundle();
                                    unitSortIndex = courseLesson.getUnitSortIndex();
                                    str2 = "U";
                                    break;
                                case 1:
                                    bundle = new Bundle();
                                    unitSortIndex = courseLesson.getUnitSortIndex();
                                    str2 = "U";
                                    break;
                                default:
                                    bundle = new Bundle();
                                    unitSortIndex = courseLesson.getUnitSortIndex();
                                    str2 = "U";
                                    break;
                            }
                            e0.v(unitSortIndex, bundle, str2, "unit");
                            return bundle;
                        }
                    });
                }
                vt.k0 k0Var4 = dVar.f47145b;
                int i19 = ((o0) n0Var).f27733a.keyLanguage;
                long unitId4 = courseLesson.getUnitId();
                int sortIndex4 = courseLesson.getSortIndex();
                this.f36645b = 5;
                a1 a1Var4 = (a1) k0Var4;
                a1Var4.getClass();
                yz.f fVar4 = rz.o0.f50940a;
                objM = rz.e0.M(yz.e.f58387a, new x0(i19, sortIndex4, unitId4, a1Var4, null), this);
                if (objM != aVar2) {
                    objM = b0Var;
                }
                if (objM != aVar2) {
                    return b0Var;
                }
            }
        } else {
            o0 o0Var = (o0) n0Var;
            if (o0Var.f27733a.keyLanguage == 7) {
                this.f36645b = 2;
                if (o0Var.P(true, this) != aVar2) {
                    if (ry.l.D(new Integer[]{new Integer(51), new Integer(55)}, new Integer(((o0) n0Var).f27733a.keyLanguage))) {
                        this.f36645b = 4;
                        if (((o0) n0Var).P(false, this) != aVar2) {
                            i11 = pt.c.f47143a[CoursePracticeType.valueOf(str).ordinal()];
                            if (i11 != 2) {
                                aVar.c("jxz_main_dialogue_warmup", new fz.a() { // from class: pt.b
                                    @Override // fz.a
                                    public final Object invoke() {
                                        Bundle bundle;
                                        int unitSortIndex;
                                        String str2;
                                        switch (i13) {
                                            case 0:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            case 1:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            default:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                        }
                                        e0.v(unitSortIndex, bundle, str2, "unit");
                                        return bundle;
                                    }
                                });
                            } else if (i11 != 3) {
                                aVar.c("jxz_main_dialogue_practice", new fz.a() { // from class: pt.b
                                    @Override // fz.a
                                    public final Object invoke() {
                                        Bundle bundle;
                                        int unitSortIndex;
                                        String str2;
                                        switch (i15) {
                                            case 0:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            case 1:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            default:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                        }
                                        e0.v(unitSortIndex, bundle, str2, "unit");
                                        return bundle;
                                    }
                                });
                            } else if (i11 != 4) {
                                aVar.c("jxz_main_lesson_start", new z1(28, courseLesson, str));
                            } else {
                                aVar.c("jxz_main_dialogue_speak", new fz.a() { // from class: pt.b
                                    @Override // fz.a
                                    public final Object invoke() {
                                        Bundle bundle;
                                        int unitSortIndex;
                                        String str2;
                                        switch (i14) {
                                            case 0:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            case 1:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            default:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                        }
                                        e0.v(unitSortIndex, bundle, str2, "unit");
                                        return bundle;
                                    }
                                });
                            }
                            vt.k0 k0Var5 = dVar.f47145b;
                            int i110 = ((o0) n0Var).f27733a.keyLanguage;
                            long unitId5 = courseLesson.getUnitId();
                            int sortIndex5 = courseLesson.getSortIndex();
                            this.f36645b = 5;
                            a1 a1Var5 = (a1) k0Var5;
                            a1Var5.getClass();
                            yz.f fVar5 = rz.o0.f50940a;
                            objM = rz.e0.M(yz.e.f58387a, new x0(i110, sortIndex5, unitId5, a1Var5, null), this);
                            if (objM != aVar2) {
                                objM = b0Var;
                            }
                            if (objM != aVar2) {
                                return b0Var;
                            }
                        }
                    } else {
                        i11 = pt.c.f47143a[CoursePracticeType.valueOf(str).ordinal()];
                        if (i11 != 2) {
                            aVar.c("jxz_main_dialogue_warmup", new fz.a() { // from class: pt.b
                                @Override // fz.a
                                public final Object invoke() {
                                    Bundle bundle;
                                    int unitSortIndex;
                                    String str2;
                                    switch (i13) {
                                        case 0:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        case 1:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        default:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                    }
                                    e0.v(unitSortIndex, bundle, str2, "unit");
                                    return bundle;
                                }
                            });
                        } else if (i11 != 3) {
                            aVar.c("jxz_main_dialogue_practice", new fz.a() { // from class: pt.b
                                @Override // fz.a
                                public final Object invoke() {
                                    Bundle bundle;
                                    int unitSortIndex;
                                    String str2;
                                    switch (i15) {
                                        case 0:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        case 1:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        default:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                    }
                                    e0.v(unitSortIndex, bundle, str2, "unit");
                                    return bundle;
                                }
                            });
                        } else if (i11 != 4) {
                            aVar.c("jxz_main_lesson_start", new z1(28, courseLesson, str));
                        } else {
                            aVar.c("jxz_main_dialogue_speak", new fz.a() { // from class: pt.b
                                @Override // fz.a
                                public final Object invoke() {
                                    Bundle bundle;
                                    int unitSortIndex;
                                    String str2;
                                    switch (i14) {
                                        case 0:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        case 1:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        default:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                    }
                                    e0.v(unitSortIndex, bundle, str2, "unit");
                                    return bundle;
                                }
                            });
                        }
                        vt.k0 k0Var6 = dVar.f47145b;
                        int i111 = ((o0) n0Var).f27733a.keyLanguage;
                        long unitId6 = courseLesson.getUnitId();
                        int sortIndex6 = courseLesson.getSortIndex();
                        this.f36645b = 5;
                        a1 a1Var6 = (a1) k0Var6;
                        a1Var6.getClass();
                        yz.f fVar6 = rz.o0.f50940a;
                        objM = rz.e0.M(yz.e.f58387a, new x0(i111, sortIndex6, unitId6, a1Var6, null), this);
                        if (objM != aVar2) {
                            objM = b0Var;
                        }
                        if (objM != aVar2) {
                            return b0Var;
                        }
                    }
                }
            } else {
                this.f36645b = 3;
                if (o0Var.P(false, this) != aVar2) {
                    if (ry.l.D(new Integer[]{new Integer(51), new Integer(55)}, new Integer(((o0) n0Var).f27733a.keyLanguage))) {
                        this.f36645b = 4;
                        if (((o0) n0Var).P(false, this) != aVar2) {
                            i11 = pt.c.f47143a[CoursePracticeType.valueOf(str).ordinal()];
                            if (i11 != 2) {
                                aVar.c("jxz_main_dialogue_warmup", new fz.a() { // from class: pt.b
                                    @Override // fz.a
                                    public final Object invoke() {
                                        Bundle bundle;
                                        int unitSortIndex;
                                        String str2;
                                        switch (i13) {
                                            case 0:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            case 1:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            default:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                        }
                                        e0.v(unitSortIndex, bundle, str2, "unit");
                                        return bundle;
                                    }
                                });
                            } else if (i11 != 3) {
                                aVar.c("jxz_main_dialogue_practice", new fz.a() { // from class: pt.b
                                    @Override // fz.a
                                    public final Object invoke() {
                                        Bundle bundle;
                                        int unitSortIndex;
                                        String str2;
                                        switch (i15) {
                                            case 0:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            case 1:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            default:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                        }
                                        e0.v(unitSortIndex, bundle, str2, "unit");
                                        return bundle;
                                    }
                                });
                            } else if (i11 != 4) {
                                aVar.c("jxz_main_lesson_start", new z1(28, courseLesson, str));
                            } else {
                                aVar.c("jxz_main_dialogue_speak", new fz.a() { // from class: pt.b
                                    @Override // fz.a
                                    public final Object invoke() {
                                        Bundle bundle;
                                        int unitSortIndex;
                                        String str2;
                                        switch (i14) {
                                            case 0:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            case 1:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                            default:
                                                bundle = new Bundle();
                                                unitSortIndex = courseLesson.getUnitSortIndex();
                                                str2 = "U";
                                                break;
                                        }
                                        e0.v(unitSortIndex, bundle, str2, "unit");
                                        return bundle;
                                    }
                                });
                            }
                            vt.k0 k0Var7 = dVar.f47145b;
                            int i112 = ((o0) n0Var).f27733a.keyLanguage;
                            long unitId7 = courseLesson.getUnitId();
                            int sortIndex7 = courseLesson.getSortIndex();
                            this.f36645b = 5;
                            a1 a1Var7 = (a1) k0Var7;
                            a1Var7.getClass();
                            yz.f fVar7 = rz.o0.f50940a;
                            objM = rz.e0.M(yz.e.f58387a, new x0(i112, sortIndex7, unitId7, a1Var7, null), this);
                            if (objM != aVar2) {
                                objM = b0Var;
                            }
                            if (objM != aVar2) {
                                return b0Var;
                            }
                        }
                    } else {
                        i11 = pt.c.f47143a[CoursePracticeType.valueOf(str).ordinal()];
                        if (i11 != 2) {
                            aVar.c("jxz_main_dialogue_warmup", new fz.a() { // from class: pt.b
                                @Override // fz.a
                                public final Object invoke() {
                                    Bundle bundle;
                                    int unitSortIndex;
                                    String str2;
                                    switch (i13) {
                                        case 0:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        case 1:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        default:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                    }
                                    e0.v(unitSortIndex, bundle, str2, "unit");
                                    return bundle;
                                }
                            });
                        } else if (i11 != 3) {
                            aVar.c("jxz_main_dialogue_practice", new fz.a() { // from class: pt.b
                                @Override // fz.a
                                public final Object invoke() {
                                    Bundle bundle;
                                    int unitSortIndex;
                                    String str2;
                                    switch (i15) {
                                        case 0:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        case 1:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        default:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                    }
                                    e0.v(unitSortIndex, bundle, str2, "unit");
                                    return bundle;
                                }
                            });
                        } else if (i11 != 4) {
                            aVar.c("jxz_main_lesson_start", new z1(28, courseLesson, str));
                        } else {
                            aVar.c("jxz_main_dialogue_speak", new fz.a() { // from class: pt.b
                                @Override // fz.a
                                public final Object invoke() {
                                    Bundle bundle;
                                    int unitSortIndex;
                                    String str2;
                                    switch (i14) {
                                        case 0:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        case 1:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                        default:
                                            bundle = new Bundle();
                                            unitSortIndex = courseLesson.getUnitSortIndex();
                                            str2 = "U";
                                            break;
                                    }
                                    e0.v(unitSortIndex, bundle, str2, "unit");
                                    return bundle;
                                }
                            });
                        }
                        vt.k0 k0Var8 = dVar.f47145b;
                        int i113 = ((o0) n0Var).f27733a.keyLanguage;
                        long unitId8 = courseLesson.getUnitId();
                        int sortIndex8 = courseLesson.getSortIndex();
                        this.f36645b = 5;
                        a1 a1Var8 = (a1) k0Var8;
                        a1Var8.getClass();
                        yz.f fVar8 = rz.o0.f50940a;
                        objM = rz.e0.M(yz.e.f58387a, new x0(i113, sortIndex8, unitId8, a1Var8, null), this);
                        if (objM != aVar2) {
                            objM = b0Var;
                        }
                        if (objM != aVar2) {
                            return b0Var;
                        }
                    }
                }
            }
        }
        return aVar2;
    }

    private final Object j(Object obj) {
        String strD;
        uz.j jVar = (uz.j) this.f36646c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36645b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            List listL = ns.o.L("ㅁ ㄴ ㅇ ㄹ ㅎ", "ㅏ ㅓ ㅗ ㅜ", "ㄱ ㄷ ㅂ ㅈ ㅅ", "ㅑ ㅕ ㅛ ㅠ", "ㅋ ㅌ ㅍ ㅊ", "ㅐ ㅔ ㅡ ㅣ");
            String str = (String) this.f36649f;
            ArrayList arrayList = new ArrayList(ry.n.W(listL, 10));
            int i12 = 0;
            for (Object obj2 : listL) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    ns.o.V();
                    throw null;
                }
                String str2 = (String) obj2;
                arrayList.add(new SyllableWriteLesson(i12, i13, str2, oz.q.W0(str, new String[]{";"}, 0, 6).contains(String.valueOf(i13)) ? SyllableLessonStatus.COMPLETED : SyllableLessonStatus.UNLOCKED, oz.q.W0(str2, new String[]{" "}, 0, 6)));
                i12 = i13;
            }
            SyllableWriteLesson syllableWriteLesson = (SyllableWriteLesson) this.f36647d;
            if (syllableWriteLesson == null || (strD = c.a.d(syllableWriteLesson)) == null) {
                strD = (String) this.f36648e;
            }
            qv.b bVar = new qv.b(arrayList, syllableWriteLesson, strD);
            this.f36646c = null;
            this.f36645b = 1;
            if (jVar.emit(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }

    private final Object m(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36645b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            ed.c cVar = (ed.c) this.f36646c;
            ob.p pVar = (ob.p) this.f36647d;
            this.f36645b = 1;
            obj = rb.f.a(cVar, pVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        ((AtomicInteger) this.f36648e).set(((Number) obj).intValue());
        ((ListenableFuture) this.f36649f).cancel(true);
        return qy.b0.f48488a;
    }

    private final Object n(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36645b;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        com.bumptech.glide.e.F(obj);
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f36646c;
        fb.v vVar = (fb.v) this.f36647d;
        ed.c cVar = (ed.c) this.f36648e;
        ob.p pVar = (ob.p) this.f36649f;
        this.f36645b = 1;
        Object objE = ConstraintTrackingWorker.e(constraintTrackingWorker, vVar, cVar, pVar, this);
        return objE == aVar ? aVar : objE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (rt.ia.a(r2, (java.util.List) r10, r5, r9) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f36647d
            rt.e3 r0 = (rt.e3) r0
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r9.f36645b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L25
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L15
            com.bumptech.glide.e.F(r10)
            goto L69
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r2 = r9.f36646c
            fv.c r2 = (fv.c) r2
            com.bumptech.glide.e.F(r10)
            goto L56
        L25:
            com.bumptech.glide.e.F(r10)
            fv.c r2 = r0.r()
            ij.d r10 = new ij.d
            java.lang.Object r6 = r9.f36648e
            vt.n0 r6 = (vt.n0) r6
            r7 = r6
            fr.o0 r7 = (fr.o0) r7
            com.lingodeer.data.env.Env r7 = r7.f27733a
            int r7 = r7.keyLanguage
            java.lang.Object r8 = r9.f36649f
            java.util.List r8 = (java.util.List) r8
            r10.<init>(r7, r8, r6)
            r9.f36646c = r2
            r9.f36645b = r5
            yz.f r5 = rz.o0.f50940a
            yz.e r5 = yz.e.f58387a
            km.s0 r6 = new km.s0
            r7 = 10
            r6.<init>(r10, r3, r7)
            java.lang.Object r10 = rz.e0.M(r5, r6, r9)
            if (r10 != r1) goto L56
            goto L68
        L56:
            java.util.List r10 = (java.util.List) r10
            mt.z3 r5 = new mt.z3
            r6 = 6
            r5.<init>(r0, r6)
            r9.f36646c = r3
            r9.f36645b = r4
            java.lang.Object r10 = rt.ia.a(r2, r10, r5, r9)
            if (r10 != r1) goto L69
        L68:
            return r1
        L69:
            qy.b0 r10 = qy.b0.f48488a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jr.i0.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) {
        WordSentenceCharacterType wordSentenceCharacterType = (WordSentenceCharacterType) this.f36646c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36645b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            b6 b6Var = new b6((n0) this.f36647d, (av.n) this.f36648e, (fv.c) this.f36649f);
            this.f36646c = null;
            this.f36645b = 1;
            if (b6Var.a(wordSentenceCharacterType, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }

    private final Object q(Object obj) {
        i0 i0Var;
        y9 y9Var = (y9) this.f36647d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36645b;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 != 0) {
            if (i11 == 1) {
                com.bumptech.glide.e.F(obj);
                i0Var = this;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
        }
        com.bumptech.glide.e.F(obj);
        p0 p0Var = (p0) this.f36646c;
        String strK = xt.d.k(((o0) y9Var.f50701a).f27733a.keyLanguage);
        ja jaVar = (ja) this.f36648e;
        String str = jaVar.f49929c;
        long j11 = jaVar.f49930d;
        String str2 = (String) this.f36649f;
        this.f36645b = 1;
        i0Var = this;
        if (((fr.x0) p0Var).d(strK, str, j11, str2, i0Var) != aVar) {
        }
        vt.c cVar = y9Var.f50703b;
        i0Var.f36645b = 2;
        ((vt.d) cVar).j(this);
        return b0Var == aVar ? aVar : b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (rt.ia.a(r2, (java.util.List) r10, r6, r9) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f36647d
            rt.dd r0 = (rt.dd) r0
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r9.f36645b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L25
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L15
            com.bumptech.glide.e.F(r10)
            goto L68
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r2 = r9.f36646c
            fv.c r2 = (fv.c) r2
            com.bumptech.glide.e.F(r10)
            goto L56
        L25:
            com.bumptech.glide.e.F(r10)
            fv.c r2 = r0.r()
            ij.d r10 = new ij.d
            java.lang.Object r6 = r9.f36648e
            vt.n0 r6 = (vt.n0) r6
            r7 = r6
            fr.o0 r7 = (fr.o0) r7
            com.lingodeer.data.env.Env r7 = r7.f27733a
            int r7 = r7.keyLanguage
            java.lang.Object r8 = r9.f36649f
            java.util.List r8 = (java.util.List) r8
            r10.<init>(r7, r8, r6)
            r9.f36646c = r2
            r9.f36645b = r5
            yz.f r6 = rz.o0.f50940a
            yz.e r6 = yz.e.f58387a
            km.s0 r7 = new km.s0
            r8 = 10
            r7.<init>(r10, r3, r8)
            java.lang.Object r10 = rz.e0.M(r6, r7, r9)
            if (r10 != r1) goto L56
            goto L67
        L56:
            java.util.List r10 = (java.util.List) r10
            rt.bd r6 = new rt.bd
            r6.<init>(r0, r5)
            r9.f36646c = r3
            r9.f36645b = r4
            java.lang.Object r10 = rt.ia.a(r2, r10, r6, r9)
            if (r10 != r1) goto L68
        L67:
            return r1
        L68:
            qy.b0 r10 = qy.b0.f48488a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jr.i0.r(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj) {
        ps.b bVar = (ps.b) this.f36647d;
        mf mfVar = (mf) this.f36646c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36645b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            mfVar.f50105f.add(new Long(bVar.f47122a));
            mfVar.c(bVar.f47122a, ps.e.f47132a, CropImageView.DEFAULT_ASPECT_RATIO);
            o2 o2Var = mfVar.f50101b;
            long j11 = bVar.f47122a;
            List list = bVar.f47126e;
            o2Var.getClass();
            n1 n1Var = new n1(uz.x0.g(new mr.a(j11, list, o2Var, null)), new f4(mfVar, bVar, (vy.d) null));
            d0.g0 g0Var = new d0.g0(mfVar, bVar, (kotlin.jvm.internal.w) this.f36648e, (ArrayList) this.f36649f);
            this.f36645b = 1;
            if (n1Var.collect(g0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }

    private final Object t(Object obj) {
        qy.q qVarV;
        String str;
        si.d dVar = (si.d) this.f36649f;
        rz.b0 b0Var = (rz.b0) this.f36648e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36645b;
        qy.b0 b0Var2 = qy.b0.f48488a;
        if (i11 != 0) {
            if (i11 == 1) {
                qVarV = (qy.q) this.f36647d;
                str = (String) this.f36646c;
                com.bumptech.glide.e.F(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            return b0Var2;
        }
        com.bumptech.glide.e.F(obj);
        HwCharacter hwCharacter = dVar.f51707i;
        if (hwCharacter == null) {
            kotlin.jvm.internal.m.n("mCurChar");
            throw null;
        }
        String strO = xt.d.o(hwCharacter.getCharId(), 2, dVar.f47884d.keyLanguage);
        qVarV = com.bumptech.glide.d.v(new m9(7));
        bh.i0 i0VarA = ((wt.q) qVarV.getValue()).a(strO);
        this.f36648e = b0Var;
        this.f36646c = strO;
        this.f36647d = qVarV;
        this.f36645b = 1;
        Object objV = uz.x0.v(i0VarA, this);
        if (objV != aVar) {
            str = strO;
            obj = objV;
        }
        return aVar;
        if (((ReviewStatus) obj) == null) {
            wt.q qVar = (wt.q) qVarV.getValue();
            this.f36648e = null;
            this.f36646c = null;
            this.f36647d = null;
            this.f36645b = 2;
            Object objB = ((n3) qVar.f55345b).b(str, -1L, this);
            if (objB != aVar) {
                objB = b0Var2;
            }
            if (objB == aVar) {
                return aVar;
            }
        }
        return b0Var2;
    }

    private final Object u(Object obj) {
        List list = (List) this.f36646c;
        b1 b1Var = (b1) this.f36649f;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36645b;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        while (!list.isEmpty()) {
            long jLongValue = ((Number) ((fz.a) this.f36647d).invoke()).longValue();
            if (jLongValue == -1) {
                if (((Number) ((qy.l) b1Var.getValue()).f48495a).longValue() == -1) {
                    break;
                }
                b1Var.setValue(new qy.l(new Long(-1L), new Long(-1L)));
                break;
            }
            long jC = (long) (jLongValue / ((ht.l) this.f36648e).c());
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            bh.l lVar = new bh.l(list, jC, b1Var, (vy.d) null, 14);
            this.f36645b = 1;
            if (rz.e0.M(eVar, lVar, this) == aVar) {
                return aVar;
            }
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [fz.e, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f36644a) {
            case 0:
                return new i0((l0.w) this.f36646c, (c1) this.f36647d, (fz.c) this.f36648e, (b1) this.f36649f, dVar, 0);
            case 1:
                i0 i0Var = new i0((f1) this.f36647d, (j9.e) this.f36648e, (c2) this.f36649f, dVar, 1);
                i0Var.f36646c = obj;
                return i0Var;
            case 2:
                i0 i0Var2 = new i0((kr.b0) this.f36649f, dVar, 2);
                i0Var2.f36648e = obj;
                return i0Var2;
            case 3:
                i0 i0Var3 = new i0((Context) this.f36647d, (i1.t) this.f36648e, (b0.c) this.f36649f, dVar, 3);
                i0Var3.f36646c = obj;
                return i0Var3;
            case 4:
                return new i0((e6.l) this.f36646c, (Context) this.f36647d, (Throwable) this.f36648e, (m6.w) this.f36649f, dVar, 4);
            case 5:
                return new i0((m6.w) this.f36646c, (h2.d) this.f36647d, (rz.b0) this.f36648e, (fz.e) this.f36649f, dVar, 5);
            case 6:
                return new i0((List) this.f36647d, (String) this.f36648e, (l0.w) this.f36646c, (l1.a1) this.f36649f, dVar);
            case 7:
                return new i0((j2) this.f36646c, (q2) this.f36647d, (j9.v) this.f36648e, (b1) this.f36649f, dVar, 7);
            case 8:
                return new i0((fv.c) this.f36646c, (Collection) this.f36647d, (Collection) this.f36649f, (fz.c) this.f36648e, dVar);
            case 9:
                i0 i0Var4 = new i0(9, (kv.i0) this.f36648e, (wt.m) this.f36649f, dVar);
                i0Var4.f36647d = obj;
                return i0Var4;
            case 10:
                i0 i0Var5 = new i0(10, (n1) this.f36648e, (dt.x) this.f36649f, dVar);
                i0Var5.f36647d = obj;
                return i0Var5;
            case 11:
                i0 i0Var6 = new i0((w0) this.f36649f, dVar, 11);
                i0Var6.f36648e = obj;
                return i0Var6;
            case 12:
                i0 i0Var7 = new i0((w0) this.f36649f, dVar, 12);
                i0Var7.f36648e = obj;
                return i0Var7;
            case 13:
                i0 i0Var8 = new i0((uz.j) this.f36648e, (fz.e) this.f36649f, dVar);
                i0Var8.f36647d = obj;
                return i0Var8;
            case 14:
                return new i0((b1) this.f36649f, (x8) this.f36647d, (ph.o) this.f36648e, dVar);
            case 15:
                return new i0(15, (List) this.f36648e, (ni.m) this.f36649f, dVar);
            case 16:
                i0 i0Var9 = new i0(16, (List) this.f36648e, (o1) this.f36649f, dVar);
                i0Var9.f36647d = obj;
                return i0Var9;
            case 17:
                return new i0((fb.v) this.f36646c, (ob.p) this.f36647d, (pb.o) this.f36648e, (Context) this.f36649f, dVar, 17);
            case 18:
                return new i0((String) this.f36646c, (pt.d) this.f36647d, (ur.a) this.f36648e, (CourseLesson) this.f36649f, dVar, 18);
            case 19:
                i0 i0Var10 = new i0((SyllableWriteLesson) this.f36647d, (String) this.f36648e, (String) this.f36649f, dVar, 19);
                i0Var10.f36646c = obj;
                return i0Var10;
            case 20:
                return new i0((ed.c) this.f36646c, (ob.p) this.f36647d, (AtomicInteger) this.f36648e, (ListenableFuture) this.f36649f, dVar, 20);
            case 21:
                return new i0((ConstraintTrackingWorker) this.f36646c, (fb.v) this.f36647d, (ed.c) this.f36648e, (ob.p) this.f36649f, dVar, 21);
            case 22:
                return new i0((e3) this.f36647d, (n0) this.f36648e, (List) this.f36649f, dVar, 22);
            case 23:
                i0 i0Var11 = new i0((n0) this.f36647d, (av.n) this.f36648e, (fv.c) this.f36649f, dVar, 23);
                i0Var11.f36646c = obj;
                return i0Var11;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new i0((p0) this.f36646c, (y9) this.f36647d, (ja) this.f36648e, (String) this.f36649f, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new i0((dd) this.f36647d, (n0) this.f36648e, (List) this.f36649f, dVar, 25);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new i0((mf) this.f36646c, (ps.b) this.f36647d, (kotlin.jvm.internal.w) this.f36648e, (ArrayList) this.f36649f, dVar, 26);
            case 27:
                i0 i0Var12 = new i0((si.d) this.f36649f, dVar, 27);
                i0Var12.f36648e = obj;
                return i0Var12;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new i0((List) this.f36646c, (fz.a) this.f36647d, (ht.l) this.f36648e, (b1) this.f36649f, dVar, 28);
            default:
                i0 i0Var13 = new i0(29, (kotlin.jvm.internal.y) this.f36648e, (uz.j) this.f36649f, dVar);
                i0Var13.f36647d = obj;
                return i0Var13;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36644a) {
            case 0:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((i0) create((kr.i) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((i0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((i0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((i0) create((y1) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((i0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((i0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((i0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((i0) create((WordSentenceCharacterType) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((i0) create(new tz.o(((tz.o) obj).f52707a), (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(fv.c cVar, Collection collection, Collection collection2, fz.c cVar2, vy.d dVar) {
        super(2, dVar);
        this.f36644a = 8;
        this.f36646c = cVar;
        this.f36647d = collection;
        this.f36649f = collection2;
        this.f36648e = cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:192:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:195:0x03f3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v31, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x01f2 -> B:142:0x02b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x02b8 -> B:142:0x02b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:195:0x03f3 -> B:186:0x03c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r69) {
        /*
            Method dump skipped, instruction units count: 3256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jr.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, Object obj4, vy.d dVar, int i11) {
        super(2, dVar);
        this.f36644a = i11;
        this.f36646c = obj;
        this.f36647d = obj2;
        this.f36648e = obj3;
        this.f36649f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f36644a = i11;
        this.f36647d = obj;
        this.f36648e = obj2;
        this.f36649f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f36644a = i11;
        this.f36649f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(List list, String str, l0.w wVar, l1.a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f36644a = 6;
        this.f36647d = list;
        this.f36648e = str;
        this.f36646c = wVar;
        this.f36649f = a1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(b1 b1Var, x8 x8Var, ph.o oVar, vy.d dVar) {
        super(2, dVar);
        this.f36644a = 14;
        this.f36649f = b1Var;
        this.f36647d = x8Var;
        this.f36648e = oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(uz.j jVar, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f36644a = 13;
        this.f36648e = jVar;
        this.f36649f = (xy.i) eVar;
    }
}

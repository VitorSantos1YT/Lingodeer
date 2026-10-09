package rt;

import com.lingodeer.data.env.Env;
import com.lingodeer.data.env.FontSizeStyleKt;
import com.lingodeer.data.model.CourseQuestionPreference;
import com.lingodeer.data.model.CourseQuestionPreferenceContext;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k9 implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49977a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uz.j f49979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f49980d;

    public k9(kotlin.jvm.internal.w wVar, int i11, uz.j jVar) {
        this.f49980d = wVar;
        this.f49978b = i11;
        this.f49979c = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        j9 j9Var;
        int i11;
        uz.w wVar;
        switch (this.f49977a) {
            case 0:
                vt.n0 n0Var = ((l9) this.f49980d).f50021a;
                if (dVar instanceof j9) {
                    j9Var = (j9) dVar;
                    int i12 = j9Var.f49925b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        j9Var.f49925b = i12 - Integer.MIN_VALUE;
                    } else {
                        j9Var = new j9(this, dVar);
                    }
                } else {
                    j9Var = new j9(this, dVar);
                }
                Object obj2 = j9Var.f49924a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = j9Var.f49925b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj2);
                    List list = (List) obj;
                    int i14 = this.f49978b;
                    if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i14))) {
                        int iT = ((fr.o0) n0Var).t();
                        if (iT == 0 || iT == 1) {
                            i11 = 1;
                        } else if (iT == 3 || iT == 4 || iT == 5) {
                            i11 = 2;
                        } else if (iT != 6) {
                            i11 = -1;
                        } else {
                            i11 = 3;
                        }
                    } else if (ry.l.D(new Integer[]{13, 2}, Integer.valueOf(i14)) || ry.l.D(new Integer[]{11, 0}, Integer.valueOf(i14))) {
                        int iT2 = ((fr.o0) n0Var).t();
                        if (iT2 == 0 || iT2 == 1) {
                            i11 = 1;
                        } else if (iT2 != 2) {
                            i11 = -1;
                        } else {
                            i11 = 2;
                        }
                    } else {
                        if (ry.l.D(new Integer[]{new Integer(51), new Integer(55), new Integer(57), new Integer(61), new Integer(63)}, new Integer(i14))) {
                            int iT3 = ((fr.o0) n0Var).t();
                            if (iT3 == 0) {
                                i11 = 1;
                            } else if (iT3 == 1) {
                                i11 = 2;
                            }
                        }
                        i11 = -1;
                    }
                    int iT4 = ((fr.o0) n0Var).t();
                    int iU = ((fr.o0) n0Var).u();
                    Env env = ((fr.o0) n0Var).f27733a;
                    boolean z11 = env.isTestAutoPlayAudio;
                    boolean z12 = env.allowSoundEffect;
                    boolean z13 = env.showAnim;
                    int iCoerceFontSizeStyle = FontSizeStyleKt.coerceFontSizeStyle(env.textSizeDel);
                    float f5 = ((fr.o0) n0Var).f();
                    fr.o0 o0Var = (fr.o0) n0Var;
                    Env env2 = o0Var.f27733a;
                    z8 z8Var = new z8(iT4, iU, i11, z11, z12, z13, iCoerceFontSizeStyle, f5, env2.themeStyle, env2.audioSpeed, env2.hideTranslation, o0Var.x());
                    int iW = ry.x.W(ry.n.W(list, 10));
                    if (iW < 16) {
                        iW = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                    for (Object obj3 : list) {
                        CourseQuestionPreference courseQuestionPreference = (CourseQuestionPreference) obj3;
                        linkedHashMap.put(new CourseQuestionPreferenceContext(courseQuestionPreference.getKeyLanguage(), courseQuestionPreference.getQuestionTypeKey()), obj3);
                    }
                    g9 g9Var = new g9(i14, z8Var, linkedHashMap);
                    j9Var.f49925b = 1;
                    if (this.f49979c.emit(g9Var, j9Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj2);
                }
                return qy.b0.f48488a;
            default:
                if (dVar instanceof uz.w) {
                    wVar = (uz.w) dVar;
                    int i15 = wVar.f53425c;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        wVar.f53425c = i15 - Integer.MIN_VALUE;
                    } else {
                        wVar = new uz.w(this, dVar);
                    }
                } else {
                    wVar = new uz.w(this, dVar);
                }
                Object obj4 = wVar.f53423a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i16 = wVar.f53425c;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj4);
                    kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) this.f49980d;
                    int i17 = wVar2.f38359a;
                    if (i17 >= this.f49978b) {
                        wVar.f53425c = 1;
                        if (this.f49979c.emit(obj, wVar) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        wVar2.f38359a = i17 + 1;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj4);
                }
                return b0Var;
        }
    }

    public k9(uz.j jVar, int i11, l9 l9Var) {
        this.f49979c = jVar;
        this.f49978b = i11;
        this.f49980d = l9Var;
    }
}

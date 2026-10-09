package ci;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.drawerlayout.widget.ktFt.FpIL;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableTestIndexActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.j3;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends ji.e {
    public th.e N;

    public q() {
        super(p.f7149a, BuildConfig.VERSION_NAME);
    }

    @Override // ji.e
    public final void q() {
        th.e eVar = this.N;
        if (eVar != null) {
            eVar.b();
        } else {
            kotlin.jvm.internal.m.n("audioPlayer");
            throw null;
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        this.N = new th.e(contextRequireContext);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        final int i11 = 0;
        bq.z.b(((j3) aVar).f32759b, new fz.c(this) { // from class: ci.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f7147b;

            {
                this.f7147b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        q qVar = this.f7147b;
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar = qVar.N;
                        if (eVar == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar2 = fv.b.f28186a;
                        eVar.h(fv.b.c("hadhihi", null, null));
                        break;
                        break;
                    case 1:
                        q qVar3 = this.f7147b;
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        th.e eVar2 = qVar3.N;
                        if (eVar2 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar4 = fv.b.f28186a;
                        eVar2.h(fv.b.c("huwa", null, null));
                        break;
                        break;
                    case 2:
                        q qVar5 = this.f7147b;
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        th.e eVar3 = qVar5.N;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar6 = fv.b.f28186a;
                        eVar3.h(fv.b.c(FpIL.JsdosIPycRhcVO, null, null));
                        break;
                        break;
                    case 3:
                        q qVar7 = this.f7147b;
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        th.e eVar4 = qVar7.N;
                        if (eVar4 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar8 = fv.b.f28186a;
                        eVar4.h(fv.b.c("taafihun", null, null));
                        break;
                        break;
                    default:
                        q qVar9 = this.f7147b;
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        qVar9.requireActivity().finish();
                        if (wh.a.f55170d == null) {
                            synchronized (wh.a.class) {
                                if (wh.a.f55170d == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    wh.a.f55170d = new wh.a(lingoSkillApplication);
                                }
                            }
                        }
                        kotlin.jvm.internal.m.c(wh.a.f55170d);
                        Context contextRequireContext2 = qVar9.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        Object obj2 = wh.a.b(contextRequireContext2).get(1);
                        kotlin.jvm.internal.m.e(obj2, "get(...)");
                        int i12 = ARSyllableTestIndexActivity.Q;
                        Context contextRequireContext3 = qVar9.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, HOBXIlHxIkMBEA.HlvKVdtP);
                        Intent intent = new Intent(contextRequireContext3, (Class<?>) ARSyllableTestIndexActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, (bi.a) obj2);
                        qVar9.startActivity(intent);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        final int i12 = 1;
        bq.z.b(((j3) aVar2).f32760c, new fz.c(this) { // from class: ci.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f7147b;

            {
                this.f7147b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        q qVar = this.f7147b;
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar = qVar.N;
                        if (eVar == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar2 = fv.b.f28186a;
                        eVar.h(fv.b.c("hadhihi", null, null));
                        break;
                        break;
                    case 1:
                        q qVar3 = this.f7147b;
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        th.e eVar2 = qVar3.N;
                        if (eVar2 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar4 = fv.b.f28186a;
                        eVar2.h(fv.b.c("huwa", null, null));
                        break;
                        break;
                    case 2:
                        q qVar5 = this.f7147b;
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        th.e eVar3 = qVar5.N;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar6 = fv.b.f28186a;
                        eVar3.h(fv.b.c(FpIL.JsdosIPycRhcVO, null, null));
                        break;
                        break;
                    case 3:
                        q qVar7 = this.f7147b;
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        th.e eVar4 = qVar7.N;
                        if (eVar4 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar8 = fv.b.f28186a;
                        eVar4.h(fv.b.c("taafihun", null, null));
                        break;
                        break;
                    default:
                        q qVar9 = this.f7147b;
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        qVar9.requireActivity().finish();
                        if (wh.a.f55170d == null) {
                            synchronized (wh.a.class) {
                                if (wh.a.f55170d == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    wh.a.f55170d = new wh.a(lingoSkillApplication);
                                }
                            }
                        }
                        kotlin.jvm.internal.m.c(wh.a.f55170d);
                        Context contextRequireContext2 = qVar9.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        Object obj2 = wh.a.b(contextRequireContext2).get(1);
                        kotlin.jvm.internal.m.e(obj2, "get(...)");
                        int i13 = ARSyllableTestIndexActivity.Q;
                        Context contextRequireContext3 = qVar9.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, HOBXIlHxIkMBEA.HlvKVdtP);
                        Intent intent = new Intent(contextRequireContext3, (Class<?>) ARSyllableTestIndexActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, (bi.a) obj2);
                        qVar9.startActivity(intent);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        final int i13 = 2;
        bq.z.b(((j3) aVar3).f32761d, new fz.c(this) { // from class: ci.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f7147b;

            {
                this.f7147b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        q qVar = this.f7147b;
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar = qVar.N;
                        if (eVar == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar2 = fv.b.f28186a;
                        eVar.h(fv.b.c("hadhihi", null, null));
                        break;
                        break;
                    case 1:
                        q qVar3 = this.f7147b;
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        th.e eVar2 = qVar3.N;
                        if (eVar2 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar4 = fv.b.f28186a;
                        eVar2.h(fv.b.c("huwa", null, null));
                        break;
                        break;
                    case 2:
                        q qVar5 = this.f7147b;
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        th.e eVar3 = qVar5.N;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar6 = fv.b.f28186a;
                        eVar3.h(fv.b.c(FpIL.JsdosIPycRhcVO, null, null));
                        break;
                        break;
                    case 3:
                        q qVar7 = this.f7147b;
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        th.e eVar4 = qVar7.N;
                        if (eVar4 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar8 = fv.b.f28186a;
                        eVar4.h(fv.b.c("taafihun", null, null));
                        break;
                        break;
                    default:
                        q qVar9 = this.f7147b;
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        qVar9.requireActivity().finish();
                        if (wh.a.f55170d == null) {
                            synchronized (wh.a.class) {
                                if (wh.a.f55170d == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    wh.a.f55170d = new wh.a(lingoSkillApplication);
                                }
                            }
                        }
                        kotlin.jvm.internal.m.c(wh.a.f55170d);
                        Context contextRequireContext2 = qVar9.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        Object obj2 = wh.a.b(contextRequireContext2).get(1);
                        kotlin.jvm.internal.m.e(obj2, "get(...)");
                        int i14 = ARSyllableTestIndexActivity.Q;
                        Context contextRequireContext3 = qVar9.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, HOBXIlHxIkMBEA.HlvKVdtP);
                        Intent intent = new Intent(contextRequireContext3, (Class<?>) ARSyllableTestIndexActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, (bi.a) obj2);
                        qVar9.startActivity(intent);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        final int i14 = 3;
        bq.z.b(((j3) aVar4).f32762e, new fz.c(this) { // from class: ci.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f7147b;

            {
                this.f7147b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        q qVar = this.f7147b;
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar = qVar.N;
                        if (eVar == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar2 = fv.b.f28186a;
                        eVar.h(fv.b.c("hadhihi", null, null));
                        break;
                        break;
                    case 1:
                        q qVar3 = this.f7147b;
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        th.e eVar2 = qVar3.N;
                        if (eVar2 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar4 = fv.b.f28186a;
                        eVar2.h(fv.b.c("huwa", null, null));
                        break;
                        break;
                    case 2:
                        q qVar5 = this.f7147b;
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        th.e eVar3 = qVar5.N;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar6 = fv.b.f28186a;
                        eVar3.h(fv.b.c(FpIL.JsdosIPycRhcVO, null, null));
                        break;
                        break;
                    case 3:
                        q qVar7 = this.f7147b;
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        th.e eVar4 = qVar7.N;
                        if (eVar4 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar8 = fv.b.f28186a;
                        eVar4.h(fv.b.c("taafihun", null, null));
                        break;
                        break;
                    default:
                        q qVar9 = this.f7147b;
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        qVar9.requireActivity().finish();
                        if (wh.a.f55170d == null) {
                            synchronized (wh.a.class) {
                                if (wh.a.f55170d == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    wh.a.f55170d = new wh.a(lingoSkillApplication);
                                }
                            }
                        }
                        kotlin.jvm.internal.m.c(wh.a.f55170d);
                        Context contextRequireContext2 = qVar9.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        Object obj2 = wh.a.b(contextRequireContext2).get(1);
                        kotlin.jvm.internal.m.e(obj2, "get(...)");
                        int i15 = ARSyllableTestIndexActivity.Q;
                        Context contextRequireContext3 = qVar9.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, HOBXIlHxIkMBEA.HlvKVdtP);
                        Intent intent = new Intent(contextRequireContext3, (Class<?>) ARSyllableTestIndexActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, (bi.a) obj2);
                        qVar9.startActivity(intent);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        final int i15 = 4;
        bq.z.b(((j3) aVar5).f32763f, new fz.c(this) { // from class: ci.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f7147b;

            {
                this.f7147b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        q qVar = this.f7147b;
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar = qVar.N;
                        if (eVar == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar2 = fv.b.f28186a;
                        eVar.h(fv.b.c("hadhihi", null, null));
                        break;
                        break;
                    case 1:
                        q qVar3 = this.f7147b;
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        th.e eVar2 = qVar3.N;
                        if (eVar2 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar4 = fv.b.f28186a;
                        eVar2.h(fv.b.c("huwa", null, null));
                        break;
                        break;
                    case 2:
                        q qVar5 = this.f7147b;
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        th.e eVar3 = qVar5.N;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar6 = fv.b.f28186a;
                        eVar3.h(fv.b.c(FpIL.JsdosIPycRhcVO, null, null));
                        break;
                        break;
                    case 3:
                        q qVar7 = this.f7147b;
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        th.e eVar4 = qVar7.N;
                        if (eVar4 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar8 = fv.b.f28186a;
                        eVar4.h(fv.b.c("taafihun", null, null));
                        break;
                        break;
                    default:
                        q qVar9 = this.f7147b;
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        qVar9.requireActivity().finish();
                        if (wh.a.f55170d == null) {
                            synchronized (wh.a.class) {
                                if (wh.a.f55170d == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    wh.a.f55170d = new wh.a(lingoSkillApplication);
                                }
                            }
                        }
                        kotlin.jvm.internal.m.c(wh.a.f55170d);
                        Context contextRequireContext2 = qVar9.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        Object obj2 = wh.a.b(contextRequireContext2).get(1);
                        kotlin.jvm.internal.m.e(obj2, "get(...)");
                        int i16 = ARSyllableTestIndexActivity.Q;
                        Context contextRequireContext3 = qVar9.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, HOBXIlHxIkMBEA.HlvKVdtP);
                        Intent intent = new Intent(contextRequireContext3, (Class<?>) ARSyllableTestIndexActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, (bi.a) obj2);
                        qVar9.startActivity(intent);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
    }
}

package ci;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.i3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends ji.e {
    public th.e N;

    public n() {
        super(m.f7143a, BuildConfig.VERSION_NAME);
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
        bq.z.b(((i3) aVar).f32699d, new fz.c(this) { // from class: ci.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f7141b;

            {
                this.f7141b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                n nVar = this.f7141b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar = nVar.N;
                        if (eVar == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar = fv.b.f28186a;
                        eVar.h(fv.b.c("a", null, null));
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar2 = nVar.N;
                        if (eVar2 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar2 = fv.b.f28186a;
                        eVar2.h(fv.b.c("b", null, null));
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar3 = nVar.N;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar3 = fv.b.f28186a;
                        eVar3.h(fv.b.c("i", null, null));
                        return b0Var;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar4 = nVar.N;
                        if (eVar4 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar4 = fv.b.f28186a;
                        eVar4.h(fv.b.c("ba", null, null));
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar5 = nVar.N;
                        if (eVar5 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar5 = fv.b.f28186a;
                        eVar5.h(fv.b.c("bi", null, null));
                        return b0Var;
                }
            }
        });
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        TextView textView = ((i3) aVar2).f32700e;
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        TextView[] textViewArr = {textView, ((i3) aVar3).f32701f};
        for (int i12 = 0; i12 < 2; i12++) {
            TextView textView2 = textViewArr[i12];
            kotlin.jvm.internal.m.c(textView2);
            final int i13 = 1;
            bq.z.b(textView2, new fz.c(this) { // from class: ci.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f7141b;

                {
                    this.f7141b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    int i14 = i13;
                    qy.b0 b0Var = qy.b0.f48488a;
                    n nVar = this.f7141b;
                    View it = (View) obj;
                    switch (i14) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            th.e eVar = nVar.N;
                            if (eVar == null) {
                                kotlin.jvm.internal.m.n("audioPlayer");
                                throw null;
                            }
                            qy.q qVar = fv.b.f28186a;
                            eVar.h(fv.b.c("a", null, null));
                            return b0Var;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            th.e eVar2 = nVar.N;
                            if (eVar2 == null) {
                                kotlin.jvm.internal.m.n("audioPlayer");
                                throw null;
                            }
                            qy.q qVar2 = fv.b.f28186a;
                            eVar2.h(fv.b.c("b", null, null));
                            return b0Var;
                        case 2:
                            kotlin.jvm.internal.m.f(it, "it");
                            th.e eVar3 = nVar.N;
                            if (eVar3 == null) {
                                kotlin.jvm.internal.m.n("audioPlayer");
                                throw null;
                            }
                            qy.q qVar3 = fv.b.f28186a;
                            eVar3.h(fv.b.c("i", null, null));
                            return b0Var;
                        case 3:
                            kotlin.jvm.internal.m.f(it, "it");
                            th.e eVar4 = nVar.N;
                            if (eVar4 == null) {
                                kotlin.jvm.internal.m.n("audioPlayer");
                                throw null;
                            }
                            qy.q qVar4 = fv.b.f28186a;
                            eVar4.h(fv.b.c("ba", null, null));
                            return b0Var;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            th.e eVar5 = nVar.N;
                            if (eVar5 == null) {
                                kotlin.jvm.internal.m.n("audioPlayer");
                                throw null;
                            }
                            qy.q qVar5 = fv.b.f28186a;
                            eVar5.h(fv.b.c("bi", null, null));
                            return b0Var;
                    }
                }
            });
        }
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        final int i14 = 2;
        bq.z.b(((i3) aVar4).f32702g, new fz.c(this) { // from class: ci.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f7141b;

            {
                this.f7141b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = i14;
                qy.b0 b0Var = qy.b0.f48488a;
                n nVar = this.f7141b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar = nVar.N;
                        if (eVar == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar = fv.b.f28186a;
                        eVar.h(fv.b.c("a", null, null));
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar2 = nVar.N;
                        if (eVar2 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar2 = fv.b.f28186a;
                        eVar2.h(fv.b.c("b", null, null));
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar3 = nVar.N;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar3 = fv.b.f28186a;
                        eVar3.h(fv.b.c("i", null, null));
                        return b0Var;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar4 = nVar.N;
                        if (eVar4 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar4 = fv.b.f28186a;
                        eVar4.h(fv.b.c("ba", null, null));
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar5 = nVar.N;
                        if (eVar5 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar5 = fv.b.f28186a;
                        eVar5.h(fv.b.c("bi", null, null));
                        return b0Var;
                }
            }
        });
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        final int i15 = 3;
        bq.z.b(((i3) aVar5).f32697b, new fz.c(this) { // from class: ci.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f7141b;

            {
                this.f7141b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i16 = i15;
                qy.b0 b0Var = qy.b0.f48488a;
                n nVar = this.f7141b;
                View it = (View) obj;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar = nVar.N;
                        if (eVar == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar = fv.b.f28186a;
                        eVar.h(fv.b.c("a", null, null));
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar2 = nVar.N;
                        if (eVar2 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar2 = fv.b.f28186a;
                        eVar2.h(fv.b.c("b", null, null));
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar3 = nVar.N;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar3 = fv.b.f28186a;
                        eVar3.h(fv.b.c("i", null, null));
                        return b0Var;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar4 = nVar.N;
                        if (eVar4 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar4 = fv.b.f28186a;
                        eVar4.h(fv.b.c("ba", null, null));
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar5 = nVar.N;
                        if (eVar5 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar5 = fv.b.f28186a;
                        eVar5.h(fv.b.c("bi", null, null));
                        return b0Var;
                }
            }
        });
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        final int i16 = 4;
        bq.z.b(((i3) aVar6).f32698c, new fz.c(this) { // from class: ci.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f7141b;

            {
                this.f7141b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i17 = i16;
                qy.b0 b0Var = qy.b0.f48488a;
                n nVar = this.f7141b;
                View it = (View) obj;
                switch (i17) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar = nVar.N;
                        if (eVar == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar = fv.b.f28186a;
                        eVar.h(fv.b.c("a", null, null));
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar2 = nVar.N;
                        if (eVar2 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar2 = fv.b.f28186a;
                        eVar2.h(fv.b.c("b", null, null));
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar3 = nVar.N;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar3 = fv.b.f28186a;
                        eVar3.h(fv.b.c("i", null, null));
                        return b0Var;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar4 = nVar.N;
                        if (eVar4 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar4 = fv.b.f28186a;
                        eVar4.h(fv.b.c("ba", null, null));
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        th.e eVar5 = nVar.N;
                        if (eVar5 == null) {
                            kotlin.jvm.internal.m.n("audioPlayer");
                            throw null;
                        }
                        qy.q qVar5 = fv.b.f28186a;
                        eVar5.h(fv.b.c("bi", null, null));
                        return b0Var;
                }
            }
        });
    }
}

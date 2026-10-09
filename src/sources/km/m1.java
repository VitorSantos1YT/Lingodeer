package km;

import android.os.Bundle;
import android.view.View;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.k5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends bp.m {
    public a9.i O;

    public m1() {
        super(l1.f38236a, BuildConfig.VERSION_NAME);
        LearnType learnType = LearnType.LEARN;
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onDestroy() {
        super.onDestroy();
        a9.i iVar = this.O;
        if (iVar != null) {
            iVar.y();
            a9.i iVar2 = this.O;
            kotlin.jvm.internal.m.c(iVar2);
            iVar2.l();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        a9.i iVar = this.O;
        if (iVar != null) {
            iVar.y();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        getContext();
        this.O = new a9.i(1);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        final int i11 = 0;
        bq.z.b(((k5) aVar).f32826b.f32581f, new fz.c(this) { // from class: km.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f38225b;

            {
                this.f38225b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.v(oz.x.q0(fv.b.Y(6L, null, null), "jpup", "jp"));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(oz.x.q0(fv.b.Y(6L, null, null), "jpup", "jp"));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        iVar3.v(oz.x.q0(fv.b.Y(316L, null, null), "jpup", "jp"));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(oz.x.q0(fv.b.Y(316L, null, null), "jpup", "jp"));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(oz.x.q0(fv.b.Y(435L, null, null), "jpup", "jp"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(oz.x.q0(fv.b.Y(435L, null, null), "jpup", "jp"));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        final int i12 = 1;
        bq.z.b(((k5) aVar2).f32826b.f32579d, new fz.c(this) { // from class: km.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f38225b;

            {
                this.f38225b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.v(oz.x.q0(fv.b.Y(6L, null, null), "jpup", "jp"));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(oz.x.q0(fv.b.Y(6L, null, null), "jpup", "jp"));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        iVar3.v(oz.x.q0(fv.b.Y(316L, null, null), "jpup", "jp"));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(oz.x.q0(fv.b.Y(316L, null, null), "jpup", "jp"));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(oz.x.q0(fv.b.Y(435L, null, null), "jpup", "jp"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(oz.x.q0(fv.b.Y(435L, null, null), "jpup", "jp"));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        final int i13 = 2;
        bq.z.b(((k5) aVar3).f32826b.f32582g, new fz.c(this) { // from class: km.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f38225b;

            {
                this.f38225b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.v(oz.x.q0(fv.b.Y(6L, null, null), "jpup", "jp"));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(oz.x.q0(fv.b.Y(6L, null, null), "jpup", "jp"));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        iVar3.v(oz.x.q0(fv.b.Y(316L, null, null), "jpup", "jp"));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(oz.x.q0(fv.b.Y(316L, null, null), "jpup", "jp"));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(oz.x.q0(fv.b.Y(435L, null, null), "jpup", "jp"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(oz.x.q0(fv.b.Y(435L, null, null), "jpup", "jp"));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        final int i14 = 3;
        bq.z.b(((k5) aVar4).f32826b.f32578c, new fz.c(this) { // from class: km.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f38225b;

            {
                this.f38225b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.v(oz.x.q0(fv.b.Y(6L, null, null), "jpup", "jp"));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(oz.x.q0(fv.b.Y(6L, null, null), "jpup", "jp"));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        iVar3.v(oz.x.q0(fv.b.Y(316L, null, null), "jpup", "jp"));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(oz.x.q0(fv.b.Y(316L, null, null), "jpup", "jp"));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(oz.x.q0(fv.b.Y(435L, null, null), "jpup", "jp"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(oz.x.q0(fv.b.Y(435L, null, null), "jpup", "jp"));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        final int i15 = 4;
        bq.z.b(((k5) aVar5).f32826b.f32583h, new fz.c(this) { // from class: km.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f38225b;

            {
                this.f38225b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.v(oz.x.q0(fv.b.Y(6L, null, null), "jpup", "jp"));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(oz.x.q0(fv.b.Y(6L, null, null), "jpup", "jp"));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        iVar3.v(oz.x.q0(fv.b.Y(316L, null, null), "jpup", "jp"));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(oz.x.q0(fv.b.Y(316L, null, null), "jpup", "jp"));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(oz.x.q0(fv.b.Y(435L, null, null), "jpup", "jp"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(oz.x.q0(fv.b.Y(435L, null, null), "jpup", "jp"));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        final int i16 = 5;
        bq.z.b(((k5) aVar6).f32826b.f32580e, new fz.c(this) { // from class: km.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f38225b;

            {
                this.f38225b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.v(oz.x.q0(fv.b.Y(6L, null, null), "jpup", "jp"));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(oz.x.q0(fv.b.Y(6L, null, null), "jpup", "jp"));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        iVar3.v(oz.x.q0(fv.b.Y(316L, null, null), "jpup", "jp"));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(oz.x.q0(fv.b.Y(316L, null, null), "jpup", "jp"));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(oz.x.q0(fv.b.Y(435L, null, null), "jpup", "jp"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = this.f38225b.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(oz.x.q0(fv.b.Y(435L, null, null), "jpup", "jp"));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        if (oz.q.v0("release", "debug", false)) {
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((k5) aVar7).f32827c.setOnLongClickListener(new fk.c(this, 1));
        }
    }
}

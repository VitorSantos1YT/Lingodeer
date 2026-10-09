package hh;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.fluent.ui.base.PdVocabularyActivity;
import com.lingo.fluent.ui.base.PdVocabularyDetailActivity;
import com.lingo.fluent.ui.base.adapter.PdVocabularyAdapter;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.INTENTS;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PdVocabularyActivity f32250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(PdVocabularyActivity pdVocabularyActivity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f32248a = i11;
        this.f32250c = pdVocabularyActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f32248a) {
            case 0:
                return new j1(this.f32250c, dVar, 0);
            default:
                return new j1(this.f32250c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f32248a) {
            case 0:
                break;
        }
        return ((j1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    /* JADX WARN: Code duplicated, block: B:48:0x010e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0135  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        int i12;
        int i13 = this.f32248a;
        final PdVocabularyActivity pdVocabularyActivity = this.f32250c;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        final int i14 = 1;
        char c11 = 1;
        int i15 = 2;
        switch (i13) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f32249b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f32249b = 1;
                    if (fb.g0.h(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                n9.q qVar = pdVocabularyActivity.f36391f;
                int i17 = PdVocabularyActivity.Z;
                ((hj.m0) pdVocabularyActivity.j()).f32906e.setVisibility(8);
                ArrayList arrayList = pdVocabularyActivity.S;
                th.e eVar = pdVocabularyActivity.V;
                if (eVar == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                PdVocabularyAdapter pdVocabularyAdapter = new PdVocabularyAdapter(arrayList, qVar, eVar, pdVocabularyActivity.m());
                pdVocabularyActivity.Q = pdVocabularyAdapter;
                final int i18 = 0;
                pdVocabularyAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: hh.h1
                    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
                    public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i19) {
                        switch (i18) {
                            case 0:
                                PdVocabularyActivity pdVocabularyActivity2 = pdVocabularyActivity;
                                int i21 = pdVocabularyActivity2.U;
                                Intent intent = new Intent(pdVocabularyActivity2, (Class<?>) PdVocabularyDetailActivity.class);
                                intent.putExtra(INTENTS.EXTRA_INT, i19);
                                intent.putExtra(INTENTS.EXTRA_INT_2, i21);
                                pdVocabularyActivity2.startActivity(intent);
                                break;
                            default:
                                PdVocabularyActivity pdVocabularyActivity3 = pdVocabularyActivity;
                                int i22 = pdVocabularyActivity3.U;
                                Intent intent2 = new Intent(pdVocabularyActivity3, (Class<?>) PdVocabularyDetailActivity.class);
                                intent2.putExtra(INTENTS.EXTRA_INT, i19);
                                intent2.putExtra(INTENTS.EXTRA_INT_2, i22);
                                pdVocabularyActivity3.startActivity(intent2);
                                break;
                        }
                    }
                });
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
                ((hj.m0) pdVocabularyActivity.j()).f32907f.setLayoutManager(linearLayoutManager);
                RecyclerView recyclerView = ((hj.m0) pdVocabularyActivity.j()).f32907f;
                PdVocabularyAdapter pdVocabularyAdapter2 = pdVocabularyActivity.Q;
                if (pdVocabularyAdapter2 == null) {
                    kotlin.jvm.internal.m.n("allAdapter");
                    throw null;
                }
                recyclerView.setAdapter(pdVocabularyAdapter2);
                ((hj.m0) pdVocabularyActivity.j()).f32907f.setHasFixedSize(true);
                Env env = ((fr.o0) pdVocabularyActivity.l()).f27733a;
                int i19 = env.keyLanguage;
                if (i19 == 0) {
                    i11 = env.fluentCNVocabularyEnterPos;
                } else if (i19 == 1) {
                    i11 = env.fluentJPVocabularyEnterPos;
                } else if (i19 == 2) {
                    i11 = env.fluentKRVocabularyEnterPos;
                } else if (i19 == 4) {
                    i11 = env.fluentESVocabularyEnterPos;
                } else if (i19 == 5) {
                    i11 = env.fluentFRVocabularyEnterPos;
                } else if (i19 == 47) {
                    i11 = env.fluentESVocabularyEnterPos;
                } else if (i19 != 53) {
                    i11 = 0;
                } else {
                    i11 = env.fluentFRVocabularyEnterPos;
                }
                pdVocabularyActivity.W = i11;
                Env env2 = ((fr.o0) pdVocabularyActivity.l()).f27733a;
                int i21 = env2.keyLanguage;
                if (i21 == 0) {
                    i12 = env2.fluentCNVocabularyEnterOffset;
                } else if (i21 == 1) {
                    i12 = env2.fluentJPVocabularyEnterOffset;
                } else if (i21 == 2) {
                    i12 = env2.fluentKRVocabularyEnterOffset;
                } else if (i21 == 4) {
                    i12 = env2.fluentESVocabularyEnterOffset;
                } else if (i21 == 5) {
                    i12 = env2.fluentFRVocabularyEnterOffset;
                } else if (i21 == 47) {
                    i12 = env2.fluentESVocabularyEnterOffset;
                } else if (i21 != 53) {
                    i12 = 0;
                } else {
                    i12 = env2.fluentFRVocabularyEnterOffset;
                }
                pdVocabularyActivity.X = i12;
                ((hj.m0) pdVocabularyActivity.j()).f32907f.addOnScrollListener(new k1(linearLayoutManager, pdVocabularyActivity));
                ArrayList arrayList2 = pdVocabularyActivity.T;
                th.e eVar2 = pdVocabularyActivity.V;
                if (eVar2 == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                PdVocabularyAdapter pdVocabularyAdapter3 = new PdVocabularyAdapter(arrayList2, qVar, eVar2, pdVocabularyActivity.m());
                pdVocabularyActivity.R = pdVocabularyAdapter3;
                pdVocabularyAdapter3.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: hh.h1
                    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
                    public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i110) {
                        switch (i14) {
                            case 0:
                                PdVocabularyActivity pdVocabularyActivity2 = pdVocabularyActivity;
                                int i22 = pdVocabularyActivity2.U;
                                Intent intent = new Intent(pdVocabularyActivity2, (Class<?>) PdVocabularyDetailActivity.class);
                                intent.putExtra(INTENTS.EXTRA_INT, i110);
                                intent.putExtra(INTENTS.EXTRA_INT_2, i22);
                                pdVocabularyActivity2.startActivity(intent);
                                break;
                            default:
                                PdVocabularyActivity pdVocabularyActivity3 = pdVocabularyActivity;
                                int i23 = pdVocabularyActivity3.U;
                                Intent intent2 = new Intent(pdVocabularyActivity3, (Class<?>) PdVocabularyDetailActivity.class);
                                intent2.putExtra(INTENTS.EXTRA_INT, i110);
                                intent2.putExtra(INTENTS.EXTRA_INT_2, i23);
                                pdVocabularyActivity3.startActivity(intent2);
                                break;
                        }
                    }
                });
                ((hj.m0) pdVocabularyActivity.j()).f32908g.setLayoutManager(new LinearLayoutManager(1));
                RecyclerView recyclerView2 = ((hj.m0) pdVocabularyActivity.j()).f32908g;
                PdVocabularyAdapter pdVocabularyAdapter4 = pdVocabularyActivity.R;
                if (pdVocabularyAdapter4 == null) {
                    kotlin.jvm.internal.m.n("favAdapter");
                    throw null;
                }
                recyclerView2.setAdapter(pdVocabularyAdapter4);
                ((hj.m0) pdVocabularyActivity.j()).f32908g.setHasFixedSize(true);
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdVocabularyActivity), null, null, new bp.j(6, pdVocabularyActivity, dVar, c11 == true ? 1 : 0), 3);
                bq.z.b(((hj.m0) pdVocabularyActivity.j()).f32904c, new g1(pdVocabularyActivity, i15));
                bq.z.b(((hj.m0) pdVocabularyActivity.j()).f32905d, new g1(pdVocabularyActivity, 3));
                PdVocabularyAdapter pdVocabularyAdapter5 = pdVocabularyActivity.Q;
                if (pdVocabularyAdapter5 != null) {
                    pdVocabularyAdapter5.openLoadAnimation(3);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("allAdapter");
                throw null;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f32249b;
                if (i22 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.n0 n0VarL = pdVocabularyActivity.l();
                    int i23 = pdVocabularyActivity.W;
                    this.f32249b = 1;
                    fr.o0 o0Var = (fr.o0) n0VarL;
                    o0Var.getClass();
                    yz.f fVar = rz.o0.f50940a;
                    Object objM = rz.e0.M(yz.e.f58387a, new fr.f0(i23, 18, o0Var, dVar), this);
                    if (objM != aVar2) {
                        objM = b0Var;
                    }
                    if (objM != aVar2) {
                    }
                    return aVar2;
                }
                if (i22 != 1) {
                    if (i22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.n0 n0VarL2 = pdVocabularyActivity.l();
                int i24 = pdVocabularyActivity.X;
                this.f32249b = 2;
                fr.o0 o0Var2 = (fr.o0) n0VarL2;
                o0Var2.getClass();
                yz.f fVar2 = rz.o0.f50940a;
                Object objM2 = rz.e0.M(yz.e.f58387a, new fr.f0(i24, 17, o0Var2, dVar), this);
                if (objM2 != aVar2) {
                    objM2 = b0Var;
                }
                if (objM2 != aVar2) {
                    return b0Var;
                }
                return aVar2;
        }
    }
}

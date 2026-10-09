package bo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;
import fr.j3;
import hj.e3;
import hj.t0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d extends j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f4472a = new d(1, t0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityRuSyllableIntroductionBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_ru_syllable_introduction, (ViewGroup) null, false);
        int i11 = R.id.ll_download;
        View viewQ = j3.q(viewInflate, R.id.ll_download);
        if (viewQ != null) {
            e3 e3VarA = e3.a(viewQ);
            i11 = R.id.ll_parent;
            if (((LinearLayout) j3.q(viewInflate, R.id.ll_parent)) != null) {
                i11 = R.id.rv_31;
                RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.rv_31);
                if (recyclerView != null) {
                    i11 = R.id.rv_32;
                    RecyclerView recyclerView2 = (RecyclerView) j3.q(viewInflate, R.id.rv_32);
                    if (recyclerView2 != null) {
                        i11 = R.id.rv_33;
                        RecyclerView recyclerView3 = (RecyclerView) j3.q(viewInflate, R.id.rv_33);
                        if (recyclerView3 != null) {
                            i11 = R.id.rv_4;
                            RecyclerView recyclerView4 = (RecyclerView) j3.q(viewInflate, R.id.rv_4);
                            if (recyclerView4 != null) {
                                i11 = R.id.rv_5_1;
                                RecyclerView recyclerView5 = (RecyclerView) j3.q(viewInflate, R.id.rv_5_1);
                                if (recyclerView5 != null) {
                                    i11 = R.id.rv_5_2;
                                    RecyclerView recyclerView6 = (RecyclerView) j3.q(viewInflate, R.id.rv_5_2);
                                    if (recyclerView6 != null) {
                                        i11 = R.id.rv_5_3;
                                        RecyclerView recyclerView7 = (RecyclerView) j3.q(viewInflate, R.id.rv_5_3);
                                        if (recyclerView7 != null) {
                                            i11 = R.id.rv_5_4;
                                            RecyclerView recyclerView8 = (RecyclerView) j3.q(viewInflate, R.id.rv_5_4);
                                            if (recyclerView8 != null) {
                                                i11 = R.id.rv_6;
                                                RecyclerView recyclerView9 = (RecyclerView) j3.q(viewInflate, R.id.rv_6);
                                                if (recyclerView9 != null) {
                                                    i11 = R.id.rv_ru_alphabet;
                                                    RecyclerView recyclerView10 = (RecyclerView) j3.q(viewInflate, R.id.rv_ru_alphabet);
                                                    if (recyclerView10 != null) {
                                                        i11 = R.id.rv_vowel;
                                                        RecyclerView recyclerView11 = (RecyclerView) j3.q(viewInflate, R.id.rv_vowel);
                                                        if (recyclerView11 != null) {
                                                            return new t0((LinearLayout) viewInflate, e3VarA, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, recyclerView8, recyclerView9, recyclerView10, recyclerView11);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}

package yl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;
import fr.j3;
import hj.e3;
import hj.w;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f57863a = new c(1, w.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityItSyllableIntroductionBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_it_syllable_introduction, (ViewGroup) null, false);
        int i11 = R.id.ll_download;
        View viewQ = j3.q(viewInflate, R.id.ll_download);
        if (viewQ != null) {
            e3 e3VarA = e3.a(viewQ);
            i11 = R.id.ll_parent;
            LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_parent);
            if (linearLayout != null) {
                i11 = R.id.recycler_1;
                RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_1);
                if (recyclerView != null) {
                    i11 = R.id.recycler_10;
                    RecyclerView recyclerView2 = (RecyclerView) j3.q(viewInflate, R.id.recycler_10);
                    if (recyclerView2 != null) {
                        i11 = R.id.recycler_11;
                        RecyclerView recyclerView3 = (RecyclerView) j3.q(viewInflate, R.id.recycler_11);
                        if (recyclerView3 != null) {
                            i11 = R.id.recycler_12;
                            RecyclerView recyclerView4 = (RecyclerView) j3.q(viewInflate, R.id.recycler_12);
                            if (recyclerView4 != null) {
                                i11 = R.id.recycler_13;
                                RecyclerView recyclerView5 = (RecyclerView) j3.q(viewInflate, R.id.recycler_13);
                                if (recyclerView5 != null) {
                                    i11 = R.id.recycler_14;
                                    RecyclerView recyclerView6 = (RecyclerView) j3.q(viewInflate, R.id.recycler_14);
                                    if (recyclerView6 != null) {
                                        i11 = R.id.recycler_15;
                                        RecyclerView recyclerView7 = (RecyclerView) j3.q(viewInflate, R.id.recycler_15);
                                        if (recyclerView7 != null) {
                                            i11 = R.id.recycler_16;
                                            RecyclerView recyclerView8 = (RecyclerView) j3.q(viewInflate, R.id.recycler_16);
                                            if (recyclerView8 != null) {
                                                i11 = R.id.recycler_17;
                                                RecyclerView recyclerView9 = (RecyclerView) j3.q(viewInflate, R.id.recycler_17);
                                                if (recyclerView9 != null) {
                                                    i11 = R.id.recycler_2;
                                                    RecyclerView recyclerView10 = (RecyclerView) j3.q(viewInflate, R.id.recycler_2);
                                                    if (recyclerView10 != null) {
                                                        i11 = R.id.recycler_3;
                                                        RecyclerView recyclerView11 = (RecyclerView) j3.q(viewInflate, R.id.recycler_3);
                                                        if (recyclerView11 != null) {
                                                            i11 = R.id.recycler_4;
                                                            RecyclerView recyclerView12 = (RecyclerView) j3.q(viewInflate, R.id.recycler_4);
                                                            if (recyclerView12 != null) {
                                                                i11 = R.id.recycler_5;
                                                                RecyclerView recyclerView13 = (RecyclerView) j3.q(viewInflate, R.id.recycler_5);
                                                                if (recyclerView13 != null) {
                                                                    i11 = R.id.recycler_6;
                                                                    RecyclerView recyclerView14 = (RecyclerView) j3.q(viewInflate, R.id.recycler_6);
                                                                    if (recyclerView14 != null) {
                                                                        i11 = R.id.recycler_7;
                                                                        RecyclerView recyclerView15 = (RecyclerView) j3.q(viewInflate, R.id.recycler_7);
                                                                        if (recyclerView15 != null) {
                                                                            i11 = R.id.recycler_8;
                                                                            RecyclerView recyclerView16 = (RecyclerView) j3.q(viewInflate, R.id.recycler_8);
                                                                            if (recyclerView16 != null) {
                                                                                i11 = R.id.recycler_9;
                                                                                RecyclerView recyclerView17 = (RecyclerView) j3.q(viewInflate, R.id.recycler_9);
                                                                                if (recyclerView17 != null) {
                                                                                    return new w((LinearLayout) viewInflate, e3VarA, linearLayout, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, recyclerView8, recyclerView9, recyclerView10, recyclerView11, recyclerView12, recyclerView13, recyclerView14, recyclerView15, recyclerView16, recyclerView17);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}

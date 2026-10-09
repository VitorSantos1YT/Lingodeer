package ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.ObservableHorizonalScrollView;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.ObservableScrollView;
import com.lingodeer.R;
import fr.j3;
import hj.t4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f53001a = new l0(3, t4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentPinyinStudyBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_pinyin_study, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.ll_left;
        if (((LinearLayout) j3.q(viewInflate, R.id.ll_left)) != null) {
            i11 = R.id.ll_top;
            if (((LinearLayout) j3.q(viewInflate, R.id.ll_top)) != null) {
                i11 = R.id.pinyin_word1;
                ImageView imageView = (ImageView) j3.q(viewInflate, R.id.pinyin_word1);
                if (imageView != null) {
                    i11 = R.id.pinyin_word2;
                    ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.pinyin_word2);
                    if (imageView2 != null) {
                        i11 = R.id.pinyin_word3;
                        ImageView imageView3 = (ImageView) j3.q(viewInflate, R.id.pinyin_word3);
                        if (imageView3 != null) {
                            i11 = R.id.pinyin_word4;
                            ImageView imageView4 = (ImageView) j3.q(viewInflate, R.id.pinyin_word4);
                            if (imageView4 != null) {
                                i11 = R.id.pinyin_word5;
                                if (((ImageView) j3.q(viewInflate, R.id.pinyin_word5)) != null) {
                                    i11 = R.id.sv_center;
                                    ObservableScrollView observableScrollView = (ObservableScrollView) j3.q(viewInflate, R.id.sv_center);
                                    if (observableScrollView != null) {
                                        i11 = R.id.sv_center_horizonal;
                                        ObservableHorizonalScrollView observableHorizonalScrollView = (ObservableHorizonalScrollView) j3.q(viewInflate, R.id.sv_center_horizonal);
                                        if (observableHorizonalScrollView != null) {
                                            i11 = R.id.sv_left;
                                            ObservableScrollView observableScrollView2 = (ObservableScrollView) j3.q(viewInflate, R.id.sv_left);
                                            if (observableScrollView2 != null) {
                                                i11 = R.id.sv_top;
                                                ObservableHorizonalScrollView observableHorizonalScrollView2 = (ObservableHorizonalScrollView) j3.q(viewInflate, R.id.sv_top);
                                                if (observableHorizonalScrollView2 != null) {
                                                    i11 = R.id.tbl_body;
                                                    TableLayout tableLayout = (TableLayout) j3.q(viewInflate, R.id.tbl_body);
                                                    if (tableLayout != null) {
                                                        return new t4((LinearLayout) viewInflate, imageView, imageView2, imageView3, imageView4, observableScrollView, observableHorizonalScrollView, observableScrollView2, observableHorizonalScrollView2, tableLayout);
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

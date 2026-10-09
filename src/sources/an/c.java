package an;

import android.widget.TextView;
import com.lingo.lingoskill.object.Word;
import fz.f;
import gm.i;
import java.util.List;
import jp.p0;
import kotlin.jvm.internal.m;
import qp.n4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends n4 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f758t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(mp.b bVar, long j11, List list, int i11) {
        super(bVar, j11, list);
        this.f758t = i11;
    }

    @Override // qp.n4
    public final void B(Word word, TextView textView, TextView textView2, TextView textView3) {
        switch (this.f758t) {
            case 0:
                int i11 = this.f47884d.koDisPlay;
                if (i11 == 0) {
                    textView.setVisibility(8);
                    textView2.setText(word.getZhuyin());
                } else if (i11 == 1) {
                    textView.setVisibility(8);
                    textView2.setText(word.getWord());
                } else if (i11 == 2) {
                    textView.setVisibility(0);
                    textView.setText(word.getZhuyin());
                    textView2.setText(word.getWord());
                }
                textView3.setText(word.getTranslations());
                break;
            case 1:
                switch (this.f47884d.jsDisPlay) {
                    case 0:
                        textView.setVisibility(8);
                        textView2.setText(word.getWord());
                        break;
                    case 1:
                        textView.setVisibility(8);
                        textView2.setText(word.getZhuyin());
                        break;
                    case 2:
                        textView.setVisibility(8);
                        textView2.setText(word.getLuoma());
                        break;
                    case 3:
                        textView.setVisibility(0);
                        textView.setText(word.getZhuyin());
                        textView2.setText(word.getWord());
                        break;
                    case 4:
                        textView.setVisibility(0);
                        textView.setText(word.getLuoma());
                        textView2.setText(word.getWord());
                        break;
                    case 5:
                        textView.setVisibility(0);
                        textView.setText(word.getLuoma());
                        textView2.setText(word.getZhuyin());
                        break;
                    case 6:
                        textView.setVisibility(0);
                        textView.setText(word.getZhuyin());
                        textView2.setText(word.getWord());
                        break;
                }
                textView3.setText(word.getTranslations());
                break;
            default:
                int i12 = this.f47884d.csDisplay;
                if (i12 == 0) {
                    textView.setVisibility(8);
                    textView2.setText(word.getLuoma());
                } else if (i12 == 1) {
                    textView.setVisibility(8);
                    textView2.setText(word.getWord());
                } else if (i12 == 2) {
                    textView.setVisibility(0);
                    textView.setText(word.getLuoma());
                    textView2.setText(word.getWord());
                }
                textView3.setText(word.getTranslations());
                break;
        }
    }

    @Override // qp.n4, qp.d
    public f n() {
        switch (this.f758t) {
            case 1:
                return i.f29300a;
            case 2:
                return si.f.f51712a;
            default:
                return super.n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    @Override // qp.n4
    public void y(Word word, TextView textView, TextView textView2, TextView textView3) {
        switch (this.f758t) {
            case 1:
                p0 p0Var = (p0) this.f47881a;
                boolean z11 = p0Var.Q;
                zq.c.e(word, textView, textView2, textView3, false);
                int length = word.getWord().length();
                for (int i11 = 0; i11 < length; i11++) {
                    String strValueOf = String.valueOf(word.getWord().charAt(i11));
                    int length2 = word.getTranslations().length();
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            if (!m.a(strValueOf, String.valueOf(word.getTranslations().charAt(i12)))) {
                                i12++;
                            } else if (!m.a(word.getTranslations(), "美国人") && !m.a(word.getTranslations(), "英国人")) {
                                switch (this.f47884d.jsDisPlay) {
                                    case 0:
                                        textView2.setText(word.getZhuyin());
                                        break;
                                    case 1:
                                        textView2.setText(word.getZhuyin());
                                        break;
                                    case 2:
                                        textView2.setText(word.getLuoma());
                                        break;
                                    case 3:
                                        textView.setVisibility(8);
                                        textView2.setText(word.getZhuyin());
                                        break;
                                    case 4:
                                        textView.setVisibility(8);
                                        textView2.setText(word.getLuoma());
                                        break;
                                    case 5:
                                        textView.setVisibility(0);
                                        textView.setText(word.getLuoma());
                                        textView2.setText(word.getZhuyin());
                                        break;
                                    case 6:
                                        textView.setVisibility(0);
                                        textView3.setVisibility(8);
                                        textView.setText(word.getLuoma());
                                        textView2.setText(word.getZhuyin());
                                        break;
                                }
                                if (p0Var.Q) {
                                    textView.setVisibility(8);
                                    textView3.setVisibility(8);
                                    textView2.setText(word.getWord());
                                }
                                break;
                            }
                        }
                    }
                }
                if (p0Var.Q) {
                    textView.setVisibility(8);
                    textView3.setVisibility(8);
                    textView2.setText(word.getWord());
                }
                break;
            default:
                super.y(word, textView, textView2, textView3);
                break;
        }
    }
}

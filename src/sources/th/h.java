package th;

import android.widget.TextView;
import bq.r;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdWord;
import fr.o0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static void a(PdWord word, TextView textView, TextView textView2, TextView textView3) {
        m.f(word, "word");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 == 0) {
            textView3.setVisibility(8);
            textView.setVisibility(8);
            textView2.setText(word.getDictationWord());
        } else if (i11 == 1 || i11 != 2) {
            textView.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setText(word.getDictationWord());
        } else {
            textView3.setVisibility(8);
            textView.setVisibility(8);
            textView2.setText(word.getDictationWord());
        }
        int[] iArr = r.f4959a;
        bq.m.J(textView2);
    }

    public static void b(PdWord word, TextView textView, TextView textView2, TextView textView3, int i11) {
        String detailWord;
        String detailZhuyin;
        String detailZhuyin2;
        String detailLuoma;
        String detailZhuyin3;
        String detailZhuyin4;
        String detailWord2;
        String detailWord3;
        String detailLuoma2;
        String detailWord4;
        String detailLuoma3;
        String detailWord5;
        String detailLuoma4;
        String detailWord6;
        boolean z11 = (i11 & 32) == 0;
        boolean z12 = (i11 & 64) == 0;
        boolean z13 = (i11 & 128) == 0;
        boolean z14 = (i11 & 256) == 0;
        m.f(word, "word");
        int iT = ((o0) xt.b.c()).t();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().keyLanguage == 2) {
            textView3.setVisibility(8);
            if (iT == 1) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                if (z11) {
                    detailLuoma4 = word.getOriginLuoma();
                } else {
                    detailLuoma4 = z12 ? word.getDetailLuoma() : word.getShowLuoma();
                }
                textView.setText(detailLuoma4);
            }
            if (z11) {
                detailWord6 = word.getOriginWord();
            } else {
                detailWord6 = z12 ? word.getDetailWord() : word.getShowWord();
            }
            textView2.setText(detailWord6);
        } else if (x.n().keyLanguage == 0) {
            textView3.setVisibility(8);
            if (iT != 0) {
                textView.setVisibility(8);
                if (iT == 1) {
                    if (z11) {
                        detailWord5 = word.getOriginWord();
                    } else {
                        detailWord5 = z12 ? word.getDetailWord() : word.getShowWord();
                    }
                    textView2.setText(detailWord5);
                } else {
                    if (z11) {
                        detailLuoma3 = word.getOriginLuoma();
                    } else {
                        detailLuoma3 = z12 ? word.getDetailLuoma() : word.getShowLuoma();
                    }
                    textView2.setText(detailLuoma3);
                }
            } else {
                textView.setVisibility(0);
                if (z11) {
                    detailLuoma2 = word.getOriginLuoma();
                } else {
                    detailLuoma2 = z12 ? word.getDetailLuoma() : word.getShowLuoma();
                }
                textView.setText(detailLuoma2);
                if (z11) {
                    detailWord4 = word.getOriginWord();
                } else {
                    detailWord4 = z12 ? word.getDetailWord() : word.getShowWord();
                }
                textView2.setText(detailWord4);
            }
        } else if (x.n().keyLanguage != 1) {
            textView3.setVisibility(8);
            textView.setVisibility(8);
            if (z11) {
                detailWord = word.getOriginWord();
            } else {
                detailWord = z12 ? word.getDetailWord() : word.getShowWord();
            }
            textView2.setText(detailWord);
            if (z11) {
                detailZhuyin = word.getOriginZhuyin();
            } else {
                detailZhuyin = z12 ? word.getDetailZhuyin() : word.getShowZhuyin();
            }
            m.c(detailZhuyin);
            if (detailZhuyin.length() > 0 && z14) {
                textView3.setVisibility(0);
                textView3.setText(detailZhuyin);
            }
        } else if (iT == 1) {
            textView.setVisibility(8);
            textView3.setVisibility(8);
            if (z11) {
                detailWord3 = word.getOriginWord();
            } else {
                detailWord3 = z12 ? word.getDetailWord() : word.getShowWord();
            }
            textView2.setText(detailWord3);
        } else if (iT == 0) {
            textView3.setVisibility(8);
            textView.setVisibility(0);
            if (z11) {
                detailZhuyin4 = word.getOriginZhuyin();
            } else {
                detailZhuyin4 = z12 ? word.getDetailZhuyin() : word.getShowZhuyin();
            }
            textView.setText(detailZhuyin4);
            if (z11) {
                detailWord2 = word.getOriginWord();
            } else {
                detailWord2 = z12 ? word.getDetailWord() : word.getShowWord();
            }
            textView2.setText(detailWord2);
            if (z11) {
                if (m.a(word.getOriginZhuyin(), word.getOriginWord())) {
                    if (z13) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(4);
                    }
                }
            } else if (z12) {
                if (m.a(word.getDetailZhuyin(), word.getDetailWord())) {
                    if (z13) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(4);
                    }
                }
            } else if (m.a(word.getShowZhuyin(), word.getShowWord())) {
                if (z13) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(4);
                }
            }
        } else if (iT == 2) {
            textView.setVisibility(8);
            textView3.setVisibility(8);
            if (z11) {
                detailZhuyin3 = word.getOriginZhuyin();
            } else {
                detailZhuyin3 = z12 ? word.getDetailZhuyin() : word.getShowZhuyin();
            }
            textView2.setText(detailZhuyin3);
        } else if (iT == 3) {
            textView.setVisibility(8);
            textView3.setVisibility(0);
            if (z11) {
                detailZhuyin2 = word.getOriginZhuyin();
            } else {
                detailZhuyin2 = z12 ? word.getDetailZhuyin() : word.getShowZhuyin();
            }
            textView2.setText(detailZhuyin2);
            if (z11) {
                detailLuoma = word.getOriginLuoma();
            } else {
                detailLuoma = z12 ? word.getDetailLuoma() : word.getShowLuoma();
            }
            textView3.setText(detailLuoma);
        }
        int[] iArr = r.f4959a;
        bq.m.J(textView2);
    }
}

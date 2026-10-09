package cj;

import android.content.Context;
import android.widget.TextView;
import bq.r;
import cf.x;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import oo.d0;
import oo.g;
import tp.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends zq.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7172u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Context context, List list, FlexboxLayout flexboxLayout, int i11) {
        super(context, list, flexboxLayout);
        this.f7172u = i11;
    }

    @Override // zq.b
    public final String c(Word word) {
        switch (this.f7172u) {
        }
        return BuildConfig.VERSION_NAME;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:49:0x0125  */
    /* JADX WARN: Code duplicated, block: B:50:0x0129  */
    @Override // zq.b
    public final void h(Word word, TextView textView, TextView textView2, TextView textView3) {
        int i11 = this.f7172u;
        m.f(word, "word");
        switch (i11) {
            case 0:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                int i12 = x.n().keyLanguage;
                if (i12 == 0) {
                    zq.c.d(word, textView, textView2, textView3);
                } else if (i12 == 1) {
                    zq.c.f(word, textView, textView2, textView3);
                } else if (i12 == 2) {
                    zq.c.g(word, textView, textView2, textView3);
                } else if (i12 == 51 || i12 == 55) {
                    textView.setVisibility(8);
                    textView3.setVisibility(8);
                    textView3.setText(word.getLuoma());
                    textView2.setText(word.getWord());
                    if (word.getWordType() == 1) {
                        textView.setText(BuildConfig.VERSION_NAME);
                        textView2.setText(word.getWord());
                        textView3.setText(BuildConfig.VERSION_NAME);
                    }
                } else if (i12 != 65) {
                    switch (i12) {
                        case 10:
                            textView.setVisibility(8);
                            textView3.setVisibility(0);
                            textView3.setText(word.getZhuyin());
                            if (x.n().keyLanguage != 10) {
                                int i13 = x.n().keyLanguage;
                            }
                            textView2.setText(word.getWord());
                            if (word.getWordType() == 1) {
                                textView.setText(BuildConfig.VERSION_NAME);
                                textView2.setText(word.getWord());
                                textView3.setText(BuildConfig.VERSION_NAME);
                            }
                            break;
                        case 11:
                            zq.c.d(word, textView, textView2, textView3);
                            break;
                        case 12:
                            zq.c.f(word, textView, textView2, textView3);
                            break;
                        case 13:
                            zq.c.g(word, textView, textView2, textView3);
                            break;
                        default:
                            textView.setVisibility(8);
                            textView3.setVisibility(8);
                            if (x.n().keyLanguage != 10) {
                                int i14 = x.n().keyLanguage;
                            }
                            textView2.setText(word.getWord());
                            if (word.getWordType() == 1) {
                                textView.setText(BuildConfig.VERSION_NAME);
                                textView2.setText(word.getWord());
                                textView3.setText(BuildConfig.VERSION_NAME);
                            }
                            break;
                    }
                } else {
                    textView.setVisibility(0);
                    textView3.setVisibility(8);
                    textView.setText(word.getLuoma());
                    textView2.setText(word.getWord());
                    if (word.getWordType() == 1) {
                        textView.setText(BuildConfig.VERSION_NAME);
                        textView2.setText(word.getWord());
                        textView3.setText(BuildConfig.VERSION_NAME);
                    }
                }
                int[] iArr = r.f4959a;
                bq.m.J(textView2);
                break;
            case 1:
                Word word2 = new Word();
                word2.setWord(word.getWord());
                word2.setZhuyin(word.getZhuyin());
                word2.setLuoma(word.getLuoma());
                word2.setWordType(word.getWordType());
                zq.c.e(word2, textView, textView2, textView3, false);
                break;
            case 2:
                zq.c.e(word, textView, textView2, textView3, false);
                break;
            case 3:
                zq.c.e(word, textView, textView2, textView3, false);
                break;
            case 4:
                zq.c.e(word, textView, textView2, textView3, false);
                break;
            case 5:
                zq.c.e(word, textView, textView2, textView3, false);
                break;
            default:
                zq.c.e(word, textView, textView2, textView3, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d0 d0Var, Context context, List list, FlexboxLayout flexboxLayout) {
        super(context, list, flexboxLayout);
        this.f7172u = 4;
        m.c(context);
        m.d(list, "null cannot be cast to non-null type kotlin.collections.List<com.lingo.lingoskill.object.Word>");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FlexboxLayout flexboxLayout, SpeakTryAdapter speakTryAdapter, Context context, List list) {
        super(context, list, flexboxLayout);
        this.f7172u = 1;
        m.c(context);
        m.d(list, "null cannot be cast to non-null type kotlin.collections.List<com.lingo.lingoskill.object.Word>");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, Context context, List list, FlexboxLayout flexboxLayout) {
        super(context, list, flexboxLayout);
        this.f7172u = 2;
        m.d(list, "null cannot be cast to non-null type kotlin.collections.List<com.lingo.lingoskill.object.Word>");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList arrayList, FlexboxLayout flexboxLayout, o oVar, Context context) {
        super(context, arrayList, flexboxLayout);
        this.f7172u = 6;
        m.c(context);
    }
}

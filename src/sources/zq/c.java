package zq;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import bq.r;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.m;
import ns.o;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static SpannableStringBuilder a(Word word, Context context) {
        m.f(context, "context");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    switch (i11) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            return new SpannableStringBuilder(word.getWord());
                    }
                }
                return x.n().koDisPlay == 0 ? new SpannableStringBuilder(word.getZhuyin()) : new SpannableStringBuilder(word.getWord());
            }
            int i12 = x.n().jsDisPlay;
            if (i12 == 0) {
                return new SpannableStringBuilder(word.getWord());
            }
            if (i12 == 1) {
                return new SpannableStringBuilder(word.getZhuyin());
            }
            if (i12 != 2) {
                return i12 != 5 ? new SpannableStringBuilder(word.getWord()) : new SpannableStringBuilder(word.getZhuyin());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String luoma = word.getLuoma();
            m.e(luoma, "getLuoma(...)");
            int i13 = 0;
            for (Object obj : q.W0(luoma, new String[]{" "}, 0, 6)) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    o.V();
                    throw null;
                }
                String str = (String) obj;
                SpannableString spannableString = new SpannableString(str);
                if (i13 % 2 == 0) {
                    spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.primary_black)), 0, str.length(), 33);
                } else {
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#78C7FF")), 0, str.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                i13 = i14;
            }
            return spannableStringBuilder;
        }
        return x.n().csDisplay == 0 ? new SpannableStringBuilder(word.getZhuyin()) : new SpannableStringBuilder(word.getWord());
    }

    public static String b(Sentence sentence) {
        m.f(sentence, "sentence");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 57) {
                        if (x.n().thaiDisPlay != 1) {
                            String translations = sentence.getTranslations();
                            m.e(translations, "getTranslations(...)");
                            String string = q.i1(translations).toString();
                            String sentence2 = sentence.getSentence();
                            m.e(sentence2, "getSentence(...)");
                            return ep.a.D(string, "\n", q.i1(sentence2).toString());
                        }
                        String strGenLuoma = sentence.genLuoma();
                        m.e(strGenLuoma, "genLuoma(...)");
                        if (strGenLuoma.length() <= 0) {
                            String translations2 = sentence.getTranslations();
                            m.e(translations2, "getTranslations(...)");
                            String string2 = q.i1(translations2).toString();
                            String sentence3 = sentence.getSentence();
                            m.e(sentence3, "getSentence(...)");
                            return ep.a.D(string2, "\n", q.i1(sentence3).toString());
                        }
                        String translations3 = sentence.getTranslations();
                        m.e(translations3, "getTranslations(...)");
                        String string3 = q.i1(translations3).toString();
                        String strGenLuoma2 = sentence.genLuoma();
                        m.e(strGenLuoma2, "genLuoma(...)");
                        String string4 = q.i1(strGenLuoma2).toString();
                        String sentence4 = sentence.getSentence();
                        m.e(sentence4, "getSentence(...)");
                        return w4.c.h(string3, "\n", string4, "\n", q.i1(sentence4).toString());
                    }
                    if (i11 == 61) {
                        if (x.n().hindiDisPlay != 1) {
                            String translations4 = sentence.getTranslations();
                            m.e(translations4, "getTranslations(...)");
                            String string5 = q.i1(translations4).toString();
                            String sentence5 = sentence.getSentence();
                            m.e(sentence5, "getSentence(...)");
                            return ep.a.D(string5, "\n", q.i1(sentence5).toString());
                        }
                        String strGenLuoma3 = sentence.genLuoma();
                        m.e(strGenLuoma3, "genLuoma(...)");
                        if (strGenLuoma3.length() <= 0) {
                            String translations5 = sentence.getTranslations();
                            m.e(translations5, "getTranslations(...)");
                            String string6 = q.i1(translations5).toString();
                            String sentence6 = sentence.getSentence();
                            m.e(sentence6, "getSentence(...)");
                            return ep.a.D(string6, "\n", q.i1(sentence6).toString());
                        }
                        String translations6 = sentence.getTranslations();
                        m.e(translations6, "getTranslations(...)");
                        String string7 = q.i1(translations6).toString();
                        String strGenLuoma4 = sentence.genLuoma();
                        m.e(strGenLuoma4, "genLuoma(...)");
                        String string8 = q.i1(strGenLuoma4).toString();
                        String sentence7 = sentence.getSentence();
                        m.e(sentence7, "getSentence(...)");
                        return w4.c.h(string7, "\n", string8, "\n", q.i1(sentence7).toString());
                    }
                    if (i11 == 63) {
                        if (x.n().ukrDisPlay != 1) {
                            String translations7 = sentence.getTranslations();
                            m.e(translations7, "getTranslations(...)");
                            String string9 = q.i1(translations7).toString();
                            String sentence8 = sentence.getSentence();
                            m.e(sentence8, "getSentence(...)");
                            return ep.a.D(string9, "\n", q.i1(sentence8).toString());
                        }
                        String strGenLuoma5 = sentence.genLuoma();
                        m.e(strGenLuoma5, "genLuoma(...)");
                        if (strGenLuoma5.length() <= 0) {
                            String translations8 = sentence.getTranslations();
                            m.e(translations8, "getTranslations(...)");
                            String string10 = q.i1(translations8).toString();
                            String sentence9 = sentence.getSentence();
                            m.e(sentence9, "getSentence(...)");
                            return ep.a.D(string10, "\n", q.i1(sentence9).toString());
                        }
                        String translations9 = sentence.getTranslations();
                        m.e(translations9, "getTranslations(...)");
                        String string11 = q.i1(translations9).toString();
                        String strGenLuoma6 = sentence.genLuoma();
                        m.e(strGenLuoma6, "genLuoma(...)");
                        String string12 = q.i1(strGenLuoma6).toString();
                        String sentence10 = sentence.getSentence();
                        m.e(sentence10, "getSentence(...)");
                        return w4.c.h(string11, "\n", string12, "\n", q.i1(sentence10).toString());
                    }
                    if (i11 == 65) {
                        if (x.n().grkDisPlay != 1) {
                            String translations10 = sentence.getTranslations();
                            m.e(translations10, "getTranslations(...)");
                            String string13 = q.i1(translations10).toString();
                            String sentence11 = sentence.getSentence();
                            m.e(sentence11, "getSentence(...)");
                            return ep.a.D(string13, "\n", q.i1(sentence11).toString());
                        }
                        String strGenLuoma7 = sentence.genLuoma();
                        m.e(strGenLuoma7, "genLuoma(...)");
                        if (strGenLuoma7.length() <= 0) {
                            String translations11 = sentence.getTranslations();
                            m.e(translations11, "getTranslations(...)");
                            String string14 = q.i1(translations11).toString();
                            String sentence12 = sentence.getSentence();
                            m.e(sentence12, "getSentence(...)");
                            return ep.a.D(string14, "\n", q.i1(sentence12).toString());
                        }
                        String translations12 = sentence.getTranslations();
                        m.e(translations12, "getTranslations(...)");
                        String string15 = q.i1(translations12).toString();
                        String strGenLuoma8 = sentence.genLuoma();
                        m.e(strGenLuoma8, "genLuoma(...)");
                        String string16 = q.i1(strGenLuoma8).toString();
                        String sentence13 = sentence.getSentence();
                        m.e(sentence13, "getSentence(...)");
                        return w4.c.h(string15, "\n", string16, "\n", q.i1(sentence13).toString());
                    }
                    switch (i11) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            return ep.a.D(sentence.getTranslations(), "\n", sentence.getSentence());
                    }
                }
                int i12 = x.n().koDisPlay;
                if (i12 == 0) {
                    String translations13 = sentence.getTranslations();
                    m.e(translations13, "getTranslations(...)");
                    String string17 = q.i1(translations13).toString();
                    String strGenLuoma9 = sentence.genLuoma();
                    m.e(strGenLuoma9, "genLuoma(...)");
                    return ep.a.D(string17, "\n", q.i1(strGenLuoma9).toString());
                }
                if (i12 == 1) {
                    String translations14 = sentence.getTranslations();
                    m.e(translations14, "getTranslations(...)");
                    String string18 = q.i1(translations14).toString();
                    String sentence14 = sentence.getSentence();
                    m.e(sentence14, "getSentence(...)");
                    return ep.a.D(string18, "\n", q.i1(sentence14).toString());
                }
                if (i12 != 2) {
                    throw new IllegalArgumentException();
                }
                String translations15 = sentence.getTranslations();
                m.e(translations15, "getTranslations(...)");
                String string19 = q.i1(translations15).toString();
                String sentence15 = sentence.getSentence();
                m.e(sentence15, "getSentence(...)");
                return ep.a.D(string19, "\n", q.i1(sentence15).toString());
            }
            switch (x.n().jsDisPlay) {
                case 0:
                    return ep.a.D(sentence.getTranslations(), "\n", sentence.getSentence());
                case 1:
                    return ep.a.D(sentence.getTranslations(), "\n", sentence.genZhuyin());
                case 2:
                    return ep.a.D(sentence.getTranslations(), "\n", sentence.genLuoma());
                case 3:
                    return ep.a.D(sentence.getTranslations(), "\n", sentence.getSentence());
                case 4:
                    return ep.a.D(sentence.getTranslations(), "\n", sentence.getSentence());
                case 5:
                    return ep.a.D(sentence.getTranslations(), "\n", sentence.genZhuyin());
                case 6:
                    return ep.a.D(sentence.getTranslations(), "\n", sentence.getSentence());
                default:
                    throw new IllegalArgumentException();
            }
        }
        int i13 = x.n().csDisplay;
        if (i13 == 0) {
            String translations16 = sentence.getTranslations();
            m.e(translations16, "getTranslations(...)");
            String string20 = q.i1(translations16).toString();
            String strGenLuoma10 = sentence.genLuoma();
            m.e(strGenLuoma10, "genLuoma(...)");
            return ep.a.D(string20, "\n", q.i1(strGenLuoma10).toString());
        }
        if (i13 == 1) {
            String translations17 = sentence.getTranslations();
            m.e(translations17, "getTranslations(...)");
            String string21 = q.i1(translations17).toString();
            String sentence16 = sentence.getSentence();
            m.e(sentence16, "getSentence(...)");
            return ep.a.D(string21, "\n", q.i1(sentence16).toString());
        }
        if (i13 != 2) {
            throw new IllegalArgumentException();
        }
        String translations18 = sentence.getTranslations();
        m.e(translations18, "getTranslations(...)");
        String string22 = q.i1(translations18).toString();
        String sentence17 = sentence.getSentence();
        m.e(sentence17, "getSentence(...)");
        return ep.a.D(string22, "\n", q.i1(sentence17).toString());
    }

    public static String c(Word word) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 57) {
                        if (x.n().thaiDisPlay != 1) {
                            String translations = word.getTranslations();
                            m.e(translations, "getTranslations(...)");
                            String string = q.i1(translations).toString();
                            String word2 = word.getWord();
                            m.e(word2, "getWord(...)");
                            return ep.a.D(string, "\n", q.i1(word2).toString());
                        }
                        String luoma = word.getLuoma();
                        if (luoma == null || luoma.length() == 0) {
                            String translations2 = word.getTranslations();
                            m.e(translations2, "getTranslations(...)");
                            String string2 = q.i1(translations2).toString();
                            String word3 = word.getWord();
                            m.e(word3, "getWord(...)");
                            return ep.a.D(string2, "\n", q.i1(word3).toString());
                        }
                        String translations3 = word.getTranslations();
                        m.e(translations3, "getTranslations(...)");
                        String string3 = q.i1(translations3).toString();
                        String luoma2 = word.getLuoma();
                        m.e(luoma2, "getLuoma(...)");
                        String string4 = q.i1(luoma2).toString();
                        String word4 = word.getWord();
                        m.e(word4, "getWord(...)");
                        return w4.c.h(string3, "\n", string4, "\n", q.i1(word4).toString());
                    }
                    if (i11 == 61) {
                        if (x.n().hindiDisPlay != 1) {
                            String translations4 = word.getTranslations();
                            m.e(translations4, "getTranslations(...)");
                            String string5 = q.i1(translations4).toString();
                            String word5 = word.getWord();
                            m.e(word5, "getWord(...)");
                            return ep.a.D(string5, "\n", q.i1(word5).toString());
                        }
                        String luoma3 = word.getLuoma();
                        if (luoma3 == null || luoma3.length() == 0) {
                            String translations5 = word.getTranslations();
                            m.e(translations5, "getTranslations(...)");
                            String string6 = q.i1(translations5).toString();
                            String word6 = word.getWord();
                            m.e(word6, "getWord(...)");
                            return ep.a.D(string6, "\n", q.i1(word6).toString());
                        }
                        String translations6 = word.getTranslations();
                        m.e(translations6, "getTranslations(...)");
                        String string7 = q.i1(translations6).toString();
                        String luoma4 = word.getLuoma();
                        m.e(luoma4, "getLuoma(...)");
                        String string8 = q.i1(luoma4).toString();
                        String word7 = word.getWord();
                        m.e(word7, "getWord(...)");
                        return w4.c.h(string7, "\n", string8, "\n", q.i1(word7).toString());
                    }
                    if (i11 == 63) {
                        if (x.n().ukrDisPlay != 1) {
                            String translations7 = word.getTranslations();
                            m.e(translations7, "getTranslations(...)");
                            String string9 = q.i1(translations7).toString();
                            String word8 = word.getWord();
                            m.e(word8, "getWord(...)");
                            return ep.a.D(string9, "\n", q.i1(word8).toString());
                        }
                        String luoma5 = word.getLuoma();
                        if (luoma5 == null || luoma5.length() == 0) {
                            String translations8 = word.getTranslations();
                            m.e(translations8, "getTranslations(...)");
                            String string10 = q.i1(translations8).toString();
                            String word9 = word.getWord();
                            m.e(word9, "getWord(...)");
                            return ep.a.D(string10, "\n", q.i1(word9).toString());
                        }
                        String translations9 = word.getTranslations();
                        m.e(translations9, "getTranslations(...)");
                        String string11 = q.i1(translations9).toString();
                        String luoma6 = word.getLuoma();
                        m.e(luoma6, "getLuoma(...)");
                        String string12 = q.i1(luoma6).toString();
                        String word10 = word.getWord();
                        m.e(word10, "getWord(...)");
                        return w4.c.h(string11, "\n", string12, "\n", q.i1(word10).toString());
                    }
                    if (i11 == 65) {
                        if (x.n().grkDisPlay != 1) {
                            String translations10 = word.getTranslations();
                            m.e(translations10, "getTranslations(...)");
                            String string13 = q.i1(translations10).toString();
                            String word11 = word.getWord();
                            m.e(word11, "getWord(...)");
                            return ep.a.D(string13, "\n", q.i1(word11).toString());
                        }
                        String luoma7 = word.getLuoma();
                        if (luoma7 == null || luoma7.length() == 0) {
                            String translations11 = word.getTranslations();
                            m.e(translations11, "getTranslations(...)");
                            String string14 = q.i1(translations11).toString();
                            String word12 = word.getWord();
                            m.e(word12, "getWord(...)");
                            return ep.a.D(string14, "\n", q.i1(word12).toString());
                        }
                        String translations12 = word.getTranslations();
                        m.e(translations12, "getTranslations(...)");
                        String string15 = q.i1(translations12).toString();
                        String luoma8 = word.getLuoma();
                        m.e(luoma8, "getLuoma(...)");
                        String string16 = q.i1(luoma8).toString();
                        String word13 = word.getWord();
                        m.e(word13, "getWord(...)");
                        return w4.c.h(string15, "\n", string16, "\n", q.i1(word13).toString());
                    }
                    switch (i11) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            return ep.a.D(word.getTranslations(), "\n", word.getWord());
                    }
                }
                int i12 = x.n().koDisPlay;
                if (i12 == 0) {
                    String translations13 = word.getTranslations();
                    m.e(translations13, "getTranslations(...)");
                    String string17 = q.i1(translations13).toString();
                    String zhuyin = word.getZhuyin();
                    m.e(zhuyin, "getZhuyin(...)");
                    return ep.a.D(string17, "\n", q.i1(zhuyin).toString());
                }
                if (i12 == 1) {
                    String translations14 = word.getTranslations();
                    m.e(translations14, "getTranslations(...)");
                    String string18 = q.i1(translations14).toString();
                    String word14 = word.getWord();
                    m.e(word14, "getWord(...)");
                    return ep.a.D(string18, "\n", q.i1(word14).toString());
                }
                if (i12 != 2) {
                    throw new IllegalArgumentException();
                }
                String translations15 = word.getTranslations();
                m.e(translations15, "getTranslations(...)");
                String string19 = q.i1(translations15).toString();
                String word15 = word.getWord();
                m.e(word15, "getWord(...)");
                String string20 = q.i1(word15).toString();
                String zhuyin2 = word.getZhuyin();
                m.e(zhuyin2, "getZhuyin(...)");
                return w4.c.h(string19, "\n", string20, " / ", q.i1(zhuyin2).toString());
            }
            switch (x.n().jsDisPlay) {
                case 0:
                    return ep.a.D(word.getTranslations(), "\n", word.getWord());
                case 1:
                    return ep.a.D(word.getTranslations(), "\n", word.getZhuyin());
                case 2:
                    String translations16 = word.getTranslations();
                    String luoma9 = word.getLuoma();
                    m.e(luoma9, "getLuoma(...)");
                    return ep.a.D(translations16, "\n", oz.x.q0(luoma9, " ", BuildConfig.VERSION_NAME));
                case 3:
                    return w4.c.h(word.getTranslations(), "\n", word.getWord(), " / ", word.getZhuyin());
                case 4:
                    return w4.c.h(word.getTranslations(), "\n", word.getWord(), " / ", word.getLuoma());
                case 5:
                    return w4.c.h(word.getTranslations(), "\n", word.getZhuyin(), " / ", word.getLuoma());
                case 6:
                    return w4.c.h(word.getTranslations(), "\n", word.getWord(), " / ", word.getZhuyin());
                default:
                    throw new IllegalArgumentException();
            }
        }
        int i13 = x.n().csDisplay;
        if (i13 == 0) {
            return ep.a.D(word.getTranslations(), "\n", word.getZhuyin());
        }
        if (i13 == 1) {
            return ep.a.D(word.getTranslations(), "\n", word.getWord());
        }
        if (i13 == 2) {
            return w4.c.h(word.getTranslations(), "\n", word.getWord(), " / ", word.getZhuyin());
        }
        throw new IllegalArgumentException();
    }

    public static void d(Word word, TextView textView, TextView textView2, TextView textView3) {
        textView.setVisibility(8);
        textView3.setVisibility(8);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().csDisplay;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    textView.setVisibility(0);
                    if (word.getWordType() != 1) {
                        textView.setText(word.getZhuyin());
                        textView2.setText(word.getWord());
                    } else {
                        textView2.setText(word.getWord());
                    }
                }
            } else if (word.getWordType() != 1) {
                textView2.setText(word.getWord());
            } else {
                textView2.setText(word.getWord());
            }
        } else if (word.getWordType() != 1) {
            textView2.setText(word.getZhuyin());
        } else {
            textView2.setText(word.getWord());
        }
        if (word.getWordType() == 1) {
            textView3.setText(BuildConfig.VERSION_NAME);
            textView.setText(BuildConfig.VERSION_NAME);
            textView2.setText(word.getWord());
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d9  */
    public static void e(Word word, TextView tvTop, TextView tvMiddle, TextView tvBottom, boolean z11) {
        m.f(word, "word");
        m.f(tvTop, "tvTop");
        m.f(tvMiddle, "tvMiddle");
        m.f(tvBottom, "tvBottom");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 == 0) {
            d(word, tvTop, tvMiddle, tvBottom);
        } else if (i11 == 1) {
            f(word, tvTop, tvMiddle, tvBottom);
        } else if (i11 == 2) {
            g(word, tvTop, tvMiddle, tvBottom);
        } else if (i11 == 51 || i11 == 55) {
            tvTop.setVisibility(8);
            int i12 = x.n().arDisPlay;
            if (i12 == 0) {
                tvMiddle.setText(word.getWord());
            } else if (i12 == 1) {
                tvTop.setVisibility(0);
                String luoma = word.getLuoma();
                if (luoma == null || luoma.length() == 0) {
                    tvTop.setVisibility(8);
                }
                tvTop.setText(word.getLuoma());
                tvMiddle.setText(word.getWord());
                if (word.getWordType() == 1) {
                    tvTop.setText(BuildConfig.VERSION_NAME);
                    tvTop.setVisibility(0);
                }
            }
        } else if (i11 == 57) {
            tvTop.setVisibility(8);
            int i13 = x.n().thaiDisPlay;
            if (i13 == 0) {
                tvMiddle.setText(word.getWord());
            } else if (i13 == 1) {
                tvTop.setVisibility(0);
                String luoma2 = word.getLuoma();
                if (luoma2 == null || luoma2.length() == 0) {
                    tvTop.setVisibility(8);
                }
                tvTop.setText(word.getLuoma());
                tvMiddle.setText(word.getWord());
                if (word.getWordType() == 1) {
                    tvTop.setText(BuildConfig.VERSION_NAME);
                    tvTop.setVisibility(0);
                }
            }
        } else if (i11 == 61) {
            tvTop.setVisibility(8);
            int i14 = x.n().hindiDisPlay;
            if (i14 == 0) {
                tvMiddle.setText(word.getWord());
            } else if (i14 == 1) {
                tvTop.setVisibility(0);
                String luoma3 = word.getLuoma();
                if (luoma3 == null || luoma3.length() == 0) {
                    tvTop.setVisibility(8);
                }
                tvTop.setText(word.getLuoma());
                tvMiddle.setText(word.getWord());
                if (word.getWordType() == 1) {
                    tvTop.setText(BuildConfig.VERSION_NAME);
                    tvTop.setVisibility(0);
                }
            }
        } else if (i11 == 63) {
            tvTop.setVisibility(8);
            tvBottom.setVisibility(8);
            tvMiddle.setText(word.getWord());
        } else if (i11 != 65) {
            switch (i11) {
                case 11:
                    d(word, tvTop, tvMiddle, tvBottom);
                    break;
                case 12:
                    f(word, tvTop, tvMiddle, tvBottom);
                    break;
                case 13:
                    g(word, tvTop, tvMiddle, tvBottom);
                    break;
                default:
                    tvTop.setVisibility(8);
                    tvBottom.setVisibility(8);
                    if ((x.n().keyLanguage == 10 || x.n().keyLanguage == 22) && z11) {
                        String word2 = word.getWord();
                        m.e(word2, "getWord(...)");
                        tvMiddle.setText(oz.x.q0(word2, "́", BuildConfig.VERSION_NAME));
                    } else {
                        tvMiddle.setText(word.getWord());
                    }
                    if (word.getWordType() == 1) {
                        tvTop.setText(BuildConfig.VERSION_NAME);
                        tvMiddle.setText(word.getWord());
                        tvBottom.setText(BuildConfig.VERSION_NAME);
                    }
                    break;
            }
        } else {
            tvTop.setVisibility(8);
            tvBottom.setVisibility(8);
            int i15 = x.n().grkDisPlay;
            if (i15 == 0) {
                String word3 = word.getWord();
                m.e(word3, "getWord(...)");
                tvMiddle.setText(oz.x.q0(word3, "?", ";"));
            } else if (i15 == 1) {
                tvTop.setVisibility(0);
                String luoma4 = word.getLuoma();
                if (luoma4 == null || luoma4.length() == 0) {
                    tvTop.setVisibility(8);
                } else {
                    String luoma5 = word.getLuoma();
                    m.e(luoma5, "getLuoma(...)");
                    tvTop.setText(oz.x.q0(luoma5, "?", ";"));
                }
                String word4 = word.getWord();
                m.e(word4, "getWord(...)");
                tvMiddle.setText(oz.x.q0(word4, "?", ";"));
                if (word.getWordType() == 1) {
                    tvTop.setText(BuildConfig.VERSION_NAME);
                    tvTop.setVisibility(0);
                }
            }
        }
        int[] iArr = r.f4959a;
        bq.m.J(tvMiddle);
    }

    public static void f(Word word, TextView textView, TextView textView2, TextView textView3) {
        textView.setVisibility(8);
        textView3.setVisibility(8);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        switch (x.n().jsDisPlay) {
            case 0:
                textView2.setText(word.getWord());
                break;
            case 1:
                textView2.setText(word.getZhuyin());
                break;
            case 2:
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String luoma = word.getLuoma();
                m.e(luoma, "getLuoma(...)");
                int i11 = 0;
                for (Object obj : q.W0(luoma, new String[]{" "}, 0, 6)) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        o.V();
                        throw null;
                    }
                    String str = (String) obj;
                    SpannableString spannableString = new SpannableString(str);
                    if (i11 % 2 == 0) {
                        Context context = textView.getContext();
                        m.e(context, "getContext(...)");
                        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.primary_black)), 0, str.length(), 33);
                    } else {
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#78C7FF")), 0, str.length(), 33);
                    }
                    spannableStringBuilder.append((CharSequence) spannableString);
                    i11 = i12;
                }
                textView2.setText(spannableStringBuilder);
                break;
            case 3:
                textView.setVisibility(0);
                textView.setText(word.getZhuyin());
                textView2.setText(word.getWord());
                if (m.a(word.getZhuyin(), word.getWord())) {
                    textView.setText(BuildConfig.VERSION_NAME);
                }
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
                textView3.setVisibility(0);
                textView.setText(word.getZhuyin());
                textView2.setText(word.getWord());
                textView3.setText(word.getLuoma());
                if (m.a(word.getZhuyin(), word.getWord())) {
                    textView.setText(BuildConfig.VERSION_NAME);
                }
                break;
        }
        if (word.getWordType() == 1) {
            textView3.setText(BuildConfig.VERSION_NAME);
            textView.setText(BuildConfig.VERSION_NAME);
            textView2.setText(word.getWord());
        }
    }

    public static void g(Word word, TextView textView, TextView textView2, TextView textView3) {
        textView.setVisibility(8);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().koDisPlay;
        if (i11 == 0) {
            textView2.setText(word.getZhuyin());
        } else if (i11 == 1) {
            textView2.setText(word.getWord());
        } else if (i11 == 2) {
            textView.setVisibility(0);
            textView.setText(word.getZhuyin());
            textView2.setText(word.getWord());
            if (m.a(word.getZhuyin(), word.getWord())) {
                textView.setText(BuildConfig.VERSION_NAME);
            }
        }
        if (word.getWordType() == 1) {
            textView3.setText(BuildConfig.VERSION_NAME);
            textView.setText(BuildConfig.VERSION_NAME);
            textView2.setText(word.getWord());
        }
    }
}

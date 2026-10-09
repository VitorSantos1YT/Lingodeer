package fi;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import bq.z;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingo.lingoskill.object.ARChar;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.h1;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends om.b {
    public AnimatorSet H;
    public h K;
    public Context L;
    public ARChar M;
    public ArrayList N;
    public final String O;
    public final String P;
    public final String Q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gi.h f27312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f27313f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f27314t;

    public i(gi.h hVar, int i11) {
        super(i11);
        this.f27312e = hVar;
        this.O = "أْ\tا\nبْ\tب\nتْ\tت\nثْ\tث\nجْ\tج\nحْ\tح\nخْ\tخ\nدْ\tد\nذْ\tذ\nرْ\tر\nزْ\tز\nسْ\tس\nشْ\tش\nصْ\tص\nضْ\tض\nطْ\tط\nظْ\tظ\nعْ\tع\nغْ\tغ\nفْ\tف\nقْ\tق\nكْ\tك\nلْ\tل\nمْ\tم\nنْ\tن\nهْ\tه\nوْ\tو\nيْ\tي";
        this.P = " ًا";
        this.Q = "ًا";
    }

    public static final h1 h(i iVar) {
        ta.a aVar = iVar.f45600c;
        m.c(aVar);
        return (h1) aVar;
    }

    @Override // om.b
    public final void b() {
        super.b();
        ta.a aVar = this.f45600c;
        m.c(aVar);
        ((h1) aVar).f32650g.b();
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.H;
        if (animatorSet2 != null) {
            animatorSet2.removeListener(this.K);
        }
        AnimatorSet animatorSet3 = this.H;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
    }

    @Override // om.b
    public final fz.f c() {
        return f.f27304a;
    }

    @Override // om.b
    public final void e() {
        Context context = d().getContext();
        m.e(context, "getContext(...)");
        this.L = context;
        this.f27312e.f29271a.x(0);
        int i11 = this.f27314t;
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            m.n("charList");
            throw null;
        }
        if (i11 < arrayList.size()) {
            j();
        }
        ta.a aVar = this.f45600c;
        m.c(aVar);
        z.b(((h1) aVar).f32647d, new e(this, 0));
        ta.a aVar2 = this.f45600c;
        m.c(aVar2);
        z.b((ImageView) ((h1) aVar2).f32645b.f32408d, new e(this, 1));
        ta.a aVar3 = this.f45600c;
        m.c(aVar3);
        ((h1) aVar3).f32650g.setDuration(2500L);
        ta.a aVar4 = this.f45600c;
        m.c(aVar4);
        ((h1) aVar4).f32650g.setInitialRadius(ff.h.l(16.0f));
        ta.a aVar5 = this.f45600c;
        m.c(aVar5);
        ((h1) aVar5).f32650g.setStyle(Paint.Style.FILL);
        ta.a aVar6 = this.f45600c;
        m.c(aVar6);
        ((h1) aVar6).f32650g.setSpeed(500);
        ta.a aVar7 = this.f45600c;
        m.c(aVar7);
        WaveView waveView = ((h1) aVar7).f32650g;
        Context context2 = this.L;
        if (context2 == null) {
            m.n("mContext");
            throw null;
        }
        waveView.setColor(context2.getColor(R.color.color_BFDF98));
        ta.a aVar8 = this.f45600c;
        m.c(aVar8);
        ((h1) aVar8).f32650g.setInterpolator(new AccelerateDecelerateInterpolator());
        ta.a aVar9 = this.f45600c;
        m.c(aVar9);
        ((h1) aVar9).f32650g.a();
    }

    @Override // om.b
    public final void f() {
        this.N = new ArrayList();
        Object objLoad = se.k.w().f55173c.load(Long.valueOf(this.f45598a));
        m.e(objLoad, "load(...)");
        ARChar aRChar = (ARChar) objLoad;
        this.M = aRChar;
        String character = aRChar.getCharacter();
        m.e(character, "getCharacter(...)");
        if (!q.v0(character, this.Q, false)) {
            ARChar aRChar2 = this.M;
            if (aRChar2 == null) {
                m.n("curChar");
                throw null;
            }
            int length = aRChar2.getCharacter().length();
            for (int i11 = 0; i11 < length; i11++) {
                ARChar aRChar3 = this.M;
                if (aRChar3 == null) {
                    m.n("curChar");
                    throw null;
                }
                String strValueOf = String.valueOf(aRChar3.getCharacter().charAt(i11));
                if (wh.a.f55170d == null) {
                    synchronized (wh.a.class) {
                        if (wh.a.f55170d == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication);
                            wh.a.f55170d = new wh.a(lingoSkillApplication);
                        }
                    }
                }
                m.c(wh.a.f55170d);
                ARChar aRCharA = wh.a.a(strValueOf);
                if (aRCharA == null) {
                    aRCharA = new ARChar();
                    aRCharA.setCharacter(strValueOf);
                    aRCharA.setAudioName(BuildConfig.VERSION_NAME);
                }
                ArrayList arrayList = this.N;
                if (arrayList == null) {
                    m.n("charList");
                    throw null;
                }
                arrayList.add(aRCharA);
            }
            return;
        }
        ARChar aRChar4 = this.M;
        if (aRChar4 == null) {
            m.n("curChar");
            throw null;
        }
        String character2 = aRChar4.getCharacter();
        m.e(character2, "getCharacter(...)");
        String[] strArr = (String[]) q.W0(character2, new String[]{this.Q}, 0, 6).toArray(new String[0]);
        ARChar aRChar5 = this.M;
        if (aRChar5 == null) {
            m.n("curChar");
            throw null;
        }
        String character3 = aRChar5.getCharacter();
        m.e(character3, "getCharacter(...)");
        if (q.I0(character3, this.Q, 0, false, 6) == 0) {
            se.k.w();
            ARChar aRCharA2 = wh.a.a(this.Q);
            if (aRCharA2 == null) {
                aRCharA2 = new ARChar();
                aRCharA2.setCharacter(this.Q);
                aRCharA2.setAudioName(BuildConfig.VERSION_NAME);
            }
            ArrayList arrayList2 = this.N;
            if (arrayList2 == null) {
                m.n("charList");
                throw null;
            }
            arrayList2.add(aRCharA2);
        }
        int length2 = strArr.length;
        for (int i12 = 0; i12 < length2; i12++) {
            String str = strArr[i12];
            int length3 = str.length();
            for (int i13 = 0; i13 < length3; i13++) {
                String strValueOf2 = String.valueOf(str.charAt(i12));
                if (wh.a.f55170d == null) {
                    synchronized (wh.a.class) {
                        if (wh.a.f55170d == null) {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication2);
                            wh.a.f55170d = new wh.a(lingoSkillApplication2);
                        }
                    }
                }
                m.c(wh.a.f55170d);
                ARChar aRCharA3 = wh.a.a(strValueOf2);
                if (aRCharA3 == null) {
                    aRCharA3 = new ARChar();
                    aRCharA3.setCharacter(strValueOf2);
                    aRCharA3.setAudioName(BuildConfig.VERSION_NAME);
                }
                ArrayList arrayList3 = this.N;
                if (arrayList3 == null) {
                    m.n("charList");
                    throw null;
                }
                arrayList3.add(aRCharA3);
            }
            if (i12 == 0) {
                ARChar aRChar6 = this.M;
                if (aRChar6 == null) {
                    m.n("curChar");
                    throw null;
                }
                String character4 = aRChar6.getCharacter();
                m.e(character4, "getCharacter(...)");
                if (q.I0(character4, this.Q, 0, false, 6) == 0) {
                    continue;
                } else {
                    if (wh.a.f55170d == null) {
                        synchronized (wh.a.class) {
                            if (wh.a.f55170d == null) {
                                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication3);
                                wh.a.f55170d = new wh.a(lingoSkillApplication3);
                            }
                        }
                    }
                    m.c(wh.a.f55170d);
                    ARChar aRCharA4 = wh.a.a(this.Q);
                    if (aRCharA4 == null) {
                        aRCharA4 = new ARChar();
                        aRCharA4.setCharacter(this.Q);
                        aRCharA4.setAudioName(BuildConfig.VERSION_NAME);
                    }
                    ArrayList arrayList4 = this.N;
                    if (arrayList4 == null) {
                        m.n("charList");
                        throw null;
                    }
                    arrayList4.add(aRCharA4);
                }
            }
        }
    }

    public final String i(ARChar aRChar) {
        String strM = defpackage.e.m(aRChar.getAudioName(), ".mp3");
        for (String str : (String[]) q.W0(this.O, new String[]{"\n"}, 0, 6).toArray(new String[0])) {
            String[] strArr = (String[]) q.W0(str, new String[]{"\t"}, 0, 6).toArray(new String[0]);
            if (m.a(strArr[1], aRChar.getCharacter())) {
                if (wh.a.f55170d == null) {
                    synchronized (wh.a.class) {
                        if (wh.a.f55170d == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication);
                            wh.a.f55170d = new wh.a(lingoSkillApplication);
                        }
                    }
                }
                m.c(wh.a.f55170d);
                ARChar aRCharA = wh.a.a(strArr[0]);
                strM = defpackage.e.m(aRCharA != null ? aRCharA.getAudioName() : null, ".mp3");
                break;
            }
        }
        qy.q qVar = fv.b.f28186a;
        return fv.b.d(strM);
    }

    public final void j() {
        ta.a aVar = this.f45600c;
        m.c(aVar);
        TextView textView = ((h1) aVar).f32647d;
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            m.n("charList");
            throw null;
        }
        textView.setTag(arrayList.get(this.f27314t));
        ArrayList arrayList2 = this.N;
        if (arrayList2 == null) {
            m.n("charList");
            throw null;
        }
        String character = ((ARChar) arrayList2.get(this.f27314t)).getCharacter();
        m.e(character, "getCharacter(...)");
        if (character.equals(this.Q)) {
            ta.a aVar2 = this.f45600c;
            m.c(aVar2);
            ((h1) aVar2).f32647d.setText(this.P);
        } else {
            ta.a aVar3 = this.f45600c;
            m.c(aVar3);
            ((h1) aVar3).f32647d.setText(character);
        }
        ta.a aVar4 = this.f45600c;
        m.c(aVar4);
        ((h1) aVar4).f32646c.setVisibility(0);
        ta.a aVar5 = this.f45600c;
        m.c(aVar5);
        TextView textView2 = ((h1) aVar5).f32646c;
        ArrayList arrayList3 = this.N;
        if (arrayList3 != null) {
            textView2.setText(((ARChar) arrayList3.get(this.f27314t)).getZhuyin());
        } else {
            m.n("charList");
            throw null;
        }
    }
}

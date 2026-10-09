package qp;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m3 implements jp.m0, tx.d, ki.a, w1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f48056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f48057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f48058c;

    public /* synthetic */ m3(Object obj, Object obj2, Object obj3) {
        this.f48056a = obj;
        this.f48057b = obj2;
        this.f48058c = obj3;
    }

    public static boolean d(Editable editable, KeyEvent keyEvent, boolean z11) {
        v5.w[] wVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (v5.w[]) editable.getSpans(selectionStart, selectionEnd, v5.w.class)) != null && wVarArr.length > 0) {
                for (v5.w wVar : wVarArr) {
                    int spanStart = editable.getSpanStart(wVar);
                    int spanEnd = editable.getSpanEnd(wVar);
                    if ((z11 && spanStart == selectionStart) || ((!z11 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void h() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    @Override // ki.a
    public void B() {
        um.f fVar = (um.f) this.f48056a;
        lc.d dVar = fVar.f53040j;
        if (dVar != null) {
            kotlin.jvm.internal.m.c(dVar);
            if (dVar.isShowing()) {
                lc.d dVar2 = fVar.f53040j;
                kotlin.jvm.internal.m.c(dVar2);
                dVar2.dismiss();
            }
        }
    }

    @Override // jp.m0
    public void D(ConstraintLayout constraintLayout) {
        p3 p3Var = (p3) this.f48057b;
        View viewFindViewById = constraintLayout.findViewById(R.id.txt_answer_txt_2);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f48056a);
        int i11 = 0;
        if (spannableStringBuilder.length() > 0) {
            int[] iArr = bq.r.f4959a;
            if (!bq.m.F() && p3Var.w()) {
                String upperCase = String.valueOf(spannableStringBuilder.charAt(0)).toUpperCase(bq.m.p());
                kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
                spannableStringBuilder.replace(0, 1, (CharSequence) upperCase);
            }
        }
        ArrayList arrayList = (ArrayList) this.f48058c;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            kotlin.jvm.internal.m.e(obj, "next(...)");
            int iIntValue = ((Number) obj).intValue();
            try {
                Context context = p3Var.f47883c;
                kotlin.jvm.internal.m.f(context, "context");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(R.color.color_wrong_high_light)), iIntValue, iIntValue + 1, 33);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        textView.setText(spannableStringBuilder);
    }

    public void a(y2.i0 i0Var, y2.w wVar) {
        tp.e eVar = (tp.e) this.f48056a;
        tp.e eVar2 = (tp.e) this.f48057b;
        tp.e eVar3 = (tp.e) this.f48058c;
        int i11 = y2.o.f56980a[wVar.ordinal()];
        if (i11 == 1) {
            eVar.m(i0Var);
            eVar3.m(i0Var);
            return;
        }
        if (i11 == 2) {
            eVar2.m(i0Var);
            eVar3.m(i0Var);
            return;
        }
        if (i11 == 3) {
            if (i0Var.K != null) {
                eVar3.m(i0Var);
                return;
            } else {
                eVar.m(i0Var);
                return;
            }
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (i0Var.K != null) {
            eVar3.m(i0Var);
        } else {
            eVar2.m(i0Var);
        }
    }

    @Override // tx.d
    public Object apply(Object obj) {
        String str = (String) this.f48058c;
        rp.b bVar = (rp.b) this.f48057b;
        String str2 = (String) this.f48056a;
        if (((Boolean) obj).booleanValue()) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            Uri uri = Uri.parse(cf.x.n().tempDir + str2);
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            kotlin.jvm.internal.m.c(lingoSkillApplication2);
            ob.e eVar = new ob.e(lingoSkillApplication2);
            hh.c cVar = new hh.c(new x7.k(), 16);
            re.v vVar = new re.v(2);
            y6.x xVarA = y6.x.a(uri);
            xVarA.f57373b.getClass();
            xVarA.f57373b.getClass();
            xVarA.f57373b.getClass();
            bVar.f49333a.postValue(new p7.v0(xVarA, eVar, cVar, k7.g.f37960a, vVar, 1048576, null));
        } else {
            bVar.f49334b.d(new fv.a(-2L, str, str2), new mo.b(bVar, str2, str, 3));
        }
        return qy.b0.f48488a;
    }

    public void b(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xf.k kVar = (xf.k) it.next();
                if (kVar != null) {
                    ArrayList arrayList = (ArrayList) this.f48058c;
                    xf.j jVar = new xf.j(9);
                    jVar.s0(kVar);
                    arrayList.add(new xf.k(jVar));
                }
            }
        }
    }

    public boolean c(y2.i0 i0Var) {
        return !(i0Var.K == null) && (((y2.c2) ((tp.e) this.f48056a).f52454b).contains(i0Var) || ((y2.c2) ((tp.e) this.f48057b).f52454b).contains(i0Var));
    }

    public boolean e(CharSequence charSequence, int i11, int i12, v5.v vVar) {
        if ((vVar.f53564c & 3) == 0) {
            v5.f fVar = (v5.f) this.f48058c;
            w5.a aVarB = vVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f51943d).getShort(iA + aVarB.f51940a);
            }
            v5.c cVar = (v5.c) fVar;
            cVar.getClass();
            ThreadLocal threadLocal = v5.c.f53515b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i11 < i12) {
                sb2.append(charSequence.charAt(i11));
                i11++;
            }
            TextPaint textPaint = cVar.f53516a;
            String string = sb2.toString();
            int i13 = r4.e.f48797a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i14 = vVar.f53564c & 4;
            vVar.f53564c = zHasGlyph ? i14 | 2 : i14 | 1;
        }
        return (vVar.f53564c & 3) == 2;
    }

    public boolean f() {
        return !(((y2.c2) ((tp.e) this.f48056a).f52454b).isEmpty() && ((y2.c2) ((tp.e) this.f48058c).f52454b).isEmpty() && ((y2.c2) ((tp.e) this.f48057b).f52454b).isEmpty());
    }

    public boolean g() {
        if (((l1.b3) this.f48056a).getValue() != this.f48058c) {
            return true;
        }
        m3 m3Var = (m3) this.f48057b;
        return m3Var != null && m3Var.g();
    }

    public Object i(CharSequence charSequence, int i11, int i12, int i13, boolean z11, v5.n nVar) {
        int i14;
        char c11;
        v5.p pVar = new v5.p((v5.s) ((ob.i) this.f48057b).f44815d);
        int iCodePointAt = Character.codePointAt(charSequence, i11);
        int i15 = 0;
        boolean zD = true;
        int iCharCount = i11;
        loop0: while (true) {
            i14 = iCharCount;
            while (true) {
                if (iCharCount < i12 && i15 < i13 && zD) {
                    SparseArray sparseArray = pVar.f53543c.f53555a;
                    v5.s sVar = sparseArray == null ? null : (v5.s) sparseArray.get(iCodePointAt);
                    if (pVar.f53541a == 2) {
                        if (sVar != null) {
                            pVar.f53543c = sVar;
                            pVar.f53546f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                pVar.a();
                            } else if (iCodePointAt != 65039) {
                                v5.s sVar2 = pVar.f53543c;
                                if (sVar2.f53556b != null) {
                                    if (pVar.f53546f != 1) {
                                        pVar.f53544d = sVar2;
                                        pVar.a();
                                    } else if (pVar.b()) {
                                        pVar.f53544d = pVar.f53543c;
                                        pVar.a();
                                    } else {
                                        pVar.a();
                                    }
                                    c11 = 3;
                                } else {
                                    pVar.a();
                                }
                            }
                            c11 = 1;
                        }
                        c11 = 2;
                    } else if (sVar == null) {
                        pVar.a();
                        c11 = 1;
                    } else {
                        pVar.f53541a = 2;
                        pVar.f53543c = sVar;
                        pVar.f53546f = 1;
                        c11 = 2;
                    }
                    pVar.f53545e = iCodePointAt;
                    if (c11 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i14)) + i14;
                        if (iCharCount >= i12) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c11 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i12) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c11 == 3) {
                        if (!z11 && e(charSequence, i14, iCharCount, pVar.f53544d.f53556b)) {
                            break;
                        }
                        zD = nVar.d(charSequence, i14, iCharCount, pVar.f53544d.f53556b);
                        i15++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (pVar.f53541a == 2 && pVar.f53543c.f53556b != null && ((pVar.f53546f > 1 || pVar.b()) && i15 < i13 && zD && (z11 || !e(charSequence, i14, iCharCount, pVar.f53543c.f53556b)))) {
            nVar.d(charSequence, i14, iCharCount, pVar.f53543c.f53556b);
        }
        return nVar.b();
    }

    public void j() {
        y.i0 i0Var = (y.i0) this.f48057b;
        String str = (String) this.f48056a;
        List list = (List) i0Var.k(str);
        if (list != null) {
            list.remove((fz.a) this.f48058c);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        i0Var.m(str, list);
    }

    @Override // ki.a
    public void m() {
        b7.c cVar = ((um.f) this.f48056a).f53034d;
        kotlin.jvm.internal.m.c(cVar);
        ImageView imageView = (ImageView) this.f48057b;
        kotlin.jvm.internal.m.c(imageView);
        cVar.f(imageView, (t7.d) this.f48058c);
        imageView.performClick();
    }

    public m3(int i11) {
        switch (i11) {
            case 10:
                this.f48056a = new tp.e(6);
                this.f48057b = new tp.e(6);
                this.f48058c = new tp.e(6);
                break;
            default:
                this.f48058c = new ArrayList();
                break;
        }
    }

    public m3(n3.g0 g0Var, m3 m3Var) {
        this.f48056a = g0Var;
        this.f48057b = m3Var;
        this.f48058c = g0Var.getValue();
    }
}

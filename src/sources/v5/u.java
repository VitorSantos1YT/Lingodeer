package v5;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f53559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f53560b;

    public u(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f53560b = new ArrayList();
        ns.o.l(cls, "watcherClass cannot be null");
        this.f53559a = cls;
    }

    public final void a() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f53560b;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((t) arrayList.get(i11)).f53558b.incrementAndGet();
            i11++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f53560b;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((t) arrayList.get(i11)).onTextChanged(this, 0, length(), length());
            i11++;
        }
    }

    public final t c(Object obj) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f53560b;
            if (i11 >= arrayList.size()) {
                return null;
            }
            t tVar = (t) arrayList.get(i11);
            if (tVar.f53557a == obj) {
                return tVar;
            }
            i11++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f53559a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i11, int i12) {
        super.delete(i11, i12);
        return this;
    }

    public final void e() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f53560b;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((t) arrayList.get(i11)).f53558b.decrementAndGet();
            i11++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        t tVarC;
        if (d(obj) && (tVarC = c(obj)) != null) {
            obj = tVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        t tVarC;
        if (d(obj) && (tVarC = c(obj)) != null) {
            obj = tVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        t tVarC;
        if (d(obj) && (tVarC = c(obj)) != null) {
            obj = tVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i11, int i12, Class cls) {
        if (this.f53559a != cls) {
            return super.getSpans(i11, i12, cls);
        }
        t[] tVarArr = (t[]) super.getSpans(i11, i12, t.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, tVarArr.length);
        for (int i13 = 0; i13 < tVarArr.length; i13++) {
            objArr[i13] = tVarArr[i13].f53557a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i11, CharSequence charSequence) {
        super.insert(i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i11, int i12, Class cls) {
        if (cls == null || this.f53559a == cls) {
            cls = t.class;
        }
        return super.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        t tVarC;
        if (d(obj)) {
            tVarC = c(obj);
            if (tVarC != null) {
                obj = tVarC;
            }
        } else {
            tVarC = null;
        }
        super.removeSpan(obj);
        if (tVarC != null) {
            this.f53560b.remove(tVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i11, int i12, CharSequence charSequence) {
        replace(i11, i12, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i11, int i12, int i13) {
        if (d(obj)) {
            t tVar = new t(obj);
            this.f53560b.add(tVar);
            obj = tVar;
        }
        super.setSpan(obj, i11, i12, i13);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i11, int i12) {
        return new u(this.f53559a, this, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i11, int i12) {
        super.delete(i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i11, CharSequence charSequence) {
        super.insert(i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i11, int i12, CharSequence charSequence, int i13, int i14) {
        replace(i11, i12, charSequence, i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i11, CharSequence charSequence, int i12, int i13) {
        super.insert(i11, charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i11, int i12, CharSequence charSequence) {
        a();
        super.replace(i11, i12, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c11) {
        super.append(c11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i11, CharSequence charSequence, int i12, int i13) {
        super.insert(i11, charSequence, i12, i13);
        return this;
    }

    public u(Class cls, u uVar, int i11, int i12) {
        super(uVar, i11, i12);
        this.f53560b = new ArrayList();
        ns.o.l(cls, "watcherClass cannot be null");
        this.f53559a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c11) {
        super.append(c11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c11) {
        super.append(c11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i11, int i12, CharSequence charSequence, int i13, int i14) {
        a();
        super.replace(i11, i12, charSequence, i13, i14);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i11, int i12) {
        super.append(charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i11, int i12) {
        super.append(charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i11, int i12) {
        super.append(charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i11) {
        super.append(charSequence, obj, i11);
        return this;
    }
}

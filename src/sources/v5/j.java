package v5;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import qp.m3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f53524j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile j f53525k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f53526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.f f53527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f53528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f53529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.android.billingclient.api.c f53530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f53531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final re.q f53532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f53533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f53534i;

    public j(r rVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f53526a = reentrantReadWriteLock;
        this.f53528c = 3;
        i iVar = (i) rVar.f53519b;
        this.f53531f = iVar;
        int i11 = rVar.f53518a;
        this.f53533h = i11;
        this.f53534i = (c) rVar.f53520c;
        this.f53529d = new Handler(Looper.getMainLooper());
        this.f53527b = new y.f(0);
        this.f53532g = new re.q(6);
        com.android.billingclient.api.c cVar = new com.android.billingclient.api.c(this);
        this.f53530e = cVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i11 == 0) {
            try {
                this.f53528c = 0;
            } catch (Throwable th2) {
                this.f53526a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                iVar.a(new d(cVar));
            } catch (Throwable th3) {
                f(th3);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f53524j) {
            try {
                jVar = f53525k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public static boolean d() {
        return f53525k != null;
    }

    public final int b(CharSequence charSequence, int i11) {
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        ns.o.l(charSequence, "charSequence cannot be null");
        m3 m3Var = (m3) this.f53530e.f7467b;
        m3Var.getClass();
        if (i11 < 0 || i11 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            w[] wVarArr = (w[]) spanned.getSpans(i11, i11 + 1, w.class);
            if (wVarArr.length > 0) {
                return spanned.getSpanStart(wVarArr[0]);
            }
        }
        return ((o) m3Var.i(charSequence, Math.max(0, i11 - 16), Math.min(charSequence.length(), i11 + 16), Integer.MAX_VALUE, true, new o(i11))).f53539b;
    }

    public final int c() {
        this.f53526a.readLock().lock();
        try {
            return this.f53528c;
        } finally {
            this.f53526a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.f53533h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (c() == 1) {
            return;
        }
        this.f53526a.writeLock().lock();
        try {
            if (this.f53528c == 0) {
                this.f53526a.writeLock().unlock();
                return;
            }
            this.f53528c = 0;
            this.f53526a.writeLock().unlock();
            com.android.billingclient.api.c cVar = this.f53530e;
            j jVar = (j) cVar.f7466a;
            try {
                jVar.f53531f.a(new d(cVar));
            } catch (Throwable th2) {
                jVar.f(th2);
            }
        } catch (Throwable th3) {
            this.f53526a.writeLock().unlock();
            throw th3;
        }
    }

    public final void f(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f53526a.writeLock().lock();
        try {
            this.f53528c = 2;
            arrayList.addAll(this.f53527b);
            this.f53527b.clear();
            this.f53526a.writeLock().unlock();
            this.f53529d.post(new h(arrayList, this.f53528c, th2));
        } catch (Throwable th3) {
            this.f53526a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:94:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:94:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x0107  */
    /* JADX WARN: Code duplicated, block: B:99:? A[SYNTHETIC] */
    public final CharSequence g(int i11, int i12, int i13, CharSequence charSequence) throws Throwable {
        Throwable th2;
        CharSequence charSequence2;
        int i14;
        int i15;
        w[] wVarArr;
        int spanStart;
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        ns.o.j("start should be <= than end", i11 <= i12);
        y yVar = null;
        if (charSequence == null) {
            return null;
        }
        ns.o.j("start should be < than charSequence length", i11 <= charSequence.length());
        ns.o.j("end should be < than charSequence length", i12 <= charSequence.length());
        if (charSequence.length() == 0 || i11 == i12) {
            return charSequence;
        }
        boolean z11 = i13 == 1;
        m3 m3Var = (m3) this.f53530e.f7467b;
        m3Var.getClass();
        boolean z12 = charSequence instanceof u;
        if (z12) {
            ((u) charSequence).a();
        }
        if (z12) {
            yVar = new y((Spannable) charSequence);
            if (yVar != null) {
                for (w wVar : wVarArr) {
                    spanStart = yVar.f53571b.getSpanStart(wVar);
                    int spanEnd = yVar.f53571b.getSpanEnd(wVar);
                    if (spanStart != i12) {
                        yVar.removeSpan(wVar);
                    }
                    i11 = Math.min(spanStart, i11);
                    i12 = Math.max(spanEnd, i12);
                }
            }
            i14 = i11;
            i15 = i12;
            if (i14 != i15) {
                charSequence2 = charSequence;
                if (!z12) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z12) {
                    return charSequence2;
                }
            }
            ((u) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    yVar = new y((Spannable) charSequence);
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    th2 = th;
                    if (!z12) {
                        throw th2;
                    }
                    ((u) charSequence2).b();
                    throw th2;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i11 - 1, i12 + 1, w.class) <= i12) {
                yVar = new y();
                yVar.f53570a = false;
                yVar.f53571b = new SpannableString(charSequence);
            }
            if (yVar != null && (wVarArr = (w[]) yVar.f53571b.getSpans(i11, i12, w.class)) != null && wVarArr.length > 0) {
                while (i < r3) {
                    spanStart = yVar.f53571b.getSpanStart(wVar);
                    int spanEnd2 = yVar.f53571b.getSpanEnd(wVar);
                    if (spanStart != i12) {
                        yVar.removeSpan(wVar);
                    }
                    i11 = Math.min(spanStart, i11);
                    i12 = Math.max(spanEnd2, i12);
                }
            }
            i14 = i11;
            i15 = i12;
            if (i14 != i15 || i14 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z12) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    y yVar2 = (y) m3Var.i(charSequence2, i14, i15, Integer.MAX_VALUE, z11, new qh.d(7, yVar, (re.q) m3Var.f48056a));
                    if (yVar2 != null) {
                        Spannable spannable = yVar2.f53571b;
                        if (z12) {
                            ((u) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z12) {
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    if (!z12) {
                        throw th2;
                    }
                    ((u) charSequence2).b();
                    throw th2;
                }
            }
            ((u) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th2 = th5;
            charSequence2 = charSequence;
        }
        if (!z12) {
            throw th2;
        }
        ((u) charSequence2).b();
        throw th2;
    }

    public final void h(g gVar) {
        ns.o.l(gVar, "initCallback cannot be null");
        this.f53526a.writeLock().lock();
        try {
            if (this.f53528c == 1 || this.f53528c == 2) {
                this.f53529d.post(new h(Arrays.asList(gVar), this.f53528c, null));
            } else {
                this.f53527b.add(gVar);
            }
        } finally {
            this.f53526a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        com.android.billingclient.api.c cVar = this.f53530e;
        cVar.getClass();
        Bundle bundle = editorInfo.extras;
        w5.b bVar = (w5.b) ((ob.i) cVar.f7468c).f44813b;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f51943d).getInt(iA + bVar.f51940a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}

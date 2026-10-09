package b1;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import d1.z0;
import j3.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import s0.s0;
import z2.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd.b f3835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f3837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f3838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f3839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o3.w f3841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f3844j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3845k = true;

    public x(o3.w wVar, hd.b bVar, boolean z11, s0 s0Var, z0 z0Var, p2 p2Var) {
        this.f3835a = bVar;
        this.f3836b = z11;
        this.f3837c = s0Var;
        this.f3838d = z0Var;
        this.f3839e = p2Var;
        this.f3841g = wVar;
    }

    public final void a(o3.g gVar) {
        this.f3840f++;
        try {
            this.f3844j.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i11 = this.f3840f - 1;
        this.f3840f = i11;
        if (i11 == 0) {
            ArrayList arrayList = this.f3844j;
            if (!arrayList.isEmpty()) {
                ((w) this.f3835a.f32184b).f3825c.invoke(ry.m.c1(arrayList));
                arrayList.clear();
            }
        }
        return this.f3840f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z11 = this.f3845k;
        if (!z11) {
            return z11;
        }
        this.f3840f++;
        return true;
    }

    public final void c(int i11) {
        sendKeyEvent(new KeyEvent(0, i11));
        sendKeyEvent(new KeyEvent(1, i11));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i11) {
        boolean z11 = this.f3845k;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f3844j.clear();
        this.f3840f = 0;
        this.f3845k = false;
        ArrayList arrayList = ((w) this.f3835a.f32184b).f3832j;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (kotlin.jvm.internal.m.a(((WeakReference) arrayList.get(i11)).get(), this)) {
                arrayList.remove(i11);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z11 = this.f3845k;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        boolean z11 = this.f3845k;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z11 = this.f3845k;
        return z11 ? this.f3836b : z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i11) {
        boolean z11 = this.f3845k;
        if (z11) {
            a(new o3.a(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        boolean z11 = this.f3845k;
        if (!z11) {
            return z11;
        }
        a(new o3.e(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        boolean z11 = this.f3845k;
        if (!z11) {
            return z11;
        }
        a(new o3.f(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z11 = this.f3845k;
        if (!z11) {
            return z11;
        }
        a(new o3.h());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i11) {
        o3.w wVar = this.f3841g;
        return TextUtils.getCapsMode(wVar.f44704a.f35700b, x0.f(wVar.f44705b), i11);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        boolean z11 = (i11 & 1) != 0;
        this.f3843i = z11;
        if (z11) {
            this.f3842h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return s.d(this.f3841g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i11) {
        if (x0.c(this.f3841g.f44705b)) {
            return null;
        }
        return ew.a.o(this.f3841g).f35700b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i11, int i12) {
        return ew.a.p(this.f3841g, i11).f35700b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i11, int i12) {
        return ew.a.q(this.f3841g, i11).f35700b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i11) {
        boolean z11 = this.f3845k;
        if (z11) {
            z11 = false;
            switch (i11) {
                case R.id.selectAll:
                    a(new o3.v(0, this.f3841g.f44704a.f35700b.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000a  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i11) {
        int i12;
        boolean z11 = this.f3845k;
        if (z11) {
            z11 = true;
            if (i11 != 0) {
                switch (i11) {
                    case 2:
                        i12 = 2;
                        break;
                    case 3:
                        i12 = 3;
                        break;
                    case 4:
                        i12 = 4;
                        break;
                    case 5:
                        i12 = 6;
                        break;
                    case 6:
                        i12 = 7;
                        break;
                    case 7:
                        i12 = 5;
                        break;
                    default:
                        i12 = 1;
                        break;
                }
            } else {
                i12 = 1;
            }
            ((w) this.f3835a.f32184b).f3826d.invoke(new o3.i(i12));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            a00.c cVar = new a00.c(this, 4);
            s0 s0Var = this.f3837c;
            int iD = s0Var != null ? l.d(s0Var, handwritingGesture, this.f3838d, this.f3839e, cVar) : 3;
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new f(intConsumer, iD, 0));
            } else {
                intConsumer.accept(iD);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z11 = this.f3845k;
        if (z11) {
            return true;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        s0 s0Var;
        if (Build.VERSION.SDK_INT < 34 || (s0Var = this.f3837c) == null) {
            return false;
        }
        return l.e(s0Var, previewableHandwritingGesture, this.f3838d, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z11) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        t tVar;
        boolean z14 = this.f3845k;
        if (!z14) {
            return z14;
        }
        boolean z15 = false;
        boolean z16 = (i11 & 1) != 0;
        boolean z17 = (i11 & 2) != 0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            z12 = (i11 & 16) != 0;
            z13 = (i11 & 8) != 0;
            boolean z18 = (i11 & 4) != 0;
            if (i12 >= 34 && (i11 & 32) != 0) {
                z15 = true;
            }
            if (z12 || z13 || z18 || z15) {
                z11 = z15;
                z15 = z18;
            } else {
                if (i12 >= 34) {
                    z11 = true;
                    z15 = true;
                } else {
                    z11 = z15;
                    z15 = true;
                }
                z12 = z15;
            }
            tVar = ((w) this.f3835a.f32184b).m;
            synchronized (tVar.f3807c) {
                try {
                    tVar.f3810f = z12;
                    tVar.f3811g = z13;
                    tVar.f3812h = z15;
                    tVar.f3813i = z11;
                    if (z16) {
                        tVar.f3809e = true;
                        if (tVar.f3814j != null) {
                            tVar.a();
                        }
                    }
                    tVar.f3808d = z17;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        z11 = false;
        z12 = true;
        z13 = z12;
        tVar = ((w) this.f3835a.f32184b).m;
        synchronized (tVar.f3807c) {
            tVar.f3810f = z12;
            tVar.f3811g = z13;
            tVar.f3812h = z15;
            tVar.f3813i = z11;
            if (z16) {
                tVar.f3809e = true;
                if (tVar.f3814j != null) {
                    tVar.a();
                }
            }
            tVar.f3808d = z17;
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qy.h] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z11 = this.f3845k;
        if (!z11) {
            return z11;
        }
        ((BaseInputConnection) ((w) this.f3835a.f32184b).f3833k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i11, int i12) {
        boolean z11 = this.f3845k;
        if (z11) {
            a(new o3.t(i11, i12));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i11) {
        boolean z11 = this.f3845k;
        if (z11) {
            a(new o3.u(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i11, int i12) {
        boolean z11 = this.f3845k;
        if (!z11) {
            return z11;
        }
        a(new o3.v(i11, i12));
        return true;
    }
}

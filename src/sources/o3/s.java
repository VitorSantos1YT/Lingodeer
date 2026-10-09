package o3;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import lf.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f44689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f44692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f44695g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44696h = true;

    public s(w wVar, x0 x0Var, boolean z11) {
        this.f44689a = x0Var;
        this.f44690b = z11;
        this.f44692d = wVar;
    }

    public final void a(g gVar) {
        this.f44691c++;
        try {
            this.f44695g.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i11 = this.f44691c - 1;
        this.f44691c = i11;
        if (i11 == 0) {
            ArrayList arrayList = this.f44695g;
            if (!arrayList.isEmpty()) {
                ((a0) this.f44689a.f40130b).f44633e.invoke(ry.m.c1(arrayList));
                arrayList.clear();
            }
        }
        return this.f44691c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z11 = this.f44696h;
        if (!z11) {
            return z11;
        }
        this.f44691c++;
        return true;
    }

    public final void c(int i11) {
        sendKeyEvent(new KeyEvent(0, i11));
        sendKeyEvent(new KeyEvent(1, i11));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i11) {
        boolean z11 = this.f44696h;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f44695g.clear();
        this.f44691c = 0;
        this.f44696h = false;
        ArrayList arrayList = ((a0) this.f44689a.f40130b).f44637i;
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
        boolean z11 = this.f44696h;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        boolean z11 = this.f44696h;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z11 = this.f44696h;
        return z11 ? this.f44690b : z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i11) {
        boolean z11 = this.f44696h;
        if (z11) {
            a(new a(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        boolean z11 = this.f44696h;
        if (!z11) {
            return z11;
        }
        a(new e(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        boolean z11 = this.f44696h;
        if (!z11) {
            return z11;
        }
        a(new f(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z11 = this.f44696h;
        if (!z11) {
            return z11;
        }
        a(new h());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i11) {
        w wVar = this.f44692d;
        return TextUtils.getCapsMode(wVar.f44704a.f35700b, j3.x0.f(wVar.f44705b), i11);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        boolean z11 = (i11 & 1) != 0;
        this.f44694f = z11;
        if (z11) {
            this.f44693e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return com.bumptech.glide.g.x(this.f44692d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i11) {
        if (j3.x0.c(this.f44692d.f44705b)) {
            return null;
        }
        return ew.a.o(this.f44692d).f35700b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i11, int i12) {
        return ew.a.p(this.f44692d, i11).f35700b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i11, int i12) {
        return ew.a.q(this.f44692d, i11).f35700b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i11) {
        boolean z11 = this.f44696h;
        if (z11) {
            z11 = false;
            switch (i11) {
                case R.id.selectAll:
                    a(new v(0, this.f44692d.f44704a.f35700b.length()));
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
        boolean z11 = this.f44696h;
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
            ((a0) this.f44689a.f40130b).f44634f.invoke(new i(i12));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z11 = this.f44696h;
        if (z11) {
            return true;
        }
        return z11;
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
        c cVar;
        boolean z14 = this.f44696h;
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
            cVar = ((a0) this.f44689a.f40130b).f44640l;
            synchronized (cVar.f44653c) {
                try {
                    cVar.f44656f = z12;
                    cVar.f44657g = z13;
                    cVar.f44658h = z15;
                    cVar.f44659i = z11;
                    if (z16) {
                        cVar.f44655e = true;
                        if (cVar.f44660j != null) {
                            cVar.a();
                        }
                    }
                    cVar.f44654d = z17;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        z11 = false;
        z12 = true;
        z13 = z12;
        cVar = ((a0) this.f44689a.f40130b).f44640l;
        synchronized (cVar.f44653c) {
            cVar.f44656f = z12;
            cVar.f44657g = z13;
            cVar.f44658h = z15;
            cVar.f44659i = z11;
            if (z16) {
                cVar.f44655e = true;
                if (cVar.f44660j != null) {
                    cVar.a();
                }
            }
            cVar.f44654d = z17;
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qy.h] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z11 = this.f44696h;
        if (!z11) {
            return z11;
        }
        ((BaseInputConnection) ((a0) this.f44689a.f40130b).f44638j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i11, int i12) {
        boolean z11 = this.f44696h;
        if (z11) {
            a(new t(i11, i12));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i11) {
        boolean z11 = this.f44696h;
        if (z11) {
            a(new u(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i11, int i12) {
        boolean z11 = this.f44696h;
        if (!z11) {
            return z11;
        }
        a(new v(i11, i12));
        return true;
    }
}

package o3;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import y.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class l implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f44686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b1.x f44687b;

    public l(b1.x xVar, p0 p0Var) {
        this.f44686a = p0Var;
        this.f44687b = xVar;
    }

    public final void a(b1.x xVar) {
        xVar.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i11) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.clearMetaKeyStates(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            if (xVar != null) {
                a(xVar);
                this.f44687b = null;
            }
            this.f44686a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i11) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.commitText(charSequence, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.deleteSurroundingText(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.deleteSurroundingTextInCodePoints(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i11) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.getCursorCapsMode(i11);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.getExtractedText(extractedTextRequest, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i11) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.getSelectedText(i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i11, int i12) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.getTextAfterCursor(i11, i12);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i11, int i12) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.getTextBeforeCursor(i11, i12);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i11) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.performContextMenuAction(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i11) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.performEditorAction(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z11) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i11) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.requestCursorUpdates(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i11, int i12) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.setComposingRegion(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i11) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.setComposingText(charSequence, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i11, int i12) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.setSelection(i11, i12);
        }
        return false;
    }
}

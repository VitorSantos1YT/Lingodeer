package s8;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import b7.w;
import com.lingodeer.R;
import java.io.EOFException;
import x7.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f51490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f51491e;

    public e() {
        this.f51490d = new f();
        this.f51491e = new w(new byte[65025], 0);
        this.f51487a = -1;
    }

    public int a(int i11) {
        int i12;
        int i13 = 0;
        this.f51488b = 0;
        do {
            int i14 = this.f51488b;
            int i15 = i11 + i14;
            f fVar = (f) this.f51490d;
            if (i15 >= fVar.f51494c) {
                break;
            }
            int[] iArr = fVar.f51497f;
            this.f51488b = i14 + 1;
            i12 = iArr[i15];
            i13 += i12;
        } while (i12 == 255);
        return i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sb.a b(View view) {
        sb.a aVar = (sb.a) this.f51491e;
        if (aVar != null) {
            return aVar;
        }
        if (view instanceof sb.a) {
            sb.a aVar2 = (sb.a) view;
            this.f51491e = aVar2;
            return aVar2;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        int i11 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i11 >= viewGroup.getChildCount()) {
                return null;
            }
            sb.a aVarB = b(viewGroup.getChildAt(i11));
            if (aVarB != null) {
                this.f51491e = aVarB;
                return aVarB;
            }
            i11++;
        }
    }

    public void c(int i11) {
        ViewGroup viewGroup = (ViewGroup) this.f51490d;
        if (this.f51489c && viewGroup.getFitsSystemWindows()) {
            Rect rect = new Rect();
            viewGroup.getWindowVisibleDisplayFrame(rect);
            i11 = rect.bottom - rect.top;
        }
        if (i11 < 0) {
            return;
        }
        int i12 = this.f51487a;
        if (i12 < 0) {
            this.f51487a = i11;
            return;
        }
        int i13 = i12 - i11;
        if (i13 == 0) {
            return;
        }
        if (Math.abs(i13) == this.f51488b) {
            String.format("offset just equal statusBar height %d", Integer.valueOf(i13));
            return;
        }
        this.f51487a = i11;
        sb.a aVarB = b(viewGroup);
        if (aVarB == null) {
            return;
        }
        int iAbs = Math.abs(i13);
        Context context = viewGroup.getContext();
        if (ve.i.f54007c == 0) {
            ve.i.f54007c = context.getResources().getDimensionPixelSize(R.dimen.min_keyboard_height);
        }
        if (iAbs < ve.i.f54007c) {
            return;
        }
        if (i13 > 0) {
            aVarB.b();
        } else {
            aVarB.a();
        }
    }

    public boolean d(n nVar) {
        int i11;
        f fVar = (f) this.f51490d;
        w wVar = (w) this.f51491e;
        b7.a.j(nVar != null);
        if (this.f51489c) {
            this.f51489c = false;
            wVar.F(0);
        }
        while (!this.f51489c) {
            if (this.f51487a < 0) {
                if (fVar.b(nVar, -1L) && fVar.a(nVar, true)) {
                    int iA = fVar.f51495d;
                    if ((fVar.f51492a & 1) == 1 && wVar.f4041c == 0) {
                        iA += a(0);
                        i11 = this.f51488b;
                    } else {
                        i11 = 0;
                    }
                    try {
                        nVar.s(iA);
                        this.f51487a = i11;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f51487a);
            int i12 = this.f51487a + this.f51488b;
            if (iA2 > 0) {
                wVar.c(wVar.f4041c + iA2);
                try {
                    nVar.readFully(wVar.f4039a, wVar.f4041c, iA2);
                    wVar.H(wVar.f4041c + iA2);
                    this.f51489c = fVar.f51497f[i12 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == fVar.f51494c) {
                i12 = -1;
            }
            this.f51487a = i12;
        }
        return true;
    }

    public e(ViewGroup viewGroup) {
        int i11;
        int identifier;
        this.f51487a = -1;
        this.f51490d = viewGroup;
        Context context = viewGroup.getContext();
        synchronized (ub.a.class) {
            try {
                if (!ub.a.f52902a && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                    ub.a.f52903b = dimensionPixelSize;
                    ub.a.f52902a = true;
                    String.format("Get status bar height %d", Integer.valueOf(dimensionPixelSize));
                }
                i11 = ub.a.f52903b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f51488b = i11;
        this.f51489c = (((Activity) viewGroup.getContext()).getWindow().getAttributes().flags & 67108864) != 0;
    }
}

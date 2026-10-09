package p8;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import qp.o2;
import s2.i;
import s2.v;
import x7.n;
import y.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f46565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cloneable f46568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Cloneable f46569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f46570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f46571g;

    /* JADX WARN: Type inference failed for: r2v7, types: [byte[], java.lang.Cloneable] */
    public b(int i11) {
        switch (i11) {
            case 1:
                this.f46568d = new SparseLongArray();
                this.f46569e = new SparseBooleanArray();
                this.f46570f = new ArrayList();
                this.f46571g = new r((Object) null);
                this.f46566b = -1;
                this.f46567c = -1;
                break;
            default:
                this.f46568d = new byte[8];
                this.f46569e = new ArrayDeque();
                this.f46570f = new e();
                break;
        }
    }

    public void a(MotionEvent motionEvent) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.f46568d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j11 = this.f46565a;
                this.f46565a = 1 + j11;
                sparseLongArray.put(pointerId, j11);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j12 = this.f46565a;
            this.f46565a = 1 + j12;
            sparseLongArray.put(pointerId2, j12);
            if (motionEvent.getToolType(actionIndex) == 3) {
                ((SparseBooleanArray) this.f46569e).put(pointerId2, true);
            }
        }
    }

    public void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f46566b && source == this.f46567c) {
            return;
        }
        this.f46566b = toolType;
        this.f46567c = source;
        ((SparseBooleanArray) this.f46569e).clear();
        ((SparseLongArray) this.f46568d).clear();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x010c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x0126  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Code duplicated, block: B:73:0x0182  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    public o2 c(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        int actionIndex;
        long jValueAt;
        float f5;
        long j11;
        long jR;
        long jF;
        int toolType;
        int i11;
        int historySize;
        int i12;
        char c11;
        char c12;
        long jFloatToRawIntBits;
        float historicalX;
        b bVar = this;
        SparseLongArray sparseLongArray = (SparseLongArray) bVar.f46568d;
        ArrayList arrayList = (ArrayList) bVar.f46570f;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) bVar.f46569e;
        int actionMasked = motionEvent.getActionMasked();
        int i13 = 3;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z11 = true;
        boolean z12 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z13 = actionMasked == 8;
        if (z12) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i14 = 0;
        while (i14 < pointerCount) {
            boolean z14 = (z12 || i14 == actionIndex || (z13 && motionEvent.getButtonState() == 0)) ? false : z11;
            int pointerId = motionEvent.getPointerId(i14);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
            if (iIndexOfKey >= 0) {
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
            } else {
                long j12 = bVar.f46565a;
                bVar.f46565a = j12 + 1;
                sparseLongArray.put(pointerId, j12);
                jValueAt = j12;
            }
            float pressure = motionEvent.getPressure(i14);
            char c13 = ' ';
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getY(i14))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i14))) << 32);
            long jA = f2.b.a(CropImageView.DEFAULT_ASPECT_RATIO, i13, jFloatToRawIntBits2);
            if (i14 == 0) {
                f5 = 0.0f;
                jR = (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32);
                jF = androidComposeView.F(jR);
            } else {
                f5 = 0.0f;
                if (Build.VERSION.SDK_INT >= 29) {
                    jR = i.a(motionEvent, i14);
                    jF = androidComposeView.F(jR);
                } else {
                    j11 = jFloatToRawIntBits2;
                    jR = androidComposeView.r(jFloatToRawIntBits2);
                }
                toolType = motionEvent.getToolType(i14);
                if (toolType == 0) {
                    if (toolType != 1) {
                        i11 = 1;
                    } else if (toolType != 2) {
                        i11 = i13;
                    } else if (toolType != i13) {
                        i11 = 2;
                    } else if (toolType != 4) {
                        i11 = 4;
                    }
                    ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i12 = 0;
                    while (i12 < historySize) {
                        historicalX = motionEvent.getHistoricalX(i14, i12);
                        float historicalY = motionEvent.getHistoricalY(i14, i12);
                        char c14 = c13;
                        if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(historicalX)) << c14) | (((long) Float.floatToRawIntBits(historicalY)) & 4294967295L);
                            arrayList2.add(new s2.c(motionEvent.getHistoricalEventTime(i12), jFloatToRawIntBits3, jFloatToRawIntBits3));
                        }
                        i12++;
                        c13 = c14;
                        sparseLongArray = sparseLongArray;
                    }
                    SparseLongArray sparseLongArray2 = sparseLongArray;
                    c11 = c13;
                    if (motionEvent.getActionMasked() == 8) {
                        c12 = '\n';
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c11);
                    } else {
                        c12 = '\n';
                        jFloatToRawIntBits = 0;
                    }
                    arrayList.add(new v(jValueAt, motionEvent.getEventTime(), jR, j11, z14, pressure, i11, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList2, jFloatToRawIntBits, jA));
                    i14++;
                    i13 = 3;
                    z11 = true;
                    z12 = z12;
                    z13 = z13;
                    sparseLongArray = sparseLongArray2;
                    bVar = this;
                }
                i11 = 0;
                ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                i12 = 0;
                while (i12 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i14, i12);
                    float historicalY2 = motionEvent.getHistoricalY(i14, i12);
                    char c15 = c13;
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
                    }
                    i12++;
                    c13 = c15;
                    sparseLongArray = sparseLongArray;
                }
                SparseLongArray sparseLongArray3 = sparseLongArray;
                c11 = c13;
                if (motionEvent.getActionMasked() == 8) {
                    c12 = '\n';
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c11);
                } else {
                    c12 = '\n';
                    jFloatToRawIntBits = 0;
                }
                arrayList.add(new v(jValueAt, motionEvent.getEventTime(), jR, j11, z14, pressure, i11, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList3, jFloatToRawIntBits, jA));
                i14++;
                i13 = 3;
                z11 = true;
                z12 = z12;
                z13 = z13;
                sparseLongArray = sparseLongArray3;
                bVar = this;
            }
            j11 = jF;
            toolType = motionEvent.getToolType(i14);
            if (toolType == 0) {
                if (toolType != 1) {
                    i11 = 1;
                } else if (toolType != 2) {
                    i11 = i13;
                } else if (toolType != i13) {
                    i11 = 2;
                } else if (toolType != 4) {
                    i11 = 4;
                }
                ArrayList arrayList4 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                i12 = 0;
                while (i12 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i14, i12);
                    float historicalY3 = motionEvent.getHistoricalY(i14, i12);
                    char c16 = c13;
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
                    }
                    i12++;
                    c13 = c16;
                    sparseLongArray = sparseLongArray;
                }
                SparseLongArray sparseLongArray4 = sparseLongArray;
                c11 = c13;
                if (motionEvent.getActionMasked() == 8) {
                    c12 = '\n';
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c11);
                } else {
                    c12 = '\n';
                    jFloatToRawIntBits = 0;
                }
                arrayList.add(new v(jValueAt, motionEvent.getEventTime(), jR, j11, z14, pressure, i11, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList4, jFloatToRawIntBits, jA));
                i14++;
                i13 = 3;
                z11 = true;
                z12 = z12;
                z13 = z13;
                sparseLongArray = sparseLongArray4;
                bVar = this;
            }
            i11 = 0;
            ArrayList arrayList5 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i12 = 0;
            while (i12 < historySize) {
                historicalX = motionEvent.getHistoricalX(i14, i12);
                float historicalY4 = motionEvent.getHistoricalY(i14, i12);
                char c17 = c13;
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
                }
                i12++;
                c13 = c17;
                sparseLongArray = sparseLongArray;
            }
            SparseLongArray sparseLongArray5 = sparseLongArray;
            c11 = c13;
            if (motionEvent.getActionMasked() == 8) {
                c12 = '\n';
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c11);
            } else {
                c12 = '\n';
                jFloatToRawIntBits = 0;
            }
            arrayList.add(new v(jValueAt, motionEvent.getEventTime(), jR, j11, z14, pressure, i11, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList5, jFloatToRawIntBits, jA));
            i14++;
            i13 = 3;
            z11 = true;
            z12 = z12;
            z13 = z13;
            sparseLongArray = sparseLongArray5;
            bVar = this;
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new o2(1, arrayList, motionEvent);
    }

    public long d(n nVar, int i11) {
        byte[] bArr = (byte[]) this.f46568d;
        nVar.readFully(bArr, 0, i11);
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 << 8) | ((long) (bArr[i12] & 255));
        }
        return j11;
    }

    public void e(MotionEvent motionEvent) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f46569e;
        SparseLongArray sparseLongArray = (SparseLongArray) this.f46568d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i11) == iKeyAt) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
    }
}

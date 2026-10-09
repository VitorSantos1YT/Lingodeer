package a9;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import b0.h2;
import b7.f0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import j3.a0;
import j3.b0;
import j3.c0;
import j3.y0;
import java.io.IOException;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.z;
import mt.l0;
import ns.o;
import ob.m;
import org.koin.core.error.DefinitionOverrideException;
import pz.j;
import pz.k;
import qy.l;
import rt.s8;
import ry.r;
import y.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements u8.d, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f521e;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f517a = obj;
        this.f518b = obj2;
        this.f519c = obj3;
        this.f520d = obj4;
        this.f521e = obj5;
    }

    @Override // j3.b0
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f521e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((a0) arrayList.get(i11)).f35657a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    @Override // j3.b0
    public float b() {
        return ((Number) this.f519c.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    @Override // j3.b0
    public float c() {
        return ((Number) this.f520d.getValue()).floatValue();
    }

    public void d(ac.g gVar, Class cls) {
        ((ArrayList) this.f520d).add(new l(gVar, cls));
    }

    public void e(dc.a aVar, Class cls) {
        ((ArrayList) this.f518b).add(new l(aVar, cls));
    }

    @Override // u8.d
    public int f(long j11) {
        long[] jArr = (long[]) this.f518b;
        int iA = f0.a(jArr, j11, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    public l1.h g(t1.b bVar, fz.a aVar) {
        int i11;
        int i12;
        int i13;
        w wVar = new w();
        wVar.f38359a = -1;
        synchronized (this.f517a) {
            Throwable th2 = (Throwable) this.f518b;
            if (th2 != null) {
                bVar.b(th2);
                return l1.g.f39298b;
            }
            t1.a aVar2 = (t1.a) this.f519c;
            do {
                i11 = aVar2.get();
                i12 = i11 + 1;
            } while (!aVar2.compareAndSet(i11, i12));
            boolean z11 = (134217727 & i12) == 1;
            wVar.f38359a = (i12 >>> 27) & 15;
            ((e0) this.f520d).a(bVar);
            if (z11 && aVar != null) {
                try {
                    aVar.invoke();
                } catch (Throwable th3) {
                    synchronized (this.f517a) {
                        try {
                            if (((Throwable) this.f518b) == null) {
                                this.f518b = th3;
                                e0 e0Var = (e0) this.f520d;
                                Object[] objArr = e0Var.f56686a;
                                int i14 = e0Var.f56687b;
                                for (int i15 = 0; i15 < i14; i15++) {
                                    ((t1.b) objArr[i15]).b(th3);
                                }
                                ((e0) this.f520d).d();
                                t1.a aVar3 = (t1.a) this.f519c;
                                do {
                                    i13 = aVar3.get();
                                } while (!aVar3.compareAndSet(i13, ((((i13 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            return new ob.c(new l0(bVar, this, wVar, 25));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi h(int i11) {
        Bidi bidi;
        Layout layout = (Layout) this.f517a;
        ArrayList arrayList = (ArrayList) this.f518b;
        ArrayList arrayList2 = (ArrayList) this.f519c;
        boolean[] zArr = (boolean[]) this.f520d;
        if (zArr[i11]) {
            return (Bidi) arrayList2.get(i11);
        }
        int iIntValue = i11 == 0 ? 0 : ((Number) arrayList.get(i11 - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i11)).intValue();
        int i12 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f521e;
        if (cArr == null || cArr.length < i12) {
            cArr = new char[i12];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i12)) {
            bidi = new Bidi(cArr2, 0, null, 0, i12, layout.getParagraphDirection(layout.getLineForOffset(r(i11))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i11, bidi);
        zArr[i11] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f521e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f521e = cArr2;
        return bidi;
    }

    public void i() {
        ((h2) this.f517a).V("Create eager instances ...");
        long jA = j.a();
        m mVar = (m) this.f520d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) mVar.f44828d;
        int i11 = 0;
        v10.d[] dVarArr = (v10.d[]) concurrentHashMap.values().toArray(new v10.d[0]);
        ArrayList arrayListB = o.b(Arrays.copyOf(dVarArr, dVarArr.length));
        concurrentHashMap.clear();
        i iVar = (i) mVar.f44826b;
        oi.c cVar = new oi.c((h2) iVar.f517a, ((c20.b) iVar.f519c).f6515d, z.a(v10.c.class), (b20.a) null, (a20.a) null);
        int size = arrayListB.size();
        while (i11 < size) {
            Object obj = arrayListB.get(i11);
            i11++;
            ((v10.d) obj).b(cVar);
        }
        long jA2 = k.a(jA);
        h2 h2Var = (h2) this.f517a;
        StringBuilder sb2 = new StringBuilder("Created eager instances in ");
        int i12 = pz.a.f47220d;
        sb2.append(pz.a.j(jA2, pz.c.MICROSECONDS) / 1000.0d);
        sb2.append(" ms");
        h2Var.V(sb2.toString());
    }

    @Override // u8.d
    public long j(int i11) {
        return ((long[]) this.f518b)[i11];
    }

    public void k() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f519c = mediaPlayer;
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: bq.b
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                a9.i iVar = this.f4940a;
                d dVar = (d) iVar.f520d;
                if (dVar != null) {
                    dVar.k(0);
                }
                e eVar = (e) iVar.f521e;
                if (eVar != null) {
                    eVar.a();
                }
            }
        });
        ((MediaPlayer) this.f519c).setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: bq.c
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i11, int i12) {
                d dVar = (d) this.f4941a.f520d;
                if (dVar != null) {
                    dVar.k(1);
                }
                return true;
            }
        });
    }

    public void l() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f519c;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            ((MediaPlayer) this.f519c).release();
            this.f519c = null;
        }
    }

    public void m(fz.c cVar) {
        int i11;
        synchronized (this.f517a) {
            try {
                e0 e0Var = (e0) this.f520d;
                this.f520d = (e0) this.f521e;
                this.f521e = e0Var;
                t1.a aVar = (t1.a) this.f519c;
                do {
                    i11 = aVar.get();
                } while (!aVar.compareAndSet(i11, ((((i11 >>> 27) & 15) + 1) & 15) << 27));
                int i12 = e0Var.f56687b;
                for (int i13 = 0; i13 < i12; i13++) {
                    cVar.invoke(e0Var.f(i13));
                }
                e0Var.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public float n(int i11, boolean z11) {
        Layout layout = (Layout) this.f517a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i11));
        if (i11 > lineEnd) {
            i11 = lineEnd;
        }
        return z11 ? layout.getPrimaryHorizontal(i11) : layout.getSecondaryHorizontal(i11);
    }

    public float o(int i11, boolean z11, boolean z12) {
        int i12;
        int i13;
        int iT = i11;
        Layout layout = (Layout) this.f517a;
        if (!z12) {
            return n(i11, z11);
        }
        int iD = k3.o.d(layout, iT, z12);
        int lineStart = layout.getLineStart(iD);
        int lineEnd = layout.getLineEnd(iD);
        if (iT != lineStart && iT != lineEnd) {
            return n(i11, z11);
        }
        if (iT == 0 || iT == layout.getText().length()) {
            return n(i11, z11);
        }
        int iQ = q(iT, z12);
        boolean z13 = layout.getParagraphDirection(layout.getLineForOffset(r(iQ))) == -1;
        int iT2 = t(lineEnd, lineStart);
        int iR = r(iQ);
        int i14 = lineStart - iR;
        int i15 = iT2 - iR;
        Bidi bidiH = h(iQ);
        Bidi bidiCreateLineBidi = bidiH != null ? bidiH.createLineBidi(i14, i15) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z11 || z13 == zIsRtlCharAt) {
                z13 = !z13;
            }
            return iT == lineStart ? z13 : !z13 ? layout.getLineLeft(iD) : layout.getLineRight(iD);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        k3.k[] kVarArr = new k3.k[runCount];
        for (int i16 = 0; i16 < runCount; i16++) {
            kVarArr[i16] = new k3.k(bidiCreateLineBidi.getRunStart(i16) + lineStart, bidiCreateLineBidi.getRunLimit(i16) + lineStart, bidiCreateLineBidi.getRunLevel(i16) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i17 = 0; i17 < runCount2; i17++) {
            bArr[i17] = (byte) bidiCreateLineBidi.getRunLevel(i17);
        }
        Bidi.reorderVisually(bArr, 0, kVarArr, 0, runCount);
        if (iT == lineStart) {
            int i18 = 0;
            while (true) {
                if (i18 >= runCount) {
                    i13 = -1;
                    break;
                }
                if (kVarArr[i18].f37875a == iT) {
                    i13 = i18;
                    break;
                }
                i18++;
            }
            boolean z14 = (z11 || z13 == kVarArr[i13].f37877c) ? !z13 : z13;
            if (i13 == 0 && z14) {
                return layout.getLineLeft(iD);
            }
            if (i13 != runCount - 1 || z14) {
                return z14 ? layout.getPrimaryHorizontal(kVarArr[i13 - 1].f37875a) : layout.getPrimaryHorizontal(kVarArr[i13 + 1].f37875a);
            }
            return layout.getLineRight(iD);
        }
        if (iT > iT2) {
            iT = t(iT, lineStart);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= runCount) {
                i12 = -1;
                break;
            }
            if (kVarArr[i19].f37876b == iT) {
                i12 = i19;
                break;
            }
            i19++;
        }
        boolean z15 = (z11 || z13 == kVarArr[i12].f37877c) ? z13 : !z13;
        if (i12 == 0 && z15) {
            return layout.getLineLeft(iD);
        }
        if (i12 != runCount - 1 || z15) {
            return z15 ? layout.getPrimaryHorizontal(kVarArr[i12 - 1].f37876b) : layout.getPrimaryHorizontal(kVarArr[i12 + 1].f37876b);
        }
        return layout.getLineRight(iD);
    }

    @Override // u8.d
    public List p(long j11) {
        c cVar = (c) this.f517a;
        Map map = (Map) this.f519c;
        HashMap map2 = (HashMap) this.f520d;
        HashMap map3 = (HashMap) this.f521e;
        ArrayList arrayList = new ArrayList();
        cVar.g(j11, cVar.f469h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j11, false, cVar.f469h, treeMap);
        cVar.h(j11, map, map2, cVar.f469h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Pair pair = (Pair) obj;
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                g gVar = (g) map2.get(pair.first);
                gVar.getClass();
                arrayList2.add(new a7.b(null, null, null, bitmapDecodeByteArray, gVar.f489c, 0, gVar.f491e, gVar.f488b, 0, Integer.MIN_VALUE, -3.4028235E38f, gVar.f492f, gVar.f493g, false, -16777216, gVar.f496j, CropImageView.DEFAULT_ASPECT_RATIO, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            g gVar2 = (g) map2.get(entry.getKey());
            gVar2.getClass();
            a7.a aVar = (a7.a) entry.getValue();
            CharSequence charSequence = aVar.f388a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar2 : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) BuildConfig.VERSION_NAME);
            }
            for (int i12 = 0; i12 < spannableStringBuilder.length(); i12++) {
                if (spannableStringBuilder.charAt(i12) == ' ') {
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (i14 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i14) == ' ') {
                        i14++;
                    }
                    int i15 = i14 - i13;
                    if (i15 > 0) {
                        spannableStringBuilder.delete(i12, i15 + i12);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == '\n') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == ' ') {
                        spannableStringBuilder.delete(i17, i16 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i18 = 0; i18 < spannableStringBuilder.length() - 1; i18++) {
                if (spannableStringBuilder.charAt(i18) == ' ') {
                    int i19 = i18 + 1;
                    if (spannableStringBuilder.charAt(i19) == '\n') {
                        spannableStringBuilder.delete(i18, i19);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f5 = gVar2.f489c;
            int i21 = gVar2.f490d;
            aVar.f392e = f5;
            aVar.f393f = i21;
            aVar.f394g = gVar2.f491e;
            aVar.f395h = gVar2.f488b;
            aVar.f399l = gVar2.f492f;
            float f11 = gVar2.f495i;
            int i22 = gVar2.f494h;
            aVar.f398k = f11;
            aVar.f397j = i22;
            aVar.f402p = gVar2.f496j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public int q(int i11, boolean z11) {
        ArrayList arrayList = (ArrayList) this.f518b;
        int iC = o.c(arrayList, Integer.valueOf(i11));
        int i12 = iC < 0 ? -(iC + 1) : iC + 1;
        if (z11 && i12 > 0) {
            int i13 = i12 - 1;
            if (i11 == ((Number) arrayList.get(i13)).intValue()) {
                return i13;
            }
        }
        return i12;
    }

    public int r(int i11) {
        if (i11 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f518b).get(i11 - 1)).intValue();
    }

    @Override // u8.d
    public int s() {
        return ((long[]) this.f518b).length;
    }

    public int t(int i11, int i12) {
        while (i11 > i12) {
            char cCharAt = ((Layout) this.f517a).getText().charAt(i11 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((kotlin.jvm.internal.m.h(cCharAt, OSSConstants.DEFAULT_BUFFER_SIZE) < 0 || kotlin.jvm.internal.m.h(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i11;
            }
            i11--;
        }
        return i11;
    }

    public void u(List list, boolean z11) throws DefinitionOverrideException {
        LinkedHashSet linkedHashSet;
        Object next;
        LinkedHashSet<x10.a> linkedHashSet2 = new LinkedHashSet();
        ry.k kVar = new ry.k(ry.m.f0(list));
        while (!kVar.isEmpty()) {
            x10.a aVar = (x10.a) kVar.removeLast();
            if (linkedHashSet2.add(aVar)) {
                ArrayList arrayList = aVar.f55751e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    x10.a aVar2 = (x10.a) obj;
                    if (!linkedHashSet2.contains(aVar2)) {
                        kVar.addLast(aVar2);
                    }
                }
            }
        }
        m mVar = (m) this.f520d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) mVar.f44828d;
        for (x10.a aVar3 : linkedHashSet2) {
            for (Map.Entry entry : aVar3.f55749c.entrySet()) {
                String mapping = (String) entry.getKey();
                v10.b factory = (v10.b) entry.getValue();
                i iVar = (i) mVar.f44826b;
                kotlin.jvm.internal.m.f(mapping, "mapping");
                kotlin.jvm.internal.m.f(factory, "factory");
                u10.a aVar4 = factory.f53471a;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) mVar.f44827c;
                if (((v10.b) concurrentHashMap2.get(mapping)) == null) {
                    linkedHashSet = linkedHashSet2;
                } else {
                    if (!z11) {
                        String msg = "Already existing definition for " + aVar4 + " at " + mapping;
                        kotlin.jvm.internal.m.f(msg, "msg");
                        throw new DefinitionOverrideException(msg);
                    }
                    h2 h2Var = (h2) iVar.f517a;
                    linkedHashSet = linkedHashSet2;
                    String msg2 = "(+) override index '" + mapping + "' -> '" + aVar4 + '\'';
                    h2Var.getClass();
                    kotlin.jvm.internal.m.f(msg2, "msg");
                    h2Var.h0(w10.a.WARNING, msg2);
                    Iterator it = concurrentHashMap.values().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((v10.d) next).f53471a.equals(aVar4));
                    if (((v10.d) next) != null) {
                        concurrentHashMap.remove(Integer.valueOf(aVar4.hashCode()));
                    }
                }
                ((h2) iVar.f517a).V("(+) index '" + mapping + "' -> '" + aVar4 + '\'');
                concurrentHashMap2.put(mapping, factory);
                linkedHashSet2 = linkedHashSet;
            }
            LinkedHashSet linkedHashSet3 = linkedHashSet2;
            for (v10.d dVar : aVar3.f55748b) {
                concurrentHashMap.put(Integer.valueOf(dVar.f53471a.hashCode()), dVar);
            }
            linkedHashSet2 = linkedHashSet3;
        }
        LinkedHashSet linkedHashSet4 = linkedHashSet2;
        c20.b bVar = (c20.b) this.f519c;
        bVar.getClass();
        Iterator it2 = linkedHashSet4.iterator();
        while (it2.hasNext()) {
            bVar.f6513b.addAll(((x10.a) it2.next()).f55750d);
        }
    }

    public void v(String str) {
        this.f517a = null;
        this.f518b = str;
        w();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    public void w() {
        bq.d dVar;
        if (((MediaPlayer) this.f519c) == null) {
            k();
        }
        try {
            try {
                y();
                ((MediaPlayer) this.f519c).reset();
                try {
                    x();
                } catch (IllegalStateException unused) {
                    ((MediaPlayer) this.f519c).reset();
                    ((MediaPlayer) this.f519c).release();
                    k();
                    x();
                }
                MediaPlayer mediaPlayer = (MediaPlayer) this.f519c;
                mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setPitch(1.0f));
                ((MediaPlayer) this.f519c).prepare();
                ((MediaPlayer) this.f519c).start();
            } catch (IllegalStateException e8) {
                e = e8;
                e.printStackTrace();
                dVar = (bq.d) this.f520d;
                if (dVar != null) {
                    dVar.k(1);
                }
                ((MediaPlayer) this.f519c).reset();
                ((MediaPlayer) this.f519c).release();
                k();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            bq.d dVar2 = (bq.d) this.f520d;
            if (dVar2 != null) {
                dVar2.k(1);
            }
        } catch (SecurityException e11) {
            e = e11;
            e.printStackTrace();
            dVar = (bq.d) this.f520d;
            if (dVar != null) {
                dVar.k(1);
            }
            ((MediaPlayer) this.f519c).reset();
            ((MediaPlayer) this.f519c).release();
            k();
        }
    }

    public void x() throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) this.f517a;
        if (assetFileDescriptor != null) {
            ((MediaPlayer) this.f519c).setDataSource(assetFileDescriptor.getFileDescriptor(), ((AssetFileDescriptor) this.f517a).getStartOffset(), ((AssetFileDescriptor) this.f517a).getLength());
            ((AssetFileDescriptor) this.f517a).close();
        } else {
            String str = (String) this.f518b;
            if (str != null) {
                ((MediaPlayer) this.f519c).setDataSource(str);
            }
        }
    }

    public void y() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f519c;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        ((MediaPlayer) this.f519c).stop();
    }

    public void z(s8 key, fz.c cVar) {
        kotlin.jvm.internal.m.f(key, "key");
        synchronized (this.f520d) {
            ((LinkedHashMap) this.f519c).remove(key);
            ((LinkedHashMap) this.f519c).put(key, cVar);
        }
        ((tz.h) this.f521e).i(qy.b0.f48488a);
    }

    public i(int i11) {
        switch (i11) {
            case 10:
                this.f517a = new p10.b(w10.a.NONE, 1);
                this.f518b = new ob.c(this);
                this.f519c = new c20.b(this);
                this.f520d = new m(this);
                new ConcurrentHashMap();
                new HashMap();
                this.f521e = new c20.a(0);
                break;
            case 11:
            default:
                this.f517a = null;
                this.f518b = null;
                this.f519c = null;
                this.f520d = null;
                this.f521e = null;
                break;
            case 12:
                this.f517a = new Object();
                this.f519c = new t1.a(0);
                this.f520d = new e0();
                this.f521e = new e0();
                break;
        }
    }

    public i(c cVar, HashMap map, HashMap map2, HashMap map3) {
        this.f517a = cVar;
        this.f520d = map2;
        this.f521e = map3;
        this.f519c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i11 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        this.f518b = jArr;
    }

    public i(j3.h hVar, y0 y0Var, List list, v3.c cVar, n3.h hVar2) {
        int i11;
        String strSubstring;
        j3.h hVar3 = hVar;
        y0 y0Var2 = y0Var;
        this.f517a = hVar3;
        this.f518b = list;
        qy.j jVar = qy.j.NONE;
        final int i12 = 0;
        this.f519c = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: j3.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a9.i f35825b;

            {
                this.f35825b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i12) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.f35825b.f521e;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fB = ((a0) obj3).f35657a.b();
                            int iA = ns.o.A(arrayList);
                            int i13 = 1;
                            if (1 <= iA) {
                                while (true) {
                                    Object obj4 = arrayList.get(i13);
                                    float fB2 = ((a0) obj4).f35657a.b();
                                    if (Float.compare(fB, fB2) < 0) {
                                        obj3 = obj4;
                                        fB = fB2;
                                    }
                                    if (i13 != iA) {
                                        i13++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        a0 a0Var = (a0) obj;
                        return Float.valueOf(a0Var != null ? a0Var.f35657a.b() : CropImageView.DEFAULT_ASPECT_RATIO);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.f35825b.f521e;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC = ((a0) obj5).f35657a.K.c();
                            int iA2 = ns.o.A(arrayList2);
                            int i14 = 1;
                            if (1 <= iA2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i14);
                                    float fC2 = ((a0) obj6).f35657a.K.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i14 != iA2) {
                                        i14++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        a0 a0Var2 = (a0) obj2;
                        return Float.valueOf(a0Var2 != null ? a0Var2.f35657a.K.c() : CropImageView.DEFAULT_ASPECT_RATIO);
                }
            }
        });
        final int i13 = 1;
        this.f520d = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: j3.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a9.i f35825b;

            {
                this.f35825b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.f35825b.f521e;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fB = ((a0) obj3).f35657a.b();
                            int iA = ns.o.A(arrayList);
                            int i14 = 1;
                            if (1 <= iA) {
                                while (true) {
                                    Object obj4 = arrayList.get(i14);
                                    float fB2 = ((a0) obj4).f35657a.b();
                                    if (Float.compare(fB, fB2) < 0) {
                                        obj3 = obj4;
                                        fB = fB2;
                                    }
                                    if (i14 != iA) {
                                        i14++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        a0 a0Var = (a0) obj;
                        return Float.valueOf(a0Var != null ? a0Var.f35657a.b() : CropImageView.DEFAULT_ASPECT_RATIO);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.f35825b.f521e;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC = ((a0) obj5).f35657a.K.c();
                            int iA2 = ns.o.A(arrayList2);
                            int i15 = 1;
                            if (1 <= iA2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i15);
                                    float fC2 = ((a0) obj6).f35657a.K.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i15 != iA2) {
                                        i15++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        a0 a0Var2 = (a0) obj2;
                        return Float.valueOf(a0Var2 != null ? a0Var2.f35657a.K.c() : CropImageView.DEFAULT_ASPECT_RATIO);
                }
            }
        });
        c0 c0Var = y0Var2.f35828b;
        j3.h hVar4 = j3.i.f35705a;
        ArrayList arrayList = hVar3.f35702d;
        String str = hVar3.f35700b;
        r rVar = r.f50854a;
        List listS0 = arrayList != null ? ry.m.S0(arrayList, new j3.g(i13)) : rVar;
        ArrayList arrayList2 = new ArrayList();
        ry.k kVar = new ry.k();
        int size = listS0.size();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            j3.f fVar = (j3.f) listS0.get(i14);
            j3.f fVarA = j3.f.a(fVar, c0Var.a((c0) fVar.f35689a), i12, 14);
            Object obj = fVarA.f35689a;
            int i16 = fVarA.f35691c;
            int i17 = fVarA.f35690b;
            while (i15 < i17 && !kVar.isEmpty()) {
                j3.f fVar2 = (j3.f) kVar.last();
                listS0 = listS0;
                int i18 = fVar2.f35691c;
                rVar = rVar;
                Object obj2 = fVar2.f35689a;
                if (i17 < i18) {
                    arrayList2.add(new j3.f(obj2, i15, i17));
                    i15 = i17;
                } else {
                    int i19 = size;
                    arrayList2.add(new j3.f(obj2, i15, i18));
                    i15 = fVar2.f35691c;
                    while (!kVar.isEmpty() && i15 == ((j3.f) kVar.last()).f35691c) {
                        kVar.removeLast();
                    }
                    size = i19;
                }
            }
            List list2 = listS0;
            r rVar2 = rVar;
            int i21 = size;
            if (i15 < i17) {
                arrayList2.add(new j3.f(c0Var, i15, i17));
                i15 = i17;
            }
            j3.f fVar3 = (j3.f) kVar.j();
            if (fVar3 != null) {
                int i22 = fVar3.f35691c;
                Object obj3 = fVar3.f35689a;
                int i23 = fVar3.f35690b;
                if (i23 == i17 && i22 == i16) {
                    kVar.removeLast();
                    kVar.addLast(new j3.f(((c0) obj3).a((c0) obj), i17, i16));
                } else if (i23 == i22) {
                    arrayList2.add(new j3.f(obj3, i23, i22));
                    kVar.removeLast();
                    kVar.addLast(new j3.f(obj, i17, i16));
                } else if (i22 >= i16) {
                    kVar.addLast(new j3.f(((c0) obj3).a((c0) obj), i17, i16));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                kVar.addLast(new j3.f(obj, i17, i16));
            }
            i14++;
            listS0 = list2;
            rVar = rVar2;
            size = i21;
            i12 = 0;
        }
        r rVar3 = rVar;
        while (i15 <= str.length() && !kVar.isEmpty()) {
            j3.f fVar4 = (j3.f) kVar.last();
            Object obj4 = fVar4.f35689a;
            int i24 = fVar4.f35691c;
            arrayList2.add(new j3.f(obj4, i15, i24));
            while (!kVar.isEmpty() && i24 == ((j3.f) kVar.last()).f35691c) {
                kVar.removeLast();
            }
            i15 = i24;
        }
        if (i15 < str.length()) {
            arrayList2.add(new j3.f(c0Var, i15, str.length()));
        }
        if (arrayList2.isEmpty()) {
            i11 = 0;
            arrayList2.add(new j3.f(c0Var, 0, 0));
        } else {
            i11 = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i25 = i11;
        while (i25 < size2) {
            j3.f fVar5 = (j3.f) arrayList2.get(i25);
            int i26 = fVar5.f35690b;
            int i27 = fVar5.f35691c;
            if (i26 != i27) {
                strSubstring = str.substring(i26, i27);
                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
            } else {
                strSubstring = BuildConfig.VERSION_NAME;
            }
            List listA = j3.i.a(hVar3, i26, i27, new in.c(17));
            j3.h hVar5 = new j3.h(strSubstring, listA == null ? rVar3 : listA);
            c0 c0Var2 = (c0) fVar5.f35689a;
            if (c0Var2.f35669b == 0) {
                c0Var2 = new c0(c0Var2.f35668a, c0Var.f35669b, c0Var2.f35670c, c0Var2.f35671d, c0Var2.f35672e, c0Var2.f35673f, c0Var2.f35674g, c0Var2.f35675h, c0Var2.f35676i);
            }
            y0 y0Var3 = new y0(y0Var2.f35827a, c0Var.a(c0Var2));
            List list3 = hVar5.f35699a;
            List list4 = list3 == null ? rVar3 : list3;
            List list5 = (List) this.f518b;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i28 = 0;
            while (i28 < size3) {
                j3.f fVar6 = (j3.f) list5.get(i28);
                int i29 = fVar6.f35690b;
                c0 c0Var3 = c0Var;
                int i30 = fVar6.f35691c;
                if (j3.i.b(i26, i27, i29, i30)) {
                    if (i26 > i29 || i30 > i27) {
                        p3.a.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new j3.f(fVar6.f35689a, i29 - i26, i30 - i26));
                }
                i28++;
                list5 = list5;
                c0Var = c0Var3;
            }
            arrayList3.add(new a0(new r3.c(strSubstring, y0Var3, list4, arrayList4, hVar2, cVar), i26, i27));
            i25++;
            hVar3 = hVar;
            y0Var2 = y0Var;
            str = str;
            arrayList2 = arrayList2;
        }
        this.f521e = arrayList3;
    }
}

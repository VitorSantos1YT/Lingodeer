package bp;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.http.object.NewsFeed;
import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.ui.base.NewsFeedActivity;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetReceiver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(int i11, Object obj, vy.d dVar, int i12) {
        super(2, dVar);
        this.f4819a = i12;
        this.f4821c = i11;
        this.f4823e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    private final Object e(Object obj) throws IOException {
        Integer numE;
        String strF;
        rs.f fVar = (rs.f) this.f4823e;
        uz.j jVar = (uz.j) this.f4822d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f4820b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            h00.m mVarD = fVar.f49406c;
            if (mVarD == null) {
                h00.s sVar = xt.c.f56291a;
                InputStream inputStreamOpen = fVar.f49404a.getAssets().open("story_user_counts.json");
                kotlin.jvm.internal.m.e(inputStreamOpen, "open(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, oz.a.f46133a), OSSConstants.DEFAULT_BUFFER_SIZE);
                try {
                    String strI = ob.f.I(bufferedReader);
                    bufferedReader.close();
                    mVarD = sVar.d(strI);
                    fVar.f49406c = mVarD;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ns.o.m(bufferedReader, th2);
                        throw th3;
                    }
                }
            }
            h00.m mVar = (h00.m) h00.n.g(mVarD).get(xt.d.k(((fr.o0) fVar.f49405b).f27733a.keyLanguage));
            if (mVar != null) {
                h00.m mVar2 = (h00.m) h00.n.g(mVar).get("unit_" + this.f4821c);
                if (mVar2 != null) {
                    numE = h00.n.e(h00.n.h(mVar2));
                } else {
                    numE = null;
                }
            } else {
                numE = null;
            }
            if (numE == null || (strF = w4.c.f(Math.max(1000, numE.intValue()) / 1000, "K")) == null) {
                strF = "1K";
            }
            this.f4822d = null;
            this.f4820b = 1;
            if (jVar.emit(strF, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:106:0x02df  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:111:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:113:0x0302  */
    /* JADX WARN: Code duplicated, block: B:114:0x0305  */
    /* JADX WARN: Code duplicated, block: B:116:0x030d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0312  */
    /* JADX WARN: Code duplicated, block: B:127:0x0337  */
    /* JADX WARN: Code duplicated, block: B:128:0x033e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0360  */
    /* JADX WARN: Code duplicated, block: B:140:0x037f  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:154:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:166:0x03e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:170:0x0414  */
    /* JADX WARN: Code duplicated, block: B:177:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d0 A[LOOP:1: B:29:0x00ce->B:30:0x00d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x0118  */
    /* JADX WARN: Code duplicated, block: B:41:0x011f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0132  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    /* JADX WARN: Code duplicated, block: B:56:0x0169  */
    /* JADX WARN: Code duplicated, block: B:59:0x0172  */
    /* JADX WARN: Code duplicated, block: B:62:0x0186 A[LOOP:4: B:61:0x0184->B:62:0x0186, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x021c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0234  */
    /* JADX WARN: Code duplicated, block: B:72:0x0236  */
    /* JADX WARN: Code duplicated, block: B:74:0x023d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0278  */
    /* JADX WARN: Code duplicated, block: B:89:0x0285  */
    /* JADX WARN: Code duplicated, block: B:90:0x028a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0297  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b7  */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0423, code lost:
    
        if (((fr.o0) r2).T(r13, r6, r36) == r3) goto L172;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.t3.j(java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f4820b;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        vt.n0 n0Var = ((rt.r5) this.f4822d).f50336e;
        int i12 = this.f4821c;
        rt.x4 x4Var = (rt.x4) this.f4823e;
        kotlin.jvm.internal.m.f(x4Var, "<this>");
        String strJ = nv.p.j(x4Var.f50624a.ordinal(), "playbackMode=");
        String strJ2 = nv.p.j(x4Var.f50628e.ordinal(), "sleepTimer=");
        String str = "showNativeTranslation=" + x4Var.f50629f;
        rt.s4 s4Var = x4Var.f50630g;
        String strJ3 = nv.p.j(s4Var.ordinal(), "playbackOrder=");
        String strY0 = ry.m.y0(ns.o.L(strJ, strJ2, str, strJ3, "randomOrder=" + (s4Var == rt.s4.SHUFFLE), "loop=" + x4Var.f50631h, "audioSpeed=" + x4Var.f50632i, nv.p.j(x4Var.f50633j, "playsPerItem="), "pauseBetweenRepetitionsSeconds=" + x4Var.f50634k, "pauseBetweenItemsSeconds=" + x4Var.f50635l), "|", null, null, null, 62);
        this.f4820b = 1;
        fr.o0 o0Var = (fr.o0) n0Var;
        o0Var.getClass();
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new e6.q0(o0Var, i12, strY0, null, 16), this);
        if (objM != aVar) {
            objM = b0Var;
        }
        return objM == aVar ? aVar : b0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4819a) {
            case 0:
                return new t3((NewsFeedActivity) this.f4822d, (NewsFeed) this.f4823e, this.f4821c, dVar, 0);
            case 1:
                return new t3(this.f4821c, (ArrayList) this.f4822d, (UpdateLessonActivity) this.f4823e, dVar);
            case 2:
                return new t3((vt.n0) this.f4822d, this.f4821c, (l1.a1) this.f4823e, dVar, 2);
            case 3:
                return new t3((DayStreakWidgetReceiver) this.f4822d, (Context) this.f4823e, this.f4821c, dVar, 3);
            case 4:
                return new t3((ep.c) this.f4822d, this.f4821c, (ArrayList) this.f4823e, dVar, 4);
            case 5:
                t3 t3Var = new t3(this.f4821c, (fr.i3) this.f4823e, dVar, 5);
                t3Var.f4822d = obj;
                return t3Var;
            case 6:
                return new t3((gi.d) this.f4822d, (ARChar) this.f4823e, this.f4820b, this.f4821c, dVar, 6);
            case 7:
                return new t3((gp.w) this.f4822d, (fz.a) this.f4823e, dVar, 7);
            case 8:
                return new t3((gp.w) this.f4822d, (gq.v) this.f4823e, dVar, 8);
            case 9:
                return new t3((gq.u) this.f4822d, (gq.w) this.f4823e, this.f4821c, dVar, 9);
            case 10:
                t3 t3Var2 = new t3((gq.u) this.f4823e, this.f4821c, dVar, 10);
                t3Var2.f4822d = obj;
                return t3Var2;
            case 11:
                return new t3((List) this.f4822d, (String) this.f4823e, this.f4820b, this.f4821c, dVar, 11);
            case 12:
                return new t3((List) this.f4823e, dVar, 12);
            case 13:
                return new t3((Boolean) this.f4822d, this.f4821c, (nu.e) this.f4823e, dVar, 13);
            case 14:
                t3 t3Var3 = new t3(this.f4821c, (nu.e) this.f4823e, dVar, 14);
                t3Var3.f4822d = obj;
                return t3Var3;
            case 15:
                t3 t3Var4 = new t3((rs.f) this.f4823e, this.f4821c, dVar, 15);
                t3Var4.f4822d = obj;
                return t3Var4;
            case 16:
                return new t3((rt.r5) this.f4823e, dVar, 16);
            case 17:
                return new t3((rt.r5) this.f4822d, this.f4821c, (rt.x4) this.f4823e, dVar, 17);
            case 18:
                return new t3((rt.r5) this.f4822d, this.f4821c, (Set) this.f4823e, dVar, 18);
            default:
                return new t3((ReviewNew) this.f4822d, (vp.d) this.f4823e, this.f4821c, dVar, 19);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4819a) {
            case 0:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                t3 t3Var = (t3) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                t3Var.invokeSuspend(b0Var);
                return b0Var;
            case 7:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((t3) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((t3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0260 A[LOOP:3: B:100:0x025a->B:102:0x0260, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x028b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0295  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:123:0x030a A[LOOP:6: B:122:0x0308->B:123:0x030a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x0344 A[LOOP:7: B:125:0x0342->B:126:0x0344, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x0384  */
    /* JADX WARN: Code duplicated, block: B:132:0x0394  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:147:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:149:0x03df  */
    /* JADX WARN: Code duplicated, block: B:151:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:154:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:161:0x043e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0449  */
    /* JADX WARN: Code duplicated, block: B:166:0x0456  */
    /* JADX WARN: Code duplicated, block: B:167:0x0458  */
    /* JADX WARN: Code duplicated, block: B:169:0x046a  */
    /* JADX WARN: Code duplicated, block: B:171:0x046d  */
    /* JADX WARN: Code duplicated, block: B:173:0x047a  */
    /* JADX WARN: Code duplicated, block: B:174:0x047c  */
    /* JADX WARN: Code duplicated, block: B:176:0x048d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x048f  */
    /* JADX WARN: Code duplicated, block: B:179:0x049c  */
    /* JADX WARN: Code duplicated, block: B:180:0x049e  */
    /* JADX WARN: Code duplicated, block: B:182:0x04af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:185:0x04be  */
    /* JADX WARN: Code duplicated, block: B:186:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:188:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:197:0x0504 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x0506 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:199:0x0508  */
    /* JADX WARN: Code duplicated, block: B:201:0x050d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x050f  */
    /* JADX WARN: Code duplicated, block: B:203:0x0512  */
    /* JADX WARN: Code duplicated, block: B:204:0x0515 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x0517  */
    /* JADX WARN: Code duplicated, block: B:206:0x051a  */
    /* JADX WARN: Code duplicated, block: B:207:0x051d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0545  */
    /* JADX WARN: Code duplicated, block: B:212:0x054a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x054c  */
    /* JADX WARN: Code duplicated, block: B:214:0x054f  */
    /* JADX WARN: Code duplicated, block: B:217:0x056e A[LOOP:9: B:216:0x056c->B:217:0x056e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:221:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:280:0x072a  */
    /* JADX WARN: Code duplicated, block: B:281:0x072e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0739  */
    /* JADX WARN: Code duplicated, block: B:286:0x0748  */
    /* JADX WARN: Code duplicated, block: B:291:0x076f  */
    /* JADX WARN: Code duplicated, block: B:294:0x0773  */
    /* JADX WARN: Code duplicated, block: B:341:0x0859 A[PHI: r8
      0x0859: PHI (r8v13 int) = (r8v11 int), (r8v14 int) binds: [B:339:0x0855, B:330:0x0815] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:344:0x0867 A[PHI: r8
      0x0867: PHI (r8v15 int) = (r8v13 int), (r8v16 int) binds: [B:342:0x0864, B:329:0x080f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:346:0x0871  */
    /* JADX WARN: Code duplicated, block: B:349:0x0881  */
    /* JADX WARN: Code duplicated, block: B:353:0x088f A[PHI: r1
      0x088f: PHI (r1v38 int) = (r1v36 int), (r1v39 int) binds: [B:351:0x088c, B:327:0x0801] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:357:0x08a3 A[Catch: Exception -> 0x07ec, CancellationException -> 0x07ef, TRY_ENTER, TryCatch #4 {CancellationException -> 0x07ef, Exception -> 0x07ec, blocks: (B:317:0x07e5, B:363:0x08cb, B:365:0x08d3, B:366:0x08d9, B:324:0x07f4, B:360:0x08b1, B:357:0x08a3), top: B:486:0x07dc }] */
    /* JADX WARN: Code duplicated, block: B:359:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:360:0x08b1 A[Catch: Exception -> 0x07ec, CancellationException -> 0x07ef, PHI: r3 r8
      0x08b1: PHI (r3v35 java.lang.Object) = (r3v34 java.lang.Object), (r3v39 java.lang.Object) binds: [B:358:0x08ae, B:325:0x07f7] A[DONT_GENERATE, DONT_INLINE]
      0x08b1: PHI (r8v17 int) = (r8v15 int), (r8v18 int) binds: [B:358:0x08ae, B:325:0x07f7] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {CancellationException -> 0x07ef, Exception -> 0x07ec, blocks: (B:317:0x07e5, B:363:0x08cb, B:365:0x08d3, B:366:0x08d9, B:324:0x07f4, B:360:0x08b1, B:357:0x08a3), top: B:486:0x07dc }] */
    /* JADX WARN: Code duplicated, block: B:447:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:459:0x0b0e  */
    /* JADX WARN: Code duplicated, block: B:500:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x041f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x0409 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x05c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x023c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0241  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, qy.h] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v24 java.lang.Object, still in use, count: 2, list:
          (r7v24 java.lang.Object) from 0x0238: PHI (r7 I:??) = (r7v16 java.lang.Object), (r7v24 java.lang.Object) binds: [B:94:0x0237, B:497:0x0238] A[DONT_GENERATE, DONT_INLINE]
          (r7v24 java.lang.Object) from 0x022a: CHECK_CAST (com.lingodeer.data.model.DailyStreakHistory) (r7v24 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 3120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.t3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(int i11, ArrayList arrayList, UpdateLessonActivity updateLessonActivity, vy.d dVar) {
        super(2, dVar);
        this.f4819a = 1;
        this.f4821c = i11;
        this.f4822d = arrayList;
        this.f4823e = updateLessonActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(gp.w wVar, Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4819a = i11;
        this.f4822d = wVar;
        this.f4823e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, int i11, Object obj2, vy.d dVar, int i12) {
        super(2, dVar);
        this.f4819a = i12;
        this.f4822d = obj;
        this.f4821c = i11;
        this.f4823e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f4819a = i12;
        this.f4823e = obj;
        this.f4821c = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, Object obj2, int i11, int i12, vy.d dVar, int i13) {
        super(2, dVar);
        this.f4819a = i13;
        this.f4822d = obj;
        this.f4823e = obj2;
        this.f4820b = i11;
        this.f4821c = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, Object obj2, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f4819a = i12;
        this.f4822d = obj;
        this.f4823e = obj2;
        this.f4821c = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4819a = i11;
        this.f4823e = obj;
    }
}

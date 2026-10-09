package v7;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import b7.f0;
import com.google.api.Service;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.DescriptorProtos;
import com.lingodeer.data.model.AchievementLevelType;
import com.stkouyu.util.httputil.Consts;
import com.yalantis.ucrop.UCrop;
import com.yalantis.ucrop.view.CropImageView;
import dt.Xk.wuoM;
import f7.e1;
import f7.g1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import y6.m0;
import y6.o0;
import y6.y0;
import y6.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends m7.p {
    public static final int[] X1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean Y1;
    public static boolean Z1;
    public boolean A1;
    public int B1;
    public int C1;
    public long D1;
    public int E1;
    public int F1;
    public int G1;
    public g1 H1;
    public boolean I1;
    public long J1;
    public int K1;
    public long L1;
    public z0 M1;
    public z0 N1;
    public int O1;
    public boolean P1;
    public int Q1;
    public i R1;
    public t S1;
    public long T1;
    public long U1;
    public boolean V1;
    public int W1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final Context f53622h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final boolean f53623i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final qp.r f53624j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final int f53625k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final boolean f53626l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final u f53627m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final i9.f f53628n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final long f53629o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final PriorityQueue f53630p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public c7.j f53631q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public boolean f53632r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public boolean f53633s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public d0 f53634t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f53635u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public int f53636v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public List f53637w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public Surface f53638x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public l f53639y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public b7.x f53640z1;

    public j(h hVar) {
        super(2, hVar.f53615c, 30.0f);
        Context applicationContext = hVar.f53613a.getApplicationContext();
        this.f53622h1 = applicationContext;
        this.f53625k1 = hVar.f53619g;
        this.f53634t1 = null;
        this.f53624j1 = new qp.r(hVar.f53617e, hVar.f53618f);
        this.f53623i1 = this.f53634t1 == null;
        this.f53627m1 = new u(applicationContext, this, hVar.f53616d);
        this.f53628n1 = new i9.f();
        this.f53626l1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f53640z1 = b7.x.f4042c;
        this.B1 = 1;
        this.C1 = 0;
        this.M1 = z0.f57406d;
        this.Q1 = 0;
        this.N1 = null;
        this.O1 = -1000;
        this.T1 = -9223372036854775807L;
        this.U1 = -9223372036854775807L;
        this.f53630p1 = new PriorityQueue();
        this.f53629o1 = -9223372036854775807L;
        this.H1 = null;
    }

    public static int B0(m7.n nVar, y6.p pVar) {
        int i11 = pVar.f57292o;
        List list = pVar.f57294q;
        if (i11 == -1) {
            return z0(nVar, pVar);
        }
        int size = list.size();
        int length = 0;
        for (int i12 = 0; i12 < size; i12++) {
            length += ((byte[]) list.get(i12)).length;
        }
        return pVar.f57292o + length;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0208  */
    /* JADX WARN: Code duplicated, block: B:170:0x020c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0216  */
    /* JADX WARN: Code duplicated, block: B:174:0x021a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0224  */
    /* JADX WARN: Code duplicated, block: B:178:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x0236  */
    /* JADX WARN: Code duplicated, block: B:185:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x0244  */
    /* JADX WARN: Code duplicated, block: B:189:0x024e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0252  */
    /* JADX WARN: Code duplicated, block: B:193:0x025c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0260  */
    /* JADX WARN: Code duplicated, block: B:197:0x026a  */
    /* JADX WARN: Code duplicated, block: B:198:0x026e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0278  */
    /* JADX WARN: Code duplicated, block: B:202:0x027c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0286  */
    /* JADX WARN: Code duplicated, block: B:206:0x028a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0294  */
    /* JADX WARN: Code duplicated, block: B:210:0x0298  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02be  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02da  */
    /* JADX WARN: Code duplicated, block: B:230:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:241:0x0304  */
    /* JADX WARN: Code duplicated, block: B:242:0x0308  */
    /* JADX WARN: Code duplicated, block: B:245:0x0312  */
    /* JADX WARN: Code duplicated, block: B:246:0x0316  */
    /* JADX WARN: Code duplicated, block: B:249:0x0320  */
    /* JADX WARN: Code duplicated, block: B:250:0x0324  */
    /* JADX WARN: Code duplicated, block: B:253:0x032e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0332  */
    /* JADX WARN: Code duplicated, block: B:257:0x033c  */
    /* JADX WARN: Code duplicated, block: B:258:0x0340  */
    /* JADX WARN: Code duplicated, block: B:261:0x034a  */
    /* JADX WARN: Code duplicated, block: B:262:0x034e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0358  */
    /* JADX WARN: Code duplicated, block: B:266:0x035c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0366  */
    /* JADX WARN: Code duplicated, block: B:270:0x036a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0374  */
    /* JADX WARN: Code duplicated, block: B:274:0x0378  */
    /* JADX WARN: Code duplicated, block: B:277:0x0382  */
    /* JADX WARN: Code duplicated, block: B:278:0x0386  */
    /* JADX WARN: Code duplicated, block: B:281:0x0390  */
    /* JADX WARN: Code duplicated, block: B:282:0x0394  */
    /* JADX WARN: Code duplicated, block: B:285:0x039e  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:294:0x03be  */
    /* JADX WARN: Code duplicated, block: B:297:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:302:0x03da  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:313:0x0400  */
    /* JADX WARN: Code duplicated, block: B:314:0x0404  */
    /* JADX WARN: Code duplicated, block: B:317:0x040e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0412  */
    /* JADX WARN: Code duplicated, block: B:321:0x041c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0420  */
    /* JADX WARN: Code duplicated, block: B:325:0x042a  */
    /* JADX WARN: Code duplicated, block: B:326:0x042e  */
    /* JADX WARN: Code duplicated, block: B:329:0x0438  */
    /* JADX WARN: Code duplicated, block: B:330:0x043c  */
    /* JADX WARN: Code duplicated, block: B:333:0x0446  */
    /* JADX WARN: Code duplicated, block: B:334:0x044a  */
    /* JADX WARN: Code duplicated, block: B:337:0x0454  */
    /* JADX WARN: Code duplicated, block: B:338:0x0458  */
    /* JADX WARN: Code duplicated, block: B:341:0x0462  */
    /* JADX WARN: Code duplicated, block: B:342:0x0466  */
    /* JADX WARN: Code duplicated, block: B:345:0x0470  */
    /* JADX WARN: Code duplicated, block: B:346:0x0474  */
    /* JADX WARN: Code duplicated, block: B:349:0x047e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0482  */
    /* JADX WARN: Code duplicated, block: B:353:0x048c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0490  */
    /* JADX WARN: Code duplicated, block: B:357:0x049a  */
    /* JADX WARN: Code duplicated, block: B:358:0x049e  */
    /* JADX WARN: Code duplicated, block: B:361:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:366:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:370:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:381:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:386:0x0500  */
    /* JADX WARN: Code duplicated, block: B:389:0x050a  */
    /* JADX WARN: Code duplicated, block: B:390:0x050e  */
    /* JADX WARN: Code duplicated, block: B:393:0x0518  */
    /* JADX WARN: Code duplicated, block: B:394:0x051c  */
    /* JADX WARN: Code duplicated, block: B:397:0x0526  */
    /* JADX WARN: Code duplicated, block: B:398:0x052a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0534  */
    /* JADX WARN: Code duplicated, block: B:402:0x0538  */
    /* JADX WARN: Code duplicated, block: B:405:0x0542  */
    /* JADX WARN: Code duplicated, block: B:406:0x0546  */
    /* JADX WARN: Code duplicated, block: B:409:0x0550  */
    /* JADX WARN: Code duplicated, block: B:410:0x0554  */
    /* JADX WARN: Code duplicated, block: B:413:0x055e  */
    /* JADX WARN: Code duplicated, block: B:414:0x0562  */
    /* JADX WARN: Code duplicated, block: B:417:0x056c  */
    /* JADX WARN: Code duplicated, block: B:418:0x0570  */
    /* JADX WARN: Code duplicated, block: B:421:0x057a  */
    /* JADX WARN: Code duplicated, block: B:422:0x057e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0588  */
    /* JADX WARN: Code duplicated, block: B:426:0x058c  */
    /* JADX WARN: Code duplicated, block: B:429:0x0596  */
    /* JADX WARN: Code duplicated, block: B:430:0x059a  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:434:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:445:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:449:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:454:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:457:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:461:0x0606  */
    /* JADX WARN: Code duplicated, block: B:462:0x060a  */
    /* JADX WARN: Code duplicated, block: B:465:0x0614  */
    /* JADX WARN: Code duplicated, block: B:466:0x0618  */
    /* JADX WARN: Code duplicated, block: B:469:0x0622  */
    /* JADX WARN: Code duplicated, block: B:470:0x0626  */
    /* JADX WARN: Code duplicated, block: B:473:0x0630  */
    /* JADX WARN: Code duplicated, block: B:474:0x0634  */
    /* JADX WARN: Code duplicated, block: B:477:0x063e  */
    /* JADX WARN: Code duplicated, block: B:478:0x0642  */
    /* JADX WARN: Code duplicated, block: B:481:0x064c  */
    /* JADX WARN: Code duplicated, block: B:482:0x0650  */
    /* JADX WARN: Code duplicated, block: B:485:0x065a  */
    /* JADX WARN: Code duplicated, block: B:486:0x065e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0668  */
    /* JADX WARN: Code duplicated, block: B:490:0x066c  */
    /* JADX WARN: Code duplicated, block: B:493:0x0676  */
    /* JADX WARN: Code duplicated, block: B:494:0x067a  */
    /* JADX WARN: Code duplicated, block: B:497:0x0684  */
    /* JADX WARN: Code duplicated, block: B:498:0x0688  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0692  */
    /* JADX WARN: Code duplicated, block: B:502:0x0696  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:509:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:513:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:517:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:518:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:521:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:522:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:530:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:533:0x0702  */
    /* JADX WARN: Code duplicated, block: B:534:0x0706  */
    /* JADX WARN: Code duplicated, block: B:537:0x0710  */
    /* JADX WARN: Code duplicated, block: B:538:0x0714  */
    /* JADX WARN: Code duplicated, block: B:541:0x071e  */
    /* JADX WARN: Code duplicated, block: B:542:0x0722  */
    /* JADX WARN: Code duplicated, block: B:545:0x072c  */
    /* JADX WARN: Code duplicated, block: B:546:0x0730  */
    /* JADX WARN: Code duplicated, block: B:549:0x073a  */
    /* JADX WARN: Code duplicated, block: B:552:0x0744  */
    /* JADX WARN: Code duplicated, block: B:553:0x0747  */
    /* JADX WARN: Code duplicated, block: B:556:0x0751  */
    /* JADX WARN: Code duplicated, block: B:557:0x0754  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[Catch: all -> 0x08be, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x075e  */
    /* JADX WARN: Code duplicated, block: B:561:0x0762  */
    /* JADX WARN: Code duplicated, block: B:564:0x076c  */
    /* JADX WARN: Code duplicated, block: B:565:0x0770  */
    /* JADX WARN: Code duplicated, block: B:568:0x077a  */
    /* JADX WARN: Code duplicated, block: B:569:0x077e  */
    /* JADX WARN: Code duplicated, block: B:572:0x0788  */
    /* JADX WARN: Code duplicated, block: B:573:0x078c  */
    /* JADX WARN: Code duplicated, block: B:576:0x0796  */
    /* JADX WARN: Code duplicated, block: B:577:0x079a  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:581:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:592:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:596:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:601:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:604:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:608:0x0806  */
    /* JADX WARN: Code duplicated, block: B:609:0x080a  */
    /* JADX WARN: Code duplicated, block: B:612:0x0814  */
    /* JADX WARN: Code duplicated, block: B:613:0x0818  */
    /* JADX WARN: Code duplicated, block: B:616:0x0822  */
    /* JADX WARN: Code duplicated, block: B:617:0x0826  */
    /* JADX WARN: Code duplicated, block: B:620:0x0830  */
    /* JADX WARN: Code duplicated, block: B:621:0x0834  */
    /* JADX WARN: Code duplicated, block: B:624:0x083e  */
    /* JADX WARN: Code duplicated, block: B:625:0x0842  */
    /* JADX WARN: Code duplicated, block: B:628:0x084c  */
    /* JADX WARN: Code duplicated, block: B:629:0x084f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:632:0x0859  */
    /* JADX WARN: Code duplicated, block: B:633:0x085b  */
    /* JADX WARN: Code duplicated, block: B:636:0x0865  */
    /* JADX WARN: Code duplicated, block: B:637:0x0867  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:640:0x0871  */
    /* JADX WARN: Code duplicated, block: B:641:0x0873  */
    /* JADX WARN: Code duplicated, block: B:644:0x087d  */
    /* JADX WARN: Code duplicated, block: B:645:0x087f  */
    /* JADX WARN: Code duplicated, block: B:648:0x0889  */
    /* JADX WARN: Code duplicated, block: B:649:0x088b  */
    /* JADX WARN: Code duplicated, block: B:652:0x0895  */
    /* JADX WARN: Code duplicated, block: B:653:0x0897  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:660:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118 A[Catch: all -> 0x08be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean y0(String str) {
        String str2;
        byte b3;
        String str3;
        byte b11;
        boolean z11 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (j.class) {
            try {
                if (!Y1) {
                    int i11 = Build.VERSION.SDK_INT;
                    byte b12 = 28;
                    if (i11 <= 28) {
                        String str4 = Build.DEVICE;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b11 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b11 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b11 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b11 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b11 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b11 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b11 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b11 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b11 = -1;
                                break;
                        }
                        switch (b11) {
                            default:
                                if (i11 <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                    str2 = Build.MODEL;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b3 = 0;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b3 = 1;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b3 = 2;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b3 = 3;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b3 = 4;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b3 = 5;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b3 = 6;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b3 = 7;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b3 = 8;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (i11 <= 26) {
                                                str3 = Build.DEVICE;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b12 = 0;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b12 = 1;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b12 = 2;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b12 = 3;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b12 = 4;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b12 = 5;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b12 = 6;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b12 = 7;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b12 = 8;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b12 = 9;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b12 = 10;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b12 = 11;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b12 = 12;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b12 = 13;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b12 = 14;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b12 = 15;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b12 = 16;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b12 = 17;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b12 = 18;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b12 = 19;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b12 = 20;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b12 = 21;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b12 = 22;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b12 = 23;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b12 = 24;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b12 = 25;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b12 = 26;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b12 = 27;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b12 = 29;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b12 = 30;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b12 = 31;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b12 = 32;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b12 = 33;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b12 = 34;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b12 = 35;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b12 = 36;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b12 = 37;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b12 = 38;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b12 = 39;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b12 = 40;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b12 = 41;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b12 = 42;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b12 = 43;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b12 = 44;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b12 = 45;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b12 = 46;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b12 = 47;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b12 = 48;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b12 = 49;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b12 = 50;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b12 = 51;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b12 = 52;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b12 = 53;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b12 = 54;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b12 = 55;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b12 = 56;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b12 = 57;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b12 = 58;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b12 = 59;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b12 = 60;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b12 = 61;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b12 = 62;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b12 = 63;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b12 = 64;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b12 = 65;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b12 = 66;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b12 = 67;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b12 = 68;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b12 = 69;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b12 = 70;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b12 = 71;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b12 = 72;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b12 = 73;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b12 = 74;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b12 = 75;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b12 = 76;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b12 = 77;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b12 = 78;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b12 = 79;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b12 = 80;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b12 = 81;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b12 = 82;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b12 = 83;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b12 = 84;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b12 = 85;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b12 = 86;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b12 = 87;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b12 = 88;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b12 = 89;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b12 = 90;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b12 = 91;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b12 = 92;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b12 = 93;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b12 = 94;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b12 = 95;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b12 = 96;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b12 = 97;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b12 = 98;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b12 = 99;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b12 = 100;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b12 = 101;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b12 = 102;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b12 = 103;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b12 = 104;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b12 = 105;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b12 = 106;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b12 = 107;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b12 = 108;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b12 = 109;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b12 = 110;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b12 = 111;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b12 = 112;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b12 = 113;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b12 = 114;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b12 = 115;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b12 = 116;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b12 = 117;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b12 = 118;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b12 = 119;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b12 = 120;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b12 = 121;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b12 = 122;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b12 = 123;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b12 = 124;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b12 = 125;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b12 = 126;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b12 = 127;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b12 = 128;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b12 = 129;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b12 = 130;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b12 = 131;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b12 = 132;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b12 = 133;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b12 = 134;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b12 = 135;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b12 = 136;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b12 = 137;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b12 = 138;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b12 = 139;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b12 = -1;
                                                        break;
                                                }
                                                switch (b12) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                                                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                                                    case 27:
                                                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                                    case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                                    case 30:
                                                    case 31:
                                                    case Consts.SP /* 32 */:
                                                    case 33:
                                                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                                    case 35:
                                                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                                    case 37:
                                                    case 38:
                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                                    case 43:
                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                    case 46:
                                                    case 47:
                                                    case 48:
                                                    case 49:
                                                    case 50:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case UCrop.REQUEST_CROP /* 69 */:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case AchievementLevelType.DAY_STREAK_LV_6 /* 75 */:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case UCrop.RESULT_ERROR /* 96 */:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case AchievementLevelType.DAY_STREAK_LV_7 /* 125 */:
                                                    case 126:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z11 = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z11 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z11 = true;
                                break;
                        }
                    } else if (i11 <= 27) {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b3 = 0;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b3 = 1;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b3 = 2;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b3 = 3;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b3 = 4;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b3 = 5;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b3 = 6;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b3 = 7;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b3 = 8;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            default:
                                if (i11 <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b12 = 0;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b12 = 1;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b12 = 2;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b12 = 3;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b12 = 4;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b12 = 5;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b12 = 6;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b12 = 7;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b12 = 8;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b12 = 9;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b12 = 10;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b12 = 11;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b12 = 12;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b12 = 13;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b12 = 14;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b12 = 15;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b12 = 16;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b12 = 17;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b12 = 18;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b12 = 19;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b12 = 20;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b12 = 21;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b12 = 22;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b12 = 23;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b12 = 24;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b12 = 25;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b12 = 26;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b12 = 27;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b12 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b12 = 29;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b12 = 30;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b12 = 31;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b12 = 32;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b12 = 33;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b12 = 34;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b12 = 35;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b12 = 36;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b12 = 37;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b12 = 38;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b12 = 39;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b12 = 40;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b12 = 41;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b12 = 42;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b12 = 43;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b12 = 44;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b12 = 45;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b12 = 46;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b12 = 47;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b12 = 48;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b12 = 49;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b12 = 50;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b12 = 51;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b12 = 52;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b12 = 53;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b12 = 54;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b12 = 55;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b12 = 56;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b12 = 57;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b12 = 58;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b12 = 59;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b12 = 60;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b12 = 61;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b12 = 62;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b12 = 63;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b12 = 64;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b12 = 65;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b12 = 66;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b12 = 67;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b12 = 68;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b12 = 69;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b12 = 70;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b12 = 71;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b12 = 72;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b12 = 73;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b12 = 74;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b12 = 75;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b12 = 76;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b12 = 77;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b12 = 78;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b12 = 79;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b12 = 80;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b12 = 81;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b12 = 82;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b12 = 83;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b12 = 84;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b12 = 85;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b12 = 86;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b12 = 87;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b12 = 88;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b12 = 89;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b12 = 90;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b12 = 91;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b12 = 92;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b12 = 93;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b12 = 94;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b12 = 95;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b12 = 96;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b12 = 97;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b12 = 98;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b12 = 99;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b12 = 100;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b12 = 101;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b12 = 102;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b12 = 103;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b12 = 104;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b12 = 105;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b12 = 106;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b12 = 107;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b12 = 108;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b12 = 109;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b12 = 110;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b12 = 111;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b12 = 112;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b12 = 113;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b12 = 114;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b12 = 115;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b12 = 116;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b12 = 117;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b12 = 118;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b12 = 119;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b12 = 120;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b12 = 121;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b12 = 122;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b12 = 123;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b12 = 124;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b12 = 125;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b12 = 126;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b12 = 127;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b12 = 128;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b12 = 129;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b12 = 130;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b12 = 131;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b12 = 132;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b12 = 133;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b12 = 134;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b12 = 135;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b12 = 136;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b12 = 137;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b12 = 138;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b12 = 139;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        default:
                                            b12 = -1;
                                            break;
                                    }
                                    switch (b12) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case Service.METRICS_FIELD_NUMBER /* 24 */:
                                        case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                        case Service.BILLING_FIELD_NUMBER /* 26 */:
                                        case 27:
                                        case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                        case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                        case 30:
                                        case 31:
                                        case Consts.SP /* 32 */:
                                        case 33:
                                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        case 35:
                                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        case 37:
                                        case 38:
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        case 43:
                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case UCrop.REQUEST_CROP /* 69 */:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case AchievementLevelType.DAY_STREAK_LV_6 /* 75 */:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case UCrop.RESULT_ERROR /* 96 */:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case AchievementLevelType.DAY_STREAK_LV_7 /* 125 */:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z11 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z11 = true;
                                break;
                        }
                    } else {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b3 = -1;
                                } else {
                                    b3 = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b3 = -1;
                                } else {
                                    b3 = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b3 = -1;
                                } else {
                                    b3 = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b3 = -1;
                                } else {
                                    b3 = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b3 = -1;
                                } else {
                                    b3 = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b3 = -1;
                                } else {
                                    b3 = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b3 = -1;
                                } else {
                                    b3 = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b3 = -1;
                                } else {
                                    b3 = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b3 = -1;
                                } else {
                                    b3 = 8;
                                }
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            default:
                                if (i11 <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b12 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 139;
                                            }
                                            break;
                                        default:
                                            b12 = -1;
                                            break;
                                    }
                                    switch (b12) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case Service.METRICS_FIELD_NUMBER /* 24 */:
                                        case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                        case Service.BILLING_FIELD_NUMBER /* 26 */:
                                        case 27:
                                        case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                        case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                        case 30:
                                        case 31:
                                        case Consts.SP /* 32 */:
                                        case 33:
                                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        case 35:
                                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        case 37:
                                        case 38:
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        case 43:
                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case UCrop.REQUEST_CROP /* 69 */:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case AchievementLevelType.DAY_STREAK_LV_6 /* 75 */:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case UCrop.RESULT_ERROR /* 96 */:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case AchievementLevelType.DAY_STREAK_LV_7 /* 125 */:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z11 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z11 = true;
                                break;
                        }
                    }
                    Z1 = z11;
                    Y1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Z1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    public static int z0(m7.n nVar, y6.p pVar) {
        int i11 = pVar.f57298u;
        int i12 = pVar.f57299v;
        if (i11 != -1 && i12 != -1) {
            String str = pVar.f57291n;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                HashMap map = m7.s.f41035a;
                Pair pairB = b7.d.b(pVar);
                if (pairB == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i11 * i12) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i11 * i12) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !nVar.f40989f)))) {
                        return ((f0.e(i12, 16) * f0.e(i11, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i11 * i12) * 3) / 8;
            }
        }
        return -1;
    }

    @Override // m7.p, f7.e
    public final void A(float f5, float f11) throws ExoPlaybackException {
        super.A(f5, f11);
        d0 d0Var = this.f53634t1;
        if (d0Var != null) {
            d0Var.n(f5);
        } else {
            this.f53627m1.i(f5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Surface C0(m7.n nVar) {
        boolean z11;
        k kVar;
        int i11;
        RuntimeException runtimeException;
        Error error;
        d0 d0Var = this.f53634t1;
        if (d0Var != null) {
            return d0Var.e();
        }
        Surface surface = this.f53638x1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && nVar.f40991h) {
            return null;
        }
        b7.a.j(L0(nVar));
        l lVar = this.f53639y1;
        if (lVar != null && lVar.f53648a != nVar.f40989f && lVar != null) {
            lVar.release();
            this.f53639y1 = null;
        }
        if (this.f53639y1 == null) {
            Context context = this.f53622h1;
            boolean z12 = nVar.f40989f;
            boolean z13 = false;
            if (z12) {
                if (!l.b(context)) {
                    z11 = false;
                }
                b7.a.j(z11);
                kVar = new k("ExoPlayer:PlaceholderSurface");
                if (z12) {
                    i11 = l.f53646d;
                } else {
                    i11 = 0;
                }
                kVar.start();
                Handler handler = new Handler(kVar.getLooper(), kVar);
                kVar.f53642b = handler;
                kVar.f53641a = new b7.h(handler);
                synchronized (kVar) {
                    kVar.f53642b.obtainMessage(1, i11, 0).sendToTarget();
                    while (kVar.f53645e == null && kVar.f53644d == null && kVar.f53643c == null) {
                        try {
                            kVar.wait();
                        } catch (InterruptedException unused) {
                            z13 = true;
                        }
                    }
                }
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = kVar.f53644d;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = kVar.f53643c;
                if (error == null) {
                    throw error;
                }
                l lVar2 = kVar.f53645e;
                lVar2.getClass();
                this.f53639y1 = lVar2;
            } else {
                int i12 = l.f53646d;
            }
            z11 = true;
            b7.a.j(z11);
            kVar = new k("ExoPlayer:PlaceholderSurface");
            if (z12) {
                i11 = l.f53646d;
            } else {
                i11 = 0;
            }
            kVar.start();
            Handler handler2 = new Handler(kVar.getLooper(), kVar);
            kVar.f53642b = handler2;
            kVar.f53641a = new b7.h(handler2);
            synchronized (kVar) {
                kVar.f53642b.obtainMessage(1, i11, 0).sendToTarget();
                while (kVar.f53645e == null) {
                    kVar.wait();
                }
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = kVar.f53644d;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = kVar.f53643c;
                if (error == null) {
                    throw error;
                }
                l lVar3 = kVar.f53645e;
                lVar3.getClass();
                this.f53639y1 = lVar3;
            }
        }
        return this.f53639y1;
    }

    public final boolean D0(m7.n nVar) {
        if (this.f53634t1 != null) {
            return true;
        }
        Surface surface = this.f53638x1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && nVar.f40991h) || L0(nVar);
        }
        return true;
    }

    @Override // m7.p
    public final f7.g E(m7.n nVar, y6.p pVar, y6.p pVar2) {
        f7.g gVarB = nVar.b(pVar, pVar2);
        int i11 = gVarB.f26740e;
        c7.j jVar = this.f53631q1;
        jVar.getClass();
        if (pVar2.f57298u > jVar.f6660a || pVar2.f57299v > jVar.f6661b) {
            i11 |= 256;
        }
        if (B0(nVar, pVar2) > jVar.f6662c) {
            i11 |= 64;
        }
        int i12 = i11;
        return new f7.g(nVar.f40984a, pVar, pVar2, i12 != 0 ? 0 : gVarB.f26739d, i12);
    }

    public final boolean E0(e7.d dVar) {
        if (l() || dVar.e(536870912)) {
            return true;
        }
        long j11 = this.U1;
        return j11 == -9223372036854775807L || j11 - (dVar.f25117t - this.Z0.f40999c) <= 100000;
    }

    @Override // m7.p
    public final MediaCodecDecoderException F(IllegalStateException illegalStateException, m7.n nVar) {
        Surface surface = this.f53638x1;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    public final void F0() {
        if (this.E1 > 0) {
            this.f26705t.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = jElapsedRealtime - this.D1;
            int i11 = this.E1;
            qp.r rVar = this.f53624j1;
            Handler handler = (Handler) rVar.f48145b;
            if (handler != null) {
                handler.post(new a0(rVar, i11, j11));
            }
            this.E1 = 0;
            this.D1 = jElapsedRealtime;
        }
    }

    public final void G0() {
        if (this.P1) {
            int i11 = Build.VERSION.SDK_INT;
            m7.l lVar = this.f41019n0;
            if (lVar == null) {
                return;
            }
            this.R1 = new i(this, lVar);
            if (i11 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                lVar.a(bundle);
            }
        }
    }

    public final void H0(long j11) {
        Surface surface;
        x0(j11);
        z0 z0Var = this.M1;
        boolean zEquals = z0Var.equals(z0.f57406d);
        qp.r rVar = this.f53624j1;
        if (!zEquals && !z0Var.equals(this.N1)) {
            this.N1 = z0Var;
            rVar.d(z0Var);
        }
        this.Y0.f26719e++;
        u uVar = this.f53627m1;
        boolean z11 = uVar.f53685e != 3;
        uVar.f53685e = 3;
        uVar.f53692l.getClass();
        uVar.f53687g = f0.K(SystemClock.elapsedRealtime());
        if (z11 && (surface = this.f53638x1) != null) {
            Handler handler = (Handler) rVar.f48145b;
            if (handler != null) {
                handler.post(new ef.a(rVar, surface, SystemClock.elapsedRealtime()));
            }
            this.A1 = true;
        }
        c0(j11);
    }

    public final void I0(m7.l lVar, int i11, long j11) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.h(i11, j11);
        Trace.endSection();
        this.Y0.f26719e++;
        this.F1 = 0;
        if (this.f53634t1 == null) {
            z0 z0Var = this.M1;
            boolean zEquals = z0Var.equals(z0.f57406d);
            qp.r rVar = this.f53624j1;
            if (!zEquals && !z0Var.equals(this.N1)) {
                this.N1 = z0Var;
                rVar.d(z0Var);
            }
            u uVar = this.f53627m1;
            boolean z11 = uVar.f53685e != 3;
            uVar.f53685e = 3;
            uVar.f53692l.getClass();
            uVar.f53687g = f0.K(SystemClock.elapsedRealtime());
            if (!z11 || (surface = this.f53638x1) == null) {
                return;
            }
            Handler handler = (Handler) rVar.f48145b;
            if (handler != null) {
                handler.post(new ef.a(rVar, surface, SystemClock.elapsedRealtime()));
            }
            this.A1 = true;
        }
    }

    public final void J0(Object obj) throws ExoPlaybackException {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f53638x1;
        qp.r rVar = this.f53624j1;
        if (surface2 == surface) {
            if (surface != null) {
                z0 z0Var = this.N1;
                if (z0Var != null) {
                    rVar.d(z0Var);
                }
                Surface surface3 = this.f53638x1;
                if (surface3 == null || !this.A1 || (handler = (Handler) rVar.f48145b) == null) {
                    return;
                }
                handler.post(new ef.a(rVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f53638x1 = surface;
        d0 d0Var = this.f53634t1;
        u uVar = this.f53627m1;
        if (d0Var == null) {
            uVar.h(surface);
        }
        this.A1 = false;
        int i11 = this.H;
        m7.l lVar = this.f41019n0;
        if (lVar != null && this.f53634t1 == null) {
            m7.n nVar = this.f41026u0;
            nVar.getClass();
            boolean zD0 = D0(nVar);
            int i12 = Build.VERSION.SDK_INT;
            if (!zD0 || this.f53632r1) {
                i0();
                T();
            } else {
                Surface surfaceC0 = C0(nVar);
                if (surfaceC0 != null) {
                    lVar.m(surfaceC0);
                } else {
                    if (i12 < 35) {
                        throw new IllegalStateException();
                    }
                    lVar.g();
                }
            }
        }
        if (surface != null) {
            z0 z0Var2 = this.N1;
            if (z0Var2 != null) {
                rVar.d(z0Var2);
            }
        } else {
            this.N1 = null;
            d0 d0Var2 = this.f53634t1;
            if (d0Var2 != null) {
                d0Var2.o();
            }
        }
        if (i11 == 2) {
            d0 d0Var3 = this.f53634t1;
            if (d0Var3 != null) {
                d0Var3.s(true);
            } else {
                uVar.c(true);
            }
        }
        G0();
    }

    public final boolean K0(long j11, long j12, boolean z11, boolean z12) throws ExoPlaybackException {
        if (this.f53634t1 != null && this.f53623i1) {
            j12 -= -this.T1;
        }
        if (j11 < -500000 && !z11) {
            p7.z0 z0Var = this.K;
            z0Var.getClass();
            int iM = z0Var.m(j12 - this.M);
            if (iM != 0) {
                PriorityQueue priorityQueue = this.f53630p1;
                if (z12) {
                    f7.f fVar = this.Y0;
                    int i11 = fVar.f26718d + iM;
                    fVar.f26718d = i11;
                    fVar.f26720f += this.G1;
                    fVar.f26718d = priorityQueue.size() + i11;
                } else {
                    this.Y0.f26724j++;
                    N0(priorityQueue.size() + iM, this.G1);
                }
                if (J()) {
                    T();
                }
                d0 d0Var = this.f53634t1;
                if (d0Var != null) {
                    d0Var.p(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // m7.p
    public final int L(e7.d dVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.H1 == null && !this.P1) || dVar.f25117t >= this.N || E0(dVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean L0(m7.n nVar) {
        if (this.P1 || y0(nVar.f40984a)) {
            return false;
        }
        return !nVar.f40989f || l.b(this.f53622h1);
    }

    @Override // m7.p
    public final float M(float f5, y6.p pVar, y6.p[] pVarArr) {
        m7.n nVar;
        float fMax = -1.0f;
        for (y6.p pVar2 : pVarArr) {
            float f11 = pVar2.f57302y;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f5;
        if (this.H1 == null || (nVar = this.f41026u0) == null) {
            return f12;
        }
        int i11 = pVar.f57298u;
        int i12 = pVar.f57299v;
        float f13 = -3.4028235E38f;
        if (nVar.f40992i) {
            float f14 = nVar.f40995l;
            if (f14 != -3.4028235E38f && nVar.f40993j == i11 && nVar.f40994k == i12) {
                f13 = f14;
            } else {
                float f15 = 1024.0f;
                if (!nVar.g(i11, i12, 1024.0f)) {
                    f13 = CropImageView.DEFAULT_ASPECT_RATIO;
                    while (true) {
                        float f16 = f15 - f13;
                        if (Math.abs(f16) <= 5.0f) {
                            break;
                        }
                        float f17 = (f16 / 2.0f) + f13;
                        if (nVar.g(i11, i12, f17)) {
                            f13 = f17;
                        } else {
                            f15 = f17;
                        }
                    }
                } else {
                    f13 = 1024.0f;
                }
                nVar.f40995l = f13;
                nVar.f40993j = i11;
                nVar.f40994k = i12;
            }
        }
        return f12 != -1.0f ? Math.max(f12, f13) : f13;
    }

    public final void M0(m7.l lVar, int i11) {
        Trace.beginSection("skipVideoBuffer");
        lVar.d(i11);
        Trace.endSection();
        this.Y0.f26720f++;
    }

    @Override // m7.p
    public final ArrayList N(m7.i iVar, y6.p pVar, boolean z11) {
        List listA0 = A0(this.f53622h1, iVar, pVar, z11, this.P1);
        HashMap map = m7.s.f41035a;
        ArrayList arrayList = new ArrayList(listA0);
        Collections.sort(arrayList, new com.google.android.material.button.a(new hh.c(pVar, 10), 6));
        return arrayList;
    }

    public final void N0(int i11, int i12) {
        f7.f fVar = this.Y0;
        fVar.f26722h += i11;
        int i13 = i11 + i12;
        fVar.f26721g += i13;
        this.E1 += i13;
        int i14 = this.F1 + i13;
        this.F1 = i14;
        fVar.f26723i = Math.max(i14, fVar.f26723i);
        int i15 = this.f53625k1;
        if (i15 <= 0 || this.E1 < i15) {
            return;
        }
        F0();
    }

    public final void O0(long j11) {
        f7.f fVar = this.Y0;
        fVar.f26725k += j11;
        fVar.f26726l++;
        this.J1 += j11;
        this.K1++;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x013b  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x013b, please report this as an issue */
    @Override // m7.p
    public final oi.c P(m7.n nVar, y6.p pVar, MediaCrypto mediaCrypto, float f5) {
        int i11;
        c7.j jVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        byte b3;
        boolean z11;
        int iZ0;
        String str = nVar.f40986c;
        y6.p[] pVarArr = this.L;
        pVarArr.getClass();
        int i12 = pVar.f57298u;
        float f11 = pVar.f57302y;
        y6.g gVar = pVar.D;
        int i13 = pVar.f57299v;
        int iB0 = B0(nVar, pVar);
        if (pVarArr.length == 1) {
            if (iB0 != -1 && (iZ0 = z0(nVar, pVar)) != -1) {
                iB0 = Math.min((int) (iB0 * 1.5f), iZ0);
            }
            jVar = new c7.j(i12, i13, iB0);
            gVar = gVar;
            i11 = i13;
        } else {
            int length = pVarArr.length;
            int iMax = i12;
            int iMax2 = i13;
            int i14 = 0;
            boolean z12 = false;
            while (i14 < length) {
                y6.p pVar2 = pVarArr[i14];
                y6.p[] pVarArr2 = pVarArr;
                if (gVar != null && pVar2.D == null) {
                    y6.o oVarA = pVar2.a();
                    oVarA.C = gVar;
                    pVar2 = new y6.p(oVarA);
                }
                f7.g gVarB = nVar.b(pVar, pVar2);
                int i15 = length;
                int i16 = pVar2.f57299v;
                if (gVarB.f26739d != 0) {
                    int i17 = pVar2.f57298u;
                    b3 = -1;
                    z12 |= i17 == -1 || i16 == -1;
                    iMax = Math.max(iMax, i17);
                    iMax2 = Math.max(iMax2, i16);
                    iB0 = Math.max(iB0, B0(nVar, pVar2));
                } else {
                    b3 = -1;
                }
                length = i15;
                i14++;
                pVarArr = pVarArr2;
            }
            if (z12) {
                b7.a.B("Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z13 = i13 > i12;
                int i18 = z13 ? i13 : i12;
                int i19 = z13 ? i12 : i13;
                boolean z14 = z13;
                float f12 = i19 / i18;
                int i21 = 0;
                while (true) {
                    if (i21 < 9) {
                        int i22 = X1[i21];
                        int i23 = i21;
                        int i24 = (int) (i22 * f12);
                        if (i22 > i18 && i24 > i19) {
                            if (z14) {
                                i22 = i24;
                            }
                            if (z14) {
                                i24 = i22;
                            }
                            int i25 = i18;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f40987d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point2 = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point2 = new Point(f0.e(i22, widthAlignment) * widthAlignment, f0.e(i24, heightAlignment) * heightAlignment);
                            }
                            if (point2 != null) {
                                point = point2;
                                i11 = i13;
                                if (nVar.g(point2.x, point2.y, f11)) {
                                }
                            } else {
                                i11 = i13;
                            }
                            i21 = i23 + 1;
                            i13 = i11;
                            i18 = i25;
                            gVar = gVar;
                            i19 = i19;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            y6.o oVarA2 = pVar.a();
                            oVarA2.f57271t = iMax;
                            oVarA2.f57272u = iMax2;
                            iB0 = Math.max(iB0, z0(nVar, new y6.p(oVarA2)));
                            b7.a.B("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    gVar = gVar;
                    i11 = i13;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        y6.o oVarA3 = pVar.a();
                        oVarA3.f57271t = iMax;
                        oVarA3.f57272u = iMax2;
                        iB0 = Math.max(iB0, z0(nVar, new y6.p(oVarA3)));
                        b7.a.B("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                gVar = gVar;
                i11 = i13;
            }
            jVar = new c7.j(iMax, iMax2, iB0);
        }
        this.f53631q1 = jVar;
        int i26 = this.P1 ? this.Q1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i12);
        mediaFormat.setInteger("height", i11);
        b7.q.b(mediaFormat, pVar.f57294q);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        b7.q.a(mediaFormat, "rotation-degrees", pVar.f57303z);
        if (gVar != null) {
            y6.g gVar2 = gVar;
            b7.q.a(mediaFormat, "color-transfer", gVar2.f57197c);
            b7.q.a(mediaFormat, "color-standard", gVar2.f57195a);
            b7.q.a(mediaFormat, "color-range", gVar2.f57196b);
            byte[] bArr = gVar2.f57198d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(pVar.f57291n)) {
            HashMap map = m7.s.f41035a;
            Pair pairB = b7.d.b(pVar);
            if (pairB != null) {
                b7.q.a(mediaFormat, "profile", ((Integer) pairB.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", jVar.f6660a);
        mediaFormat.setInteger("max-height", jVar.f6661b);
        b7.q.a(mediaFormat, "max-input-size", jVar.f6662c);
        int i27 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f5 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f5);
        }
        if (this.f53626l1) {
            z11 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z11 = true;
        }
        if (i26 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z11);
            mediaFormat.setInteger("audio-session-id", i26);
        }
        if (i27 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.O1));
        }
        Surface surfaceC0 = C0(nVar);
        if (this.f53634t1 != null && !f0.I(this.f53622h1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new oi.c(nVar, mediaFormat, pVar, surfaceC0, mediaCrypto, (Object) null);
    }

    @Override // m7.p
    public final void Q(e7.d dVar) {
        if (this.f53633s1) {
            ByteBuffer byteBuffer = dVar.H;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b3 = byteBuffer.get();
                short s3 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b3 == -75 && s3 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        m7.l lVar = this.f41019n0;
                        lVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lVar.a(bundle);
                    }
                }
            }
        }
    }

    @Override // m7.p
    public final boolean V(y6.p pVar) throws ExoPlaybackException {
        d0 d0Var = this.f53634t1;
        if (d0Var == null || d0Var.c()) {
            return true;
        }
        try {
            return this.f53634t1.v(pVar);
        } catch (VideoSink$VideoSinkException e8) {
            throw g(e8, pVar, false, 7000);
        }
    }

    @Override // m7.p
    public final void W(Exception exc) {
        b7.a.p("Video codec error", exc);
        qp.r rVar = this.f53624j1;
        Handler handler = (Handler) rVar.f48145b;
        if (handler != null) {
            handler.post(new a0(rVar, exc, 1));
        }
    }

    @Override // m7.p
    public final void X(long j11, long j12, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        qp.r rVar = this.f53624j1;
        Handler handler = (Handler) rVar.f48145b;
        if (handler != null) {
            str2 = str;
            handler.post(new a0(rVar, str2, j11, j12));
        } else {
            str2 = str;
        }
        this.f53632r1 = y0(str2);
        m7.n nVar = this.f41026u0;
        nVar.getClass();
        boolean z11 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(nVar.f40985b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f40987d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f53633s1 = z11;
        G0();
    }

    @Override // m7.p
    public final void Y(String str) {
        qp.r rVar = this.f53624j1;
        Handler handler = (Handler) rVar.f48145b;
        if (handler != null) {
            handler.post(new a0(rVar, str, 2));
        }
    }

    @Override // m7.p
    public final f7.g Z(ob.e eVar) throws ExoPlaybackException {
        f7.g gVarZ = super.Z(eVar);
        y6.p pVar = (y6.p) eVar.f44805c;
        pVar.getClass();
        qp.r rVar = this.f53624j1;
        Handler handler = (Handler) rVar.f48145b;
        if (handler != null) {
            handler.post(new a0(rVar, pVar, gVarZ));
        }
        return gVarZ;
    }

    @Override // m7.p
    public final void a0(y6.p pVar, MediaFormat mediaFormat) {
        int integer;
        int i11;
        m7.l lVar = this.f41019n0;
        if (lVar != null) {
            lVar.k(this.B1);
        }
        if (this.P1) {
            i11 = pVar.f57298u;
            integer = pVar.f57299v;
        } else {
            mediaFormat.getClass();
            boolean z11 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z11 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z11 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i11 = integer2;
        }
        float f5 = pVar.A;
        int i12 = pVar.f57303z;
        if (i12 == 90 || i12 == 270) {
            f5 = 1.0f / f5;
            int i13 = integer;
            integer = i11;
            i11 = i13;
        }
        this.M1 = new z0(i11, f5, integer);
        d0 d0Var = this.f53634t1;
        if (d0Var == null || !this.V1) {
            this.f53627m1.g(pVar.f57302y);
        } else {
            y6.o oVarA = pVar.a();
            oVarA.f57271t = i11;
            oVarA.f57272u = integer;
            oVarA.f57277z = f5;
            y6.p pVar2 = new y6.p(oVarA);
            int i14 = this.f53636v1;
            List listS = this.f53637w1;
            if (listS == null) {
                listS = ImmutableList.s();
            }
            d0Var.b(pVar2, this.Z0.f40998b, i14, listS);
            this.f53636v1 = 2;
        }
        this.V1 = false;
    }

    @Override // m7.p
    public final void c0(long j11) {
        super.c0(j11);
        if (this.P1) {
            return;
        }
        this.G1--;
    }

    @Override // m7.p
    public final void d0() {
        d0 d0Var = this.f53634t1;
        if (d0Var != null) {
            d0Var.k();
            if (this.T1 == -9223372036854775807L) {
                this.T1 = this.Z0.f40998b;
            }
            this.f53634t1.j(-this.T1);
        } else {
            this.f53627m1.f(2);
        }
        this.V1 = true;
        G0();
    }

    @Override // m7.p
    public final void e0(e7.d dVar) {
        this.W1 = 0;
        int iL = L(dVar);
        if ((Build.VERSION.SDK_INT < 34 || (iL & 32) == 0) && !this.P1) {
            this.G1++;
        }
    }

    @Override // f7.e, f7.a1
    public final void f(int i11, Object obj) throws ExoPlaybackException {
        if (i11 == 1) {
            J0(obj);
            return;
        }
        if (i11 == 7) {
            obj.getClass();
            t tVar = (t) obj;
            this.S1 = tVar;
            d0 d0Var = this.f53634t1;
            if (d0Var != null) {
                d0Var.i(tVar);
                return;
            }
            return;
        }
        if (i11 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.Q1 != iIntValue) {
                this.Q1 = iIntValue;
                if (this.P1) {
                    i0();
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.B1 = iIntValue2;
            m7.l lVar = this.f41019n0;
            if (lVar != null) {
                lVar.k(iIntValue2);
                return;
            }
            return;
        }
        if (i11 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.C1 = iIntValue3;
            d0 d0Var2 = this.f53634t1;
            if (d0Var2 != null) {
                d0Var2.m(iIntValue3);
                return;
            }
            y yVar = this.f53627m1.f53682b;
            if (yVar.f53714j == iIntValue3) {
                return;
            }
            yVar.f53714j = iIntValue3;
            yVar.d(true);
            return;
        }
        if (i11 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(y0.f57380a)) {
                d0 d0Var3 = this.f53634t1;
                if (d0Var3 == null || !d0Var3.c()) {
                    return;
                }
                this.f53634t1.u();
                return;
            }
            this.f53637w1 = list;
            d0 d0Var4 = this.f53634t1;
            if (d0Var4 != null) {
                d0Var4.q(list);
                return;
            }
            return;
        }
        if (i11 == 14) {
            obj.getClass();
            b7.x xVar = (b7.x) obj;
            if (xVar.f4043a == 0 || xVar.f4044b == 0) {
                return;
            }
            this.f53640z1 = xVar;
            d0 d0Var5 = this.f53634t1;
            if (d0Var5 != null) {
                Surface surface = this.f53638x1;
                b7.a.k(surface);
                d0Var5.d(surface, xVar);
                return;
            }
            return;
        }
        switch (i11) {
            case 16:
                obj.getClass();
                this.O1 = ((Integer) obj).intValue();
                m7.l lVar2 = this.f41019n0;
                if (lVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.O1));
                    lVar2.a(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.f53638x1;
                J0(null);
                obj.getClass();
                ((j) obj).f(1, surface2);
                break;
            case 18:
                boolean z11 = this.H1 != null;
                g1 g1Var = (g1) obj;
                this.H1 = g1Var;
                if (z11 != (g1Var != null)) {
                    v0(this.f41020o0);
                }
                break;
            default:
                if (i11 == 11) {
                    f7.c0 c0Var = (f7.c0) obj;
                    c0Var.getClass();
                    this.f41014i0 = c0Var;
                }
                break;
        }
    }

    @Override // m7.p
    public final boolean g0(long j11, long j12, m7.l lVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, y6.p pVar) {
        int i14;
        lVar.getClass();
        long j14 = j13 - this.Z0.f40999c;
        int i15 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f53630p1;
            Long l9 = (Long) priorityQueue.peek();
            if (l9 == null || l9.longValue() >= j13) {
                break;
            }
            i15++;
            priorityQueue.poll();
        }
        N0(i15, 0);
        d0 d0Var = this.f53634t1;
        if (d0Var != null) {
            if (!z11 || z12) {
                return d0Var.f(j13, new g(this, lVar, i11, j14));
            }
            M0(lVar, i11);
            return true;
        }
        int iA = this.f53627m1.a(j13, j11, j12, this.Z0.f40998b, z11, z12, this.f53628n1);
        i9.f fVar = this.f53628n1;
        if (iA == 0) {
            this.f26705t.getClass();
            long jNanoTime = System.nanoTime();
            t tVar = this.S1;
            if (tVar != null) {
                tVar.c(j14, jNanoTime, pVar, this.f41021p0);
            }
            I0(lVar, i11, jNanoTime);
            O0(fVar.f34275a);
            return true;
        }
        if (iA == 1) {
            long j15 = fVar.f34276b;
            long j16 = fVar.f34275a;
            if (j15 == this.L1) {
                M0(lVar, i11);
            } else {
                t tVar2 = this.S1;
                if (tVar2 != null) {
                    i14 = i11;
                    tVar2.c(j14, j15, pVar, this.f41021p0);
                } else {
                    i14 = i11;
                }
                I0(lVar, i14, j15);
            }
            O0(j16);
            this.L1 = j15;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            lVar.d(i11);
            Trace.endSection();
            N0(0, 1);
            O0(fVar.f34275a);
            return true;
        }
        if (iA == 3) {
            M0(lVar, i11);
            O0(fVar.f34275a);
            return true;
        }
        if (iA == 4 || iA == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iA));
    }

    @Override // f7.e
    public final void h() {
        d0 d0Var = this.f53634t1;
        if (d0Var == null) {
            u uVar = this.f53627m1;
            if (uVar.f53685e == 0) {
                uVar.f53685e = 1;
                return;
            }
            return;
        }
        int i11 = this.f53636v1;
        if (i11 == 0 || i11 == 1) {
            this.f53636v1 = 0;
        } else {
            d0Var.w();
        }
    }

    @Override // m7.p
    public final void j0() {
        d0 d0Var = this.f53634t1;
        if (d0Var != null) {
            d0Var.k();
        }
    }

    @Override // f7.e
    public final String k() {
        return "MediaCodecVideoRenderer";
    }

    @Override // m7.p
    public final void l0() {
        super.l0();
        this.f53630p1.clear();
        this.G1 = 0;
        this.W1 = 0;
        this.I1 = false;
    }

    @Override // f7.e
    public final boolean m() {
        if (!this.U0) {
            return false;
        }
        d0 d0Var = this.f53634t1;
        return d0Var == null || d0Var.a();
    }

    @Override // m7.p, f7.e
    public final boolean o() {
        boolean zO = super.o();
        d0 d0Var = this.f53634t1;
        if (d0Var != null) {
            return d0Var.t(zO);
        }
        if (zO && (this.f41019n0 == null || this.P1)) {
            return true;
        }
        return this.f53627m1.b(zO);
    }

    @Override // m7.p, f7.e
    public final void p() {
        f7.f fVar;
        qp.r rVar = this.f53624j1;
        this.N1 = null;
        this.U1 = -9223372036854775807L;
        G0();
        this.A1 = false;
        this.R1 = null;
        this.I1 = true;
        try {
            super.p();
            fVar = this.Y0;
            rVar.getClass();
            synchronized (fVar) {
            }
        } finally {
            fVar = this.Y0;
            rVar.getClass();
            synchronized (fVar) {
                Handler handler = (Handler) rVar.f48145b;
                if (handler != null) {
                    handler.post(new pb.b(18, rVar, fVar));
                }
                rVar.d(z0.f57406d);
            }
        }
    }

    @Override // m7.p
    public final boolean p0(e7.d dVar) {
        boolean z11 = false;
        if (!E0(dVar)) {
            boolean z12 = dVar.f25117t < this.N;
            if (z12 && !dVar.e(268435456)) {
                if (dVar.e(67108864)) {
                    dVar.n();
                    z11 = true;
                }
                if (z11) {
                    if (z12) {
                        this.Y0.f26718d++;
                    } else {
                        this.f53630p1.add(Long.valueOf(dVar.f25117t));
                        this.W1++;
                    }
                }
                return z11;
            }
        }
        return false;
    }

    @Override // f7.e
    public final void q(boolean z11, boolean z12) {
        d0 d0Var;
        this.Y0 = new f7.f();
        e1 e1Var = this.f26702d;
        e1Var.getClass();
        boolean z13 = e1Var.f26714b;
        b7.a.j((z13 && this.Q1 == 0) ? false : true);
        if (this.P1 != z13) {
            this.P1 = z13;
            i0();
        }
        f7.f fVar = this.Y0;
        qp.r rVar = this.f53624j1;
        Handler handler = (Handler) rVar.f48145b;
        if (handler != null) {
            handler.post(new a0(rVar, fVar, 5));
        }
        boolean z14 = this.f53635u1;
        u uVar = this.f53627m1;
        if (!z14) {
            if (this.f53637w1 != null && this.f53634t1 == null) {
                f7.k kVar = new f7.k(this.f53622h1, uVar);
                kVar.f26819a = true;
                b7.y yVar = this.f26705t;
                yVar.getClass();
                kVar.f26824f = yVar;
                b7.a.j(!kVar.f26820b);
                if (((o) kVar.f26823e) == null) {
                    kVar.f26823e = new o();
                }
                q qVar = new q(kVar);
                kVar.f26820b = true;
                qVar.f53673o = 1;
                SparseArray sparseArray = qVar.f53662c;
                if (f0.i(sparseArray, 0)) {
                    d0Var = (d0) sparseArray.get(0);
                } else {
                    m mVar = new m(qVar, qVar.f53660a);
                    qVar.f53666g.add(mVar);
                    sparseArray.put(0, mVar);
                    d0Var = mVar;
                }
                this.f53634t1 = d0Var;
            }
            this.f53635u1 = true;
        }
        d0 d0Var2 = this.f53634t1;
        if (d0Var2 == null) {
            b7.y yVar2 = this.f26705t;
            yVar2.getClass();
            uVar.f53692l = yVar2;
            uVar.f(!z12 ? 1 : 0);
            return;
        }
        d0Var2.l(new f(this), MoreExecutors.a());
        t tVar = this.S1;
        if (tVar != null) {
            this.f53634t1.i(tVar);
        }
        if (this.f53638x1 != null && !this.f53640z1.equals(b7.x.f4042c)) {
            this.f53634t1.d(this.f53638x1, this.f53640z1);
        }
        this.f53634t1.m(this.C1);
        this.f53634t1.n(this.f41017l0);
        List list = this.f53637w1;
        if (list != null) {
            this.f53634t1.q(list);
        }
        this.f53636v1 = !z12 ? 1 : 0;
        this.f41007c1 = true;
    }

    @Override // m7.p
    public final boolean q0() {
        y6.p pVar = this.f41020o0;
        if (this.H1 == null || this.I1 || this.P1) {
            return true;
        }
        return (pVar != null && pVar.f57293p > 0) || this.f41009d1 || this.S0 != -9223372036854775807L;
    }

    @Override // m7.p, f7.e
    public final void r(long j11, boolean z11) throws ExoPlaybackException {
        d0 d0Var = this.f53634t1;
        if (d0Var != null && !z11) {
            d0Var.p(true);
        }
        super.r(j11, z11);
        d0 d0Var2 = this.f53634t1;
        u uVar = this.f53627m1;
        if (d0Var2 == null) {
            y yVar = uVar.f53682b;
            yVar.m = 0L;
            yVar.f53719p = -1L;
            yVar.f53717n = -1L;
            uVar.f53688h = -9223372036854775807L;
            uVar.f53686f = -9223372036854775807L;
            uVar.f53685e = Math.min(uVar.f53685e, 1);
            uVar.f53689i = -9223372036854775807L;
        }
        if (z11) {
            d0 d0Var3 = this.f53634t1;
            if (d0Var3 != null) {
                d0Var3.s(false);
            } else {
                uVar.c(false);
            }
        }
        G0();
        this.F1 = 0;
    }

    @Override // m7.p
    public final boolean r0(m7.n nVar) {
        return D0(nVar);
    }

    @Override // f7.e
    public final void s() {
        d0 d0Var = this.f53634t1;
        if (d0Var == null || !this.f53623i1) {
            return;
        }
        d0Var.release();
    }

    @Override // m7.p
    public final boolean s0() {
        m7.n nVar = this.f41026u0;
        if (this.f53634t1 != null && nVar != null) {
            String str = nVar.f40984a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.s0();
    }

    @Override // f7.e
    public final void t() {
        try {
            try {
                this.H0 = false;
                k0();
                i0();
                hd.b bVar = this.f41013h0;
                if (bVar != null) {
                    bVar.x(null);
                }
                this.f41013h0 = null;
                this.f53635u1 = false;
                this.T1 = -9223372036854775807L;
                l lVar = this.f53639y1;
                if (lVar != null) {
                    lVar.release();
                    this.f53639y1 = null;
                }
            } catch (Throwable th2) {
                hd.b bVar2 = this.f41013h0;
                if (bVar2 != null) {
                    bVar2.x(null);
                }
                this.f41013h0 = null;
                throw th2;
            }
        } catch (Throwable th3) {
            this.f53635u1 = false;
            this.T1 = -9223372036854775807L;
            l lVar2 = this.f53639y1;
            if (lVar2 != null) {
                lVar2.release();
                this.f53639y1 = null;
            }
            throw th3;
        }
    }

    @Override // f7.e
    public final void u() {
        this.E1 = 0;
        this.f26705t.getClass();
        this.D1 = SystemClock.elapsedRealtime();
        this.J1 = 0L;
        this.K1 = 0;
        d0 d0Var = this.f53634t1;
        if (d0Var != null) {
            d0Var.h();
        } else {
            this.f53627m1.d();
        }
    }

    @Override // m7.p
    public final int u0(m7.i iVar, y6.p pVar) {
        boolean z11;
        int i11 = 0;
        if (!y6.d0.n(pVar.f57291n)) {
            return f7.e.a(0, 0, 0, 0);
        }
        boolean z12 = pVar.f57295r != null;
        Context context = this.f53622h1;
        List listA0 = A0(context, iVar, pVar, z12, false);
        if (z12 && listA0.isEmpty()) {
            listA0 = A0(context, iVar, pVar, false, false);
        }
        if (listA0.isEmpty()) {
            return f7.e.a(1, 0, 0, 0);
        }
        int i12 = pVar.O;
        if (i12 != 0 && i12 != 2) {
            return f7.e.a(2, 0, 0, 0);
        }
        m7.n nVar = (m7.n) listA0.get(0);
        boolean zE = nVar.e(pVar);
        if (!zE) {
            int i13 = 1;
            while (true) {
                if (i13 >= listA0.size()) {
                    z11 = true;
                    break;
                }
                m7.n nVar2 = (m7.n) listA0.get(i13);
                if (nVar2.e(pVar)) {
                    z11 = false;
                    zE = true;
                    nVar = nVar2;
                    break;
                }
                i13++;
            }
        } else {
            z11 = true;
            break;
        }
        int i14 = zE ? 4 : 3;
        int i15 = nVar.f(pVar) ? 16 : 8;
        int i16 = nVar.f40990g ? 64 : 0;
        int i17 = z11 ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(pVar.f57291n) && !z6.c.c(context)) {
            i17 = 256;
        }
        if (zE) {
            List listA1 = A0(context, iVar, pVar, z12, true);
            if (!listA1.isEmpty()) {
                HashMap map = m7.s.f41035a;
                ArrayList arrayList = new ArrayList(listA1);
                Collections.sort(arrayList, new com.google.android.material.button.a(new hh.c(pVar, 10), 6));
                m7.n nVar3 = (m7.n) arrayList.get(0);
                if (nVar3.e(pVar) && nVar3.f(pVar)) {
                    i11 = 32;
                }
            }
        }
        return i14 | i15 | i11 | i16 | i17;
    }

    @Override // f7.e
    public final void v() {
        F0();
        int i11 = this.K1;
        if (i11 != 0) {
            long j11 = this.J1;
            qp.r rVar = this.f53624j1;
            Handler handler = (Handler) rVar.f48145b;
            if (handler != null) {
                handler.post(new a0(rVar, j11, i11));
            }
            this.J1 = 0L;
            this.K1 = 0;
        }
        d0 d0Var = this.f53634t1;
        if (d0Var != null) {
            d0Var.g();
        } else {
            this.f53627m1.e();
        }
    }

    @Override // m7.p, f7.e
    public final void w(y6.p[] pVarArr, long j11, long j12, p7.b0 b0Var) {
        super.w(pVarArr, j11, j12, b0Var);
        o0 o0Var = this.R;
        if (o0Var.p()) {
            this.U1 = -9223372036854775807L;
        } else {
            b0Var.getClass();
            this.U1 = o0Var.g(b0Var.f46328a, new m0()).f57231d;
        }
    }

    @Override // m7.p, f7.e
    public final void y(long j11, long j12) throws ExoPlaybackException {
        d0 d0Var = this.f53634t1;
        if (d0Var != null) {
            try {
                d0Var.r(j11, j12);
            } catch (VideoSink$VideoSinkException e8) {
                throw g(e8, e8.f2146a, false, 7001);
            }
        }
        super.y(j11, j12);
    }

    public static List A0(Context context, m7.i iVar, y6.p pVar, boolean z11, boolean z12) {
        String str = pVar.f57291n;
        if (str == null) {
            return ImmutableList.s();
        }
        if (Build.VERSION.SDK_INT >= 26 && wuoM.eXsBkavv.equals(str) && !z6.c.c(context)) {
            String strB = m7.s.b(pVar);
            List listS = strB == null ? ImmutableList.s() : iVar.b(strB, z11, z12);
            if (!listS.isEmpty()) {
                return listS;
            }
        }
        return m7.s.f(iVar, pVar, z11, z12);
    }
}

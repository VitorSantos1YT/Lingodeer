package gh;

import b7.e0;
import bq.r;
import cf.x;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.GameWordStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f29192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f29193b;

    public /* synthetic */ a(long j11, boolean z11) {
        this.f29192a = j11;
        this.f29193b = z11;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        int[] iArr = r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String strK = e0.k(this.f29192a, bq.m.r(x.n().keyLanguage), "-");
        GameWordStatus gameWordStatus = (GameWordStatus) PdLessonDbHelper.INSTANCE.gameWordStatusDao().load(strK);
        boolean z11 = this.f29193b;
        if (gameWordStatus == null) {
            gameWordStatus = z11 ? new GameWordStatus(strK, Long.valueOf(jCurrentTimeMillis), Integer.valueOf(z11 ? 1 : 0), 0L, 1L, w4.c.f(z11 ? 1 : 0, ";")) : new GameWordStatus(strK, Long.valueOf(jCurrentTimeMillis), Integer.valueOf(z11 ? 1 : 0), 1L, 0L, w4.c.f(z11 ? 1 : 0, ";"));
        } else {
            gameWordStatus.setLastStudyTime(Long.valueOf(jCurrentTimeMillis));
            gameWordStatus.setLastStatus(Integer.valueOf(z11 ? 1 : 0));
            String lastThreeResult = gameWordStatus.getLastThreeResult();
            kotlin.jvm.internal.m.e(lastThreeResult, "getLastThreeResult(...)");
            if (lastThreeResult.length() == 0) {
                gameWordStatus.setLastThreeResult((z11 ? 1 : 0) + ";");
            } else {
                gameWordStatus.setLastThreeResult(gameWordStatus.getLastThreeResult() + (z11 ? 1 : 0) + ";");
            }
            String lastThreeResult2 = gameWordStatus.getLastThreeResult();
            kotlin.jvm.internal.m.e(lastThreeResult2, "getLastThreeResult(...)");
            List listW0 = q.W0(lastThreeResult2, new String[]{";"}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listW0) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() > 3) {
                StringBuilder sb2 = new StringBuilder();
                Iterator it = arrayList.subList(arrayList.size() - 3, arrayList.size()).iterator();
                while (it.hasNext()) {
                    sb2.append(((String) it.next()) + ";");
                }
                gameWordStatus.setLastThreeResult(sb2.toString());
            }
            if (z11) {
                gameWordStatus.setCorrectCount(Long.valueOf(gameWordStatus.getCorrectCount().longValue() + 1));
            } else {
                gameWordStatus.setWrongCount(Long.valueOf(gameWordStatus.getWrongCount().longValue() + 1));
            }
        }
        PdLessonDbHelper.INSTANCE.gameWordStatusDao().insertOrReplace(gameWordStatus);
        return Boolean.TRUE;
    }
}

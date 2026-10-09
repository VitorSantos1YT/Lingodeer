package bh;

import android.content.Context;
import com.lingo.lingoskill.object.AckDao;
import com.lingo.lingoskill.object.JaKanaStrokeData;
import com.lingo.lingoskill.object.LessonDao;
import com.lingo.lingoskill.object.LevelDao;
import com.lingo.lingoskill.object.PhraseDao;
import com.lingo.lingoskill.object.SentenceDao;
import com.lingo.lingoskill.object.UnitDao;
import com.lingo.lingoskill.object.WordDao;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements vt.i0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f4364k = ry.x.Y(new qy.l((char) 12354, "a"), new qy.l((char) 12356, "i"), new qy.l((char) 12358, "u"), new qy.l((char) 12360, "e"), new qy.l((char) 12362, "o"), new qy.l((char) 12363, "ka"), new qy.l((char) 12365, "ki"), new qy.l((char) 12367, "ku"), new qy.l((char) 12369, "ke"), new qy.l((char) 12371, "ko"), new qy.l((char) 12373, "sa"), new qy.l((char) 12375, "shi"), new qy.l((char) 12377, "su"), new qy.l((char) 12379, "se"), new qy.l((char) 12381, "so"), new qy.l((char) 12383, "ta"), new qy.l((char) 12385, "chi"), new qy.l((char) 12388, "tsu"), new qy.l((char) 12390, "te"), new qy.l((char) 12392, "to"), new qy.l((char) 12394, "na"), new qy.l((char) 12395, "ni"), new qy.l((char) 12396, "nu"), new qy.l((char) 12397, "ne"), new qy.l((char) 12398, "no"), new qy.l((char) 12399, "ha"), new qy.l((char) 12402, "hi"), new qy.l((char) 12405, "hu"), new qy.l((char) 12408, "he"), new qy.l((char) 12411, "ho"), new qy.l((char) 12414, "ma"), new qy.l((char) 12415, "mi"), new qy.l((char) 12416, "mu"), new qy.l((char) 12417, "me"), new qy.l((char) 12418, "mo"), new qy.l((char) 12420, "ya"), new qy.l((char) 12422, "yu"), new qy.l((char) 12424, "yo"), new qy.l((char) 12425, "ra"), new qy.l((char) 12426, "ri"), new qy.l((char) 12427, "ru"), new qy.l((char) 12428, "re"), new qy.l((char) 12429, "ro"), new qy.l((char) 12431, "wa"), new qy.l((char) 12434, "wo"), new qy.l((char) 12435, "n"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LevelDao f4365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnitDao f4366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LessonDao f4367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WordDao f4368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SentenceDao f4369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PhraseDao f4370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AckDao f4371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vt.n0 f4372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dh.a f4373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vt.d0 f4374j;

    public t(Context context, LevelDao levelDao, UnitDao unitDao, LessonDao lessonDao, WordDao wordDao, SentenceDao sentenceDao, PhraseDao phraseDao, AckDao ackDao, vt.n0 n0Var, dh.a aVar, vt.d0 d0Var) {
        this.f4365a = levelDao;
        this.f4366b = unitDao;
        this.f4367c = lessonDao;
        this.f4368d = wordDao;
        this.f4369e = sentenceDao;
        this.f4370f = phraseDao;
        this.f4371g = ackDao;
        this.f4372h = n0Var;
        this.f4373i = aVar;
        this.f4374j = d0Var;
        boolean z11 = hl.a.f33682b;
        if (z11 || z11) {
            return;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ks.b.d(context, "graphicsJaKana.txt"), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        hl.a.f33681a = linkedHashMap;
                        hl.a.f33682b = true;
                        linkedHashMap.size();
                        return;
                    }
                    if (!oz.q.K0(line)) {
                        try {
                            JaKanaStrokeData jaKanaStrokeDataFromJson = JaKanaStrokeData.Companion.fromJson(line);
                            if (jaKanaStrokeDataFromJson != null) {
                                linkedHashMap.put(jaKanaStrokeDataFromJson.getCharacter(), line);
                                jaKanaStrokeDataFromJson.getCharacter();
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ns.o.m(bufferedReader, th2);
                        throw th3;
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    public final uz.i a(long j11) {
        gp.r rVar = new gp.r(new c(this, j11, (vy.d) null, 1));
        yz.f fVar = rz.o0.f50940a;
        return uz.x0.w(rVar, yz.e.f58387a);
    }

    public final gp.r b(long j11) {
        return new gp.r(new c(this, j11, (vy.d) null, 11));
    }
}

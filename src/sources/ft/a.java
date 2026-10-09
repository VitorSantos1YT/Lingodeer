package ft;

import android.net.Uri;
import com.bumptech.glide.d;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import java.util.List;
import ns.o;
import ot.u1;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f28033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CourseWord f28034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CourseWord f28035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CourseWord f28036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final CourseWord f28037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final CourseWord f28038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CourseWord f28039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final CourseWord f28040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final CourseWord f28041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f28042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f28043k;

    static {
        CourseWord courseWordCopy$default = CourseWord.copy$default(new CourseWord(0L, "apple", 0), 0L, null, null, null, "苹果", null, 0, 0, null, null, null, null, null, null, null, null, Uri.parse("https://res.lingodeer.com/enes/main/course/lesson_png/enes-p-1-12814414540367.png"), null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -65553, 63, null);
        List listS = o.S(o.L(CourseWord.copy$default(new CourseWord(0L, "apple", 0), 0L, null, null, null, null, null, 0, 0, null, null, null, "n.", null, null, null, null, Uri.parse("https://res.lingodeer.com/enes/main/course/lesson_png/enes-p-1-12814414540367.png"), null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -67585, 63, null), CourseWord.copy$default(new CourseWord(1L, "banana", 0), 0L, null, null, null, null, null, 0, 0, null, null, null, "n.", null, null, null, null, Uri.parse("https://res.lingodeer.com/enes/main/course/lesson_png/enes-p-1-12814414540367.png"), null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -67585, 63, null), CourseWord.copy$default(new CourseWord(2L, "orange", 0), 0L, null, null, null, null, null, 0, 0, null, null, null, "n.", null, null, null, null, Uri.parse("https://res.lingodeer.com/enes/main/course/lesson_png/enes-p-1-12814414540367.png"), null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -67585, 63, null), CourseWord.copy$default(new CourseWord(3L, "pear", 0), 0L, null, null, null, null, null, 0, 0, null, null, null, "n.", null, null, null, null, Uri.parse("https://res.lingodeer.com/enes/main/course/lesson_png/enes-p-1-12814414540367.png"), null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -67585, 63, null)));
        f28033a = listS;
        new u1(courseWordCopy$default, listS);
        f28034b = new CourseWord(1L, "I", 0);
        f28035c = CourseWord.copy$default(new CourseWord(2L, "am", 0), 0L, null, null, null, "shi", null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -17, 63, null);
        f28036d = new CourseWord(3L, "from", 0);
        f28037e = new CourseWord(4L, "Korea", 0);
        f28038f = new CourseWord(5L, "China", 0);
        f28039g = new CourseWord(6L, "USA", 0);
        f28040h = new CourseWord(7L, "Japan", 0);
        f28041i = new CourseWord(4224L, "_____", 0);
        f28042j = d.v(new fk.a(1));
        f28043k = d.v(new fk.a(2));
        d.v(new fk.a(3));
        d.v(new fk.a(4));
        d.v(new fk.a(5));
        d.v(new fk.a(6));
        d.v(new fk.a(7));
        d.v(new fk.a(8));
        d.v(new fk.a(9));
    }

    public static final CourseSentence a() {
        return (CourseSentence) f28042j.getValue();
    }
}

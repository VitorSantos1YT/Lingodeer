package i7;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t7.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f34193a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // t7.p
    public final Object e(Uri uri, d7.g gVar) throws IOException {
        String line = new BufferedReader(new InputStreamReader(gVar, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = f34193a.matcher(line);
            if (!matcher.matches()) {
                throw ParserException.b("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j11 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j12 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j12 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j11;
            }
            return Long.valueOf(time);
        } catch (ParseException e8) {
            throw ParserException.b(null, e8);
        }
    }
}

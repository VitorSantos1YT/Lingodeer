package ko;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.lingo.lingoskill.speak.object.PodTrans;
import java.io.IOException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends TypeAdapter {
    public static void a(JsonWriter jsonWriter, String str, String str2) throws IOException {
        if (str2 != null) {
            jsonWriter.name(str).value(str2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final Object read2(JsonReader reader) throws IOException {
        m.f(reader, "reader");
        PodTrans podTrans = new PodTrans();
        if (reader.peek() == JsonToken.STRING) {
            reader.skipValue();
            return podTrans;
        }
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (reader.peek() == JsonToken.NULL) {
                reader.skipValue();
            } else {
                String strNextString = reader.nextString();
                if (strNextName != null) {
                    switch (strNextName.hashCode()) {
                        case 3179:
                            if (strNextName.equals("cn")) {
                                podTrans.setCn(strNextString);
                            }
                            break;
                        case 3201:
                            if (strNextName.equals("de")) {
                                podTrans.setDe(strNextString);
                            }
                            break;
                        case 3241:
                            if (strNextName.equals("en")) {
                                podTrans.setEn(strNextString);
                            }
                            break;
                        case 3276:
                            if (strNextName.equals("fr")) {
                                podTrans.setFr(strNextString);
                            }
                            break;
                        case 3371:
                            if (strNextName.equals("it")) {
                                podTrans.setIt(strNextString);
                            }
                            break;
                        case 3398:
                            if (strNextName.equals("jp")) {
                                podTrans.setJp(strNextString);
                            }
                            break;
                        case 3431:
                            if (strNextName.equals("kr")) {
                                podTrans.setKr(strNextString);
                            }
                            break;
                        case 3588:
                            if (strNextName.equals("pt")) {
                                podTrans.setPt(strNextString);
                            }
                            break;
                        case 3651:
                            if (strNextName.equals("ru")) {
                                podTrans.setRu(strNextString);
                            }
                            break;
                        case 3677:
                            if (strNextName.equals("sp")) {
                                podTrans.setSp(strNextString);
                            }
                            break;
                        case 3774:
                            if (strNextName.equals("vt")) {
                                podTrans.setVt(strNextString);
                            }
                            break;
                        case 96848:
                            if (strNextName.equals("ara")) {
                                podTrans.setAra(strNextString);
                            }
                            break;
                        case 104115:
                            if (strNextName.equals("idn")) {
                                podTrans.setIdn(strNextString);
                            }
                            break;
                        case 114649:
                            if (strNextName.equals("tch")) {
                                podTrans.setTch(strNextString);
                            }
                            break;
                        case 115217:
                            if (strNextName.equals("tur")) {
                                podTrans.setTur(strNextString);
                            }
                            break;
                        case 3558812:
                            if (strNextName.equals("thai")) {
                                podTrans.setThai(strNextString);
                            }
                            break;
                    }
                }
            }
        }
        reader.endObject();
        return podTrans;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter out, Object obj) throws IOException {
        PodTrans podTrans = (PodTrans) obj;
        m.f(out, "out");
        if (podTrans == null) {
            out.nullValue();
            return;
        }
        out.beginObject();
        a(out, "cn", podTrans.getCn());
        a(out, "en", podTrans.getEn());
        a(out, "jp", podTrans.getJp());
        a(out, "kr", podTrans.getKr());
        a(out, "sp", podTrans.getSp());
        a(out, "fr", podTrans.getFr());
        a(out, "de", podTrans.getDe());
        a(out, "tch", podTrans.getTch());
        a(out, "idn", podTrans.getIdn());
        a(out, "pt", podTrans.getPt());
        a(out, "it", podTrans.getIt());
        a(out, "tur", podTrans.getTur());
        a(out, "vt", podTrans.getVt());
        a(out, "ru", podTrans.getRu());
        a(out, "thai", podTrans.getThai());
        a(out, "ara", podTrans.getAra());
        out.endObject();
    }
}

package us.shiroyama.android.ormlitefields.ui.sample.db;

import android.provider.BaseColumns;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Locale;

/**
 * DB Model Class representing Country
 *
 * @author Fumihiko Shiroyama
 */

@DatabaseTable(tableName = "country")
public class Country {

    @DatabaseField(columnName = BaseColumns._ID, generatedId = true)
    private Long id;

    @DatabaseField
    private String name;

    @DatabaseField(columnName = "country_code")
    private int countryCode;

    @Nullable
    @DatabaseField(columnName = "sub_country_code")
    private Integer subCountryCode;

    @DatabaseField(columnName = "iso_code")
    private String isoCode;

    @SuppressWarnings("unused")
    private Country() {
    }

    public Country(@NonNull String name, int countryCode, @NonNull String isoCode) {
        this(name, countryCode, null, isoCode);
    }

    public Country(@NonNull String name, int countryCode, @Nullable Integer subCountryCode, @NonNull String isoCode) {
        this.name = name;
        this.countryCode = countryCode;
        this.subCountryCode = subCountryCode;
        this.isoCode = isoCode;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    @Nullable
    public Integer getSubCountryCode() {
        return subCountryCode;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public boolean hasSubCountryCode() {
        return subCountryCode != null;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Country [id=%d, name=%s, country_code=%d, sub_country_code=%d, iso_code=%s]", id, name, countryCode, subCountryCode, isoCode);
    }

}

package practice.hospital;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float max = 40F;
        float min = 32F;
        float[] temperatureData = new float[patientsCount];

        for (int i = 0; i < patientsCount; i++) {
            float temp = (float) (Math.random() * ((max - min))) + min;
            temperatureData[i] = (float) (Math.round(temp * 100)) / 100;
        }
        return temperatureData;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */
        StringBuilder allTemperatures = new StringBuilder();
        float mediumTemperature = 0F;
        int healthCount = 0;

        for (int i = 0; i < temperatureData.length; i++) {
            float temp = (float) (Math.round(temperatureData[i] * 100)) / 100;
            if ((int) (temp * 10) >= 362 && (int) (temp * 10) <= 369) {
                healthCount++;
            }

            allTemperatures.append(temp).append(" ");
            mediumTemperature += temperatureData[i];
        }

        String tempReport = allTemperatures.substring(0, allTemperatures.length() - 1);
        mediumTemperature = mediumTemperature / temperatureData.length;
        mediumTemperature = (float) (Math.round(mediumTemperature * 100)) / 100;

        String report =
                "Температуры пациентов: " + tempReport +
                        "\nСредняя температура: " + mediumTemperature +
                        "\nКоличество здоровых: " + healthCount;

        return report;
    }
}

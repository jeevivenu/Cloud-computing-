def convert_temperature(value, from_unit, to_unit):
    if from_unit == 'C':
        if to_unit == 'F':
            return value * 9/5 + 32
        elif to_unit == 'K':
            return value + 273.15
    elif from_unit == 'F':
        if to_unit == 'C':
            return (value - 32) * 5/9
        elif to_unit == 'K':
            return (value + 459.67) * 5/9
    elif from_unit == 'K':
        if to_unit == 'C':
            return value - 273.15
        elif to_unit == 'F':
            return value * 9/5 - 459.67
    return value

value = float(input("Enter the temperature value: "))
from_unit = input("Enter the unit of the given temperature (C, F, K): ").upper()
to_unit = input("Enter the unit to convert to (C, F, K): ").upper()

converted_value = convert_temperature(value, from_unit, to_unit)
print(f"{value} {from_unit} is equal to {converted_value
